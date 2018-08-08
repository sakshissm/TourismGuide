package com.apkglobal.tourismguide;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.R.attr.button;

public class StatesActivity extends AppCompatActivity {
 Animation animation;
    int[] IMAGES={
            R.drawable.ap1,R.drawable.arp1,
            R.drawable.asm1,R.drawable.bhr1,
            R.drawable.chtg1,R.drawable.goa1,
            R.drawable.gurt1,R.drawable.hryn1,
            R.drawable.hmp1,R.drawable.jk1,
            R.drawable.jkh1,R.drawable.kar1,
            R.drawable.ker1,R.drawable.mp1,
            R.drawable.mhr1,R.drawable.man1,
            R.drawable.meg1,R.drawable.miz1,
            R.drawable.nag1,R.drawable.odi1,
            R.drawable.pun1,R.drawable.raj1,
            R.drawable.skm1,R.drawable.tn1,
            R.drawable.tel1,R.drawable.trp1,
            R.drawable.uk1,R.drawable.up1,
            R.drawable.wb1,R.drawable.del1};
    String[] state_name={
            "Andhra Pradesh","Arunachal Pradesh",
            "Assam","Bihar",
            "Chhattisgarh","Goa",
            "Gujarat","Haryana",
            "Himachal Pradesh", "Jammu & Kashmir",
            "Jharkhand","Karnataka",
            "Kerala", "Madhya Pradesh",
            "Maharashtra","Manipur",
            "Meghalaya","Mizoram",
            "Nagaland","Odisha",
            "Punjab","Rajasthan",
            "Sikkim","Tamil Nadu",
            "Telangana","Tripura ",
            "Uttarakhand ","Uttar Pradesh",
            "West Bengal","Delhi"
             };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);

      final  ListView listView=(ListView)findViewById(R.id.listview);
      final  CustomerAdapter customerAdapter=new CustomerAdapter();
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


    class CustomerAdapter extends BaseAdapter{


        @Override
        public Object getItem(int position) {

            return null;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.custom_layout_listview,null);
            CircleImageView circleImageView=(CircleImageView)convertView.findViewById(R.id.state_image);
            Button button=(Button)convertView.findViewById(R.id.state_button);

            circleImageView.setImageResource(IMAGES[position]);
            button.setText(state_name[position]);

            animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
            MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2,20);
            animation.setInterpolator(interpolator);
            button.startAnimation(animation);
            circleImageView.startAnimation(animation);

            View.OnClickListener myButtonClickListener=new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = (Integer) v.getTag();
                    switch (position)
                    {
                        case 0:
                            Intent intent0 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent0.putExtra("intVariableName", position);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent1.putExtra("intVariableName", position);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent2.putExtra("intVariableName", position);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent3.putExtra("intVariableName", position);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent4.putExtra("intVariableName", position);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent5.putExtra("intVariableName", position);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent6.putExtra("intVariableName", position);
                            startActivity(intent6);
                            break;
                        case 7:
                            Intent intent7 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent7.putExtra("intVariableName", position);
                            startActivity(intent7);
                            break;
                        case 8:
                            Intent intent8 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent8.putExtra("intVariableName", position);
                            startActivity(intent8);
                            break;
                        case 9:
                            Intent intent9 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent9.putExtra("intVariableName", position);
                            startActivity(intent9);
                            break;
                        case 10:
                            Intent intent10= new Intent(getApplicationContext(),PlacesActivity.class);
                            intent10.putExtra("intVariableName", position);
                            startActivity(intent10);
                            break;
                        case 11:
                            Intent intent11 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent11.putExtra("intVariableName", position);
                            startActivity(intent11);
                            break;
                        case 12:
                            Intent intent12 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent12.putExtra("intVariableName", position);
                            startActivity(intent12);
                            break;
                        case 13:
                            Intent intent13 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent13.putExtra("intVariableName", position);
                            startActivity(intent13);
                            break;
                        case 14:
                            Intent intent14= new Intent(getApplicationContext(),PlacesActivity.class);
                            intent14.putExtra("intVariableName", position);
                            startActivity(intent14);
                            break;
                        case 15:
                            Intent intent15 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent15.putExtra("intVariableName", position);
                            startActivity(intent15);
                            break;
                        case 16:
                            Intent intent16 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent16.putExtra("intVariableName", position);
                            startActivity(intent16);
                            break;
                        case 17:
                            Intent intent17 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent17.putExtra("intVariableName", position);
                            startActivity(intent17);
                            break;
                        case 18:
                            Intent intent18 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent18.putExtra("intVariableName", position);
                            startActivity(intent18);
                            break;
                        case 19:
                            Intent intent19 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent19.putExtra("intVariableName", position);
                            startActivity(intent19);
                            break;
                        case 20:
                            Intent intent20 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent20.putExtra("intVariableName", position);
                            startActivity(intent20);
                            break;
                        case 21:
                            Intent intent21 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent21.putExtra("intVariableName", position);
                            startActivity(intent21);
                            break;
                        case 22:
                            Intent intent22 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent22.putExtra("intVariableName", position);
                            startActivity(intent22);
                            break;
                        case 23:
                            Intent intent23 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent23.putExtra("intVariableName", position);
                            startActivity(intent23);
                            break;
                        case 24:
                            Intent intent24 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent24.putExtra("intVariableName", position);
                            startActivity(intent24);
                            break;
                        case 25:
                            Intent intent25 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent25.putExtra("intVariableName", position);
                            startActivity(intent25);
                            break;
                        case 26:
                            Intent intent26 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent26.putExtra("intVariableName", position);
                            startActivity(intent26);
                            break;
                        case 27:
                            Intent intent27 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent27.putExtra("intVariableName", position);
                            startActivity(intent27);
                            break;
                        case 28:
                            Intent intent28 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent28.putExtra("intVariableName", position);
                            startActivity(intent28);
                            break;
                        case 29:
                            Intent intent29 = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent29.putExtra("intVariableName", position);
                            startActivity(intent29);
                            break;
                        default:
                            Intent intent = new Intent(getApplicationContext(),PlacesActivity.class);
                            intent.putExtra("intVariableName", position);
                            startActivity(intent);
                            break;
                    }
                }
            };
            button.setTag(position);
            button.setOnClickListener(myButtonClickListener);
            circleImageView.setTag(position);
            circleImageView.setOnClickListener(myButtonClickListener);
            return convertView;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public int getCount() {
            return IMAGES.length;
        }
    }
}
