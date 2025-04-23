package com.example.a3rd_sem;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class List_Page extends AppCompatActivity {
    String name[]={"ram","Sita","Gita","shyam","Rahul","Binod sir","Rupak sir "
    ,"Asmit sir","prdip sir","sajesh sir ","ritesh "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_page);

        ListView list1=findViewById(R.id.list_items);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>
                (this,R.layout.list_items,R.id.items,name);
        list1.setAdapter(adapter);
    }
}