package com.example.yvtc.yvtc062904;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner, spinner2;
    TextView tv, tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                TextView tv = (TextView) view;
//                String str = tv.getText().toString();
//                Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();

                String cityArray[] = getResources().getStringArray(R.array.city);
                // Toast.makeText(MainActivity.this, cityArray[position], Toast.LENGTH_SHORT).show();
                tv.setText(cityArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        String[] arr2 = {"蘋果", "香蕉", "鳳梨", "芭樂"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, arr2);
        spinner2.setAdapter(adapter);


    }
    public void click1(View v)
    {
        int sel = spinner.getSelectedItemPosition();
        String cityArray[] = getResources().getStringArray(R.array.city);
        tv2.setText(cityArray[sel]);
    }


}
