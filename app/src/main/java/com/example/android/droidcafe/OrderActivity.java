package com.example.android.droidcafe;

import android.graphics.drawable.Icon;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;

import android.view.View;

import android.widget.RadioButton;

import android.widget.Toast;



/**

 * This activity handles radio buttons for choosing

 * a delivery method for an order.

 */

public class OrderActivity extends AppCompatActivity {



    private static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();



    /**

     * Sets the content view to activity_order.

     *

     * @param savedInstanceState Saved instance.

     */

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_order);

    }





    public void displayToast(String message) {

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }



    /**

     * Checks which radio button was clicked

     * and displays a toast message to show the choice.

     *

     * @param view The radio button view.

     */

    public void onRadioButtonClicked(View view) {

        // Is a button now checked?

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked

        switch (view.getId()) {

            case R.id.sameday:

                if (checked)

                    // Same day service

                    displayToast(getString(R.string.chosen) +

                            getString(R.string.same_day_messenger_service));

                break;

            case R.id.nextday:

                if (checked)

                    // Next day delivery

                    displayToast(getString(R.string.chosen) +

                            getString(R.string.next_day_ground_delivery));

                break;

            case R.id.pickup:

                if (checked)

                    // Pick up

                    displayToast(getString(R.string.chosen) +

                            getString(R.string.pick_up));

                break;

            default:

                Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));

                break;

        }

    }

}
