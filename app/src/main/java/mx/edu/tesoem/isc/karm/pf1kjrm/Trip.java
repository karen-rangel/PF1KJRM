package mx.edu.tesoem.isc.karm.pf1kjrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Trip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);

    }
    public void retorno(View v){
        Intent retorno= new Intent( this,FrmActivityPrincipal.class);
        startActivity(retorno);
        finish();
    }
}
