package com.apkglobal.tourismguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MonthActivity extends AppCompatActivity implements View.OnClickListener {
  Button jan,feb,mar,april,may,june,july,aug,sep,oct,nov,dec;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        jan=(Button)findViewById(R.id.jan);
        feb=(Button)findViewById(R.id.feb);
        mar=(Button)findViewById(R.id.march);
        april=(Button)findViewById(R.id.april);
        may=(Button)findViewById(R.id.may);
        june=(Button)findViewById(R.id.june);
        july=(Button)findViewById(R.id.july);
        aug=(Button)findViewById((R.id.aug));
        sep=(Button)findViewById(R.id.sep);
        oct=(Button)findViewById(R.id.oct);
        nov=(Button)findViewById(R.id.nov);
        dec=(Button)findViewById(R.id.dec);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2,20);
        animation.setInterpolator(interpolator);
        jan.startAnimation(animation);
        feb.startAnimation(animation);
        mar.startAnimation(animation);
        april.startAnimation(animation);
        may.startAnimation(animation);
        june.startAnimation(animation);
        july.startAnimation(animation);
        aug.startAnimation(animation);
        sep.startAnimation(animation);
        oct.startAnimation(animation);
        nov.startAnimation(animation);
        dec.startAnimation(animation);

        jan.setOnClickListener(this);
        feb.setOnClickListener(this);
        mar.setOnClickListener(this);
        april.setOnClickListener(this);
        may.setOnClickListener(this);
        june.setOnClickListener(this);
        july.setOnClickListener(this);
        aug.setOnClickListener(this);
        sep.setOnClickListener(this);
        oct.setOnClickListener(this);
        nov.setOnClickListener(this);
        dec.setOnClickListener(this);


    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.jan:
                Intent jan_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                jan_intent.putExtra("intVariableName", v.getId());
                startActivity(jan_intent);
                break;
            case R.id.feb:
                Intent feb_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                feb_intent.putExtra("intVariableName", v.getId());
                startActivity(feb_intent);
                break;
            case R.id.march:
                Intent march_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                march_intent.putExtra("intVariableName", v.getId());
                startActivity(march_intent);
                break;
            case R.id.april:
                Intent april_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                april_intent.putExtra("intVariableName", v.getId());
                startActivity(april_intent);
                break;
            case R.id.may:
                Intent may_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                may_intent.putExtra("intVariableName", v.getId());
                startActivity(may_intent);
                break;
            case R.id.june:
                Intent june_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                june_intent.putExtra("intVariableName", v.getId());
                startActivity(june_intent);
                break;
            case R.id.july:
                Intent july_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                july_intent.putExtra("intVariableName", v.getId());
                startActivity(july_intent);
                break;
            case R.id.aug:
                Intent aug_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                aug_intent.putExtra("intVariableName", v.getId());
                startActivity(aug_intent);
                break;
            case R.id.sep:
                Intent sep_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                sep_intent.putExtra("intVariableName", v.getId());
                startActivity(sep_intent);
                break;
            case R.id.oct:
                Intent oct_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                oct_intent.putExtra("intVariableName", v.getId());
                startActivity(oct_intent);
                break;
            case R.id.nov:
                Intent nov_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                nov_intent.putExtra("intVariableName", v.getId());
                startActivity(nov_intent);
                break;
            case R.id.dec:
                Intent dec_intent=new Intent(getApplicationContext(),MonthViseTourActivity.class);
                dec_intent.putExtra("intVariableName", v.getId());
                startActivity(dec_intent);
                break;



        }
    }
}
