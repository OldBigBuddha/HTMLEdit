package com.lifeistech.android.techmemotyou;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.activeandroid.query.Select;

import java.util.List;


public class MyWebView extends ActionBarActivity {
    MemoDB mMemoDB;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        long recordId = getIntent().getLongExtra("id", 0);
        if(recordId == 0) return;

        List<MemoDB> memoDBList = new Select().from(MemoDB.class).where("id = ?", recordId).execute();
        mMemoDB = memoDBList.get(0);

        setTitle(mMemoDB.title);

        web = (WebView)findViewById(R.id.webView);
        web.getSettings().setJavaScriptEnabled(false);
        web.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        web.getSettings().setSupportMultipleWindows(false);
        web.getSettings().setSupportZoom(false);
        web.setVerticalScrollBarEnabled(false);
        web.setHorizontalScrollBarEnabled(false);

        web.loadData(mMemoDB.memo, "text/html; charset=utf-8", "utf-8");

        web.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("/")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}
