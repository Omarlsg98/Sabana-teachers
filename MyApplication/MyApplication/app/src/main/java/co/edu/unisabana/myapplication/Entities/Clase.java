package co.edu.unisabana.myapplication.Entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/14/2017.
 */

public class Clase {

    @SerializedName("idClase")
    public int idClase;

    @SerializedName("Dia")
    public String Dia;

    @SerializedName("HoraIn")
    public String HoraIn;

    @SerializedName("HoraFin")
    public String HoraFin;

    @SerializedName("Curso_idCurso")
    public int Curso_idCurso;

    @SerializedName("Salon_idSalon")
    public int Salon_idSalon;
}
