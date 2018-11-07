package com.testautomation.trifecatestautomationframework;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

public class AccountSettings {
    UiDevice mDevice;
    public AccountSettings(UiDevice mDevice) {
        this.mDevice = mDevice;
    }

    public void logout() throws UiObjectNotFoundException {
        UiObject logoutButton = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/activity_account_logout"));

        UiScrollable scrollableViewToScroll = new UiScrollable(new UiSelector()
                .className("android.widget.ScrollView"));
        scrollableViewToScroll.scrollIntoView(logoutButton);
        logoutButton.click();
    }
}
