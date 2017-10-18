package tutorial.android.sachin4droid.androidtutorials;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import tutorial.android.sachin4droid.androidtutorials.fragment.Fragment1;
import tutorial.android.sachin4droid.androidtutorials.fragment.Fragment2;

public class FragmentTestActivity extends Activity implements Fragment2.OnFragmentInteractionListener,Fragment1.OnFragmentInteractionListener{

    Button button1Fragment,button2Fragment;
    //FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_test);

        button1Fragment = (Button) findViewById(R.id.button1Fragment);
        button2Fragment = (Button) findViewById(R.id.button2Fragment);
       // frameLayout = (FrameLayout) findViewById(R.id.framelayout);

        button1Fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.addToBackStack("Fragment1");
                ft.add(R.id.framelayout, new Fragment1());
                ft.commit();

            }
        });
        button2Fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.framelayout, new Fragment2());
                ft.addToBackStack("Fragment2");
                ft.commit();

            }
        });

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.framelayout, new Fragment1());
        ft.commit();



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
