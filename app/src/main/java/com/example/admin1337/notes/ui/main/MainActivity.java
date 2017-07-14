package com.example.admin1337.notes.ui.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.example.admin1337.notes.R;

/**
 * @author Mazaev Alexey
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        getSupportFragmentManager().beginTransaction()
            .add(R.id.flMain, MainFragment.newInstance())
            .commit();
    }
}
