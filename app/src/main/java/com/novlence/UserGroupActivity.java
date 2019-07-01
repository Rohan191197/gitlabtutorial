package com.novlence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class UserGroupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_group);
    }

    public void addingUser(View view) {
        Intent it = new Intent(this,AddingUserActivity.class);
        startActivity(it);
    }

    public void createGroups(View view) {
        Intent it = new Intent(this,CreateGroupsActivity.class);
        startActivity(it);
    }

    public void removeUsers(View view) {
        Intent it = new Intent(this,RemoveUsersActivity.class);
        startActivity(it);
    }

    public void userPermissions(View view) {
        Intent it = new Intent(this,UserPermissionsActivity.class);
        startActivity(it);
    }
}
