package com.android.renly.plusclub_rn.api;

import com.android.renly.plusclub_rn.api.api.PlusClubApi;
import com.android.renly.plusclub_rn.api.api.WeatherApi;

public class ApiFactory {
    protected static final Object monitor = new Object();
    static PlusClubApi plusClubApi = null;
    static WeatherApi weatherApi = null;

}
