package com.example.tuan6_lab6_portrait_a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class AdapterItems extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<Item> listItem;
    private int index = -1;

    public AdapterItems(Context context, int idLayout, List<Item> listItem) {
        this.context = context;
        this.idLayout = idLayout;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        if(listItem.size() != 0 && !listItem.isEmpty()) {
            return  listItem.size();
        }

        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        ImageView imgvLogo = view.findViewById(R.id.imgLogo);
        TextView tvDescription = view.findViewById(R.id.tvDescription);

        final ConstraintLayout constraintLayout = view.findViewById(R.id.idConstrainLayout);
        final Item item = listItem.get(i);

        if(listItem != null && !listItem.isEmpty()) {
            imgvLogo.setImageResource(item.getImgLogo());
            tvDescription.setText(item.getDescription());
        }

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, item.getDescription(), Toast.LENGTH_SHORT).show();
//            }
//        });

        return view;
    }
}
