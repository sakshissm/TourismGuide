package com.apkglobal.tourismguide;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
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

import static com.apkglobal.tourismguide.R.array.arp_add;
import static com.apkglobal.tourismguide.R.array.arp_desc;
import static com.apkglobal.tourismguide.R.array.arp_places;
import static com.apkglobal.tourismguide.R.array.asm_add;
import static com.apkglobal.tourismguide.R.array.asm_desc;
import static com.apkglobal.tourismguide.R.array.asm_places;
import static com.apkglobal.tourismguide.R.array.bhr_add;
import static com.apkglobal.tourismguide.R.array.bhr_desc;
import static com.apkglobal.tourismguide.R.array.bhr_places;
import static com.apkglobal.tourismguide.R.array.chtg_add;
import static com.apkglobal.tourismguide.R.array.chtg_desc;
import static com.apkglobal.tourismguide.R.array.chtg_places;
import static com.apkglobal.tourismguide.R.array.del_add;
import static com.apkglobal.tourismguide.R.array.del_desc;
import static com.apkglobal.tourismguide.R.array.del_places;
import static com.apkglobal.tourismguide.R.array.goa_add;
import static com.apkglobal.tourismguide.R.array.goa_desc;
import static com.apkglobal.tourismguide.R.array.goa_places;
import static com.apkglobal.tourismguide.R.array.gurt_add;
import static com.apkglobal.tourismguide.R.array.gurt_desc;
import static com.apkglobal.tourismguide.R.array.gurt_places;
import static com.apkglobal.tourismguide.R.array.hmp_add;
import static com.apkglobal.tourismguide.R.array.hmp_desc;
import static com.apkglobal.tourismguide.R.array.hmp_places;
import static com.apkglobal.tourismguide.R.array.hryn_add;
import static com.apkglobal.tourismguide.R.array.hryn_desc;
import static com.apkglobal.tourismguide.R.array.hryn_places;
import static com.apkglobal.tourismguide.R.array.jk_add;
import static com.apkglobal.tourismguide.R.array.jk_desc;
import static com.apkglobal.tourismguide.R.array.jk_places;
import static com.apkglobal.tourismguide.R.array.jkh_add;
import static com.apkglobal.tourismguide.R.array.jkh_desc;
import static com.apkglobal.tourismguide.R.array.jkh_places;
import static com.apkglobal.tourismguide.R.array.kar_add;
import static com.apkglobal.tourismguide.R.array.kar_desc;
import static com.apkglobal.tourismguide.R.array.kar_places;
import static com.apkglobal.tourismguide.R.array.ker_add;
import static com.apkglobal.tourismguide.R.array.ker_desc;
import static com.apkglobal.tourismguide.R.array.ker_places;
import static com.apkglobal.tourismguide.R.array.man_add;
import static com.apkglobal.tourismguide.R.array.man_desc;
import static com.apkglobal.tourismguide.R.array.man_places;
import static com.apkglobal.tourismguide.R.array.meg_add;
import static com.apkglobal.tourismguide.R.array.meg_desc;
import static com.apkglobal.tourismguide.R.array.meg_places;
import static com.apkglobal.tourismguide.R.array.mhr_add;
import static com.apkglobal.tourismguide.R.array.mhr_desc;
import static com.apkglobal.tourismguide.R.array.mhr_places;
import static com.apkglobal.tourismguide.R.array.miz_add;
import static com.apkglobal.tourismguide.R.array.miz_desc;
import static com.apkglobal.tourismguide.R.array.miz_places;
import static com.apkglobal.tourismguide.R.array.mp_add;
import static com.apkglobal.tourismguide.R.array.mp_desc;
import static com.apkglobal.tourismguide.R.array.mp_places;
import static com.apkglobal.tourismguide.R.array.nag_add;
import static com.apkglobal.tourismguide.R.array.nag_desc;
import static com.apkglobal.tourismguide.R.array.nag_places;
import static com.apkglobal.tourismguide.R.array.odi_add;
import static com.apkglobal.tourismguide.R.array.odi_desc;
import static com.apkglobal.tourismguide.R.array.odi_places;
import static com.apkglobal.tourismguide.R.array.pun_add;
import static com.apkglobal.tourismguide.R.array.pun_desc;
import static com.apkglobal.tourismguide.R.array.pun_places;
import static com.apkglobal.tourismguide.R.array.raj_add;
import static com.apkglobal.tourismguide.R.array.raj_desc;
import static com.apkglobal.tourismguide.R.array.raj_places;
import static com.apkglobal.tourismguide.R.array.skm_add;
import static com.apkglobal.tourismguide.R.array.skm_desc;
import static com.apkglobal.tourismguide.R.array.skm_places;
import static com.apkglobal.tourismguide.R.array.tel_add;
import static com.apkglobal.tourismguide.R.array.tel_desc;
import static com.apkglobal.tourismguide.R.array.tel_places;
import static com.apkglobal.tourismguide.R.array.tn_add;
import static com.apkglobal.tourismguide.R.array.tn_desc;
import static com.apkglobal.tourismguide.R.array.tn_places;
import static com.apkglobal.tourismguide.R.array.trp_add;
import static com.apkglobal.tourismguide.R.array.trp_desc;
import static com.apkglobal.tourismguide.R.array.trp_places;
import static com.apkglobal.tourismguide.R.array.uk_add;
import static com.apkglobal.tourismguide.R.array.uk_desc;
import static com.apkglobal.tourismguide.R.array.uk_places;
import static com.apkglobal.tourismguide.R.array.up_add;
import static com.apkglobal.tourismguide.R.array.up_desc;
import static com.apkglobal.tourismguide.R.array.up_places;
import static com.apkglobal.tourismguide.R.array.wb_add;
import static com.apkglobal.tourismguide.R.array.wb_desc;
import static com.apkglobal.tourismguide.R.array.wb_places;
import static com.apkglobal.tourismguide.R.string.ap_add1;
import static com.apkglobal.tourismguide.R.string.ap_add10;
import static com.apkglobal.tourismguide.R.string.ap_add2;
import static com.apkglobal.tourismguide.R.string.ap_add3;
import static com.apkglobal.tourismguide.R.string.ap_add4;
import static com.apkglobal.tourismguide.R.string.ap_add5;
import static com.apkglobal.tourismguide.R.string.ap_add6;
import static com.apkglobal.tourismguide.R.string.ap_add7;
import static com.apkglobal.tourismguide.R.string.ap_add8;
import static com.apkglobal.tourismguide.R.string.ap_add9;
import static com.apkglobal.tourismguide.R.string.ap_desc1;
import static com.apkglobal.tourismguide.R.string.ap_desc10;
import static com.apkglobal.tourismguide.R.string.ap_desc2;
import static com.apkglobal.tourismguide.R.string.ap_desc3;
import static com.apkglobal.tourismguide.R.string.ap_desc4;
import static com.apkglobal.tourismguide.R.string.ap_desc5;
import static com.apkglobal.tourismguide.R.string.ap_desc6;
import static com.apkglobal.tourismguide.R.string.ap_desc7;
import static com.apkglobal.tourismguide.R.string.ap_desc8;
import static com.apkglobal.tourismguide.R.string.ap_desc9;

