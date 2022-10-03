package P1;

import java.sql.Date;

public class ReservaAdultosIndividual
{
	private int NumAdultos;
	
	Reserva reserva = new Reserva();
	String IdUsuario;
	
	private Date FechaReserva;
	
	public String getIdUsuario()
	{
		return this.IdUsuario;
	}
	
	public void setIdUsuario(String IdUsuario)
	{
		this.IdUsuario = IdUsuario;
	}
	
	public int getNumAdultos()
	{
		return this.NumAdultos;
	}
	
	public void setNumAdultos(int NumAdultos)
	{
		this.NumAdultos = NumAdultos;
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
		String info = "Usuario:" + this.IdUsuario + "En fecha:" + this.FechaReserva + "Para un numero de adultos:" + this.NumAdultos + 1;
		return info;
	}
	
	
}