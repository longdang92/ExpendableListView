package com.example.longdang.expendablelistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {

    private ExpandableListAdapter listAdapter;
    private ExpandableListView listView;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView) findViewById(R.id.LvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void initData(){
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("Long Dang");
        listDataHeader.add("Thuong Dang");
        listDataHeader.add("Dat Dang");
        listDataHeader.add("Thanh Dang");

        List<String> listName = new ArrayList<>();
        listName.add("This is Expandable ListView");

        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Expandable ListView");
        androidStudio.add("Google Map");
        androidStudio.add("Chat");
        androidStudio.add("Application");
        androidStudio.add("Long Dang");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Xamarin Expandable ListView");
        xamarin.add("Xamarin Google Map");
        xamarin.add("Xamarin Chat");
        xamarin.add("Xamarin Application");
        xamarin.add("Xamarin Long Dang");

        List<String> loda = new ArrayList<>();
        loda.add("Loda Expandable ListView");
        loda.add("Loda Google Map");
        loda.add("Loda Chat");
        loda.add("Loda Application");
        loda.add("Loda Long Dang");

        listHashMap.put(listDataHeader.get(0),listName);
        listHashMap.put(listDataHeader.get(1),androidStudio);
        listHashMap.put(listDataHeader.get(2),xamarin);
        listHashMap.put(listDataHeader.get(3),loda);

    }

}
