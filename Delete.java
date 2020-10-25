package co.edu.unisabana.myapplication;

import android.content.Context;

import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.HashMap;

/**
 * Created by User on 8/21/2017.
 */

public class Delete {

    static public void deleteVoto (final Context t, int Asistencia, int idClase,AsyncResponse tar) {
        HashMap postData = new HashMap();
        postData.put("select", "voto");
        postData.put("dato1", Integer.toString(Asistencia));
        postData.put("dato2", Integer.toString(idClase));
        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(t, postData, tar);
        taskRead.execute("http://10.0.2.2/appsabana/delete.php");
    }
}
