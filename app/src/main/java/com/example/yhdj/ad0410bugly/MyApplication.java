package com.example.yhdj.ad0410bugly;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by yhdj on 2017/4/1.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.initCrashReport(getApplicationContext(), "cd19e7e40e", true);
    }
}
