package co.edu.unisabana.myapplication.Entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/14/2017.
 */

public class Curso {
    @SerializedName("idCurso")
    public int idCurso;

    @SerializedName("Curso")
    public String Curso;

    @SerializedName("Facultad_idFacultad")
    public int Facultad_idFacultad;
}
