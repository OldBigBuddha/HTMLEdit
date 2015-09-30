package com.lifeistech.android.techmemotyou;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.activeandroid.query.Select;

import java.util.List;


public class MainActivity extends ActionBarActivity {

    ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.memo_list);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

         @Override

         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             MemoDB date = (MemoDB) parent.getItemAtPosition(position);
             Intent i = new Intent(MainActivity.this, MemoDetailActivity.class);
             i.putExtra("date", date.date);
             startActivity(i);
         }
        });

    }

    @Override
    public void onResume() {
        super.onResume();

        setMemolist();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (R.id.main_create == id) {
            Intent i = new Intent (MainActivity.this, MemoCreateActivity.class);
            startActivity(i);

            return true;
        }

        if (R.id.dentaku == id) {
            jump_Calculator();
        }

        return super.onOptionsItemSelected(item);
    }

    void setMemolist() {
        List<MemoDB> memoList = new Select().from(MemoDB.class).execute();
        ArrayAdapter<MemoDB> adapter = new ArrayAdapter<MemoDB>(
                getApplicationContext (),
                R.layout.memo_row,
                memoList
        );
        mListView.setAdapter(adapter);
    }

    void jump_Calculator () {
        Intent intent = new Intent(MainActivity.this, Calculator.class);
        startActivity(intent);
    }
}
