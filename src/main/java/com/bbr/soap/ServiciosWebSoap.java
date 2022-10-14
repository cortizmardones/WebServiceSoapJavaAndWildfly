package com.bbr.soap;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bbr.soap.InterfaceUsuario")
public class ServiciosWebSoap implements InterfaceUsuario {
	
	//##############################################################################
	// WSDL SE CONSULTA EN ESTE CASO ACÁ : http://localhost:8080/DynamicExampleProyect/ServiciosWebSoap?wsdl
	// PARA ESTE EJEMPLO USE WILDFLY24+
	//##############################################################################
	
	private List<Usuario> listaUsuarios = new ArrayList<Usuario>();

	@Override
	public List<Usuario> listarUsuarios() {
		return listaUsuarios;
	}

	@Override
	public String agregarUsuario(Usuario usuario) {
		this.listaUsuarios.add(usuario);
		return "Usuario " + usuario.getNombre() + " agregado a los registros";
	}
	
	@Override
	public String EliminarUsuario(Usuario usuario) {
		if(listaUsuarios.contains(usuario)) {
			int indice = listaUsuarios.indexOf(usuario);
			listaUsuarios.remove(indice);
			return "Usuario " + usuario.getNombre() + " ha sido eliminado de los registros";
		} else {
			return "Usuario no encontrado en los registros";
		}
		
	}

}
