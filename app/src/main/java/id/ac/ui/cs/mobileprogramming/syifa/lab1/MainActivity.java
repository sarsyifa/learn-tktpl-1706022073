package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView iViewDice;
    private Random rnd = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        iViewDice = findViewById(R.id.image_view_dice);
        iViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

        Button rollButton = findViewById(R.id.button);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
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

    private void rollDice() {
        int randomNumber = rnd.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                iViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                iViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                iViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                iViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                iViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                iViewDice.setImageResource(R.drawable.dice6);
                break;
        }
    }
}