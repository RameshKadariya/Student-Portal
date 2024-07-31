package com.example.studentportal;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.studentportal.Adapters.studentPortalAdapter;
import com.example.studentportal.Models.studentPortalModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Initialize the RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        // Set up the RecyclerView adapter and layout manager
        ArrayList<studentPortalModel> list =new ArrayList<>();

        list.add(new studentPortalModel(R.drawable.profile,"profile"));
        list.add(new studentPortalModel(R.drawable.event,"Events"));
        list.add(new studentPortalModel(R.drawable.staff,"Staffs"));
        list.add(new studentPortalModel(R.drawable.attende,"Attendence"));
        list.add(new studentPortalModel(R.drawable.chatbox,"ChatBox"));
        list.add(new studentPortalModel(R.drawable.gradesheet,"Gradesheet"));
        list.add(new studentPortalModel(R.drawable.gallery,"Gallery"));
        list.add(new studentPortalModel(R.drawable.fee,"Fees Details"));

        studentPortalAdapter adapter=new studentPortalAdapter(list,this);
        recyclerView.setAdapter(adapter);

        //Linear Layout Manager
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

        //Horizontal Linear Layout Manager
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);

        //Grid Layout Manager
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        //Staggered Layout Manager
//        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(staggeredGridLayoutManager);


    }
}