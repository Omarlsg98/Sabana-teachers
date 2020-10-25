package co.edu.unisabana.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.kosalgeek.android.json.JsonConverter;
import com.kosalgeek.asynctask.AsyncResponse;
import com.kosalgeek.asynctask.PostResponseAsyncTask;

import java.util.ArrayList;

import co.edu.unisabana.myapplication.Entities.Edificio;

public class MainActivity extends AppCompatActivity implements AsyncResponse, View.OnClickListener {

    EditText etDato1, etDato2, etDato3;
    TextView txtTest;
    Button btnInsertV, btnInsertE, btnSelectE;
    static int end = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        etDato1 = (EditText)findViewById(R.id.etDato1);
        etDato2 = (EditText)findViewById(R.id.etDato2);
        etDato3 = (EditText)findViewById(R.id.etDato3);
        txtTest = (TextView)findViewById(R.id.txtTest);
        btnInsertV = (Button)findViewById(R.id.btnInsertV);
        btnInsertE = (Button)findViewById(R.id.btnInsertE);
        btnSelectE = (Button)findViewById(R.id.btnSelectE);

        btnInsertE.setOnClickListener(this);
        btnInsertV.setOnClickListener(this);
        btnSelectE.setOnClickListener(this);

        PostResponseAsyncTask taskRead = new PostResponseAsyncTask(this, new AsyncResponse() {
            @Override
            public void processFinish(String s) {
                if(s.equals("success1")){
                    Toast.makeText(MainActivity.this, "Login Successfully",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        taskRead.execute("http://10.0.2.2/client/read.php");
    }

    @Override
    public void processFinish(String output) {

    }

    @Override
    public void onClick(View v) {
        String dato1 = etDato1.getText().toString();
        String dato2 = etDato2.getText().toString();
        String dato3 = etDato3.getText().toString();
        if(v.equals(btnInsertV)) {
            Insert.inVoto(this, dato1, dato2, new AsyncResponse() {
                @Override
                public void processFinish(String s) {
                    if(s.equals("success1")){
                        Toast.makeText(MainActivity.this, "Login Successfully",
                                Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
        if(v.equals(btnInsertE)) {
            //Insert.insertObservacion(this,dato1,dato2,dato3);
            Get.GetClassInfo(this, 2);
        }
        if(v.equals(btnSelectE)) {
            //ArrayList<Edificio> Edifici =
            Select.selectEdificio(this, new AsyncResponse() {
                @Override
                public void processFinish(String s) {
                    ArrayList<Edificio> ediList = new JsonConverter<Edificio>().toArrayList(s, Edificio.class);
                    changeText(ediList);
                }
            });
        }
    }

    public void changeText(ArrayList<Edificio> ediList) {
        txtTest.setText(ediList.get(0).Edificio);
    }
}
