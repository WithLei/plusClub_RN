package com.android.renly.plusclub_rn.injector.modules;

import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.module.hotnews.HotNewsFragPresenter;
import com.android.renly.plusclub_rn.module.hotnews.HotNewsFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class HotNewsFragModule {
    private final HotNewsFragment mView;

    public HotNewsFragModule(HotNewsFragment mView) {
        this.mView = mView;
    }

    @PerFragment
    @Provides
    public HotNewsFragPresenter provideHotNewsFragPresenter() {
        return new HotNewsFragPresenter(mView);
    }
}
