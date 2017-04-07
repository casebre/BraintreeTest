package com.example.rafael.braintreetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.braintreepayments.api.BraintreeFragment;
import com.braintreepayments.api.exceptions.InvalidArgumentException;

public class BraintreeBrowserSwitchActivity extends AppCompatActivity {

    private BraintreeFragment mBraintreeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_braintree_browser_switch);

        try {
            String mAuthorization = "";
            mBraintreeFragment = BraintreeFragment.newInstance(this, mAuthorization);
        } catch (InvalidArgumentException e) {
            // There was an issue with your authorization string.
        }
    }
}
