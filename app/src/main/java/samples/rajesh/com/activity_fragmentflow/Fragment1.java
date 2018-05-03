package samples.rajesh.com.activity_fragmentflow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Rajesh Kumar on 03-05-2018.
 */
public class Fragment1 extends Fragment {

    View view;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("Fragment1","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Fragment1","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment,container,false);
        TextView txt = (TextView)view.findViewById(R.id.txt);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.add(R.id.container,new Fragment2());
//                ft.addToBackStack("fragment2");
                ft.commit();
//                startActivity(new Intent(getActivity(),MainActivity2.class));
            }
        });
        Log.e("Fragment1","onCreateView");
        return view;

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment1","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment1","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment1","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment1","onStop");
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("Fragment1","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment1","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("Fragment1","onDetach");
    }
}
