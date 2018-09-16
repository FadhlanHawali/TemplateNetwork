package com.fadhlanhawali.templatenetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.VolleyError;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //GET Request
        String url = "https://www.thesportsdb.com/api/v1/json/1/searchteams.php?t=Arsenal";
        String TAG = MainActivity.class.getSimpleName();
        final VolleyNetwork request = new VolleyNetwork(url,TAG);
        request.getRequest(new VolleyNetwork.VolleyCallback() {
            @Override
            public void onSuccess(JSONObject result) {
                Log.d("tag","hasil :" + result.toString());
            }

            @Override
            public void onError(VolleyError error) {

            }
        },this);

        //POST Request
        request.postRequest(new VolleyNetwork.VolleyCallback() {
            @Override
            public void onSuccess(JSONObject result) {

            }

            @Override
            public void onError(VolleyError error) {

            }
        },this);
    }
}
