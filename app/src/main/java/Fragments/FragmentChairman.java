package Fragments;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.List;

import ListViewAdapters.Option4Adapter;
import POJO_Classes.Option4;
import agha.databaseproject.R;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentChairman extends Fragment {

    @BindView(R.id.get_preferences)
    Button getPreferences;

    @BindView(R.id.preferences_lv)
    ListView listView;

    @BindDrawable(R.drawable.greenborder)
    Drawable greenBorder;

    @BindDrawable(R.drawable.redborder)
    Drawable redBorder;

    @BindDrawable(R.drawable.yellowborder)
    Drawable yellowBorder;

    Option4Adapter adapter ;

    private String GET_URL = "https://ics324-project-server-side.herokuapp.com/preferences";
    private String PUT_URL = "https://ics324-project-server-side.herokuapp.com/editpreference";

    public FragmentChairman() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chairman, container, false);
        ButterKnife.bind(this,view);

        getPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestQueue queue = Volley.newRequestQueue(getContext());

                StringRequest stringRequest = new StringRequest(Request.Method.GET, GET_URL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        GsonBuilder builder = new GsonBuilder();
                        Gson gson = builder.create();
                        Log.e("response",response);
                        List<Option4> list = Arrays.asList(gson.fromJson(response,Option4[].class));

                        adapter = new Option4Adapter(getContext(),list);
                        listView.setAdapter(adapter);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("response","empty");
                    }
                });
                queue.add(stringRequest);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.e("index",i+"");
            }
        });


        return view ;
    }

}
