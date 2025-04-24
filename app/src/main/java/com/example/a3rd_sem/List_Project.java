package com.example.a3rd_sem;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class List_Project extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_project);

        ListView listView=findViewById(R.id.list);

        String[] title={"title1","Title2","Title3","Title 4"};
        String[] description={"This is Title 1","This is Title 2",
        "this is Title 3","This is Title 4"};
        int[] images ={R.drawable.images,R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,R.drawable.images};

        ItemsAdapter adapter=new ItemsAdapter(
                this,title,description,images);

        listView.setAdapter(adapter);
    }
}