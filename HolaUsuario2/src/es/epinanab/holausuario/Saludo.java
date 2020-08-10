package es.epinanab.holausuario;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Saludo extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saludo);
        
        //Localizar los controles desde el Layout en nuestro codigo
        TextView txtSaludo = (TextView)findViewById(R.id.TxtSaludo);
        
        //Recuperamos la información pasada en el intent
        Bundle b = this.getIntent().getExtras();
        
        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola " + b.getString("Nombre"));
    }
}
