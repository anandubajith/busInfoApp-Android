package net.anandu.aanavandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class ResultListActivity extends AppCompatActivity {


    private String from;
    private String to;

    private RecyclerView mUserList;
    private RecyclerView.Adapter mUserListAdapter;
    private RecyclerView.LayoutManager mUserListLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_list);

        from = getIntent().getStringExtra("from");
        to = getIntent().getStringExtra("to");

        TextView t = findViewById(R.id.infoText);
        t.setText(from + " " + to);
        mUserList = findViewById(R.id.my_recycler_view);
        mUserList.setNestedScrollingEnabled(false);
        mUserList.setHasFixedSize(false);
        mUserListLayoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);

        mUserList.setLayoutManager(mUserListLayoutManager);

        mUserListAdapter = new MyAdapter();
        mUserList.setAdapter(mUserListAdapter);

    }
}
