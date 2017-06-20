package com.anncode.mediumapi.user.repository;

import com.anncode.mediumapi.user.presenter.UserPresenter;

/**
 * Created by anahisalgado on 20/06/17.
 */

public class UserRepositoryImpl implements UserRepository {

    private UserPresenter userPresenter;

    public UserRepositoryImpl(UserPresenter userPresenter) {
        this.userPresenter = userPresenter;
    }

    @Override
    public void getDataUser() {

    }
}
