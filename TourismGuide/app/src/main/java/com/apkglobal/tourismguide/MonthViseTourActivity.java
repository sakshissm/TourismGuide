package com.apkglobal.tourismguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import static com.apkglobal.tourismguide.R.array.apr_desc;
import static com.apkglobal.tourismguide.R.array.apr_places;
import static com.apkglobal.tourismguide.R.array.aug_desc;
import static com.apkglobal.tourismguide.R.array.aug_places;
import static com.apkglobal.tourismguide.R.array.dec_desc;
import static com.apkglobal.tourismguide.R.array.dec_places;
import static com.apkglobal.tourismguide.R.array.feb_desc;
import static com.apkglobal.tourismguide.R.array.feb_places;
import static com.apkglobal.tourismguide.R.array.jan_desc;
import static com.apkglobal.tourismguide.R.array.jan_places;
import static com.apkglobal.tourismguide.R.array.july_desc;
import static com.apkglobal.tourismguide.R.array.july_places;
import static com.apkglobal.tourismguide.R.array.june_desc;
import static com.apkglobal.tourismguide.R.array.june_places;
import static com.apkglobal.tourismguide.R.array.mar_desc;
import static com.apkglobal.tourismguide.R.array.mar_places;
import static com.apkglobal.tourismguide.R.array.may_desc;
import static com.apkglobal.tourismguide.R.array.may_places;
import static com.apkglobal.tourismguide.R.array.nov_desc;
import static com.apkglobal.tourismguide.R.array.nov_places;
import static com.apkglobal.tourismguide.R.array.oct_desc;
import static com.apkglobal.tourismguide.R.array.oct_places;
import static com.apkglobal.tourismguide.R.array.sep_desc;
import static com.apkglobal.tourismguide.R.array.sep_places;

public class MonthViseTourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_vise_tour);


        ListView listView=(ListView)findViewById(R.id.listview3);
        MonthViseTourActivity.CustomerAdapter customerAdapter=new MonthViseTourActivity.CustomerAdapter();
        listView.setAdapter(customerAdapter);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    break;
                case R.id.navigation_feed_back:
                    Intent intent1=new Intent(getApplicationContext(),SendMail.class);
                    startActivity(intent1);
                    break;
                case R.id.navigation_about_us:

                    Intent intent2=new Intent(getApplicationContext(),About.class);
                    startActivity(intent2);
                    break;
            }
            return false;
        }

    };



    public class CustomerAdapter  extends BaseAdapter{
        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout_listview3, null);
            TextView place_name=(TextView)convertView.findViewById(R.id.month_place_name);
            TextView place_desc=(TextView)convertView.findViewById(R.id.month_place_desc);
            Intent mIntent = getIntent();
            int intValue = mIntent.getIntExtra("intVariableName", 0);
            switch(intValue)
            {
                case R.id.jan:
                    String[] jan_place=getResources().getStringArray(jan_places);
                    String[] jan_des=getResources().getStringArray(jan_desc);
                    place_name.setText(jan_place[position]);
                    place_desc.setText(jan_des[position]);
                    break;
                case R.id.feb:
                    String[] feb_place=getResources().getStringArray(feb_places);
                    String[] feb_des=getResources().getStringArray(feb_desc);
                    place_name.setText(feb_place[position]);
                    place_desc.setText(feb_des[position]);
                    break;
                case R.id.march:
                    String[] mar_place=getResources().getStringArray(mar_places);
                    String[] mar_des=getResources().getStringArray(mar_desc);
                    place_name.setText(mar_place[position]);
                    place_desc.setText(mar_des[position]);
                    break;
                case R.id.april:
                    String[] apr_place=getResources().getStringArray(apr_places);
                    String[] apr_des=getResources().getStringArray(apr_desc);
                    place_name.setText(apr_place[position]);
                    place_desc.setText(apr_des[position]);
                    break;
                case R.id.may:
                    String[] may_place=getResources().getStringArray(may_places);
                    String[] may_des=getResources().getStringArray(may_desc);
                    place_name.setText(may_place[position]);
                    place_desc.setText(may_des[position]);
                    break;
                case R.id.june:
                    String[] june_place=getResources().getStringArray(june_places);
                    String[] june_des=getResources().getStringArray(june_desc);
                    place_name.setText(june_place[position]);
                    place_desc.setText(june_des[position]);
                    break;
                case R.id.july:
                    String[] july_place=getResources().getStringArray(july_places);
                    String[] july_des=getResources().getStringArray(july_desc);
                    place_name.setText(july_place[position]);
                    place_desc.setText(july_des[position]);
                    break;
                case R.id.aug:
                    String[] aug_place=getResources().getStringArray(aug_places);
                    String[] aug_des=getResources().getStringArray(aug_desc);
                    place_name.setText(aug_place[position]);
                    place_desc.setText(aug_des[position]);
                    break;
                case R.id.sep:
                    String[] sep_place=getResources().getStringArray(sep_places);
                    String[] sep_des=getResources().getStringArray(sep_desc);
                    place_name.setText(sep_place[position]);
                    place_desc.setText(sep_des[position]);
                    break;
                case R.id.oct:
                    String[] oct_place=getResources().getStringArray(oct_places);
                    String[] oct_des=getResources().getStringArray(oct_desc);
                    place_name.setText(oct_place[position]);
                    place_desc.setText(oct_des[position]);
                    break;
                case R.id.nov:
                    String[] nov_place=getResources().getStringArray(nov_places);
                    String[] nov_des=getResources().getStringArray(nov_desc);
                    place_name.setText(nov_place[position]);
                    place_desc.setText(nov_des[position]);
                    break;
                case R.id.dec:
                    String[] dec_place=getResources().getStringArray(dec_places);
                    String[] dec_des=getResources().getStringArray(dec_desc);
                    place_name.setText(dec_place[position]);
                    place_desc.setText(dec_des[position]);
                    break;
            }
            return convertView;
        }
    }
}
