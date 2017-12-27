package ListViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import POJO_Classes.Option5;
import agha.databaseproject.R;

public class Option5Adapter extends BaseAdapter{

    private List<Option5> list;
    private LayoutInflater inflater ;
    private TextView name,id;
    private Context context ;

    public Option5Adapter(Context applicationContext , List<Option5> list) {
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
        view = inflater.inflate(R.layout.option5_listview,null);

        name = view.findViewById(R.id.option5_lv_name);
        id = view.findViewById(R.id.option5_lv_id);

        name.setText(list.get(i).getFirstName()+ " " + list.get(i).getLastName());
        id.setText(list.get(i).getId()+"");

        return view;
    }
}
