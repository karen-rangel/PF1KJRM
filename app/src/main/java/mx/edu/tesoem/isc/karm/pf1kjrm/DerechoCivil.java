package mx.edu.tesoem.isc.karm.pf1kjrm;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class DerechoCivil extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derecho_civil);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent principal=new Intent(DerechoCivil.this,Trip.class);
                startActivity(principal);
                finish();

            }
        },3000);

    }

    public void pantalla3(View v){
        Intent FrmActivityPrincipal= new Intent( this,FrmActivityPrincipal.class);
        startActivity(FrmActivityPrincipal);
        finish();

    }

}
