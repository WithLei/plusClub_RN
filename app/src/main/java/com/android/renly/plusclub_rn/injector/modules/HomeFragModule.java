package com.android.renly.plusclub_rn.injector.modules;

import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.module.home.fullscreen.HomeFragPresenter;
import com.android.renly.plusclub_rn.module.home.fullscreen.HomeFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class HomeFragModule {
    private final HomeFragment mView;
    private final String cityCode;

    public HomeFragModule(HomeFragment mView, String cityCode) {
        this.mView = mView;
        this.cityCode = cityCode;
    }

    @PerFragment
    @Provides
    public HomeFragPresenter  provideHomeFragPresenter() {
        return new HomeFragPresenter(cityCode, mView);
    }
}
