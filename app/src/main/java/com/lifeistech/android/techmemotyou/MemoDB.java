package com.lifeistech.android.techmemotyou;

import android.content.ClipData;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;

/**
 * Created by lifeictech on 15/08/10.
 */
public class MemoDB extends Model {

    @Column(name = "title")
    public String title;

    @Column(name = "memo")
    public String memo;

        public MemoDB() {
            super();
        }
        public MemoDB(String title, String memo) {
            super();
            this.title = title;
            this.memo = memo;
        }

    @Column(name = "date")
    public String date;

    @Override
    public String toString() {
        return title;
    }
}

