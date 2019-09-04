package com.clicks.yogi.custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewId;
    AppUtility appUtility;
    ListAdapterPeople listAdapterPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewId=findViewById(R.id.listViewId);

        appUtility=AppUtility.getAppUtility(getApplicationContext());
        listAdapterPeople=new ListAdapterPeople(this,appUtility.getHello());
        listViewId.setAdapter(listAdapterPeople);

        listViewId.setOnItemClickListener(new AdapterView
                .OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                switch (position) {

                    case 0:
                        Toast.makeText(MainActivity.this, "Hey CSK",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Hey RCB",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Hey RCB",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Hey KXI",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Hey CSK",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Hey KXI",
                                Toast.LENGTH_SHORT).show();
                        break;
                    // Similarly add case 6,7,8,9 etc...
                    default:
                        Toast.makeText(MainActivity.this, "add switch cases 6,7,8,9 etc",
                                Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
