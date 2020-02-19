package com.mga.guangtool;

import android.content.Context;


import com.ebupt.jlog.JLog;
import com.ebupt.jlog.constant.LogLevel;
import com.ebupt.jlog.constant.LogSegment;
import com.ebupt.jlog.constant.ZoneOffset;


import java.util.ArrayList;
import java.util.List;

public class Ginterfa {
    public static final String TAG = "TestInc";

    public static void jlogTest(Context mContext) {
        List<LogLevel> logLevels = new ArrayList<>();
        logLevels.add(LogLevel.DEBUG);
        logLevels.add(LogLevel.WARN);
        logLevels.add(LogLevel.ERROR);
        logLevels.add(LogLevel.INFO);
        JLog.init(mContext)
                .setDebug(true)
                .setLogLevelsForFile(logLevels)
                .setLogSegment(LogSegment.TWENTY_FOUR_HOURS)
                .setCharset("UTF-8")
                .setTimeFormat("yyyy年MM月dd日 HH时mm分ss秒")
                .setZoneOffset(ZoneOffset.P0800);

        JLog.i(TAG, "invoking jlogTest()");
    }


}
