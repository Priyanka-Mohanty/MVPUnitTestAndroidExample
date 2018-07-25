package com.example.priyankam.mvpandroidexample.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.priyankam.mvpandroidexample.R;

/*
* Display the Main Screen.
* */

public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter= new MainPresenter(this);

    }
    /*
     * MvpView Method
     * */
    @Override
    public void showSignInScreen() {
        Toast.makeText(this,"Taking to user to Sign In Screen",Toast.LENGTH_SHORT).show();;
    }

    @Override
    public void showSignUpScreen() {
        Toast.makeText(this,"Taking to user to Sign Up Screen",Toast.LENGTH_SHORT).show();
    }
}
