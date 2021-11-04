package Main.Bancandes.negocio;

public class Cuentas {
	private int Tipo_Id;
	private long Numero_Id;
	private long Numero_Cuenta;
	private int Tipo_Cuenta;
	private int Estado;
	private int Saldo;
	
	public Cuentas()
	{
		this.Tipo_Id=0;
		this.Numero_Id=0;
		this.Numero_Cuenta=0;
		this.Tipo_Cuenta=0;
		this.Estado=0;
		this.Saldo=0;
	}
	public Cuentas(int Tipo_Id, long Numero_Id, long Numero_Cuenta, int Tipo_Cuenta, int Estado, int Saldo)
	{
		this.Tipo_Id=Tipo_Id;
		this.Numero_Id=Numero_Id;
		this.Numero_Cuenta=Numero_Cuenta;
		this.Tipo_Cuenta=Tipo_Cuenta;
		this.Estado=Estado;
		this.Saldo=Saldo;
	}
	public int getTipo_Id()
	{
		return this.Tipo_Id;
	}
	public void setTipo_Id(int Tipo_Id)
	{
		this.Tipo_Id=Tipo_Id;
	}
	public long getNumero_Id()
	{
		return this.Numero_Id;
	}
	public void setNumero_Id(long Numero_Id)
	{
		this.Numero_Id=Numero_Id;
	}
	public long getNumero_Cuenta()
	{
		return this.Numero_Cuenta;
	}
	public void setNumero_Cuenta(long Numero_Cuenta)
	{
		this.Numero_Cuenta=Numero_Cuenta;
	}
	public int getTipo_Cuenta()
	{
		return this.Tipo_Cuenta;
	}
	public void setTipo_Cuenta(int Tipo_Cuenta)
	{
		this.Tipo_Cuenta=Tipo_Cuenta;
	}
	public int getEstado()
	{
		return this.Estado;
	}
	public void setEstado(int Estado)
	{
		this.Estado=Estado;
	}
	public int getSaldo() 
	{
		return this.Saldo;
	}
	public void setSaldo(int Saldo)
	{
		this.Saldo=Saldo;
	}
	public String toString()
	{
		return "Cuentas [Tipo_Id="+this.Tipo_Id+", Numero_Id="+this.Numero_Id+", Numero_Cuenta="+this.Numero_Cuenta+", Tipo_Cuenta="+this.Tipo_Cuenta+"]";	
	}
}
