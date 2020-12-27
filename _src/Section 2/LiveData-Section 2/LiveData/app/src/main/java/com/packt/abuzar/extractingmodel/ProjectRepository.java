package com.packt.abuzar.extractingmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.os.CountDownTimer;

import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {

    private static ProjectRepository projectRepository;

    private ProjectRepository() {
        //TODO this gitHubService instance will be injected using Dagger in part #2 ...
    }

    public synchronized static ProjectRepository getInstance() {
        //TODO No need to implement this singleton in Part #2 since Dagger will handle it ...
        if (projectRepository == null) {
            if (projectRepository == null) {
                projectRepository = new ProjectRepository();
            }
        }
        return projectRepository;
    }

    public LiveData<List<ProjectModel>> getProjectList() {


        final MutableLiveData<List<ProjectModel>> data = new MutableLiveData<>();
        CountDownTimer counter = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilDone) {
                //Nothing for now..... Just for waiting
            }

            public void onFinish() {
                data.setValue(getList());
            }
        }.start();


        return data;
    }

    public List<ProjectModel> getList() {

        List<ProjectModel> items = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ProjectModel projectModel = new ProjectModel();
            projectModel.title = "Project " + i;
            items.add(projectModel);
        }

        return items;
    }
}
