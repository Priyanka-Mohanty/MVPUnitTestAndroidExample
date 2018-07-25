package com.example.priyankam.mvpandroidexample.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.priyankam.mvpandroidexample.R;
import com.example.priyankam.mvpandroidexample.databinding.ActivityMainBinding;
/*
 * Display the Main Screen.
 * */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        binding.setPresenter(mainPresenter);
    }

    /*
     * MvpView Method
     * */
    @Override
    public void showSignInScreen() {
        Toast.makeText(this, "Taking to user to Sign In Screen", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this, "Taking to user to Sign Up Screen", Toast.LENGTH_SHORT).show();
    }
}
