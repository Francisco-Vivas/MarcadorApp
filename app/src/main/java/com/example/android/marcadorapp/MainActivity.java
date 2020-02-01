package com.example.android.marcadorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int localScore;
    int visitanteScore;
    int numFaltasLocal;
    int numFaltasVisitante;
    int numTarjetasRojasLocal;
    int numTarjetasRojasVisitante;
    int numTarjetasAmarillasLocal;
    int numTarjetasAmarillasVisitante;
    int numOffSidesLocal;
    int numOffSidesVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void golLocal(View view) {
        localScore = localScore + 1;
        TextView scoreView = (TextView) findViewById(R.id.local_score);
        scoreView.setText(String.valueOf(localScore));
    }

    public void golVisitante(View view) {
        visitanteScore = visitanteScore + 1;
        TextView scoreView = (TextView) findViewById(R.id.visitante_score);
        scoreView.setText(String.valueOf(visitanteScore));
    }

    public void faltasLocal(View view) {
        numFaltasLocal = numFaltasLocal + 1;
        TextView scoreView = (TextView) findViewById(R.id.faltas_local_text);
        scoreView.setText(String.valueOf(numFaltasLocal));
    }

    public void faltasVisitante(View view) {
        numFaltasVisitante = numFaltasVisitante + 1;
        TextView scoreView = (TextView) findViewById(R.id.faltas_visitante_text);
        scoreView.setText(String.valueOf(numFaltasVisitante));
    }

    public void tarjetasRojasLocal(View view) {
        numTarjetasRojasLocal = numTarjetasRojasLocal + 1;
        TextView scoreView = (TextView) findViewById(R.id.tarjetas_rojas_local_text);
        scoreView.setText(String.valueOf(numTarjetasRojasLocal));
    }

    public void tarjetasRojasVisitante(View view) {
        numTarjetasRojasVisitante = numTarjetasRojasVisitante + 1;
        TextView scoreView = (TextView) findViewById(R.id.tarjetas_rojas_visitante_text);
        scoreView.setText(String.valueOf(numTarjetasRojasVisitante));
    }

    public void tarjetasAmarillasLocal(View view) {
        numTarjetasAmarillasLocal = numTarjetasAmarillasLocal + 1;
        TextView scoreView = (TextView) findViewById(R.id.tarjetas_amarillas_local_text);
        scoreView.setText(String.valueOf(numTarjetasAmarillasLocal));
    }

    public void tarjetasAmarillasVisitante(View view) {
        numTarjetasAmarillasVisitante = numTarjetasAmarillasVisitante + 1;
        TextView scoreView = (TextView) findViewById(R.id.tarjetas_amarillas_visitante_text);
        scoreView.setText(String.valueOf(numTarjetasAmarillasVisitante));
    }

    public void offSidesLocal(View view) {
        numOffSidesLocal = numOffSidesLocal + 1;
        TextView scoreView = (TextView) findViewById(R.id.fuera_lugar_local_text);
        scoreView.setText(String.valueOf(numOffSidesLocal));
    }

    public void offSidesVisitante(View view) {
        numOffSidesVisitante = numOffSidesVisitante + 1;
        TextView scoreView = (TextView) findViewById(R.id.fuera_lugar_visitante_text);
        scoreView.setText(String.valueOf(numOffSidesVisitante));
    }

    public void resetAll(View view) {
        localScore = -1;
        visitanteScore = -1;
        numFaltasLocal = -1;
        numFaltasVisitante = -1;
        numTarjetasRojasLocal = -1;
        numTarjetasRojasVisitante = -1;
        numTarjetasAmarillasLocal = -1;
        numTarjetasAmarillasVisitante = -1;
        numOffSidesLocal = -1;
        numOffSidesVisitante = -1;
        golLocal(view);
        golVisitante(view);
        faltasLocal(view);
        faltasVisitante(view);
        tarjetasRojasLocal(view);
        tarjetasRojasVisitante(view);
        tarjetasAmarillasLocal(view);
        tarjetasAmarillasVisitante(view);
        offSidesLocal(view);
        offSidesVisitante(view);

    }

}
