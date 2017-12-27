package ListViewAdapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import POJO_Classes.Option4;
import agha.databaseproject.R;
import butterknife.BindDrawable;
import butterknife.ButterKnife;

public class Option4Adapter extends BaseAdapter{

    private List<Option4> list;
    private LayoutInflater inflater ;
    private TextView id,course ;
    private Context context ;
    private FloatingActionButton accept,refuse;
    private RelativeLayout relativeLayout;

    private String PUT_URL = "https://ics324-project-server-side.herokuapp.com/editpreference";

    RequestQueue queue ;
    JsonObjectRequest jsonobjectRequest ;


    @BindDrawable(R.drawable.greenborder)
    Drawable greenBorder;

    @BindDrawable(R.drawable.redborder)
    Drawable redBorder;

    @BindDrawable(R.drawable.yellowborder)
    Drawable yellowBorder;

    public Option4Adapter(Context applicationContext , List<Option4> list) {
        this.list = list;
        inflater = LayoutInflater.from(applicationContext);
        queue = Volley.newRequestQueue(applicationContext);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.option4_listview,null);
        ButterKnife.bind(this,view);

        id = view.findViewById(R.id.chairman_lv_instructor_name);
        course = view.findViewById(R.id.chairman_lv_course_code);
        accept = view.findViewById(R.id.preference_accept);
        refuse = view.findViewById(R.id.preference_refuse);
        relativeLayout = view.findViewById(R.id.relativeLayout_pref);

        accept.setTag(i);
        refuse.setTag(i);

        if (list.get(i).getStatus().equals("inreview"))
            relativeLayout.setBackground(yellowBorder);
        else if (list.get(i).getStatus().equals("approved"))
            relativeLayout.setBackground(greenBorder);
        else
            relativeLayout.setBackground(redBorder);

        id.setText(list.get(i).getInstructorID()+"");
        course.setText(list.get(i).getCourseCode());

        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int pos = (Integer)view.getTag();

                JSONObject jsonobject = new JSONObject();

                try {
                    jsonobject.put("InstructorID", list.get(pos).getInstructorID()+"");
                    jsonobject.put("CourseCode", list.get(pos).getCourseCode());
                    jsonobject.put("Status", "approved");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                jsonobjectRequest = new JsonObjectRequest(Request.Method.PUT, PUT_URL, jsonobject, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("accept","done");
                        Log.e("id",id.getText().toString());
                        Log.e("course",course.getText().toString());
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }

                }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("InstructorID", list.get(pos).getInstructorID()+"");
                        params.put("CourseCode", list.get(pos).getCourseCode());
                        params.put("Status", "approved");

                        return params;
                    }
                };
                queue.add(jsonobjectRequest);

            }
        });

        refuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final int pos = (Integer)view.getTag();

                JSONObject jsonobject = new JSONObject();

                try {
                    jsonobject.put("InstructorID", list.get(pos).getInstructorID()+"");
                    jsonobject.put("CourseCode", list.get(pos).getCourseCode());
                    jsonobject.put("Status", "rejected");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                jsonobjectRequest = new JsonObjectRequest(Request.Method.PUT, PUT_URL, jsonobject, new Response.Listener<JSONObject>() {

                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("rejected","done");
                        Log.e("id",id.getText().toString());
                        Log.e("course",course.getText().toString());

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }

                }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("InstructorID", list.get(pos).getInstructorID()+"");
                        params.put("CourseCode", list.get(pos).getCourseCode());
                        params.put("Status", "rejected");

                        return params;
                    }
                };
                queue.add(jsonobjectRequest);

            }
        });

        return view;

    }
}
