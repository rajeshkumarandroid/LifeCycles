package samples.rajesh.com.activity_fragmentflow;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Rajesh Kumar on 03-05-2018.
 */
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Main Activiy2","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Main Activiy2","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Main Activiy2","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Main Activiy2","onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Main Activiy2","onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Main Activiy2","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Main Activiy2","onRestart()");
    }
}
