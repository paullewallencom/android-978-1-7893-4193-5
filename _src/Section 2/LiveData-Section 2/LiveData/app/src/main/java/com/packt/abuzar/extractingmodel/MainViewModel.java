package com.packt.abuzar.extractingmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {

    public final LiveData<List<ProjectModel>> projectListings;

    public MainViewModel(Application application) {
        super(application);

        // If any transformation is needed, this can be simply done by Transformations class ...
        projectListings = ProjectRepository.getInstance().getProjectList();
    }

    /**
     * Expose the LiveData Projects query so the UI can observe it.
     */
    public LiveData<List<ProjectModel>> getProjectListObservable() {
        return projectListings;
    }


}
