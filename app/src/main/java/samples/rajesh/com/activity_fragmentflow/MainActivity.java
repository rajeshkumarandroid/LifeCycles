package samples.rajesh.com.activity_fragmentflow;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Main Activiy1","onCreate()");


        findViewById(R.id.txt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this,MainActivity2.class));
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.add(R.id.container,new Fragment1());
//                ft.addToBackStack("fragment1");
                ft.commit();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Main Activiy1","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Main Activiy1","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Main Activiy1","onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Main Activiy1","onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Main Activiy1","onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Main Activiy1","onRestart()");
    }
}
