package com.rj.testmvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.rj.testmvvm.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        UserViewModel viewModel = new UserViewModel(this);
        binding.setVm(viewModel);
        binding.setUser(viewModel.user);
    }
}
