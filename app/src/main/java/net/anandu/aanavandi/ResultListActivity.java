package net.anandu.aanavandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import net.anandu.aanavandi.model.SearchResult;

import java.util.ArrayList;
import java.util.List;

public class ResultListActivity extends AppCompatActivity {

    List<SearchResult> results;

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

        // find the data from DB and put it in results

        results = new ArrayList<>();
        results.add(new SearchResult("Pala - Banglore ( via Nilambur - Mysore )", "SuperDeluxe AirBus","3","5"));
        results.add(new SearchResult("1", "2","3","5"));
        results.add(new SearchResult("Kozhikode", "2","3","5"));
        results.add(new SearchResult("3", "2","3","5"));
        results.add(new SearchResult("666", "2","3","5"));
        results.add(new SearchResult("666", "2","3","5"));
        results.add(new SearchResult("666", "2","3","5"));
        results.add(new SearchResult("666", "2","3","5"));
        results.add(new SearchResult("666", "2","3","5"));
        results.add(new SearchResult("asdfa", "2","3","5"));
        results.add(new SearchResult("444", "2","3","5"));
        results.add(new SearchResult("e", "2","3","5"));

        mUserList = findViewById(R.id.my_recycler_view);
        mUserList.setNestedScrollingEnabled(false);
        mUserList.setHasFixedSize(false);
        mUserListLayoutManager = new LinearLayoutManager(getApplicationContext(), RecyclerView.VERTICAL, false);

        mUserList.setLayoutManager(mUserListLayoutManager);

        mUserListAdapter = new MyAdapter(results);
        mUserList.setAdapter(mUserListAdapter);

    }
}
