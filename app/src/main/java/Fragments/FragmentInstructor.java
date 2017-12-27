package Fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import agha.databaseproject.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentInstructor extends Fragment {

    @BindView(R.id.preference1_spinner)
    AppCompatSpinner spinner1;

    @BindView(R.id.preference2_spinner)
    AppCompatSpinner spinner2;

    @BindView(R.id.preference3_spinner)
    AppCompatSpinner spinner3;

    @BindView(R.id.preference4_spinner)
    AppCompatSpinner spinner4;

    @BindView(R.id.preference5_spinner)
    AppCompatSpinner spinner5;

    @BindView(R.id.preferences_submit)
    FloatingActionButton button;

    @BindView(R.id.instructor_id)
    TextView id;

    private String URL = "https://ics324-project-server-side.herokuapp.com/addpreference";

    public FragmentInstructor() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_instructor, container, false);
        ButterKnife.bind(this, view);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(),
                R.array.ics_courses, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(spinnerAdapter);
        spinner2.setAdapter(spinnerAdapter);
        spinner3.setAdapter(spinnerAdapter);
        spinner4.setAdapter(spinnerAdapter);
        spinner5.setAdapter(spinnerAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RequestQueue queue = Volley.newRequestQueue(getContext());
                JsonObjectRequest jsonobjectRequest ;

                // First Course
                if (!isEmpty(spinner1.getSelectedItem().toString().trim())) {

                    JSONObject jsonobject = new JSONObject();

                    try {
                        jsonobject.put("InstructorID", id.getText().toString());
                        jsonobject.put("CourseCode", spinner1.getSelectedItem().toString().trim());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    jsonobjectRequest = new JsonObjectRequest(Request.Method.POST, URL, jsonobject, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            Log.e("spinner1","done");
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }

                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<String, String>();
                            params.put("InstructorID", id.getText().toString());
                            params.put("CourseCode", spinner1.getSelectedItem().toString().trim());

                            return params;
                        }
                    };
                    queue.add(jsonobjectRequest);
                }

                // Second Course
                if (!isEmpty(spinner2.getSelectedItem().toString().trim())) {

                    JSONObject jsonobject = new JSONObject();

                    try {
                        jsonobject.put("InstructorID", id.getText().toString());
                        jsonobject.put("CourseCode", spinner2.getSelectedItem().toString().trim());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    jsonobjectRequest = new JsonObjectRequest(Request.Method.POST, URL, jsonobject, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            Log.e("spinner2","done");
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }

                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<String, String>();
                            params.put("InstructorID", id.getText().toString());
                            params.put("CourseCode", spinner2.getSelectedItem().toString().trim());

                            return params;
                        }
                    };
                    queue.add(jsonobjectRequest);
                }

                // Third Course
                if (!isEmpty(spinner3.getSelectedItem().toString().trim())) {

                    JSONObject jsonobject = new JSONObject();

                    try {
                        jsonobject.put("InstructorID", id.getText().toString());
                        jsonobject.put("CourseCode", spinner3.getSelectedItem().toString().trim());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    jsonobjectRequest = new JsonObjectRequest(Request.Method.POST, URL, jsonobject, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            Log.e("spinner3","done");
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }

                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<String, String>();
                            params.put("InstructorID", id.getText().toString());
                            params.put("CourseCode", spinner3.getSelectedItem().toString().trim());

                            return params;
                        }
                    };
                    queue.add(jsonobjectRequest);
                }

                // Forth Course
                if (!isEmpty(spinner4.getSelectedItem().toString().trim())) {

                    JSONObject jsonobject = new JSONObject();

                    try {
                        jsonobject.put("InstructorID", id.getText().toString());
                        jsonobject.put("CourseCode", spinner4.getSelectedItem().toString().trim());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    jsonobjectRequest = new JsonObjectRequest(Request.Method.POST, URL, jsonobject, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            Log.e("spinner4","done");
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }

                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<String, String>();
                            params.put("InstructorID", id.getText().toString());
                            params.put("CourseCode", spinner4.getSelectedItem().toString().trim());

                            return params;
                        }
                    };
                    queue.add(jsonobjectRequest);
                }

                // Forth Course
                if (!isEmpty(spinner5.getSelectedItem().toString().trim())) {

                    JSONObject jsonobject = new JSONObject();

                    try {
                        jsonobject.put("InstructorID", id.getText().toString());
                        jsonobject.put("CourseCode", spinner5.getSelectedItem().toString().trim());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    jsonobjectRequest = new JsonObjectRequest(Request.Method.POST, URL, jsonobject, new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {
                            Log.e("spinner5","done");
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }

                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<String, String>();
                            params.put("InstructorID", id.getText().toString());
                            params.put("CourseCode", spinner5.getSelectedItem().toString().trim());

                            return params;
                        }
                    };
                    queue.add(jsonobjectRequest);
                }
            }
        });

        return view;
    }

    private boolean isEmpty(String str) {
        return (str.equals("Course List ..."));
    }

}
