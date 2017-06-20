package com.anncode.mediumapi.user.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anncode.mediumapi.R;
import com.anncode.mediumapi.user.presenter.UserPresenter;
import com.anncode.mediumapi.user.presenter.UserPresenterImpl;

public class UserActivity extends AppCompatActivity implements UserView {

    private UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userPresenter = new UserPresenterImpl(this);
    }

    @Override
    public void getDataUser() {

    }

    @Override
    public void showDataUser() {

    }

    @Override
    public void goPostList() {

    }
}
