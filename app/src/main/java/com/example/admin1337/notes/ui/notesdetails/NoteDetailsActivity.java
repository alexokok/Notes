package com.example.admin1337.notes.ui.notesdetails;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import com.example.admin1337.notes.R;

/**
 * @author Mazaev Alexey
 */

public class NoteDetailsActivity extends AppCompatActivity {

    public static String DETAILS_EXTRA = "note_details_extra";

    public static Intent getIntent(Context context, String id) {
        Intent intent = new Intent(context, NoteDetailsActivity.class);
        intent.putExtra(DETAILS_EXTRA, id);

        return intent;
    }

    public static void navigateToDetailsActivity(Activity activity, String id) {
        ActivityCompat.startActivity(activity, NoteDetailsActivity.getIntent(activity, id), null);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);
    }
}
