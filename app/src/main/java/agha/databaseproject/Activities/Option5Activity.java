package agha.databaseproject.Activities;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ListViewAdapters.Option5Adapter;
import POJO_Classes.Option5;
import agha.databaseproject.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Option5Activity extends AppCompatActivity {

    @BindView(R.id.option5_spinner)
    AppCompatSpinner spinner;

    @BindView(R.id.option5_lv)
    ListView lv ;

    @BindView(R.id.option5_search)
    FloatingActionButton button ;

    private String URL = "https://ics324-project-server-side.herokuapp.com/";
    private Option5Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option5);
        ButterKnife.bind(this);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.ics_courses, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                String newURL = URL + spinner.getSelectedItem().toString();

                Log.e("URL",newURL);

                StringRequest stringRequest = new StringRequest(Request.Method.GET, newURL, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        GsonBuilder builder = new GsonBuilder();
                        Gson gson = builder.create();
                        Log.e("response",response);
                        List<Option5> list = Arrays.asList(gson.fromJson(response, Option5[].class));

                        adapter = new Option5Adapter(getApplicationContext(),list);
                        lv.setAdapter(adapter);

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
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
