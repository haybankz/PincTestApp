package com.haybankz.pinctestapp.models;

import com.google.gson.annotations.SerializedName;

public class Sentiment {
    @SerializedName("sentiment_id")
    private int id;

    @SerializedName("count")
    private long count;

    public Sentiment(int id, long count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
