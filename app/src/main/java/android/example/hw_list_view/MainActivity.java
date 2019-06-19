package android.example.hw_list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListViewAdapter adapter;
    ArrayList<employee> list;
    ListView main_custom_list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_custom_list_view=findViewById(R.id.main_custom_list_view);
        list=new ArrayList<>();

        employee temp;
        temp=new employee(1,"winnie","Internet Technology",50000);
        list.add(temp);
        temp=new employee(2,"miki","Internet Technology",55000);
        list.add(temp);
        temp=new employee(3,"Koey","Accounting",30000);
        list.add(temp);
        temp=new employee(4,"Ivan","finance",40000);
        list.add(temp);

        adapter=new ListViewAdapter(this,list);
        main_custom_list_view.setAdapter(adapter);

    }
}
