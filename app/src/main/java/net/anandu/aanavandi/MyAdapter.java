package net.anandu.aanavandi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import net.anandu.aanavandi.model.SearchResult;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserListViewHolder>{

    private List<SearchResult> userList;

    public MyAdapter(List<SearchResult> userList) {
        this.userList = userList;
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
    public void onBindViewHolder(@NonNull UserListViewHolder holder, final int position) {
        holder.mName.setText(userList.get(position).getBusName());
        holder.mType.setText(userList.get(position).getBusType());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "TODO: add details", Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
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

