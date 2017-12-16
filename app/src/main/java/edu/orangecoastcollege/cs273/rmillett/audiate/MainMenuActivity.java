package edu.orangecoastcollege.cs273.rmillett.audiate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

/**
 * The <code>MainMenuActivity</code> allows the user to choose
 * between different activities as well as edit their profile(s) or logout.
 */
public class MainMenuActivity extends AppCompatActivity {

    private static final String TAG = "MainMenuActivity";


    /**
     * This sets up the activity with the database and gets the current user.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    /**
     * This handles which activity is selected.
     * This handles all the buttons on the main menu activity layout.
     * it sends them to different places.
     *
     * @param view
     */
    public void activitySelectionHandler(View view) {
        // create Intent
        Intent activityIntent;

        // determine selected button
        switch (view.getId()) {
            case R.id.libraryButton:
                activityIntent = new Intent(this, LibraryActivity.class);
                break;
            case R.id.exercisesButton:
                activityIntent = new Intent(this, ExerciseBuilderActivity.class);
                break;
            default:
                activityIntent = new Intent();
        }

        startActivity(activityIntent);
    }
}
