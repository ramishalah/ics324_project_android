package ListViewAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import POJO_Classes.Option1;
import POJO_Classes.Option2;
import agha.databaseproject.R;

public class Option2Adapter extends BaseAdapter{

    private List<Option2> list;
    private LayoutInflater inflater ;
    private TextView Course;
    private Context context ;

    public Option2Adapter(Context applicationContext , List<Option2> list) {
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
        view = inflater.inflate(R.layout.option2_listview,null);
        Course = view.findViewById(R.id.option2_lv_course);
        Course.setText(list.get(i).getCourseCode()+ " : " + list.get(i).getCourseName());
        return view;
    }
}
