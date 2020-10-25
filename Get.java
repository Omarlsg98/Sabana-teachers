package co.edu.unisabana.myapplication;

import android.content.Context;

import com.kosalgeek.android.json.JsonConverter;
import com.kosalgeek.asynctask.AsyncResponse;

import java.util.ArrayList;
import java.util.Date;

import co.edu.unisabana.myapplication.Entities.Clase;
import co.edu.unisabana.myapplication.Entities.Curso;
import co.edu.unisabana.myapplication.Entities.Edificio;
import co.edu.unisabana.myapplication.Entities.Facultad;
import co.edu.unisabana.myapplication.Entities.Pisos;
import co.edu.unisabana.myapplication.Entities.Profesor;
import co.edu.unisabana.myapplication.Entities.Salon;
import co.edu.unisabana.myapplication.Entities.Voto;
import co.edu.unisabana.myapplication.EstadisticasEntidades.AsistenciasporFacultad;

/**
 * Created by User on 8/14/2017.
 */

public class Get {

    static public String[] ClaseNow = new String[5];

    static public void GetClassInfo (final Context t, int idsalon) {
        Select.selectClaseNow(t, idsalon, new AsyncResponse() {
            @Override
            public void processFinish(String s) {
                ArrayList<Clase> classList = new JsonConverter<Clase>().toArrayList(s, Clase.class);
                ClaseNow[0] = Integer.toString(classList.get(0).idClase);
                ClaseNow[1] = classList.get(0).HoraIn;

                Select.selectProfesorClase(t,classList.get(0).idClase,new AsyncResponse() {
                    @Override
                    public void processFinish(String s) {
                        ArrayList<Profesor> profeList = new JsonConverter<Profesor>().toArrayList(s, Profesor.class);
                        ClaseNow[2] = profeList.get(0).Nombre;
                    }
                });
                Select.selectCursoById(t,classList.get(0).Curso_idCurso,new AsyncResponse() {
                    @Override
                    public void processFinish(String s) {
                        ArrayList<Curso> cursoList = new JsonConverter<Curso>().toArrayList(s, Curso.class);
                        ClaseNow[3] = cursoList.get(0).Curso;
                        Select.selectFacultadById(t,cursoList.get(0).Facultad_idFacultad,new AsyncResponse() {
                            @Override
                            public void processFinish(String s) {
                                ArrayList<Facultad> facuList = new JsonConverter<Facultad>().toArrayList(s, Facultad.class);
                                ClaseNow[4] = facuList.get(0).Facultad;
                                //MOSTRAR INFORMACION
                                // 0ID, 1HORA, 2NOMBRE DE PROFE, 3CURSO, 4FACULTAD
                            }
                        });
                    }
                });
            }
        });
    }

    static public void getSalones (final Context t, int idedificio) {
        Select.selectSalon(t, idedificio, new AsyncResponse() {
                @Override
                public void processFinish(String s) {
                   Integer piso = Integer.parseInt(s);
                    //Numero de pisos
                }
            });
    }

    static public void getPisos (final Context t, int idedificio) {
        Select.selectPisos(t, new AsyncResponse() {
            @Override
            public void processFinish(String s) {
                // s es el numero de pisos
            }
        });
    }

    static public void getEstadisticaAsistenciaporFacultad (final Context t, int id) {
        Select.selectEstadisticas1(t, id,new AsyncResponse() {
            @Override
            public void processFinish(String s) {
                ArrayList<AsistenciasporFacultad> estaList = new JsonConverter<AsistenciasporFacultad>().toArrayList(s, AsistenciasporFacultad.class);
                //MOSTRAR ESTADISTICAS
                // DEVUELVE FACULTAD, EL INT DE ASISTENCIA Y EL CONTEO DE CADA INT DE ASISTENCIA POR FACULTAD
            }
        });
    }

    static public void getVotosClase (final Context t, int idclase) {
        Select.selectVotosClase(t, idclase, new AsyncResponse() {
            @Override
            public void processFinish(String s) {
                ArrayList<Voto> votoList = new JsonConverter<Voto>().toArrayList(s, Voto.class);
                //TODO
            }
        });
    }
}
