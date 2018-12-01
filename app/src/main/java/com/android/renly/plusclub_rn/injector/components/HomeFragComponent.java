package com.android.renly.plusclub_rn.injector.components;

import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.injector.modules.HomeFragModule;
import com.android.renly.plusclub_rn.module.home.fullscreen.HomeFragment;

import dagger.Component;

/**
 * HomeFragment
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = HomeFragModule.class)
public interface HomeFragComponent {
    void inject(HomeFragment fragment);
}
