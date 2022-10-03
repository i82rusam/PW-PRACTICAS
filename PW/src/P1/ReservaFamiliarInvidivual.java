package P1;

import java.sql.Date;

public class ReservaFamiliarInvidivual
{
	private int NumAdultos;
	private int NumNiños;
	
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
		String info = "Usuario:" + this.IdUsuario + "En fecha:" + this.FechaReserva + "Para un numero de adultos:" + this.NumAdultos + "y un numero de niños:" + this.NumNiños;
		return info;
	}
}