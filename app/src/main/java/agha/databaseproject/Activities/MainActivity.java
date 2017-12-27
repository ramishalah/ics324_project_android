package agha.databaseproject.Activities;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import Fragments.FragmentAdmin;
import Fragments.FragmentChairman;
import Fragments.FragmentInstructor;
import agha.databaseproject.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.container)
    ViewPager mViewPager;

    @BindView(R.id.tab_layout)
    TabLayout tabLayout ;

    SectionsPagerAdapter mSectionsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.colorBlack));
        tabLayout.setSelectedTabIndicatorHeight(10);


    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        // return each fragment depending on switch statement
        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0: return new FragmentAdmin();
                case 1: return new FragmentInstructor();
                case 2: return new FragmentChairman();
            }
            return new FragmentAdmin() ;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "ADMIN";
                case 1:
                    return "INSTRUCTOR";
                case 2:
                    return "CHAIRMAN";
            }
            return null;
        }
    }


}
