package shewchenko.com.github.expresscalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    EditText Price1, Price2, Price3, Price4, Price5, Price6, Price7, Price8, Price9,

            Passage1, Passage2, Passage3, Passage4, Passage5, Passage6, Passage7,
            Passage8, Passage9,

            Phone1, Phone2, Phone3, Phone4, Phone5, Phone6, Phone7, Phone8, Phone9,

            Amount500, Amount200, Amount100, Amount50, Amount20, Amount10, Amount5,
            Amount2, Amount1,

            edSumPrice, edSumPassage, edSumPhone;

    int     price1, price2, price3, price4, price5, price6, price7, price8, price9,

            passage1, passage2, passage3, passage4, passage5, passage6, passage7,
            passage8, passage9,

            phone1, phone2, phone3, phone4, phone5, phone6, phone7, phone8, phone9,

            amount500, amount200, amount100, amount50, amount20, amount10, amount5,
            amount2, amount1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        Passage1 = (EditText) findViewById(R.id.edPassage1);
        Passage2 = (EditText) findViewById(R.id.edPassage2);
        Passage3 = (EditText) findViewById(R.id.edPassage3);
        Passage4 = (EditText) findViewById(R.id.edPassage4);
        Passage5 = (EditText) findViewById(R.id.edPassage5);
        Passage6 = (EditText) findViewById(R.id.edPassage6);
        Passage7 = (EditText) findViewById(R.id.edPassage7);
        Passage8 = (EditText) findViewById(R.id.edPassage8);
        Passage9 = (EditText) findViewById(R.id.edPassage9);

        Passage1.addTextChangedListener(edPassage1Watcher);
        Passage2.addTextChangedListener(edPassage2Watcher);
        Passage3.addTextChangedListener(edPassage3Watcher);
        Passage4.addTextChangedListener(edPassage4Watcher);
        Passage5.addTextChangedListener(edPassage5Watcher);
        Passage6.addTextChangedListener(edPassage6Watcher);
        Passage7.addTextChangedListener(edPassage7Watcher);
        Passage8.addTextChangedListener(edPassage8Watcher);
        Passage9.addTextChangedListener(edPassage9Watcher);


        Phone1 = (EditText) findViewById(R.id.edPhone1);
        Phone2 = (EditText) findViewById(R.id.edPhone2);
        Phone3 = (EditText) findViewById(R.id.edPhone3);
        Phone4 = (EditText) findViewById(R.id.edPhone4);
        Phone5 = (EditText) findViewById(R.id.edPhone5);
        Phone6 = (EditText) findViewById(R.id.edPhone6);
        Phone7 = (EditText) findViewById(R.id.edPhone7);
        Phone8 = (EditText) findViewById(R.id.edPhone8);
        Phone9 = (EditText) findViewById(R.id.edPhone9);

        Phone1.addTextChangedListener(edPhone1Watcher);
        Phone2.addTextChangedListener(edPhone2Watcher);
        Phone3.addTextChangedListener(edPhone3Watcher);
        Phone4.addTextChangedListener(edPhone4Watcher);
        Phone5.addTextChangedListener(edPhone5Watcher);
        Phone6.addTextChangedListener(edPhone6Watcher);
        Phone7.addTextChangedListener(edPhone7Watcher);
        Phone8.addTextChangedListener(edPhone8Watcher);
        Phone9.addTextChangedListener(edPhone9Watcher);


        Amount500 =(EditText) findViewById(R.id.edAmount500);
        Amount200 =(EditText) findViewById(R.id.edAmount200);
        Amount100 =(EditText) findViewById(R.id.edAmount100);
        Amount50 =(EditText) findViewById(R.id.edAmount50);
        Amount20 =(EditText) findViewById(R.id.edAmount20);
        Amount10 =(EditText) findViewById(R.id.edAmount10);
        Amount5 =(EditText) findViewById(R.id.edAmount5);
        Amount2 =(EditText) findViewById(R.id.edAmount2);
        Amount1 =(EditText) findViewById(R.id.edAmount1);

        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);
        Amount500.addTextChangedListener(edAmount500Watcher);


        edSumPrice = (EditText) findViewById(R.id.edSumPrice);
        edSumPassage = (EditText) findViewById(R.id.edSumPassage);
        edSumPhone = (EditText)findViewById(R.id.edSumPhone);

    }

    public int setPrice() {

        int resultPrice = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9;
        edSumPrice.setText(" " + resultPrice);
        return resultPrice;
    }

    public int setPassage(){

        int resultPassage = passage1+passage2+passage3+passage4+passage5+passage6+passage7+passage8
                +passage9;
        edSumPassage.setText(" "+resultPassage);
        return resultPassage;
    }

    public int setPhone(){
        int resultPhone = phone1+phone2+phone3+phone4+phone5+phone6+phone7+phone8+phone9;
        edSumPhone.setText(" "+ resultPhone);
        return resultPhone;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
            setPrice();
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
            setPrice();
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
            setPrice();
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
            setPrice();
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

            setPrice();
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
            setPrice();
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
            setPrice();
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
            setPrice();
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
            setPrice();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };


    TextWatcher edPassage1Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                passage1 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage1 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage2Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                passage2 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage2 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage3Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                passage3 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage3 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage4Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                passage4 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage4 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage5Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                passage5 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage5 = 0;
            }

            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage6Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                passage6 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage6 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage7Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                passage7 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage7 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage8Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                passage8 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage8 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPassage9Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                passage9 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                passage9 = 0;
            }
            setPassage();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    TextWatcher edPhone1Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                phone1 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone1 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone2Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                phone2 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone2 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone3Watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                phone3 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone3 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone4Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                phone4 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone4 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone5Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                phone5 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone5 = 0;
            }

            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone6Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            try {
                phone6 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone6 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone7Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                phone7 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone7 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone8Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                phone8 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone8 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    private TextWatcher edPhone9Watcher= new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            try {
                phone9 = Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
                phone9 = 0;
            }
            setPhone();
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}
