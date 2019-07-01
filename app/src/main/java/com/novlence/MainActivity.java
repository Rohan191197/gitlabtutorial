package com.novlence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void basic(View view) {
        Intent it = new Intent(this,BasicActivity.class);
        startActivity(it);
    }

    public void userandgroup(View view) {
        Intent it = new Intent(this,UserGroupActivity.class);
        startActivity(it);
    }

    public void issuetracker(View view) {
        Intent it = new Intent(this,IssueTrackerActivity.class);
        startActivity(it);
    }


    public void instancemanagement(View view) {
        Intent it = new Intent(this,InstanceManagementActivity.class);
        startActivity(it);
    }

    public void continousintegration(View view) {
        Intent it = new Intent(this,ContinousIntegrationActivity.class);
        startActivity(it);
    }
}
