package Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import POJO_Classes.Option1;
import agha.databaseproject.Activities.Option1Activity;
import agha.databaseproject.Activities.Option2Activity;
import agha.databaseproject.Activities.Option5Activity;
import agha.databaseproject.Activities.Option6Activity;
import agha.databaseproject.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentAdmin extends Fragment {

    @BindView(R.id.admin_instructors_taught_courses)
    Button option1 ;

    @BindView(R.id.admin_courses_taught)
    Button option2 ;

    @BindView(R.id.admin_eligible_student)
    Button option5 ;

    @BindView(R.id.admin_eligible_instructors)
    Button option6 ;

    public FragmentAdmin() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_admin, container, false);
        ButterKnife.bind(this,view);

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Option1Activity.class);
                startActivity(intent);
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Option2Activity.class);
                startActivity(intent);
            }
        });

        option5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Option5Activity.class);
                startActivity(intent);
            }
        });

        option6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Option6Activity.class);
                startActivity(intent);
            }
        });

        return view ;
    }


}
