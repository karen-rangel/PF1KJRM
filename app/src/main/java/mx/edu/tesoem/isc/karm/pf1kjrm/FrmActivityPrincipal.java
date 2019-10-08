package mx.edu.tesoem.isc.karm.pf1kjrm;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrmActivityPrincipal extends AppCompatActivity implements View.OnClickListener {

    Button btnsig,btnsig2,btnsig3,btnsig4,btnsig5,btnsig6,btnsig7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_principal);


        btnsig3=(Button) findViewById(R.id.btnsiguiente3);
        btnsig=(Button) findViewById(R.id.btnsiguiente1);
        btnsig2=(Button) findViewById(R.id.btnsiguiente2);
        btnsig4=(Button) findViewById(R.id.btnsiguiente4);
        btnsig5=(Button) findViewById(R.id.btnsiguiente5);
        btnsig7=(Button) findViewById(R.id.btnsiguiente7);
        btnsig6=(Button) findViewById(R.id.btnsiguiente6);
        btnsig6.setOnClickListener(this);
        btnsig7.setOnClickListener(this);
        btnsig5.setOnClickListener(this);
        btnsig4.setOnClickListener(this);
        btnsig3.setOnClickListener(this);
        btnsig2.setOnClickListener(this);
        btnsig.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==btnsig.getId()){
            Intent familiar=new Intent(this,Derechofamiliar.class);
            startActivity(familiar);
            finish();
        }
        if (v.getId()==btnsig2.getId()) {
            Intent civil = new Intent(this, DerechoCivil.class);
            startActivity(civil);

            finish();
        }
        if (v.getId()==btnsig3.getId()){
            Intent mercantil = new Intent(this, Derechomercantil.class);
            startActivity(mercantil);
            finish();
        }
        if (v.getId()==btnsig4.getId()){
            Intent laboral = new Intent(this, DerechoLaboral.class);
            startActivity(laboral);
            finish();
        }
        if (v.getId()==btnsig5.getId()){
            Intent penal = new Intent(this, DerechoPenal.class);
            startActivity(penal);
            finish();

        }
        if (v.getId()==btnsig6.getId()){
            Intent Info = new Intent(this, Informes.class);
            startActivity(Info);
            finish();

        }
        if (v.getId()==btnsig7.getId()){
            Intent Info = new Intent(this, Info.class);
            startActivity(Info);
            finish();
        }

    }



}
