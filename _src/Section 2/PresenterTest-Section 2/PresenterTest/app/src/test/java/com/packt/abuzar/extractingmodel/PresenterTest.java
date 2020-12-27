package com.packt.abuzar.extractingmodel;

import android.app.Application;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class PresenterTest {

    @Mock
    private MainContractor.MainView mainView;

    @Mock
    MainPresenter mainPresenter;

    @Before
    public void setupMainPresenter() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetUpPresenter() {
        mainPresenter.setUpPresenter(mainView);
        verify(mainPresenter).setUpPresenter(mainView);
    }

    @Test
    public void testGetProjectList() {
        mainPresenter.getProjectListObservable();
        verify(mainPresenter).getProjectListObservable();
    }

}
