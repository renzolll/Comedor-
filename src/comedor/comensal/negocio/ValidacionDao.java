package comedor.comensal.negocio;

import comedor.comensal.Comensal;
import comedor.comensal.dao.ComensalDao;


public class ValidacionDao {

    private ComensalDao dao = new ComensalDao();

    public void registrarComensal(Comensal c) throws Exception {

        if (c == null) throw new Exception("Comensal vacío");

        if (c.getCodigo() == null || c.getCodigo().isEmpty())
            throw new Exception("Código obligatorio");

        if (dao.findByCodigo(c.getCodigo()) != null)
            throw new Exception("El código ya está registrado");

        if (c.getDni() == null || c.getDni().length() != 8)
            throw new Exception("DNI debe tener 8 dígitos");

        dao.insert(c);
    }
}