package com.testautomation.trifecatestautomationframework;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiScrollable;
import android.support.test.uiautomator.UiSelector;

public class HomeScreen {
    UiDevice mDevice;

    public HomeScreen(UiDevice mDevice) {
        this.mDevice = mDevice;
    }

    public void closePremiumPopUp() throws InterruptedException, UiObjectNotFoundException {
        Thread.sleep(5000);
        UiObject closeXButton = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/close_button"));

        UiScrollable scrollableViewToScroll = new UiScrollable(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/recycler_view"));
        scrollableViewToScroll.scrollToEnd(5);
        scrollableViewToScroll.scrollToBeginning(5);
        scrollableViewToScroll.scrollBackward();


        closeXButton.click();
    }
}
