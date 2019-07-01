package com.novlence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }


    public void Introduction(View view) {
        Intent it = new Intent(this,IntroductionActivity.class);
        startActivity(it);
    }

    public void Installation(View view) {
        Intent it = new Intent(this,InstallationActivity.class);
        startActivity(it);
    }

    public void Commands(View view) {
        Intent it = new Intent(this,CommandsActivity.class);
        startActivity(it);
    }

    public void SSH_Key_Setup(View view) {
        Intent it = new Intent(this,SSHKeySetupActivity.class);
        startActivity(it);
    }

    public void CreateProject(View view) {
        Intent it = new Intent(this,CreateProjectActivity.class);
        startActivity(it);
    }


    public void ForkProject(View view) {
        Intent it = new Intent(this,ForkProjectActivity.class);
        startActivity(it);
    }

    public void CreateBranch(View view) {
        Intent it = new Intent(this,CreateBranchActivity.class);
        startActivity(it);
    }

    public void AddFile(View view) {
        Intent it = new Intent(this,AddFileActivity.class);
        startActivity(it);
    }

    public void RebaseOperation(View view) {
        Intent it = new Intent(this,RebaseOperationActivity.class);
        startActivity(it);
    }

    public void SquashingCommits(View view) {
        Intent it = new Intent(this,SquashingCommitsActivity.class);
        startActivity(it);
    }
}
