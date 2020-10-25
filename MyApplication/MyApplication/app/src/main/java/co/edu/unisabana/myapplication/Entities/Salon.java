package co.edu.unisabana.myapplication.Entities;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 8/14/2017.
 */

public class Salon {
    @SerializedName("idSalon")
    public int idSalon;

    @SerializedName("Numero")
    public String Numero;

    @SerializedName("Edificio_has_Piso_Edificio_idEdificio")
    public int Edificio_has_Piso_Edificio_idEdificio;

    @SerializedName("Edificio_has_Piso_Piso_idPiso")
    public int Edificio_has_Piso_Piso_idPiso;
}
