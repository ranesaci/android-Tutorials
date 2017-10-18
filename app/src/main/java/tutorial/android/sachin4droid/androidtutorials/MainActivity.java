package tutorial.android.sachin4droid.androidtutorials;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    Button button;
    ListView mainActivityListView;
    List<String> activityList = Arrays.asList(new String[] {"ActivityOne","AnotherActivity","CustomListActivity","FragmentTestActivity" ,"ScrollViewActivity"
    ,"SpinnerActivity","RadioActivity"});


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate called now!!!");
        mainActivityListView = (ListView) findViewById(R.id.mainActivityListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,activityList );
        mainActivityListView.setAdapter(adapter);
        mainActivityListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "you have clicked "+activityList.get(i), Toast.LENGTH_SHORT).show();

                if("CustomListActivity"== activityList.get(i) ){
                    Intent intent = new Intent(MainActivity.this, CustomListActivity.class);
                    startActivity(intent);

                }
                if("FragmentTestActivity"== activityList.get(i) ){
                    Intent intent = new Intent(MainActivity.this, FragmentTestActivity.class);
                    startActivity(intent);

                }
                if("ScrollViewActivity"== activityList.get(i) ){
                    Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
                    startActivity(intent);

                }
                if("SpinnerActivity"== activityList.get(i) ){
                    Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                    startActivity(intent);

                }
                if("RadioActivity"== activityList.get(i) ){
                    Intent intent = new Intent(MainActivity.this, RadioActivity.class);
                    startActivity(intent);

                }

            }
        });



        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AnotherActivity.class);
                intent.putExtra("myname","sachin123");
                startActivity(intent);


            }
        });





    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart called now!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume called now!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause called now!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop called now!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy called now!!!");
    }
}
