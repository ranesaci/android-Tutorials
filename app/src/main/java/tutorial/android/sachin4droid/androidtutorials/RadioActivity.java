package tutorial.android.sachin4droid.androidtutorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {
    RadioButton radio1,radio2,radio3;
    Button radioSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        radioSubmit = (Button) findViewById(R.id.radioSubmit);
        radio1 = (RadioButton) findViewById(R.id.radio1);
        radio2 = (RadioButton) findViewById(R.id.radio2);
        radio3 = (RadioButton) findViewById(R.id.radio3);
        radioSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radio1.isChecked()){
                    Toast.makeText(RadioActivity.this, radio1.getText() +" is selected", Toast.LENGTH_SHORT).show();

                }
                if(radio2.isChecked()){
                    Toast.makeText(RadioActivity.this, radio2.getText() +" is selected", Toast.LENGTH_SHORT).show();

                }
                if(radio3.isChecked()){
                    Toast.makeText(RadioActivity.this, radio3.getText() +" is selected", Toast.LENGTH_SHORT).show();

                }

            }
        });



    }
}
