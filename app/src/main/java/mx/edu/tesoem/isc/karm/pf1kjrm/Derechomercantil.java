package mx.edu.tesoem.isc.karm.pf1kjrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Derechomercantil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derechomercantil);
    }
    public void pantalla4(View v){
        Intent FrmActivityPrincipal= new Intent( this,FrmActivityPrincipal.class);
        startActivity(FrmActivityPrincipal);
        finish();

    }
}
