package Main.Bancandes.Persistencia;
import java.util.Date;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import Main.Bancandes.negocio.Operaciones;
import java.text.DateFormat;
public class SQLOperaciones {
	private final static String SQL = PersistenciaBancandes.SQL;
	private PersistenciaBancandes pp;
	public SQLOperaciones (PersistenciaBancandes pp)
	{
		this.pp = pp;
	}
	@SuppressWarnings("rawtypes")
	public long adicionarOperacion (PersistenceManager pm, long Id_Operacion, int Tipo_Id, long Numero_Id, long Numero_Cuenta, int valor, long Puesto_Atencion, int Tipo_Operacion, Date Fecha) 
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaOperaciones () + "(Id_Operacion, Tipo_Id, Numero_Id, Numero_Cuenta, valor, Puesto_Atencion, Tipo_Operacion, Fecha) values (?, ?, ?, ?, ?, ?, ?, ?)");
        q.setParameters(Id_Operacion, Tipo_Id, Numero_Id, Numero_Cuenta, valor, Puesto_Atencion, Tipo_Operacion, Fecha);
        return (long) q.executeUnique();
	}
	public long eliminarOperacionPorId_Operacion (PersistenceManager pm, long Id_Operacion)
	{
        Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaOperaciones () + " WHERE Id_Operacion = ?");
        q.setParameters(Id_Operacion);
        return (long) q.executeUnique();
	}
	public Operaciones darOperacionPorId_Operacion (PersistenceManager pm, long Id_Operacion) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOperaciones () + " WHERE Id_Operacion = ?");
		q.setResultClass(Operaciones.class);
		q.setParameters(Id_Operacion);
		return (Operaciones) q.executeUnique();
	}
	public List<Operaciones> darOperaciones (PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOperaciones ());
		q.setResultClass(Operaciones.class);
		return (List<Operaciones>) q.executeList();
	}
	public void darOperacionporId_Usuario()
	{
		
	}
	public void darTop10OperacionesEnRangoFecha()
	{
		
	}
}
