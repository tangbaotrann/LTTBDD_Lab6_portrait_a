package com.example.tuan6_lab6_portrait_a;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentItem_Detail#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentItem_Detail extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentItem_Detail() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentItem_Detail.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentItem_Detail newInstance(String param1, String param2) {
        FragmentItem_Detail fragment = new FragmentItem_Detail();
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


    private ImageView imgLogoDetail;
    private TextView tvDescriptionDetail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item__detail, container, false);

        Bundle bundle = getActivity().getIntent().getExtras();
        int img = bundle.getInt("img");
        String description = bundle.getString("description");

        imgLogoDetail = view.findViewById(R.id.imgLogoDetail);
        tvDescriptionDetail = view.findViewById(R.id.tvDescriptionDetail);

        imgLogoDetail.setImageResource(img);
        tvDescriptionDetail.setText(description);

        return view;
    }
}