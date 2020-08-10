package es.epinanab.holausuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HolaUsuario extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		//Codigo del OnCreate de la Activity
		
	}//Fin del OnCreate Activity

	//Inicio del codio del OnClick del boton
	public void btn_hola(View v) {

		// Localizar los controles BOTON Y TEXTO
		final EditText txtNombre = (EditText) findViewById(R.id.TxtNombre);

		// Creamos el Intent
		Intent i = new Intent();

		// Añadimos la información al intent i
		i.putExtra("Nombre", txtNombre.getText().toString());
		
		// Asignamos al intent i parametros para iniciar la nueva Activity
		i.setClass(HolaUsuario.this, Saludo.class);

		// Iniciamos la nueva actividad
		startActivity(i);
		
	}//Fin del codigo Boton
}//Fin de la Clase HolaUsuario