package com.example.tprecycleview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {
    @GET("tpfoyer/findAllEtudiant")
    Call<List<User>> getAllEtudiants();
}
