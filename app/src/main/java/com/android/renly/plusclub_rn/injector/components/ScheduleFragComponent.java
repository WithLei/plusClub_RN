package com.android.renly.plusclub_rn.injector.components;

import com.android.renly.plusclub_rn.module.schedule.home.ScheduleFragment;
import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.injector.modules.ScheduleFragModule;

import dagger.Component;

@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = ScheduleFragModule.class)
public interface ScheduleFragComponent {
    void inject(ScheduleFragment fragment);
}
