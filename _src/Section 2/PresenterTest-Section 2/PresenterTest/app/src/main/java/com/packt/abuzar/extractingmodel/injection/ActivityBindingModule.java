package com.packt.abuzar.extractingmodel.injection;


import com.packt.abuzar.extractingmodel.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

}
