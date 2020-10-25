package co.edu.unisabana.myapplication;

import android.content.Context;
import android.widget.Toast;

import com.kosalgeek.android.json.JsonConverter;
import com.kosalgeek.asynctask.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by User on 8/14/2017.
 */

public class Insert {

    static public void insertObservacion(final Context t, String Descripcion, String idReporte, String idClase){
        HashMap postData = new HashMap();
        postData.put("mobile", "android");
        postData.put("txtDescripcion", Descripcion);
        postData.put("txtReporte_idReporte", idReporte);
        postData.put("txtReporte_Clase_idClase", idClase);
        PostResponseAsyncTask loginTask =
                new PostResponseAsyncTask(t, postData, new AsyncResponse() {
                    @Override
                    public void processFinish(String s) {
                    }
                });
        loginTask.execute("http://10.0.2.2/APPSabana/insert.php");
    }

    static public void inVoto(final Context t, String Asistencia, String idClase, AsyncResponse tar) {

    }

    static public void insertVoto(final Context t, String Asistencia, String idClase){
        HashMap postData = new HashMap();
        postData.put("mobile", "android");
        postData.put("txtAsistencia", Asistencia);
        postData.put("txtClase_idClase", idClase);
        PostResponseAsyncTask loginTask =
                new PostResponseAsyncTask(t, postData, new AsyncResponse() {
                    @Override
                    public void processFinish(String s) {
                    }
                });
        loginTask.execute("http://10.0.2.2/APPSabana/insert.php");
    }
}
