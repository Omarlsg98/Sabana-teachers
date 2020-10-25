package co.edu.unisabana.myapplication.Entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/14/2017.
 */

public class Observacion {
    @SerializedName("idObservacion")
    public int idObservacion;

    @SerializedName("Descripcion")
    public String Descripcion;

    @SerializedName("Reporte_idReporte")
    public int Reporte_idReporte;

    @SerializedName("Reporte_Clase_idClase")
    public int Reporte_Clase_idClase;
}
