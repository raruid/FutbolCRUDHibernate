/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomsListModels;

import Clases.Equipo;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Usuario
 */
public class CustomListModelEquipos extends AbstractListModel{

    private ArrayList<Equipo> equipos = new ArrayList<>();
    
    @Override
    public int getSize() {
        return equipos.size();
    }

    @Override
    public Object getElementAt(int index) {
        Equipo e = equipos.get(index);
        return e.getNombre();
    }
    public void addEquipo(Equipo e){
        equipos.add(e);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarEquipo(int index0){
        equipos.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    
    public Equipo getEquipo(int index){
        return equipos.get(index);
    }  
}
