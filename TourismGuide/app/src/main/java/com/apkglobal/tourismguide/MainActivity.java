package com.apkglobal.tourismguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.attr.animation;
import static android.R.attr.tabStripEnabled;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  Button month,states,near_by;
    TextView textView;
    Animation animation;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        month=(Button)findViewById(R.id.month);
        states=(Button)findViewById(R.id.states);
        textView=(TextView)findViewById(R.id.textview);
        near_by=(Button)findViewById(R.id.near_by);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

         ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);

        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);



        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.1,50);
        animation.setInterpolator(interpolator);
        month.startAnimation(animation);
        states.startAnimation(animation);
        textView.startAnimation(animation);
        near_by.startAnimation(animation);

        month.setOnClickListener(this);
        states.setOnClickListener(this);
        near_by.setOnClickListener(this);



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

    @Override
    public void onBackPressed() {
       moveTaskToBack(true);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id)
        {
            case R.id.month:
                {
                Intent intent = new Intent(getApplicationContext(),MonthActivity.class);
                startActivity(intent);
                    break;
                }
            case R.id.states:
            {
                Intent intent = new Intent(getApplicationContext(), StatesActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.near_by:
            {
                Intent intent = new Intent(getApplicationContext(),PlacesAPIActivity.class);
                startActivity(intent);
                break;
            }



        }
    }


    public class MyTimerTask extends TimerTask{
        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(viewPager.getCurrentItem()==0)
                        viewPager.setCurrentItem(1);
                    else if(viewPager.getCurrentItem()==1)
                    {
                        viewPager.setCurrentItem(2);
                    }
                    else if(viewPager.getCurrentItem()==2)
                    {
                        viewPager.setCurrentItem(3);
                    }
                    else if(viewPager.getCurrentItem()==3)
                    {
                        viewPager.setCurrentItem(4);
                    }
                    else if(viewPager.getCurrentItem()==4)
                    {
                        viewPager.setCurrentItem(0);
                    }

                }
            });
        }
    }




}
