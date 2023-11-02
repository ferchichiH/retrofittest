package com.example.tprecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView resultTextView;
    private GithubService githubService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          resultTextView = findViewById(R.id.resultTextView);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.88.1:8090/") // Assurez-vous que l'URL de base correspond à votre serveur local
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        githubService = retrofit.create(GithubService.class);

        getAllEtudiants();
    }

    private void getAllEtudiants() {
        Call<List<User>> call = githubService.getAllEtudiants();
        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                System.out.println(response);

                if (response.isSuccessful()) {

                    List<User> etudiants = response.body();

                    // Traitez les étudiants récupérés ici
                    for (User etudiant : etudiants) {
                        // Accédez aux propriétés de l'étudiant
                        int idEtudiant = etudiant.getIdEtudiant();
                        String nomEt = etudiant.getNomEt();
                        String prenomEt = etudiant.getPrenomEt();
                        int cin = etudiant.getCin();
                        String ecole = etudiant.getEcole();
                        Date dateNaissance = etudiant.getDateNaissance();

                        // Effectuez les opérations nécessaires avec les données de l'étudiant
                        // Par exemple, affichez les informations de l'étudiant dans la console ou mettez à jour l'interface utilisateur

                        resultTextView.setText(etudiant.toString());

                    }
                } else {
                    // Gérez les erreurs ici
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                // Gérez les erreurs de réseau ici
                System.out.println(t.getMessage());
            }
        });
    }
}