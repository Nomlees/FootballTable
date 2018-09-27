package com.example.user.footballtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAddOne (View view){
        counter++;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
    public void onClickAddTwo (View view){
        count++;
        TextView countView = (TextView)findViewById(R.id.txt_count);
        countView.setText(count.toString());
    }
    public void onClickNull (View view){
        counter = 0;
        count = 0;
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        TextView countView = (TextView)findViewById(R.id.txt_count);
        counterView.setText(counter.toString());
        countView.setText(count.toString());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }
}
