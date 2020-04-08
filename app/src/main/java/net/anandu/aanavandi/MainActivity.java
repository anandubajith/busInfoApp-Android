package net.anandu.aanavandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private Button mSearch;
    private Button mAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearch = findViewById(R.id.search);
        mAbout = findViewById(R.id.aboutButton);

        mSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ResultListActivity.class));
                finish();
            }
        });

        mAbout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new MaterialAlertDialogBuilder(v.getContext())
                        .setTitle("About")
                        .setMessage("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. ")
                        .setNeutralButton("Close",null)
                        .setNegativeButton("Website", null)
                        .setPositiveButton("GitHub", null)
                        .show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
