package com.example.galactus.more;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchPopularMovies(View view){
        makeToast("This button will launch the popular movies app!");
    }
    public void launchStockHawk(View view){
        makeToast("This button will launch the stock hawk app!");
    }
    public void launchBuildItBigger(View view){
        makeToast("This button will launch the build it bigger app!");
    }
    public void launchMakeYourAppMaterial(View view){

        makeToast("This button will launch the make your app material app!");
    }
    public void launchGoUbiquitous(View view){
        makeToast("This button will launch the go ubiquitous app!");
    }
    public void launchCapstone(View view){
        makeToast("This button will launch the capstone app!");
    }

    public void makeToast(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
