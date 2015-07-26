package shewchenko.com.github.expresscalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by shew on 26.07.15.
 */
public class PriceTextWatcher extends ActionBarActivity {

    EditText Price1, Price2, Price3, Price4, Price5, Price6, Price7, Price8, Price9;
     int price1, price2, price3, price4, price5, price6, price7, price8, price9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Price1 = (EditText) findViewById(R.id.edPrice1);
        Price2 = (EditText) findViewById(R.id.edPrice2);
        Price3 = (EditText) findViewById(R.id.edPrice3);
        Price4 = (EditText) findViewById(R.id.edPrice4);
        Price5 = (EditText) findViewById(R.id.edPrice5);
        Price6 = (EditText) findViewById(R.id.edPrice6);
        Price7 = (EditText) findViewById(R.id.edPrice7);
        Price8 = (EditText) findViewById(R.id.edPrice8);
        Price9 = (EditText) findViewById(R.id.edPrice9);

        Price1.addTextChangedListener(edPrice1Watcher);
        Price2.addTextChangedListener(edPrice2Watcher);
        Price3.addTextChangedListener(edPrice3Watcher);
        Price4.addTextChangedListener(edPrice4Watcher);
        Price5.addTextChangedListener(edPrice5Watcher);
        Price6.addTextChangedListener(edPrice6Watcher);
        Price7.addTextChangedListener(edPrice7Watcher);
        Price8.addTextChangedListener(edPrice8Watcher);
        Price9.addTextChangedListener(edPrice9Watcher);
    }

    public int setPrice(){

       int resultPrice = price1 + price2 + price3 + price4 +
               price5 + price6 + price7 + price8 + price9;
        return resultPrice;

    }

    TextWatcher edPrice1Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                price1 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price1 = 0;
            }

            //udatePrice();
            //ifProverka();

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice2Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                price2 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price2 = 0;
            }

            //udatePrice();
           // ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice3Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                price3 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price3 = 0;
            }
            // udatePrice();
            //ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice4Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                price4 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price4 = 0;
            }
            //udatePrice();
           // ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice5Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                price5 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price5 = 0;
            }
            //udatePrice();
           // ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice6Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                price6 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price6 = 0;
            }
            // udatePrice();
            //ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice7Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                price7 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price7 = 0;
            }
           // ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice8Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                price8 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price8 = 0;
            }
            // udatePrice();
            //ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPrice9Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                price9 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                price9 = 0;
            }
            // udatePrice();
            //ifProverka();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

}
