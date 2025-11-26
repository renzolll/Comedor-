package comedor.comensal.dao;

import comedor.comensal.Comensal;

import java.util.ArrayList;
import java.util.List;

public class ComensalDao {

    private List<Comensal> listaComensales = new ArrayList<>();

    public void insert(Comensal c) {
        listaComensales.add(c);
    }

    public List<Comensal> findAll() {
        return listaComensales;
    }

    public Comensal findByCodigo(String codigo) {
        for (Comensal c : listaComensales) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;   // si no existe
    }

    public void update(Comensal comensalActualizado) {
        for (int i = 0; i < listaComensales.size(); i++) {
            if (listaComensales.get(i).getCodigo().equals(comensalActualizado.getCodigo())) {
                listaComensales.set(i, comensalActualizado);
                return;
            }
        }
    }

    public void delete(String codigo) {
        listaComensales.removeIf(c -> c.getCodigo().equals(codigo));
    }
}