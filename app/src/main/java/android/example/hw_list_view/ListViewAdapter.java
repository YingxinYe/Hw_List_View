package android.example.hw_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    ArrayList<employee> mlist;
    Context context;
    LayoutInflater inflater;

    public ListViewAdapter(Context context,ArrayList<employee> list){
        this.context=context;
        mlist=list;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(R.layout.custom_list_view,parent,false);
        TextView id_text_view=view.findViewById(R.id.id_text_view);
        TextView name_text_view=view.findViewById(R.id.name_text_view);
        TextView department_text_view=view.findViewById(R.id.department_text_view);
        TextView salary_text_view=view.findViewById(R.id.salary_text_view);

        employee temp=mlist.get(position);
        id_text_view.setText(String.valueOf(temp.getId()));
        //id_text_view.setText(temp.getId());
        name_text_view.setText(temp.getName());
        department_text_view.setText(temp.getDepartment());
        salary_text_view.setText(String.valueOf(temp.getSalary()));

        return view;
    }
}
