package co.edu.unisabana.myapplication;

import android.content.Context;
import android.widget.Toast;

import com.kosalgeek.android.json.JsonConverter;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by User on 8/14/2017.
 */

public class Select {

    static public void selectClaseNow (final Context t, int idsalon, AsyncResponse tar) {

        HashMap postData = new HashMap();
        postData.put("select", "clase");
        postData.put("dato1", Integer.toString(idsalon));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectSalon (final Context t, int idEdi, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "salon");
        postData.put("dato1", Integer.toString(idEdi));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectAllCurso (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "curso");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectCursoById (final Context t, int idcurso, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "curso2");
        postData.put("dato1", Integer.toString(idcurso));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectProfesores (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "prof");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectProfesorClase (final Context t, int idclase, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "prof2");
        postData.put("dato1", Integer.toString(idclase));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectReporte (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "rep");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectObservacion (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "obs");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectVoto (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "vot");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectObservacion_voto (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "obv");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectPiso (final Context t, int idEdificio, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "piso");
        postData.put("dato1", Integer.toString(idEdificio));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectPisos (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "pisos");
        postData.put("dato1", Integer.toString(1));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/single.php");
    }


    static public void selectEdificio (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "edificio");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }

    static public void selectAllFacultad (final Context t, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "fac");
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectFacultadById (final Context t, int idFacultad, AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "fac2");
        postData.put("dato1", Integer.toString(idFacultad));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
    static public void selectEstadisticas1 (final Context t, int idFacultad,AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "facultadAsistencias");
        postData.put("dato1", Integer.toString(idFacultad));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, tar);
        taskRead.execute("http://10.0.2.2/appsabana/estadisticas.php");
    }
    static public void selectVotosClase (final Context t, int idClase,AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "votcl");
        postData.put("dato1", Integer.toString(idClase));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/read.php");
    }
}
