package com.exemple.android.photoshop;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MAIN-ACTIVITY";
    private static final int MENU_ITEM_LOGOUT = 1001 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.about);
        StringBuffer sb =new StringBuffer();
        sb.append(getString(R.string.about));
        sb.append(getString(R.string.about));
        sb.append(getString(R.string.about));
        sb.append(getString(R.string.about));

        tv.setText(sb.toString());





    }




    public boolean onCreateOptionsMenu ( Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.add(Menu.NONE, Menu.NONE, 103, "Settings");
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        menu.add(0, MENU_ITEM_LOGOUT, 102, R.string.logout);

        return true;


    }

    public boolean onOptionItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_display_about:
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);


        }
        return true;
    }




    public void btnClickHandler(View view) {
        Intent detailIntent = new Intent(this, DetailActivity.class);
        startActivity(detailIntent);
    }

    public void  websiteClickHandler(View view) {
        android.net.Uri webPage = android.net.Uri.parse ("https://www.udemy.com/ultimate-photoshop-training-from-beginner-to-pro/");
        Intent webIntent = new Intent (Intent.ACTION_VIEW, webPage);
        startActivity (webIntent);

    }


}



