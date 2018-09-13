package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Data extends AbstractTableModel {

    private List<Persona> lista;

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int r, int c) {
        Persona p = lista.get(r);

        if (c == 0) {
            return p.getId();
        } else {
            return p.getNombre();
        }
    }

    @Override
    public String getColumnName(int i) {
        if (i == 0) {
            return "ID";
        } else {
            return "Nombre";
        }
    }

    public Data() {
        lista = new ArrayList<>();

        lista.add(new Persona(1, "nom1"));
        lista.add(new Persona(2, "nom2"));
        lista.add(new Persona(3, "nom3"));
        lista.add(new Persona(4, "nom4"));
        lista.add(new Persona(5, "nom5"));
    }

    public List<Persona> getPersonas() {
        return lista;
    }

    public void addPersona(Persona p) {
        lista.add(p);
    }

}
