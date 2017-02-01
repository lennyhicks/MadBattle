package inburst.madbattle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import inburst.madbattle.Admin.ItemEditor;
import inburst.madbattle.Globals.Config;

public class MainActivity extends AppCompatActivity {

    protected ImageView mImageView;
    protected EditText mMonsterName;
    protected TextView mLevelText;
    protected EditText mEditText6;
    protected TextView mTextView;
    protected TabWidget mTabs;
    protected TextView mTextView5;
    protected EditText mMonsterAttack;
    protected EditText mMonsterDefense;
    protected EditText mMonsterStrength;
    protected EditText mMonsterHealth;
    protected LinearLayout mStats;
    protected LinearLayout mDrops;
    protected FrameLayout mTabcontent;
    protected TabHost mEditMonster;
    protected Button mButtonSaveMonster;
    /**
     * The {@link PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.fragment_npc_editor);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        // Create the adapter that will return a fragment for each of the three
//        // primary sections of the activity.
//        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
//
//        // Set up the ViewPager with the sections adapter.
//        mViewPager = (ViewPager) findViewById(R.id.container);
//        mViewPager.setAdapter(mSectionsPagerAdapter);
//
//        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(mViewPager);
        initView();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        mImageView = (ImageView) findViewById(R.id.imageView);
        mMonsterName = (EditText) findViewById(R.id.monsterName);
        mLevelText = (TextView) findViewById(R.id.level_text);
        mEditText6 = (EditText) findViewById(R.id.editText6);
        mTextView = (TextView) findViewById(R.id.textView);
        mTabs = (TabWidget) findViewById(android.R.id.tabs);
        mTextView5 = (TextView) findViewById(R.id.textView5);
        mMonsterAttack = (EditText) findViewById(R.id.monster_attack);
        mMonsterDefense = (EditText) findViewById(R.id.monster_defense);
        mMonsterStrength = (EditText) findViewById(R.id.monster_strength);
        mMonsterHealth = (EditText) findViewById(R.id.monster_health);
        mStats = (LinearLayout) findViewById(R.id.stats);
        mDrops = (LinearLayout) findViewById(R.id.drops);
        mTabcontent = (FrameLayout) findViewById(android.R.id.tabcontent);
        mEditMonster = (TabHost) findViewById(R.id.edit_monster);
        mButtonSaveMonster = (Button) findViewById(R.id.button_save_monster);

        mEditMonster.setup();


        TabHost.TabSpec statTab = mEditMonster.newTabSpec("Stat Tab");
        statTab.setIndicator("Stats");
        statTab.setContent(R.id.stats);
        mEditMonster.addTab(statTab);


        TabHost.TabSpec dropTab = mEditMonster.newTabSpec("Drop Tab");
        dropTab.setIndicator("Drops");
        dropTab.setContent(R.id.drops);
        mEditMonster.addTab(dropTab);

        mEditMonster.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                for(int i=0;i<mEditMonster.getTabWidget().getChildCount();i++)
                {
                    View view = mEditMonster.getTabWidget().getChildTabViewAt(i);
                    if ( view != null ) {
                        //view.setBackgroundColor(R.drawable.tab_color) ;

                        // get title text view
                    }

                }           }
        });

        mEditMonster.setCurrentTab(0);

        ItemEditor.rerollItem(50, 1.0, Config.ITEM_ROLL_MIN_MASTER, Config.ITEM_ROLL_MAX_MASTER);


    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
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
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }
}
