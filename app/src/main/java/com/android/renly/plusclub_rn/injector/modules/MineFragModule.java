package com.android.renly.plusclub_rn.injector.modules;

import com.android.renly.plusclub_rn.module.mine.MineFragment;
import com.android.renly.plusclub_rn.injector.PerFragment;
import com.android.renly.plusclub_rn.module.mine.MineFragPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MineFragModule {
    private final MineFragment mView;

    public MineFragModule(MineFragment mView){
        this.mView = mView;
    }

    @PerFragment
    @Provides
    public MineFragPresenter provideMineFragPresenter(){
        return new MineFragPresenter(mView);
    }
}
