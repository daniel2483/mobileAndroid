package es.danroz.holausuario;

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
        if (b.equals("Daniel"))
        {
        	txtSaludo.setText("Error: No has introducido un nombre correcto");        
        }
        else 
        {
        	txtSaludo.setText("Hola como esta " + b.getString("Nombre") + " ?");
        }
    }
}
