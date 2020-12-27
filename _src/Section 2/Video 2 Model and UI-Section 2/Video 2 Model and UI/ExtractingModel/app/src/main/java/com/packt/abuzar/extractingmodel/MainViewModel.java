package com.packt.abuzar.extractingmodel;

import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {


    public final List<ProjectModel> projectListings = new ArrayList<>();


    public void setProjectList() {

        List<ProjectModel> items = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ProjectModel projectModel = new ProjectModel();
            projectModel.title = "Project " + i;
            items.add(projectModel);
        }
        projectListings.addAll(items);

    }


}
