package mx.edu.tesoem.isc.karm.pf1kjrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void pantalla7(View v){
        Intent FrmActivityPrincipal= new Intent( this,FrmActivityPrincipal.class);
        startActivity(FrmActivityPrincipal);
        finish();
    }
}