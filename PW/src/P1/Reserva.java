package P1;

import java.util.ArrayList;
import java.util.Date;




public class Reserva {
	
	/** Para los tipos de reserva */
	private Type Type;
	private String idPista;
	private float precio;
	private float descuento;
	private int duracion;

	Usuario usuario=new Usuario();
	String IdUsuario = usuario.getCorreo();
		
	/**Para guardar la fecha a la que se realiza la reserva*/
    Date fecha = new Date();	
    
    /**Pedimos la duracion de reserva de pista*/
    public void setDuracion(int duracion)
    {
    	this.duracion = duracion;
    }
    
    public int getDuracion()
    {
    	return duracion;
    }
    
    /**Identificador de la pista que en este caso hemos ussado el propio nombre de la misma*/
	Pista pista=new Pista();
	String IdPista = pista.getNombre();
	
    
    /**Calculo del precio final de reserva de las pistas*/
	public float PrecioFinal()
	{
		float PrecioFin = this.precio - this.descuento;
		return PrecioFin;
	}
	
	
	
	
		
	
	
}