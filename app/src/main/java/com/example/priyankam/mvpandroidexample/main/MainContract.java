package com.example.priyankam.mvpandroidexample.main;

/**
 * Defines the contract between the View {@link MainActivity }
 * and the Presenter{@link MainPresenter}.
 */

public interface MainContract {

    interface MvpView {
        void showSignInScreen();

        void showSignUpScreen();
    }

    interface Presenter {
        void handleSignInButtonClick();

        void handleSignUpButtonClick();
    }
}