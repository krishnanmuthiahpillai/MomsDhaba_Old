package com.momsdhaba;

import android.content.res.TypedArray;
import android.os.Bundle;

public class HelpDesk extends BaseActivity {
	private String[] navMenuTitles;
	private TypedArray navMenuIcons;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_help_desk);
		navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items); // load
		navMenuIcons = getResources()
				.obtainTypedArray(R.array.nav_drawer_icons);// load icons from
															// strings.xml
		set(navMenuTitles, navMenuIcons);
	}

}