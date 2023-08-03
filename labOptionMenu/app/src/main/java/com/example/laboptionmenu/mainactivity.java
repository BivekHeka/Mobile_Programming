package com.example.laboptionmenu;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class mainactivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text=(TextView) findViewById(R.id.text);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.setting){
            text.setText("setting");
            return true;
        }
        else if (item.getItemId()==R.id.history){
            text.setText("history");
            return true;

        }
        else if (item.getItemId()==R.id.help){
            text.setText("help");
            return true;

        }
        else if (item.getItemId()==R.id.share){
            text.setText("share");
            return true;

        }
        else if (item.getItemId()==R.id.logout){
            text.setText("logout");
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
