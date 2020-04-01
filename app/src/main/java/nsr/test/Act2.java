package nsr.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.*;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        get_json();
    }
    public void get_json()
    {
        final TextView t1 = (TextView) findViewById(R.id.t1);
        final TextView t2 = (TextView) findViewById(R.id.t2);
        final TextView t3 = (TextView) findViewById(R.id.t3);
        final TextView t4 = (TextView) findViewById(R.id.t4);
        String json;
        try{
            InputStream is = getAssets().open("test.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer,"UTF-8");

            /*JSONArray jsa = new JSONArray(json);

            for(int i=0;i<jsa.length();i++)
            {
                JSONObject obj = jsa.getJSONObject(i);
                t1.setText(obj.getString("Name"));
                t2.setText(obj.getString("Year"));
                t3.setText(obj.getString("Graduated"));
                t4.setText(obj.getString("Interests"));
            }*/

            JSONObject obj = new JSONObject(json);
            t1.setText(obj.getString("Name"));
            t2.setText(obj.getString("Year"));
            t3.setText(obj.getString("Graduated"));
            t4.setText(obj.getString("Interests"));


        }
        catch(IOException e)
        {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
