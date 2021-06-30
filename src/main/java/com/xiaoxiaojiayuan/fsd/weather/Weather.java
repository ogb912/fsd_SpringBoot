package com.xiaoxiaojiayuan.fsd.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaofan Wang
 * @since 2021-07-01
 */
public class Weather {
    public static List<WProfile> wProfiles = new ArrayList<>();

    public static WProfile getWProfile(String name) {
        for (WProfile wProfile : wProfiles) {
            if (wProfile.getName().equals(name)) {
                return wProfile;
            }
        }

        return null;
    }
}
