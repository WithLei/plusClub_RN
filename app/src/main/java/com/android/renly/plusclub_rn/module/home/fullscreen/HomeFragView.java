package com.android.renly.plusclub_rn.module.home.fullscreen;

import com.android.renly.plusclub_rn.api.bean.Forum;

import java.util.List;

public interface HomeFragView {
    /**
     * 显示天气数据
     */
    void loadWeather(boolean isSuccess, String weather);

    /**
     * 显示头像
     */
    void loadAvatar(String path);

    /**
     * 设置主页forum模块
     */
    void setForumList(List<Forum> forumList);
}
