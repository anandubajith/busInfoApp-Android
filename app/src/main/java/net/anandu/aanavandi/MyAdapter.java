package net.anandu.aanavandi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import net.anandu.aanavandi.model.SearchResult;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserListViewHolder>{

    private List<SearchResult> userList;

    public MyAdapter() {
        this.userList = new ArrayList<>();
        userList.add(new SearchResult("Pala - Banglore ( via Nilambur - Mysore )", "SuperDeluxe AirBus","3","5"));
        userList.add(new SearchResult("Kozhikode", "2","3","5"));
        userList.add(new SearchResult("1", "2","3","5"));
        userList.add(new SearchResult("3", "2","3","5"));
        userList.add(new SearchResult("666", "2","3","5"));
        userList.add(new SearchResult("666", "2","3","5"));
        userList.add(new SearchResult("666", "2","3","5"));
        userList.add(new SearchResult("666", "2","3","5"));
        userList.add(new SearchResult("666", "2","3","5"));
        userList.add(new SearchResult("asdfa", "2","3","5"));
        userList.add(new SearchResult("444", "2","3","5"));
        userList.add(new SearchResult("e", "2","3","5"));
    }

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null,  false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(layoutParams);

        return new UserListViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        holder.mName.setText(userList.get(position).getBusName());
        holder.mType.setText(userList.get(position).getBusType());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserListViewHolder extends RecyclerView.ViewHolder {
        public TextView mName;
        public TextView mType;
        public UserListViewHolder(View view) {
            super(view);
            mName = view.findViewById(R.id.busName);
            mType = view.findViewById(R.id.busType);
        }
    }
}

