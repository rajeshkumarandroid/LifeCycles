package samples.rajesh.com.activity_fragmentflow;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rajesh Kumar on 03-05-2018.
 */
public class Fragment2 extends Fragment {
    View view;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment2","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment2","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment2,container,false);
        Log.e("Fragment2","onCreateView");
        return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment2","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment2","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment2","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment2","onStop");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment2","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment2","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment2","onDetach");
    }
}
