package com.example.meet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.meet.fragment.Homme;
import com.example.meet.fragment.Meetingroom;
import com.example.meet.fragment.Profile;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private Fragment Homme;
    private Fragment Meetingroom;
    private Fragment Profile;

    BottomNavigationView bnvhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnvhome = findViewById(R.id.bnvHome);

        // inisialisasi object fragment
        Homme = new Homme();
        Meetingroom = new Meetingroom();
        Profile = new Profile();

        // menampilkan homeFragment sebagai tampilan awal
        replaceFragment(Homme);

        // memberikan aksi ketika  menu diklik
        bnvhome.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menuHome:
                        replaceFragment(Homme);
                        break;
                    case R.id.menuProfile:
                        replaceFragment(Profile);
                        break;
                    case R.id.menuFavorite:
                        replaceFragment(Meetingroom);
                        break;
                }
                return true;
            }
        });
    }

    private void replaceFragment(Fragment homme) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.mainFragment, homme)
                .commit();
    }
}
