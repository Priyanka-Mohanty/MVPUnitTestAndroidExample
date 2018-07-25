package com.example.priyankam.mvpandroidexample.main;

/**
 * Responsible for handling action from the view and updating the UI as
 * required.
 */
public class MainPresenter implements MainContract.Presenter {
    private MainContract.MvpView mView;


    MainPresenter(MainContract.MvpView mvpView){
        mView=mvpView;
    }
    /*
    * Presenter Method
    * */
    @Override
    public void handleSignInButtonClick() {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {
        mView.showSignUpScreen();
    }
}
