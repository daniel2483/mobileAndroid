package es.epinanab.holamundo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);


	}

	// Inicio del Metodo que hemos definido en el Boton
	public void Cambia_Texto(View v) {
		// Localizamos el Boton y lo definimos en una variable
		TextView texto = (TextView) findViewById(R.id.texto);

		// Ponemos el texto que queremos en el elemento TextView
		texto.setText("Eres una Maquina Daniel!!");
		
		Intent i = new Intent();
		
		i.putExtra("nombre", "Mi nombre es Daniel Rodriguez");
		
		startActivity(i);
		// Fin de nuestro metodo Cambia_Texto
	}

	// Fin Activity
}