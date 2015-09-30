package com.lifeistech.android.techmemotyou;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class MemoCreateActivity extends ActionBarActivity {

    MemoDB mMemoDB;
    EditText mTitle;
    EditText mMemo;

    long recordId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_create);

        mTitle = (EditText) findViewById(R.id.create_title);
        mTitle.setText("index.html");
        mMemo = (EditText) findViewById(R.id.create_memo);
        mMemo.setText("<html>\n<head>\n<title>  </title>\n</head>\n<body>\n\n\n</body>\n</html>", TextView.BufferType.NORMAL);
        mMemoDB = new MemoDB();

    }

    public void hTag(View v) {
        String replaceText = "<h></h>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace(Math.min(start, end), Math.max(start, end), replaceText);

        mMemo.setSelection(start + 3);

    }

    public void pTag(View v) {
        String replaceText = "<p></p>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 3);
    }

    public void brTag(View v) {
        String replaceText = "<br>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace(Math.min(start, end), Math.max(start, end), replaceText);

    }

    public void imgTag(View v) {
        String replaceText = "<img border=\"\" src=\"\" width=\"\" height=\"\" alt=\"\" title=\"\">";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 5);
    }

    public void aTag(View v) {
        String replaceText = "<a href></a>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 8);
    }

    public void rubyTag(View v) {
        String replaceText = "<ruby>\n" +
                             "<rb></rb>\n" +
                             "<rp>(</rp>\n" +
                             "<rt></rt>\n" +
                             "<rp>)</rp>\n" +
                             "</ruby>\n";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 11);
    }

    public void ulTag(View v) {
        String replaceText = "<ul>\n\n</ul>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 4);
    }

    public void olTag(View v) {
        String replaceText = "<ol>\n\n</ol>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 4);
    }

    public void liTag(View v) {
        String replaceText = "<li></li>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 4);
    }

    public void tableTag(View v) {
        String replaceText = "<table>\n\n</table>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 8);
    }

    public void trTag(View v) {
        String replaceText = "<tr>\n\n</tr>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 5);
    }

    public void thTag(View v) {
        String replaceText = "<th></th>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 4);
    }

    public void tdTag(View v) {
        String replaceText = "<tb></tb>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 4);
    }

    public void blockquoteTag(View v) {
        String replaceText = "<blockquote>\n\n</blockquote>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 13);
    }

    public void hrTag(View v) {
        String replaceText = "<hr>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace(Math.min(start, end), Math.max(start, end), replaceText);

    }

    public void sTag(View v) {
        String replaceText = "<s></s>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 3);
    }

    public void uTag(View v) {
        String replaceText = "<u></u>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 3);
    }

    public void emTag(View v) {
        String replaceText = "<em></em>";

        int start = mMemo.getSelectionStart();
        int end = mMemo.getSelectionEnd();
        Editable editable = mMemo.getText();
        editable.replace( Math.min( start, end), Math.max( start, end), replaceText);

        mMemo.setSelection(start + 4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_memo_create, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //Saveメニューが押された際の処理
        if (R.id.create_save == id) {
            recordId = saveMemo();
//            finish();
        }

        //WebViewを押した際の処理
        if (R.id.jump_webView == id) {
            if(recordId != 0) {
                Intent intent = new Intent(this, MyWebView.class);
                intent.putExtra("id", recordId);
                startActivity(intent);
            }
        }

        return super.onOptionsItemSelected(item);
    }

    long saveMemo() {
        mMemoDB.title = mTitle.getText().toString();
        mMemoDB.memo = mMemo.getText().toString();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.JAPAN);
        mMemoDB.date = sdf.format(date);
        return mMemoDB.save();
    }
}
