package com.android.renly.plusclub_rn.injector.components;

import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.injector.modules.HotNewsFragModule;
import com.android.renly.plusclub_rn.module.hotnews.HotNewsFragment;

import dagger.Component;

@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = HotNewsFragModule.class)
public interface HotNewsFragComponent {
    void inject(HotNewsFragment fragment);
}
