package com.testautomation.trifecatestautomationframework;

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

public class OOBE {
    UiDevice mDevice;

    public OOBE(UiDevice mDevice) {
        this.mDevice = mDevice;
    }

    public void createNewAccount() {

    }

    public void loginWithExistingAccount() throws UiObjectNotFoundException {

        UiObject openLoginScreenButton = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/login_button"));
        openLoginScreenButton.click();

        UiObject emailUsernameInputField = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/activity_sign_in_username"));

        emailUsernameInputField.setText("roman.sentsov.razerzone+1@gmail.com");

        UiObject passwordInputField = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/activity_sign_in_password"));
        passwordInputField.setText("cxzdsaewq");

        UiObject loginButton = mDevice.findObject(new UiSelector()
                .resourceId("com.n_ix.pocket_wod:id/activity_sign_in_login"));
        loginButton.click();
    }

}
