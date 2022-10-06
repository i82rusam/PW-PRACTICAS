package P1;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;

public class GestorUsuario
{
	Usuario Usuario = new Usuario();
	private ArrayList<Usuario> lista=new ArrayList<Usuario>();
	String busquedaID;
	
	
	public GestorUsuario()
	{
		lista.clear();
	}
	public ArrayList<Usuario> getLista() 
	{			
		return lista;
	}
	
		public void setLista(ArrayList<Usuario> lista) 
	{
		this.lista = lista;
	}
		
	public ArrayList<Usuario>consultarUsuario()
	{
		ArrayList<Usuario> usuarioRegistrado = new ArrayList<Usuario>();
		for(Usuario l : lista)
		{
			if(l.getCorreo()!=Usuario.correo)
			{
				usuarioRegistrado.add(l);
			}
		}
		return usuarioRegistrado;
	}
	
	public ArrayList<Usuario>listarUsuario()
	{
		ArrayList<Usuario> usuarioListado = new ArrayList<Usuario>();
		for(Usuario l : lista)
		{
			l.toString();
		}
		return usuarioListado;
	}
	//Metemos los nombre y apellidos que queremos modificar para compararlos
		public String getbusquedaID() 
		{
	    	return busquedaID;
	    }

		public void setbusquedaID(String busquedaID)
		{
			this.busquedaID = busquedaID;
		}
	/**Para modificar el usuario usamos este metodo*/

	public ArrayList<Usuario>ModificarUsuario()
	{
	
		ArrayList<Usuario> usuarioModificar = new ArrayList<Usuario>();
        for (P1.Usuario l : lista) {
        	if (l.getNombreApellidos()==busquedaID) {
                l.nombreApellidos = "NUEVONOMBRE";
                //No se como igualar a una fecha para modificarla
                l.fechaNacimiento = Date;
                l.correo= "NUEVOCORREO";
               
            }

        }
                break;
        
		return lista;
		
	}
	
	
}

