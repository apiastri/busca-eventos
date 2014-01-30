package com.bpoplataforma.buscaeventos;

import java.util.List;
import java.util.Vector;

import com.bpoplataforma.buscaeventos.dao.EventoDAO;
import com.bpoplataforma.buscaeventos.model.Evento;
import com.bpoplataforma.buscaeventos.model.Usuario;
import com.plataforma.buscaeventos.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	
	private EventoDAO datasource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		datasource = EventoDAO.getInstance(this);
		datasource.crearEventosDePrueba();
		//datasource.obtenerEventosDeUsuario(new Usuario());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
