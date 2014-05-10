package com.tagworld.slidingmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Fragment2 extends Fragment {
	private LinearLayout llMain;
	private TextView tvFragmentName;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.activity_main, null);

		llMain = (LinearLayout) view.findViewById(R.id.llMain);

		tvFragmentName = (TextView) view.findViewById(R.id.tvFragmentName);
		
		llMain.setBackgroundColor(Color.BLUE);
		tvFragmentName.setText("Fragment - 2");

		return view;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

}
