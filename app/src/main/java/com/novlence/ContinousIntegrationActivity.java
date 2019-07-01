package com.novlence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContinousIntegrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continous_integration);
    }

    public void CIintroduction(View view) {
        Intent it = new Intent(this,CIIntroductionActivity.class);
        startActivity(it);
    }

    public void CICD(View view) {
        Intent it = new Intent(this,CICDActivity.class);
        startActivity(it);
    }

    public void variables(View view) {
        Intent it = new Intent(this,CICDVariablesActivity.class);
        startActivity(it);
    }


    public void permissions(View view) {
        Intent it = new Intent(this,CIPermissionActivity.class);
        startActivity(it);
    }

    public void runners(View view) {
        Intent it = new Intent(this,GitlabRunnersActivity.class);
        startActivity(it);
    }

    public void usage(View view) {
        Intent it = new Intent(this,AdvancedUsageActivity.class);
        startActivity(it);
    }

    public void cycleAnalytics(View view) {
        Intent it = new Intent(this,CycleAnalyticsActivity.class);
        startActivity(it);
    }

    public void containingRegistry(View view) {
        Intent it = new Intent(this,ContainingRegistryActivity.class);
        startActivity(it);
    }
}
