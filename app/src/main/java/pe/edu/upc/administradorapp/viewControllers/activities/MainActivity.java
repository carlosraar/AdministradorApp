package pe.edu.upc.administradorapp.viewControllers.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import pe.edu.upc.administradorapp.R;
import pe.edu.upc.administradorapp.viewControllers.fragments.DetailFragment;
import pe.edu.upc.administradorapp.viewControllers.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            return  navigateTo(item);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private Fragment getFragmentFor(MenuItem  item){

        switch(item.getItemId()) {
            case  R.id.navigation_home: return   new HomeFragment();
            case  R.id.navigation_detail: return  new DetailFragment();

            default:  return new  HomeFragment();
        }

    }

    private boolean  navigateTo( MenuItem  item){
        item.setChecked(true);
        return  getSupportFragmentManager().beginTransaction().replace(R.id.content,  getFragmentFor(item)).commit()>0;
    }


}
