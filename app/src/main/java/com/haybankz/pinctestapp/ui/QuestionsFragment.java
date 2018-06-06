package com.haybankz.pinctestapp.ui;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.haybankz.pinctestapp.R;
import com.haybankz.pinctestapp.adapters.QuestionAdapter;
import com.haybankz.pinctestapp.api.ApiClient;
import com.haybankz.pinctestapp.api.ApiService;
import com.haybankz.pinctestapp.models.Question;
import com.haybankz.pinctestapp.models.QuestionResponse;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class QuestionsFragment extends Fragment {



    private RecyclerView recyclerView;
    private ProgressBar progressBar;



    private ProgressDialog progressDialog;
    QuestionAdapter questionAdapter;


    public QuestionsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View mView =  inflater.inflate(R.layout.fragment_questions, container, false);

//        progressDialog = new ProgressDialog(getContext());
//        progressDialog.setMessage("Getting Questions");
//        progressDialog.setCancelable(false);
//        progressDialog.setIndeterminate(true);


        progressBar = (ProgressBar) mView.findViewById(R.id.progress_bar);
        recyclerView = (RecyclerView) mView.findViewById(R.id.recycler_view);
        getQuestions();

        return mView;
    }

    List<Question> questions = new ArrayList<>();
    public void getQuestions(){
//        progressDialog.show();
        progressBar.setVisibility(View.VISIBLE);

        Retrofit retrofit = ApiClient.getClient();

        ApiService apiService = retrofit.create(ApiService.class);

        Call<QuestionResponse> call = apiService.getQuestions();
        call.enqueue(new Callback<QuestionResponse>() {
            @Override
            public void onResponse(@NonNull Call<QuestionResponse> call, @NonNull Response<QuestionResponse> response) {
                QuestionResponse questionResponse = response.body();

                assert questionResponse != null;
                questions = questionResponse.getData();





                questionAdapter = new QuestionAdapter(getActivity(), questions);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),
                        LinearLayoutManager.VERTICAL, false);
                recyclerView.setLayoutManager(linearLayoutManager);

                recyclerView.setAdapter(questionAdapter);

                progressBar.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);

//                progressDialog.hide();

            }

            @Override
            public void onFailure(@NonNull Call<QuestionResponse> call, @NonNull Throwable t) {
                Snackbar snackbar = Snackbar.make(recyclerView, "Failed to connect to server.\nCheck your internet connection", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getQuestions();
                    }
                });

                snackbar.show();

//                progressDialog.hide();
                progressBar.setVisibility(View.GONE);
            }
        });



    }

    @Override
    public void onResume() {
        super.onResume();

    }
}
