package com.packt.abuzar.extractingmodel;

import android.arch.lifecycle.LiveData;

import java.util.List;

public interface MainContractor {


    interface MainView {

    }

    interface MainPresenter {


        public void setUpPresenter(MainView mainView);
        public LiveData<List<ProjectModel>> getProjectListObservable();
    }

}
