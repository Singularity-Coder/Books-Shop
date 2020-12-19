package com.singularitycoder.brhatmrdanga.home.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.singularitycoder.brhatmrdanga.R;
import com.singularitycoder.brhatmrdanga.home.model.TeamModel;

public class TeamActivity extends AppCompatActivity {

    private static final String TAG = "TeamActivity";

    EditText etTeamName;
    EditText etTeamMemberCount;
    EditText etTeamBooksSold;
    EditText etTeamLakshmiEarnedCount;
    EditText etTeamBooksTakenCount;
    Button btnTeamCreate;

    // Declare an instance of Firestore
    FirebaseFirestore db;

    private ProgressDialog loadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);

        db = FirebaseFirestore.getInstance();

        loadingBar = new ProgressDialog(this);

        etTeamName = findViewById(R.id.team_name);
        etTeamMemberCount = findViewById(R.id.team_members_count);
        etTeamBooksSold = findViewById(R.id.team_books_sold_count);
        etTeamLakshmiEarnedCount = findViewById(R.id.team_lakshmi_earned_count);
        etTeamBooksTakenCount = findViewById(R.id.team_books_taken_count);
        btnTeamCreate = findViewById(R.id.team_submit);
    }

    public void createTeam(View view) {
        validateSignUpUser();
    }

    public void validateSignUpUser() {
        // Validate input
        String teamName = etTeamName.getText().toString();
        String memberCount = etTeamMemberCount.getText().toString();
        String booksSold = etTeamBooksSold.getText().toString();
        String lakshmiEarned = etTeamLakshmiEarnedCount.getText().toString();
        String booksTaken = etTeamBooksTakenCount.getText().toString();

        if (TextUtils.isEmpty(teamName)) {
            Toast.makeText(this, "Please write your member type...", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(memberCount)) {
            Toast.makeText(this, "Please write your first name...", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(booksSold)) {
            Toast.makeText(this, "Please write your last name...", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(lakshmiEarned)) {
            Toast.makeText(this, "Please write your phone number...", Toast.LENGTH_SHORT).show();
        } else if (TextUtils.isEmpty(booksTaken)) {
            Toast.makeText(this, "Please write your zone...", Toast.LENGTH_SHORT).show();
        } else {
            loadingBar.setTitle("Create Team");
            loadingBar.setMessage("Please wait, while we are creating ur team!");
            loadingBar.setCanceledOnTouchOutside(false);
            loadingBar.show();

            // Create team using Firestore DB after validating input
            createTeamFirestore(teamName, memberCount, booksSold, lakshmiEarned, booksTaken);

        }
    }

    private void createTeamFirestore(String teamName, String memberCount, String booksSold, String lakshmiEarned, String booksTaken) {
        // Create Collection reference
        CollectionReference members = db.collection("members");

        // Users obj
        TeamModel team = new TeamModel(
                teamName,
                memberCount,
                booksSold,
                lakshmiEarned,
                booksTaken
        );

        // Save Users obj to Firestore - Add a new document with a generated ID
        // Collection name is "Users". U can create a new collection this way
        db.collection("teams")
                .add(team)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                        Toast.makeText(getApplicationContext(), "User Created", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        loadingBar.dismiss();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                        Toast.makeText(getApplicationContext(), "Failed to create User", Toast.LENGTH_SHORT).show();
                        loadingBar.dismiss();
                    }
                });
    }
}
