package com.anncode.mediumapi.user.presenter;

import com.anncode.mediumapi.user.interactor.UserInteractor;
import com.anncode.mediumapi.user.interactor.UserInteractorImpl;
import com.anncode.mediumapi.user.view.UserView;

/**
 * Created by anahisalgado on 20/06/17.
 */

public class UserPresenterImpl implements UserPresenter {
    private UserView userView;
    private UserInteractor userInteractor;

    public UserPresenterImpl(UserView userView) {
        this.userView = userView;
        userInteractor = new UserInteractorImpl(this);
    }

    @Override
    public void getDataUser() {

    }

    @Override
    public void showDataUser() {

    }
}
