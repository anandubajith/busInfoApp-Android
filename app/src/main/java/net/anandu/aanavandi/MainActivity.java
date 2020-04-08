package net.anandu.aanavandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MainActivity extends AppCompatActivity {

    private Button mSearch;
    private Button mAbout;
    private EditText mFrom;
    private EditText mTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSearch = findViewById(R.id.search);
        mAbout = findViewById(R.id.aboutButton);

        mFrom = findViewById(R.id.from);
        mTo = findViewById(R.id.to);


        mSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( mFrom.getText().toString().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Select source", Toast.LENGTH_SHORT).show();
                    return;
                }
                if ( mTo.getText().toString().isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Select Destination", Toast.LENGTH_SHORT).show();
                    return;
                }


                Intent i = new Intent(getApplicationContext(),ResultListActivity.class);
                i.putExtra("from", mFrom.getText().toString());
                i.putExtra("to", mTo.getText().toString());
                startActivity(i);
                // finish(); We shouldn't close this here
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
