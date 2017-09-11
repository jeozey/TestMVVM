package com.rj.testmvvm;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/9/11.
 */

public class UserViewModel {
    public final User user;
    private Context context;
    public UserViewModel(Context context) {
        user = new User();
        this.context = context;
    }

    public void changeUser(View view){
        user.name.set("testN"+System.currentTimeMillis());
        user.pass.set("testP"+System.currentTimeMillis());
        user.now.set(""+System.currentTimeMillis());
    }
    public void login(View view){
        Toast.makeText(context, user.toString(),Toast.LENGTH_SHORT).show();
    }

}
