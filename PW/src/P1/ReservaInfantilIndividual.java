package P1;

import java.sql.Date;
import java.util.ArrayList;

public class ReservaInfantilIndividual
{ 
	/**Numero de niños que juegan en la pista*/
	private int NumNiños;
	
	/**Adulto que realiza la reserva de la pista*/
	Reserva reserva = new Reserva();
	String IdUsuario;
	
	/**Fecha seleccionada para dicha reserva*/
	private Date FechaReserva;
	
	public String getIdUsuario()
	{
		return this.IdUsuario;
	}
	
	public void setIdUsuario(String IdUsuario)
	{
		this.IdUsuario = IdUsuario;
	}
	
	public int getNumNiños()
	{
		return this.NumNiños;
	}
	
	public void setNumNiños(int NumNiños)
	{
		this.NumNiños = NumNiños;
	}
	
	public Date getFechaReserva() 
	{
		return this.FechaReserva;
	}
	
	public void setFechaReserva(Date FechaReserva)
	{
		this.FechaReserva = FechaReserva;
	}
	
	public String toString()
	{
		String info = "Usuario:" + this.IdUsuario + "En fecha:" + this.FechaReserva + "Para un numero de niños:" + this.NumNiños;
		return info;
	}
	
}