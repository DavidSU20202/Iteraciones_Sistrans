package Main.Bancandes.Persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import Main.Bancandes.negocio.Oficina;
public class SQLOficina {
	private final static String SQL = PersistenciaBancandes.SQL;
	private PersistenciaBancandes pp;
	public SQLOficina (PersistenciaBancandes pp)
	{
		this.pp = pp;
	}
	public long RegistrarOficina(PersistenceManager pm, String Nombre, String Direccion, int PuntosAtencion, long Id_Gerente, long Id_Oficina)
	{
        Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaOficina () + "(Nombre, Direccion, PuntosAtencion, Id_Gerente, Id_Oficina) values (?, ?, ?, ?,?)");
        q.setParameters(Nombre, Direccion, PuntosAtencion, Id_Gerente, Id_Oficina);
        return (long) q.executeUnique();
	}
}
