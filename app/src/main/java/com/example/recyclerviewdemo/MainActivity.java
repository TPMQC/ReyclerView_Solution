package com.example.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerviewdemo.model.Reminder;

import java.util.ArrayList;
import java.util.List;

import static android.widget.LinearLayout.HORIZONTAL;
import static android.widget.LinearLayout.VERTICAL;
/*Todo:
 * 1. Import recyclerView and add it to main activity
 * 2. Create a custom adapter, in this case, for Reminder object*/

public class MainActivity extends AppCompatActivity {
    //Todo:
    private RecyclerView recyclerView;
    private ReminderAdapter reminderAdapter;
    private List<Reminder> reminderList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Todo
        init();
    }

    //Todo:
    void init() {
        recyclerView = findViewById(R.id.recyclerview_id);
        reminderList = DataProvider.getSampleData();
        reminderAdapter = new ReminderAdapter(this, reminderList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(reminderAdapter);
        DividerItemDecoration itemDecor = new DividerItemDecoration(this, VERTICAL);
        recyclerView.addItemDecoration(itemDecor);
    }
}
