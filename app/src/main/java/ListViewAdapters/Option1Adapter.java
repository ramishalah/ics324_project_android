package ListViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import POJO_Classes.Option1;
import agha.databaseproject.R;

public class Option1Adapter extends BaseAdapter{

    private List<Option1> list;
    private LayoutInflater inflater ;
    private TextView name ;
    private Context context ;

    public Option1Adapter(Context applicationContext , List<Option1> list) {
        this.list = list;
        inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.option1_listview,null);
        name = view.findViewById(R.id.option1_lv_name);
        name.setText(list.get(i).getfName()+ " " + list.get(i).getLname());
        return view;
    }
}
