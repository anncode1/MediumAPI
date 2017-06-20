package com.anncode.mediumapi.user.interactor;

import com.anncode.mediumapi.user.presenter.UserPresenter;
import com.anncode.mediumapi.user.repository.UserRepository;
import com.anncode.mediumapi.user.repository.UserRepositoryImpl;

/**
 * Created by anahisalgado on 20/06/17.
 */

public class UserInteractorImpl implements UserInteractor {

    private UserPresenter userPresenter;
    private UserRepository userRepository;

    public UserInteractorImpl(UserPresenter userPresenter) {
        this.userPresenter = userPresenter;
        userRepository = new UserRepositoryImpl(userPresenter);
    }

    @Override
    public void getDataUser() {
        userRepository.getDataUser();
    }
}
