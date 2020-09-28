package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static class Number {
        int number;

        public Number (int input) {

            this.number = input;
        }

        public boolean isLeapYear() {
            int year = number;
            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    // year is divisible by 400, hence the year is a leap year
                    if ( year % 400 == 0)
                        return true;
                    else
                        return false;
                }
                else
                    return true;
            }
            else
                return false;
        }
    }

    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public void checkNumber(View view) {
        Log.i("Log info", "button pressed");
        EditText editText = (EditText) findViewById(R.id.inputText);
        String message;
        if (isNumeric(editText.getText().toString())) {
            message = editText.getText().toString();
            if (editText.getText().toString().length() != 4 ){
                message += " is not a year.";
            } else {
                Number input = new Number(Integer.parseInt(editText.getText().toString()));
                if (input.isLeapYear()) {
                    message += " is a leap year!";
                } else {
                    message += " is not a leap year.";
                }
            }
        }
        else if (editText.getText().toString().isEmpty()) {
            message = "Please enter a year";
        }
        else {
            message = "Your input isn't a number";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}