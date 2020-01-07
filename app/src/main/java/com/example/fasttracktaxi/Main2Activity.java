package com.example.fasttracktaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.add:
            count=(TextView)findViewById(R.id.textView);
            count.setText("Add is clicked");
            return(true);
        case R.id.reset:
            count=(TextView)findViewById(R.id.textView);
            count.setText("Nothing is selected");
            return(true);
        case R.id.about:
            Toast.makeText(this, R.string.about, Toast.LENGTH_LONG).show();
            return(true);
        case R.id.exit:
            finish();
            return(true);

    }
        return(super.onOptionsItemSelected(item));
    }
}
