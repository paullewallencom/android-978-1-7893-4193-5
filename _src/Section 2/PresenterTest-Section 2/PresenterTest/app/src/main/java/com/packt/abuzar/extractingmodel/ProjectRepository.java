package com.packt.abuzar.extractingmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.os.CountDownTimer;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ProjectRepository {

    private static ProjectRepository projectRepository;


    List<ProjectModel> projectList;

//    @Inject
    public ProjectRepository(List<ProjectModel> projectList) {
        //TODO this gitHubService instance will be injected using Dagger in part #2 ...
        this.projectList = projectList;
    }


    public LiveData<List<ProjectModel>> getProjectList() {


        final MutableLiveData<List<ProjectModel>> data = new MutableLiveData<>();
        CountDownTimer counter = new CountDownTimer(1000, 500) {
            public void onTick(long millisUntilDone) {
                //Nothing for now..... Just for waiting
            }

            public void onFinish() {
                data.setValue(projectList);
            }
        }.start();


        return data;
    }

}
