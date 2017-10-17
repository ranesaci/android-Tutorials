package tutorial.android.sachin4droid.androidtutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        textView = (TextView) findViewById(R.id.paramtextView);

        //to get the param value
        String paramValue = getIntent().getExtras().getString("myname");
        textView.setText("Welcome "+paramValue+"!!!");


    }
}
