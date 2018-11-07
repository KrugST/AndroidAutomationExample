package com.testautomation.trifecatestautomationframework;


import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;

import org.junit.Before;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class DriverInstance {
    public UiDevice mDevice;
    String ANDROID_PACKAGE = "com.n_ix.pocket_wod";

    public UiDevice getDriverInstance(){
        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        return mDevice;
    }

    @Before
    public void beforeTest(){

        mDevice = getDriverInstance();

        // Start from the home screen
        mDevice.pressHome();

        // Wait for launcher
        final String launcherPackage = mDevice.getLauncherPackageName();
        assertNotNull(launcherPackage);
        mDevice.wait(Until.hasObject(By.pkg(launcherPackage).depth(0)),
                5000);

        // Launch the app
        Context context = InstrumentationRegistry.getContext();
        final Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(ANDROID_PACKAGE);
        // Clear out any previous instances
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);

        // Wait for the app to appear
        mDevice.wait(Until.hasObject(By.pkg(ANDROID_PACKAGE).depth(0)),
                5000);
    }
}
