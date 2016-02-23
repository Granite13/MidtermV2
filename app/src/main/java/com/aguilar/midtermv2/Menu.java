package com.aguilar.midtermv2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by whyaguilar on 2/23/16.
 */
public class Menu extends ListActivity {

    //temporary for listActivity

    private static String url = "http://joseniandroid.herokuapp.com/api/books/";

    private static final String TAG_ID = "id";
    private static final String TAG_TITLE = "name";
    private static final String TAG_GENRE = "genre";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_ISREAD = "status";


    JSONArray contacts = null;

    // Hashmap for ListView
    ArrayList<HashMap<String, String>> booklist;

    // ---- Temp to populate List
    String booklisted[] = {"Name of Book 1","Name of Book 2","Name of Book 3","Name of Book 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,booklisted));
        booklist = new ArrayList<HashMap<String, String>>();
        ListView lv = getListView();
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        try{
            Intent ourIntent = new Intent();
            startActivity(ourIntent);
        }catch(Exception e){
            e.printStackTrace();
        }




    }
}
