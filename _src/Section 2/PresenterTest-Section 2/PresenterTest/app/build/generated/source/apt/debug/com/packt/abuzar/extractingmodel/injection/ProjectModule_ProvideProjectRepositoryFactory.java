// Generated by Dagger (https://google.github.io/dagger).
package com.packt.abuzar.extractingmodel.injection;

import com.packt.abuzar.extractingmodel.ProjectModel;
import com.packt.abuzar.extractingmodel.ProjectRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.inject.Provider;

public final class ProjectModule_ProvideProjectRepositoryFactory
    implements Factory<ProjectRepository> {
  private final ProjectModule module;

  private final Provider<List<ProjectModel>> projectModelListProvider;

  public ProjectModule_ProvideProjectRepositoryFactory(
      ProjectModule module, Provider<List<ProjectModel>> projectModelListProvider) {
    this.module = module;
    this.projectModelListProvider = projectModelListProvider;
  }

  @Override
  public ProjectRepository get() {
    return Preconditions.checkNotNull(
        module.provideProjectRepository(projectModelListProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ProjectModule_ProvideProjectRepositoryFactory create(
      ProjectModule module, Provider<List<ProjectModel>> projectModelListProvider) {
    return new ProjectModule_ProvideProjectRepositoryFactory(module, projectModelListProvider);
  }

  public static ProjectRepository proxyProvideProjectRepository(
      ProjectModule instance, List<ProjectModel> projectModelList) {
    return Preconditions.checkNotNull(
        instance.provideProjectRepository(projectModelList),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
