package com.haybankz.pinctestapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuestionResponse {

    @SerializedName("data")
    List<Question> data;

    public List<Question> getData() {
        return data;
    }

    public void setData(List<Question> data) {
        this.data = data;
    }
}
