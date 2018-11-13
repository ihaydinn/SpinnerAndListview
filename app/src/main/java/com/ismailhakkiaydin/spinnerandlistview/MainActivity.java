package com.ismailhakkiaydin.spinnerandlistview;

import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spnCountries;
    private ListView lstCities;

    private void init(){
        spnCountries = findViewById(R.id.spnCountries);
        lstCities = findViewById(R.id.lstCities);
    }

    private void spnCountries_Selection(){
        spnCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String selection = spnCountries.getItemAtPosition(position).toString();
                MainActivity.this.setTitle(selection);
                Binding(getCities(selection),lstCities);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private ArrayList<String> getCities(String country){
        ArrayList<String> cities = new ArrayList<>();

        switch (country){
            case "Turkey":
                cities.add("Istanbul");
                cities.add("Ankara");
                cities.add("Izmir");
                cities.add("Bursa");
                cities.add("Antalya");
                break;
            case "England":
                cities.add("London");
                cities.add("Liverpool");
                cities.add("Leeds");
                cities.add("Bristol");
                break;
            case "U.S.A":
                cities.add("Texas");
                cities.add("Newyork");
                cities.add("Washington");
                cities.add("California");
                break;
            case "Russia":
                    cities.add("Petersburg");
                    cities.add("Moscow");
                    cities.add("Kazan");
                    break;
            case "China":
                cities.add("Pekin");
                cities.add("Shanhai");
                cities.add("Hong Kong");
                break;
            case "Germany":
                cities.add("Koln");
                cities.add("Bremen");
                cities.add("Munich");
                break;

        }

        return cities;
    }


    private void Binding(ArrayList<String> data, ListView lst){
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, data);
        lst.setAdapter(adp);
    }

    private void registerHandlers(){
        spnCountries_Selection();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        registerHandlers();
    }

}
