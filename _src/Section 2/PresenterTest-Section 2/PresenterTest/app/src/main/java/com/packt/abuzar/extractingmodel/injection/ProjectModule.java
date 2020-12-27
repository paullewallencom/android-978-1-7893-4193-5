package com.packt.abuzar.extractingmodel.injection;

import android.app.Application;

import com.packt.abuzar.extractingmodel.MainAdapter;
import com.packt.abuzar.extractingmodel.ProjectModel;
import com.packt.abuzar.extractingmodel.ProjectRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ProjectModule {


    Application application;

    public ProjectModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    List<ProjectModel> provideProjectList() {
        List<ProjectModel> items = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ProjectModel projectModel = new ProjectModel();
            projectModel.title = "Project " + i;
            items.add(projectModel);
        }
        return items;
    }

    @Provides
    @Singleton
    ProjectRepository provideProjectRepository(List<ProjectModel> projectModelList) {
        return new ProjectRepository(projectModelList);
    }


    @Provides
    @Singleton
    MainAdapter provideMainAdapter() {
        return new MainAdapter(application.getApplicationContext());
    }

}
