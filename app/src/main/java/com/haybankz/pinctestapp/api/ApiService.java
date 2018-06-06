package com.haybankz.pinctestapp.api;

import com.haybankz.pinctestapp.models.QuestionResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("api/questions")
    Call<QuestionResponse> getQuestions();
}
