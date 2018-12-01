package com.android.renly.plusclub_rn.injector.modules;

import com.android.renly.plusclub_rn.module.schedule.home.ScheduleFragment;
import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.module.schedule.home.ScheduleFragPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ScheduleFragModule {
    private final ScheduleFragment mView;

    public ScheduleFragModule(ScheduleFragment mView) {
        this.mView = mView;
    }

    @PerFragment
    @Provides
    public ScheduleFragPresenter provideScheduleFragPresenter() {
        return new ScheduleFragPresenter(mView);
    }
}
