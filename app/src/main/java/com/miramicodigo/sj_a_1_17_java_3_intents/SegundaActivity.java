package com.miramicodigo.sj_a_1_17_java_3_intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 06-04-17
     * */
    private TextView tvTexto1;
    private TextView tvTexto2;

    private EditText etCajaTexto;
    private Button btnRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvTexto1 = (TextView) findViewById(R.id.tvTextoUno);
        tvTexto2 = (TextView) findViewById(R.id.tvTextoDos);
        etCajaTexto = (EditText) findViewById(R.id.etCajaTexto);
        btnRespuesta = (Button) findViewById(R.id.btnRespuesta);

    }

}
