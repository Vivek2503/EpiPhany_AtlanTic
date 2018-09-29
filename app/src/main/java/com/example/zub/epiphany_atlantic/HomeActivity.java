package com.example.zub.epiphany_atlantic;

import android.graphics.Typeface;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    TextView title;

    ImageButton home, homeMax, message, messageMax, notification, notificationMax, settings, settingsMax, post_icon;

    RelativeLayout homeR, messageR, notificationR, settingsR;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ViewPager pager = (ViewPager) findViewById(R.id.home_viewpager);
        pager.setAdapter(new HomeActivity.MyPagerAdapter(getSupportFragmentManager()));

        title = (TextView) findViewById(R.id.homeText);

        Typeface typeface1 = Typeface.createFromAsset(this.getAssets(), "fonts/Courgette.ttf");

        title.setTypeface(typeface1);

        home = (ImageButton) findViewById(R.id.bnb_home_icon);
        homeMax = (ImageButton) findViewById(R.id.bnb_home_max);
        message = (ImageButton) findViewById(R.id.bnb_message_icon);
        messageMax = (ImageButton) findViewById(R.id.bnb_message_max);
        notification = (ImageButton) findViewById(R.id.bnb_notification_icon);
        notificationMax = (ImageButton) findViewById(R.id.bnb_notification_max);
        settings = (ImageButton) findViewById(R.id.bnb_settings_icon);
        settingsMax = (ImageButton) findViewById(R.id.bnb_settings_max);

        post_icon = (ImageButton) findViewById(R.id.bnb_post_icon);


        homeR= (RelativeLayout) findViewById(R.id.homeR);
        messageR= (RelativeLayout) findViewById(R.id.messageR);
        notificationR= (RelativeLayout) findViewById(R.id.notificationR);
        settingsR= (RelativeLayout) findViewById(R.id.settingsR);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(position==0)
                {
                    homeMax.setVisibility(View.VISIBLE);
                    home.setVisibility(View.INVISIBLE);
                    messageMax.setVisibility(View.INVISIBLE);
                    notificationMax.setVisibility(View.INVISIBLE);
                    settingsMax.setVisibility(View.INVISIBLE);
                    message.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.VISIBLE);
                    settings.setVisibility(View.VISIBLE);
                }
                else if(position==1)
                {
                    messageMax.setVisibility(View.VISIBLE);
                    message.setVisibility(View.INVISIBLE);
                    homeMax.setVisibility(View.INVISIBLE);
                    notificationMax.setVisibility(View.INVISIBLE);
                    settingsMax.setVisibility(View.INVISIBLE);
                    home.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.VISIBLE);
                    settings.setVisibility(View.VISIBLE);
                }
                else if(position==2)
                {
                    home.setVisibility(View.VISIBLE);
                    message.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.VISIBLE);
                    settings.setVisibility(View.VISIBLE);

                    bounceAnim();

                    homeMax.setVisibility(View.INVISIBLE);
                    messageMax.setVisibility(View.INVISIBLE);
                    notificationMax.setVisibility(View.INVISIBLE);
                    settingsMax.setVisibility(View.INVISIBLE);
                }

                else if(position==3)
                {
                    notificationMax.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.INVISIBLE);
                    homeMax.setVisibility(View.INVISIBLE);
                    messageMax.setVisibility(View.INVISIBLE);
                    settingsMax.setVisibility(View.INVISIBLE);
                    home.setVisibility(View.VISIBLE);
                    message.setVisibility(View.VISIBLE);
                    settings.setVisibility(View.VISIBLE);
                }
                else if(position==4)
                {
                    settingsMax.setVisibility(View.VISIBLE);
                    settings.setVisibility(View.INVISIBLE);
                    homeMax.setVisibility(View.INVISIBLE);
                    messageMax.setVisibility(View.INVISIBLE);
                    notificationMax.setVisibility(View.INVISIBLE);
                    home.setVisibility(View.VISIBLE);
                    message.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                homeMax.setVisibility(View.VISIBLE);
                home.setVisibility(View.INVISIBLE);
                messageMax.setVisibility(View.INVISIBLE);
                notificationMax.setVisibility(View.INVISIBLE);
                settingsMax.setVisibility(View.INVISIBLE);
                message.setVisibility(View.VISIBLE);
                notification.setVisibility(View.VISIBLE);
                settings.setVisibility(View.VISIBLE);

                pager.setCurrentItem(0);

            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                messageMax.setVisibility(View.VISIBLE);
                message.setVisibility(View.INVISIBLE);
                homeMax.setVisibility(View.INVISIBLE);
                notificationMax.setVisibility(View.INVISIBLE);
                settingsMax.setVisibility(View.INVISIBLE);
                home.setVisibility(View.VISIBLE);
                notification.setVisibility(View.VISIBLE);
                settings.setVisibility(View.VISIBLE);

                pager.setCurrentItem(1);


            }
        });

        post_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                home.setVisibility(View.VISIBLE);
                message.setVisibility(View.VISIBLE);
                notification.setVisibility(View.VISIBLE);
                settings.setVisibility(View.VISIBLE);

                bounceAnim();

                homeMax.setVisibility(View.INVISIBLE);
                messageMax.setVisibility(View.INVISIBLE);
                notificationMax.setVisibility(View.INVISIBLE);
                settingsMax.setVisibility(View.INVISIBLE);

                pager.setCurrentItem(2);

            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notificationMax.setVisibility(View.VISIBLE);
                notification.setVisibility(View.INVISIBLE);
                homeMax.setVisibility(View.INVISIBLE);
                messageMax.setVisibility(View.INVISIBLE);
                settingsMax.setVisibility(View.INVISIBLE);
                home.setVisibility(View.VISIBLE);
                message.setVisibility(View.VISIBLE);
                settings.setVisibility(View.VISIBLE);

                pager.setCurrentItem(3);

            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                settingsMax.setVisibility(View.VISIBLE);
                settings.setVisibility(View.INVISIBLE);
                homeMax.setVisibility(View.INVISIBLE);
                messageMax.setVisibility(View.INVISIBLE);
                notificationMax.setVisibility(View.INVISIBLE);
                home.setVisibility(View.VISIBLE);
                message.setVisibility(View.VISIBLE);
                notification.setVisibility(View.VISIBLE);

                pager.setCurrentItem(4);

            }
        });


    }

    private void bounceAnim() {


        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        post_icon.startAnimation(myAnim);


    }


    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int pos) {
            switch(pos) {



                case 0:

                    return HomeFragment.newInstance("FirstFragment, Instance 1");
                case 1:

                    return MessageFragment.newInstance("SecondFragment, Instance 1");
                case 2:

                    return PostFragment.newInstance("ThirdFragment, Instance 1");
                case 3:

                    return NotificationFragment.newInstance("ForthFragment, Instance 1");
                case 4:

                    return SettingsFragment.newInstance("FifthFragment, Instance 1");

                default:

                    return HomeFragment.newInstance("FirstFragment, Instance 1");
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }



        @Override
        public int getCount() {
            return 5;
        }



    }

}
