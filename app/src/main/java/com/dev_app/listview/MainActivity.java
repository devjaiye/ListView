package com.dev_app.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise ListView
        ListView myListView  = (ListView) findViewById(R.id.MyListView);

        //set values in the ListView
        final ArrayList<String> myMeal = new ArrayList<String>(asList("Rice","Salad","Chicken soup","Beans"));

        //Creates your listview
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myMeal);
        //displays the listview
        myListView.setAdapter(arrayAdapter);

        //On item click is set for the listview to perform an action
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Hello: "+myMeal.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
