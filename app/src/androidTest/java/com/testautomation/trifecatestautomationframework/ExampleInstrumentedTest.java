package com.testautomation.trifecatestautomationframework;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiObjectNotFoundException;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends DriverInstance {

    @Test
    public void loginAccountLogoutSmokeTest() throws UiObjectNotFoundException, InterruptedException {
        OOBE oobe = new OOBE(mDevice);
        oobe.loginWithExistingAccount();

        HomeScreen homeScreen = new HomeScreen(mDevice);
        homeScreen.closePremiumPopUp();

        BottomTabNavigation bottomTabNavigation = new BottomTabNavigation(mDevice);
        bottomTabNavigation.clickConfigMenuButton();

        ConfigMenuNavigation configMenuNavigation = new ConfigMenuNavigation(mDevice);
        configMenuNavigation.clickAccountButton();

        AccountSettings accountSettings = new AccountSettings(mDevice);
        accountSettings.logout();
    }

}
