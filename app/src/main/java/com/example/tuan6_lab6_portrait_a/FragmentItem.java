package com.example.tuan6_lab6_portrait_a;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentItem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentItem extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentItem() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentItem.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentItem newInstance(String param1, String param2) {
        FragmentItem fragment = new FragmentItem();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private AdapterItems adapter;
    private List<Item> listItem;
    private ListView listView;
    private int[] imgs = new int[] { R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5 , R.drawable.img6, R.drawable.img7};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item, container, false);

        listView = view.findViewById(R.id.idListview);
        listItem = new ArrayList<>();
        listItem.add(new Item(imgs[0], "Nike shoes-discount 50%\n Pls touch to see detail"));
        listItem.add(new Item(imgs[1], "Adidas shoes-discount 80%\n Pls touch to see detail"));
        listItem.add(new Item(imgs[2], "Nike Bicycle-discount 30%\n Pls touch to see detail"));
        listItem.add(new Item(imgs[3], "Yonex shoes-discount 50%\n Pls touch to see detail"));
        listItem.add(new Item(imgs[4], "Victor shoes-discount 50%\n Pls touch to see detail"));
        listItem.add(new Item(imgs[5], "Lining shoes-discount 50%\n Pls touch to see detail"));
        listItem.add(new Item(imgs[6], "Binh Minh shoes-discount 90%\n Pls touch to see detail"));

        adapter = new AdapterItems(getActivity(), R.layout.item_custom_list_view, listItem);
        listView.setAdapter(adapter);

        // evts click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("img", listItem.get(i).getImgLogo());
                bundle.putString("description", listItem.get(i).getDescription());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        return view;
    }
}