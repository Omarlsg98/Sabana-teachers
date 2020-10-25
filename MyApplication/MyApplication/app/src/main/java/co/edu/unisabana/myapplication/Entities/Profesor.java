package co.edu.unisabana.myapplication.Entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/14/2017.
 */

public class Profesor {
    @SerializedName("idProfesor")
    public int idProfesor;

    @SerializedName("Nombre")
    public String Nombre;

    @SerializedName("Facultad_idFacultad")
    public int Facultad_idFacultad;
}
