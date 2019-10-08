package mx.edu.tesoem.isc.karm.pf1kjrm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Derechofamiliar extends AppCompatActivity implements View.OnClickListener {
    
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derechofamiliar);

        atras=(Button) findViewById(R.id.atras);
        atras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent btnatras=new Intent(this,FrmActivityPrincipal.class);
        startActivity(btnatras);
        finish();
    }
}
