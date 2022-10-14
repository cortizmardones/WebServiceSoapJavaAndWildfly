package com.bbr.soap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface InterfaceUsuario {
	
    @WebMethod
    public List<Usuario> listarUsuarios();
     
    @WebMethod
    public String agregarUsuario(Usuario usuario);
    
    @WebMethod
    public String EliminarUsuario(Usuario usuario);

}
