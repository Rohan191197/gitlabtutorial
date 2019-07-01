package com.novlence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InstanceManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instance_management);
    }

    public void createBackup(View view) {
        Intent it = new Intent(this,CreateBackupActivity.class);
        startActivity(it);
    }

    public void restoreBackup(View view) {
        Intent it = new Intent(this,RestoreBackupActivity.class);
        startActivity(it);
    }

    public void importRepository(View view) {
        Intent it = new Intent(this,ImportRepositoryActivity.class);
        startActivity(it);
    }
}
