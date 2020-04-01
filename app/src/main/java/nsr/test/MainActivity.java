package nsr.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button writeJSON = (Button) findViewById(R.id.writeJSON);

        writeJSON.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent lintent = new Intent(MainActivity.this,Act2.class);
                MainActivity.this.startActivity(lintent);
            }
        });
    }
}