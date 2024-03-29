package com.custom.list;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private List<String> data;
	SingleListAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		data = new ArrayList<String>();
		fillData();
		adapter = new SingleListAdapter(this, data);
		ListView lvMain = (ListView) findViewById(R.id.list);
		lvMain.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	void fillData() {
		for (int i = 1; i <= 10; i++) {
			data.add("Heading" + i);
		}
	}

}