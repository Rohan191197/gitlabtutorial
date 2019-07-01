package com.novlence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IssueTrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_issue_tracker);
    }

    public void createissue(View view) {
        Intent it = new Intent(this, CreateIssueActivity.class);
        startActivity(it);
    }

    public void mergerequest(View view) {
        Intent it = new Intent(this, MergeRequestActivity.class);
        startActivity(it);
    }

    public void refrencingissue(View view) {
        Intent it = new Intent(this, ReferencingIssueActivity.class);
        startActivity(it);
    }

    public void milestones(View view) {
        Intent it = new Intent(this, MilestonesActivity.class);
        startActivity(it);
    }


    public void wikipages(View view) {
        Intent it = new Intent(this,WikiPagesActivity.class);
        startActivity(it);
    }
}
