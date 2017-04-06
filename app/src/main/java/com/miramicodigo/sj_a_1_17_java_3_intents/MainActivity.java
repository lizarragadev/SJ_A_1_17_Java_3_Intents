package com.miramicodigo.sj_a_1_17_java_3_intents;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    /**
     * @author Gustavo Lizarraga
     * @date 06-04-17
     * */

    private ImageButton ibAbrirActivity;
    private ImageButton ibEnviarDatos;
    private ImageButton ibDevolverDatos;
    private ImageButton ibAbrirMarcado;
    private ImageButton ibLlamar;
    private ImageButton ibAbrirGoogleMaps;
    private ImageButton ibAbrirPaginaWeb;
    private ImageButton ibCompartirTexto;
    private ImageButton ibCompartirImagen;
    private ImageButton ibEnviarMail;
    private ImageButton ibAbrirApp;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibAbrirActivity = (ImageButton) findViewById(R.id.ibAbrirActivity);
        ibEnviarDatos = (ImageButton) findViewById(R.id.ibEnviarDatos);
        ibDevolverDatos = (ImageButton) findViewById(R.id.ibDevolverDatos);
        ibAbrirMarcado = (ImageButton) findViewById(R.id.ibAbrirMarcado);
        ibLlamar = (ImageButton) findViewById(R.id.ibLlamar);
        ibAbrirGoogleMaps = (ImageButton) findViewById(R.id.ibAbrirGoogleMaps);
        ibAbrirPaginaWeb = (ImageButton) findViewById(R.id.ibAbrirPaginaWeb);
        ibCompartirTexto = (ImageButton) findViewById(R.id.ibCompartirTexto);
        ibCompartirImagen = (ImageButton) findViewById(R.id.ibCompartirImagen);
        ibEnviarMail = (ImageButton) findViewById(R.id.ibEnviarEmail);
        ibAbrirApp = (ImageButton) findViewById(R.id.ibAbrirApp);


    }

    public void abrirActivity() {

    }

    public void enviarDatos() {

    }

    public void devolverDatos() {

    }

    public void abrirMarcadoTelefonico() {

    }

    public void llamar() {
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, 123);
        } else {
            //Si el permiso fue aceptado
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case 123:
                if ((grantResults.length > 0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    llamar();
                } else {
                    Log.d("TAG", "Permiso de llamada no concedido");
                }
                break;
            default:
                break;
        }
    }

    public void abrirGoogleMaps() {

    }

    public void abrirPaginaWeb() {

    }

    public void compartirTexto() {

    }

    public void compartirImagen() {

    }

    public void enviarMail() {

    }

    public void abrirApp() {

    }
}
