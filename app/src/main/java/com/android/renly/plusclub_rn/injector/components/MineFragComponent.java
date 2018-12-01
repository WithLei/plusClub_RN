package com.android.renly.plusclub_rn.injector.components;

import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.injector.modules.MineFragModule;
import com.android.renly.plusclub_rn.module.mine.MineFragment;

import dagger.Component;

@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = MineFragModule.class)
public interface MineFragComponent {
    void inject(MineFragment fragment);
}