public class PlacesActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);


        ListView listView=(ListView)findViewById(R.id.listview2);
        PlacesActivity.CustomerAdapter customerAdapter=new PlacesActivity.CustomerAdapter();
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
    public class CustomerAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 10;
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
        public View getView( int position, View convertView, ViewGroup parent)
        {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout_listview2, null);
            final CircleImageView circleImageView = (CircleImageView) convertView.findViewById(R.id.state_image);
            TextView place_name = (TextView) convertView.findViewById(R.id.place_name);
            final TextView place_desc = (TextView) convertView.findViewById(R.id.place_desc);
            final TextView address = (TextView) convertView.findViewById(R.id.address);
            final ImageView imageview=(ImageView)convertView.findViewById(R.id.img_view3);

            View.OnClickListener myfirstclick=new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    circleImageView.setVisibility(View.INVISIBLE);
                    imageview.setVisibility(View.VISIBLE);
                    address.setVisibility(View.INVISIBLE);
                    place_desc.setVisibility(View.VISIBLE);
                }
            };
            circleImageView.setOnClickListener(myfirstclick);
            address.setOnClickListener(myfirstclick);

            View.OnClickListener mysecondclick=new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    circleImageView.setVisibility(View.VISIBLE);
                    imageview.setVisibility(View.INVISIBLE);
                    address.setVisibility(View.VISIBLE);
                    place_desc.setVisibility(View.INVISIBLE);
                }
            };
            imageview.setOnClickListener(mysecondclick);
            place_desc.setOnClickListener(mysecondclick);


            Bundle extras = getIntent().getExtras();

            int intValue = extras.getInt("intVariableName");


            switch (intValue)
            {
                case 0:
                    int[] IMAGES_AP={R.drawable.ap1,R.drawable.ap2,R.drawable.ap3,R.drawable.ap4,R.drawable.ap5,R.drawable.ap6,R.drawable.ap7,
                            R.drawable.ap8,R.drawable.ap9,R.drawable.ap10};
                    String[] Andhra_pradesh_places={"Venkateswara Temple, Tirumala",
                            "Ramakrishna Mission Beach",
                            "Veerabhadra Temple, Lepakshi",
                            "Mallikarjuna Jyotirlinga",
                            "Belum Caves",
                            "Kanaka Durga Temple",
                            "Varaha Lakshmi Narasimha temple, Simhachalam",
                            "Talakona","Srikalahasteeswara temple","INS Kursura (S20)"};
                 String[] AP_desc= { getString(ap_desc1),   getString(ap_desc2),
                             getString(ap_desc3),   getString(ap_desc4),
                             getString (ap_desc5),  getString (ap_desc6),
                             getString (ap_desc7),   getString(ap_desc8),
                             getString(ap_desc9),   getString(ap_desc10)};
                    String[] AP_addres= { getString(ap_add1),  getString(ap_add2),
                             getString(ap_add3),  getString(ap_add4),
                            getString(ap_add5),  getString(ap_add6),
                             getString(ap_add7),  getString(ap_add8),
                            getString(ap_add9),  getString(ap_add10)};
                    imageview.setImageResource(IMAGES_AP[position]);
                    circleImageView.setImageResource(IMAGES_AP[position]);
                    place_name.setText(Andhra_pradesh_places[position]);
                    address.setText(AP_addres[position]);
                    place_desc.setText(AP_desc[position]);



                    break;
                case 1:
                    int[] IMAGES_arp={R.drawable.arp1,R.drawable.arp2,R.drawable.arp3,R.drawable.arp4,R.drawable.arp5,
                            R.drawable.arp6,R.drawable.arp7,R.drawable.arp8,R.drawable.arp9,R.drawable.arp10,};
                        String[] arp_place = getResources().getStringArray(arp_places);
                        String[] arp_descp = getResources().getStringArray(arp_desc);
                        String[] arp_addr = getResources().getStringArray(arp_add);

                    circleImageView.setImageResource(IMAGES_arp[position]);
                    place_name.setText(arp_place[position]);
                    place_desc.setText(arp_descp[position]);
                    address.setText(arp_addr[position]);
                    imageview.setImageResource(IMAGES_arp[position]);

                    break;
                case 2:
                   int[] IMAGES_asm={R.drawable.asm1,R.drawable.asm2,R.drawable.asm3,R.drawable.asm4,R.drawable.asm5,
                           R.drawable.asm6,R.drawable.asm7,R.drawable.asm8,R.drawable.asm9,R.drawable.asm10};

                    String[] asm_place = getResources().getStringArray(asm_places);
                    String[] asm_descp = getResources().getStringArray(asm_desc);
                    String[] asm_addr = getResources().getStringArray(asm_add);

                    circleImageView.setImageResource(IMAGES_asm[position]);
                    place_name.setText(asm_place[position]);
                    place_desc.setText(asm_descp[position]);
                    address.setText(asm_addr[position]);
                    imageview.setImageResource(IMAGES_asm[position]);

                    break;
                case 3:
                    int[] IMAGES_bhr={R.drawable.bhr1,R.drawable.bhr2,R.drawable.bhr3,R.drawable.bhr4,R.drawable.bhr5,
                            R.drawable.bhr6,R.drawable.bhr7,R.drawable.bhr8,R.drawable.bhr9,R.drawable.bhr10};

                    String[] bhr_place = getResources().getStringArray(bhr_places);
                    String[] bhr_descp = getResources().getStringArray(bhr_desc);
                    String[] bhr_addr = getResources().getStringArray(bhr_add);

                    circleImageView.setImageResource(IMAGES_bhr[position]);
                    place_name.setText(bhr_place[position]);
                    place_desc.setText(bhr_descp[position]);
                    address.setText(bhr_addr[position]);
                   imageview.setImageResource(IMAGES_bhr[position]);
                    break;
                case 4:
                    int[] IMAGES_chtg={R.drawable.chtg1,R.drawable.chtg2,R.drawable.chtg3,R.drawable.chtg4,R.drawable.chtg5,
                            R.drawable.chtg6,R.drawable.chtg7,R.drawable.chtg8,R.drawable.chtg9,R.drawable.chtg10};

                    String[] chtg_place = getResources().getStringArray(chtg_places);
                    String[] chtg_descp = getResources().getStringArray(chtg_desc);
                    String[] chtg_addr = getResources().getStringArray(chtg_add);

                    circleImageView.setImageResource(IMAGES_chtg[position]);
                    place_name.setText(chtg_place[position]);
                    place_desc.setText(chtg_descp[position]);
                    address.setText(chtg_addr[position]);
                    imageview.setImageResource(IMAGES_chtg[position]);

                    break;
                case 5:
                    int[] IMAGES_goa={R.drawable.goa1,R.drawable.goa2,R.drawable.goa3,R.drawable.goa4,R.drawable.goa5,
                            R.drawable.goa6,R.drawable.goa7,R.drawable.goa8,R.drawable.goa9,R.drawable.goa10};

                    String[] goa_place = getResources().getStringArray(goa_places);
                    String[] goa_descp = getResources().getStringArray(goa_desc);
                    String[] goa_addr = getResources().getStringArray(goa_add);

                    circleImageView.setImageResource(IMAGES_goa[position]);
                    place_name.setText(goa_place[position]);
                    place_desc.setText(goa_descp[position]);
                    address.setText(goa_addr[position]);
                   imageview.setImageResource(IMAGES_goa[position]);
                    break;
                case 6:
                    int[] IMAGES_gurt={R.drawable.gurt1,R.drawable.gurt2,R.drawable.gurt3,R.drawable.gurt4,R.drawable.gurt5,
                            R.drawable.gurt6,R.drawable.gurt7,R.drawable.gurt8,R.drawable.gurt9,R.drawable.gurt10};

                    String[] gurt_place = getResources().getStringArray(gurt_places);
                    String[] gurt_descp = getResources().getStringArray(gurt_desc);
                    String[] gurt_addr = getResources().getStringArray(gurt_add);

                    circleImageView.setImageResource(IMAGES_gurt[position]);
                    place_name.setText(gurt_place[position]);
                    place_desc.setText(gurt_descp[position]);
                    address.setText(gurt_addr[position]);
                   imageview.setImageResource(IMAGES_gurt[position]);
                    break;
                case 7:
                    int[] IMAGES_hryn={R.drawable.hryn1,R.drawable.hryn2,R.drawable.hryn3,R.drawable.hryn4,R.drawable.hryn5,
                            R.drawable.hryn6,R.drawable.hryn7,R.drawable.hryn8,R.drawable.hryn9,R.drawable.hryn10};

                    String[] hryn_place = getResources().getStringArray(hryn_places);
                    String[] hryn_descp = getResources().getStringArray(hryn_desc);
                    String[] hryn_addr = getResources().getStringArray(hryn_add);

                    circleImageView.setImageResource(IMAGES_hryn[position]);
                    place_name.setText(hryn_place[position]);
                    place_desc.setText(hryn_descp[position]);
                    address.setText(hryn_addr[position]);
                    imageview.setImageResource(IMAGES_hryn[position]);
                    break;
                case 8:
                    int[] IMAGES_hmp={R.drawable.hmp1,R.drawable.hmp2,R.drawable.hmp3,R.drawable.hmp4,R.drawable.hmp5,
                            R.drawable.hmp6,R.drawable.hmp7,R.drawable.hmp8,R.drawable.hmp9,R.drawable.hmp10};

                    String[] hmp_place = getResources().getStringArray(hmp_places);
                    String[] hmp_descp = getResources().getStringArray(hmp_desc);
                    String[] hmp_addr = getResources().getStringArray(hmp_add);

                    circleImageView.setImageResource(IMAGES_hmp[position]);
                    place_name.setText(hmp_place[position]);
                    place_desc.setText(hmp_descp[position]);
                    address.setText(hmp_addr[position]);
                    imageview.setImageResource(IMAGES_hmp[position]);
                    break;
                case 9:
                    int[] IMAGES_jk={R.drawable.jk1,R.drawable.jk2,R.drawable.jk3,R.drawable.jk4,R.drawable.jk5,
                            R.drawable.jk6,R.drawable.jk7,R.drawable.jk8,R.drawable.jk1,R.drawable.jk2};

                    String[] jk_place = getResources().getStringArray(jk_places);
                    String[] jk_descp = getResources().getStringArray(jk_desc);
                    String[] jk_addr = getResources().getStringArray(jk_add);

                    circleImageView.setImageResource(IMAGES_jk[position]);
                    place_name.setText(jk_place[position]);
                    place_desc.setText(jk_descp[position]);
                    address.setText(jk_addr[position]);
                   imageview.setImageResource(IMAGES_jk[position]);
                    break;
                case 10:
                    int[] IMAGES_jkh={R.drawable.jkh1,R.drawable.jkh2,R.drawable.jkh3,R.drawable.jkh4,R.drawable.jkh5,
                            R.drawable.jkh6,R.drawable.jkh7,R.drawable.jkh8,R.drawable.jkh9,R.drawable.jkh10};

                    String[] jkh_place = getResources().getStringArray(jkh_places);
                    String[] jkh_descp = getResources().getStringArray(jkh_desc);
                    String[] jkh_addr = getResources().getStringArray(jkh_add);

                    circleImageView.setImageResource(IMAGES_jkh[position]);
                    place_name.setText(jkh_place[position]);
                    place_desc.setText(jkh_descp[position]);
                    address.setText(jkh_addr[position]);
                   imageview.setImageResource(IMAGES_jkh[position]);
                    break;
                case 11:
                    int[] IMAGES_kar={R.drawable.kar1,R.drawable.kar2,R.drawable.kar3,R.drawable.kar4,R.drawable.kar5,
                            R.drawable.kar6,R.drawable.kar7,R.drawable.kar8,R.drawable.kar9,R.drawable.kar10};

                    String[] kar_place = getResources().getStringArray(kar_places);
                    String[] kar_descp = getResources().getStringArray(kar_desc);
                    String[] kar_addr = getResources().getStringArray(kar_add);

                    circleImageView.setImageResource(IMAGES_kar[position]);
                    place_name.setText(kar_place[position]);
                    place_desc.setText(kar_descp[position]);
                    address.setText(kar_addr[position]);
                   imageview.setImageResource(IMAGES_kar[position]);
                    break;
                case 12:
                    int[] IMAGES_ker={R.drawable.ker1,R.drawable.ker2,R.drawable.ker3,R.drawable.ker4,R.drawable.ker5,
                            R.drawable.ker6,R.drawable.ker7,R.drawable.ker8,R.drawable.ker9,R.drawable.ker10};

                    String[] ker_place = getResources().getStringArray(ker_places);
                    String[] ker_descp = getResources().getStringArray(ker_desc);
                    String[] ker_addr = getResources().getStringArray(ker_add);

                    circleImageView.setImageResource(IMAGES_ker[position]);
                    place_name.setText(ker_place[position]);
                    place_desc.setText(ker_descp[position]);
                    address.setText(ker_addr[position]);
                    imageview.setImageResource(IMAGES_ker[position]);
                    break;
                case 13:
                    int[] IMAGES_mp={R.drawable.mp1,R.drawable.mp2,R.drawable.mp3,R.drawable.mp4,R.drawable.mp5,
                            R.drawable.mp6,R.drawable.mp7,R.drawable.mp8,R.drawable.mp9,R.drawable.mp10};

                    String[] mp_place = getResources().getStringArray(mp_places);
                    String[] mp_descp = getResources().getStringArray(mp_desc);
                    String[] mp_addr = getResources().getStringArray(mp_add);

                    circleImageView.setImageResource(IMAGES_mp[position]);
                    place_name.setText(mp_place[position]);
                    place_desc.setText(mp_descp[position]);
                    address.setText(mp_addr[position]);
                   imageview.setImageResource(IMAGES_mp[position]);
                    break;
                case 14:
                    int[] IMAGES_mhr={R.drawable.mhr1,R.drawable.mhr2,R.drawable.mhr3,R.drawable.mhr4,R.drawable.mhr5,
                            R.drawable.mhr6,R.drawable.mhr7,R.drawable.mhr8,R.drawable.mhr9,R.drawable.mhr10};

                    String[] mhr_place = getResources().getStringArray(mhr_places);
                    String[] mhr_descp = getResources().getStringArray(mhr_desc);
                    String[] mhr_addr = getResources().getStringArray(mhr_add);

                    circleImageView.setImageResource(IMAGES_mhr[position]);
                    place_name.setText(mhr_place[position]);
                    place_desc.setText(mhr_descp[position]);
                    address.setText(mhr_addr[position]);
                    imageview.setImageResource(IMAGES_mhr[position]);
                    break;
                case 15:
                    int[] IMAGES_man={R.drawable.man1,R.drawable.man2,R.drawable.man3,R.drawable.man4,R.drawable.man5,
                            R.drawable.man6,R.drawable.man7,R.drawable.man8,R.drawable.man9,R.drawable.man10};

                    String[] man_place = getResources().getStringArray(man_places);
                    String[] man_descp = getResources().getStringArray(man_desc);
                    String[] man_addr = getResources().getStringArray(man_add);

                    circleImageView.setImageResource(IMAGES_man[position]);
                    place_name.setText(man_place[position]);
                    place_desc.setText(man_descp[position]);
                    address.setText(man_addr[position]);
                    imageview.setImageResource(IMAGES_man[position]);
                    break;
                case 16:
                    int[] IMAGES_meg={R.drawable.meg1,R.drawable.meg2,R.drawable.meg3,R.drawable.meg4,R.drawable.meg5,
                            R.drawable.meg6,R.drawable.meg7,R.drawable.meg8,R.drawable.meg9,R.drawable.meg10};

                    String[] meg_place = getResources().getStringArray(meg_places);
                    String[] meg_descp = getResources().getStringArray(meg_desc);
                    String[] meg_addr = getResources().getStringArray(meg_add);

                    circleImageView.setImageResource(IMAGES_meg[position]);
                    place_name.setText(meg_place[position]);
                    place_desc.setText(meg_descp[position]);
                    address.setText(meg_addr[position]);
                   imageview.setImageResource(IMAGES_meg[position]);
                    break;
                case 17:
                    int[] IMAGES_miz={R.drawable.miz1,R.drawable.miz2,R.drawable.miz3,R.drawable.miz4,R.drawable.miz5,
                            R.drawable.miz6,R.drawable.miz7,R.drawable.miz8,R.drawable.miz9,R.drawable.miz10};

                    String[] miz_place = getResources().getStringArray(miz_places);
                    String[] miz_descp = getResources().getStringArray(miz_desc);
                    String[] miz_addr = getResources().getStringArray(miz_add);

                    circleImageView.setImageResource(IMAGES_miz[position]);
                    place_name.setText(miz_place[position]);
                    place_desc.setText(miz_descp[position]);
                    address.setText(miz_addr[position]);
                    imageview.setImageResource(IMAGES_miz[position]);
                    break;

                case 18:
                    int[] IMAGES_nag={R.drawable.nag1,R.drawable.nag2,R.drawable.nag3,R.drawable.nag4,R.drawable.nag5,
                            R.drawable.nag6,R.drawable.nag7,R.drawable.nag8,R.drawable.nag9,R.drawable.nag10};

                    String[] nag_place = getResources().getStringArray(nag_places);
                    String[] nag_descp = getResources().getStringArray(nag_desc);
                    String[] nag_addr = getResources().getStringArray(nag_add);

                    circleImageView.setImageResource(IMAGES_nag[position]);
                    place_name.setText(nag_place[position]);
                    place_desc.setText(nag_descp[position]);
                    address.setText(nag_addr[position]);
                    imageview.setImageResource(IMAGES_nag[position]);
                    break;
                case 19:
                    int[] IMAGES_odi={R.drawable.odi1,R.drawable.odi2,R.drawable.odi3,R.drawable.odi4,R.drawable.odi5,
                            R.drawable.odi6,R.drawable.odi7,R.drawable.odi8,R.drawable.odi9,R.drawable.odi10};

                    String[] odi_place = getResources().getStringArray(odi_places);
                    String[] odi_descp = getResources().getStringArray(odi_desc);
                    String[] odi_addr = getResources().getStringArray(odi_add);

                    circleImageView.setImageResource(IMAGES_odi[position]);
                    place_name.setText(odi_place[position]);
                    place_desc.setText(odi_descp[position]);
                    address.setText(odi_addr[position]);
                   imageview.setImageResource(IMAGES_odi[position]);
                    break;
                case 20:
                    int[] IMAGES_pun={R.drawable.pun1,R.drawable.pun2,R.drawable.pun3,R.drawable.pun4,R.drawable.pun5,
                            R.drawable.pun6,R.drawable.pun7,R.drawable.pun8,R.drawable.pun9,R.drawable.pun10};

                    String[] pun_place = getResources().getStringArray(pun_places);
                    String[] pun_descp = getResources().getStringArray(pun_desc);
                    String[] pun_addr = getResources().getStringArray(pun_add);

                    circleImageView.setImageResource(IMAGES_pun[position]);
                    place_name.setText(pun_place[position]);
                    place_desc.setText(pun_descp[position]);
                    address.setText(pun_addr[position]);
                    imageview.setImageResource(IMAGES_pun[position]);
                    break;
                case 21:
                    int[] IMAGES_raj={R.drawable.raj1,R.drawable.raj2,R.drawable.raj3,R.drawable.raj4,R.drawable.raj5,
                            R.drawable.raj6,R.drawable.raj7,R.drawable.raj8,R.drawable.raj9,R.drawable.raj10};

                    String[] raj_place = getResources().getStringArray(raj_places);
                    String[] raj_descp = getResources().getStringArray(raj_desc);
                    String[] raj_addr = getResources().getStringArray(raj_add);

                    circleImageView.setImageResource(IMAGES_raj[position]);
                    place_name.setText(raj_place[position]);
                    place_desc.setText(raj_descp[position]);
                    address.setText(raj_addr[position]);
                    imageview.setImageResource(IMAGES_raj[position]);
                    break;
                case 22:
                    int[] IMAGES_skm={R.drawable.skm1,R.drawable.skm2,R.drawable.skm3,R.drawable.skm4,R.drawable.skm5,
                            R.drawable.skm6,R.drawable.skm7,R.drawable.skm8,R.drawable.skm9,R.drawable.skm10};

                    String[] skm_place = getResources().getStringArray(skm_places);
                    String[] skm_descp = getResources().getStringArray(skm_desc);
                    String[] skm_addr = getResources().getStringArray(skm_add);

                    circleImageView.setImageResource(IMAGES_skm[position]);
                    place_name.setText(skm_place[position]);
                    place_desc.setText(skm_descp[position]);
                    address.setText(skm_addr[position]);
                   imageview.setImageResource(IMAGES_skm[position]);
                    break;
                case 23:
                    int[] IMAGES_tn={R.drawable.tn1,R.drawable.tn2,R.drawable.tn3,R.drawable.tn4,R.drawable.tn5,
                            R.drawable.tn6,R.drawable.tn7,R.drawable.tn8,R.drawable.tn9,R.drawable.tn10};

                    String[] tn_place = getResources().getStringArray(tn_places);
                    String[] tn_descp = getResources().getStringArray(tn_desc);
                    String[] tn_addr = getResources().getStringArray(tn_add);

                    circleImageView.setImageResource(IMAGES_tn[position]);
                    place_name.setText(tn_place[position]);
                    place_desc.setText(tn_descp[position]);
                    address.setText(tn_addr[position]);
                  imageview.setImageResource(IMAGES_tn[position]);
                    break;
                case 24:
                    int[] IMAGES_tel={R.drawable.tel1,R.drawable.tel2,R.drawable.tel3,R.drawable.tel4,R.drawable.tel5,
                            R.drawable.tel6,R.drawable.tel7,R.drawable.tel8,R.drawable.tel9,R.drawable.tel10};

                    String[] tel_place = getResources().getStringArray(tel_places);
                    String[] tel_descp = getResources().getStringArray(tel_desc);
                    String[] tel_addr = getResources().getStringArray(tel_add);

                    circleImageView.setImageResource(IMAGES_tel[position]);
                    place_name.setText(tel_place[position]);
                    place_desc.setText(tel_descp[position]);
                    address.setText(tel_addr[position]);
                   imageview.setImageResource(IMAGES_tel[position]);
                    break;
                case 25:
                    int[] IMAGES_trp={R.drawable.trp1,R.drawable.trp2,R.drawable.trp3,R.drawable.trp4,R.drawable.trp5,
                            R.drawable.trp6,R.drawable.trp7,R.drawable.trp8,R.drawable.trp9,R.drawable.trp10};

                    String[] trp_place = getResources().getStringArray(trp_places);
                    String[] trp_descp = getResources().getStringArray(trp_desc);
                    String[] trp_addr = getResources().getStringArray(trp_add);

                    circleImageView.setImageResource(IMAGES_trp[position]);
                    place_name.setText(trp_place[position]);
                    place_desc.setText(trp_descp[position]);
                    address.setText(trp_addr[position]);
                   imageview.setImageResource(IMAGES_trp[position]);
                    break;
                case 26:
                    int[] IMAGES_uk={R.drawable.uk1,R.drawable.uk2,R.drawable.uk3,R.drawable.uk4,R.drawable.uk5,
                            R.drawable.uk6,R.drawable.uk7,R.drawable.uk8,R.drawable.uk9,R.drawable.uk10};

                    String[] uk_place = getResources().getStringArray(uk_places);
                    String[] uk_descp = getResources().getStringArray(uk_desc);
                    String[] uk_addr = getResources().getStringArray(uk_add);

                    circleImageView.setImageResource(IMAGES_uk[position]);
                    place_name.setText(uk_place[position]);
                    place_desc.setText(uk_descp[position]);
                    address.setText(uk_addr[position]);
                   imageview.setImageResource(IMAGES_uk[position]);
                    break;
                case 27:
                    int[] IMAGES_up={R.drawable.up1,R.drawable.up2,R.drawable.up3,R.drawable.up4,R.drawable.up5,
                            R.drawable.up6,R.drawable.up7,R.drawable.up8,R.drawable.up9,R.drawable.up10};

                    String[] up_place = getResources().getStringArray(up_places);
                    String[] up_descp = getResources().getStringArray(up_desc);
                    String[] up_addr = getResources().getStringArray(up_add);

                    circleImageView.setImageResource(IMAGES_up[position]);
                    place_name.setText(up_place[position]);
                    place_desc.setText(up_descp[position]);
                    address.setText(up_addr[position]);
                    imageview.setImageResource(IMAGES_up[position]);
                    break;
                case 28:
                    int[] IMAGES_wb={R.drawable.wb1,R.drawable.wb2,R.drawable.wb3,R.drawable.wb4,R.drawable.wb5,
                            R.drawable.wb6,R.drawable.wb7,R.drawable.wb8,R.drawable.wb9,R.drawable.wb10};

                    String[] wb_place = getResources().getStringArray(wb_places);
                    String[] wb_descp = getResources().getStringArray(wb_desc);
                    String[] wb_addr = getResources().getStringArray(wb_add);

                    circleImageView.setImageResource(IMAGES_wb[position]);
                    place_name.setText(wb_place[position]);
                    place_desc.setText(wb_descp[position]);
                    address.setText(wb_addr[position]);
                   imageview.setImageResource(IMAGES_wb[position]);

                    break;
                case 29:
                    int[] IMAGES_del={R.drawable.del1,R.drawable.del2,R.drawable.del3,R.drawable.del4,R.drawable.del5,
                            R.drawable.del6,R.drawable.del7,R.drawable.del8,R.drawable.del9,R.drawable.del10};

                    String[] del_place = getResources().getStringArray(del_places);
                    String[] del_descp = getResources().getStringArray(del_desc);
                    String[] del_addr = getResources().getStringArray(del_add);

                    circleImageView.setImageResource(IMAGES_del[position]);
                    place_name.setText(del_place[position]);
                    place_desc.setText(del_descp[position]);
                    address.setText(del_addr[position]);
                    imageview.setImageResource(IMAGES_del[position]);

                    break;





            }

           return convertView;
        }
    }
}
