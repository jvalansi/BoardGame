package com.example.boardgame;

import com.example.boardgame.ImageAdapter;
import com.example.boardgame.MainActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    GridView gridview = (GridView) findViewById(R.id.gridview);
	    //    GridView gridview = new GridView(getApplicationContext());
	    gridview.setAdapter(new ImageAdapter(this));
	
	    gridview.setOnItemClickListener(new OnItemClickListener() {
	    	public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	    		Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
	    	}
	    });
	}	
	    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
