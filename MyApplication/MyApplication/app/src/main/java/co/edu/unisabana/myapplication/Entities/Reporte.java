package co.edu.unisabana.myapplication.Entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/14/2017.
 */

public class Reporte {
    @SerializedName("idReporte")
    public int idReporte;

    @SerializedName("Asistencia")
    public int Asistencia;

    @SerializedName("Clase_idClase")
    public int Clase_idClase;
}
