package monthsortinglist.android.acadgild.com.monthsortinglist;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class months_sorting_list extends AppCompatActivity {

    ListView list;
    String[] subjects= new String[]{"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep",
            "Oct", "Nov", "Dec"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorting_months_list);

        list= (ListView)findViewById(R.id.monthsList);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subjects){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);
                textView.setTextColor(Color.WHITE);
                return textView;
            }
        };
        list.setAdapter(adapter);
    }

    public void sortAscending(View v)
    {
        Arrays.sort(subjects);
        list= (ListView)findViewById(R.id.monthsList);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subjects){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);
                textView.setTextColor(Color.WHITE);
                return textView;
            }
        };
        list.setAdapter(adapter);
    }

    public void sortDescending(View v)
    {
        Arrays.sort(subjects, Collections.reverseOrder());
        list= (ListView)findViewById(R.id.monthsList);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, subjects){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                TextView textView = (TextView) super.getView(position, convertView, parent);
                textView.setTextColor(Color.WHITE);
                return textView;
            }
        };
        list.setAdapter(adapter);
    }



}
