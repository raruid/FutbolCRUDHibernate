/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomsListModels;

import Clases.Equipo;
import Clases.Jugador;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Usuario
 */
public class CustomListModelJugadores extends AbstractListModel{

    private final ArrayList<Jugador> jugadores = new ArrayList<>();
    
    @Override
    public int getSize() {
        return jugadores.size();
    }

    @Override
    public Object getElementAt(int index) {
        Jugador j = jugadores.get(index);
        return j.getNombre();
    }
    public void addJugador(Jugador j){
        jugadores.add(j);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarJugador(int index0){
        jugadores.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    
    public Jugador getJugador(int index){
        return jugadores.get(index);
    } 
}
