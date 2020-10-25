package co.edu.unisabana.myapplication.EstadisticasEntidades;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/19/2017.
 */

public class AsistenciasporFacultad {

    @SerializedName("idFacultad")
    public int idFacultad;

    @SerializedName("Facultad")
    public String Facultad;

    @SerializedName("Asistencia")
    public String Asistencia;

    @SerializedName("Conteo")
    public String Conteo;
}
