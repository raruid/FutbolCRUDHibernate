/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomsListModels;

import Clases.Liga;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Usuario
 */
public class CustomListModelLigas extends AbstractListModel{

    private final ArrayList<Liga> ligas = new ArrayList<>();
    
    @Override
    public int getSize() {
        return ligas.size();
    }

    @Override
    public Object getElementAt(int index) {
        Liga l = ligas.get(index);
        return l.getNombre();
    }
    public void addLiga(Liga l){
        ligas.add(l);
        this.fireIntervalAdded(this, this.getSize(), this.getSize()+1);
    }
    
    public void eliminarLiga(int index0){
        ligas.remove(index0);
        this.fireIntervalRemoved(index0, this.getSize(), this.getSize()+1);
    }
    
    public Liga getLiga(int index){
        return ligas.get(index);
    }    
}
