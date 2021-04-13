package CustomsListModels;


import Clases.Pais;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class CustomListModelPaises extends AbstractListModel{
    
    private final ArrayList<Pais> paises = new ArrayList<>();

    @Override
    public int getSize() {
        return paises.size();    
    }

    @Override
    public Object getElementAt(int index) {
        
        Pais a = paises.get(index);
        return a.getNombre();
    }

    public void addPais(Pais p){
        paises.add(p);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public void eliminarPais(int index0){
        paises.remove(index0);
        this.fireIntervalRemoved(index0, getSize(), getSize()+1);
    }
    
    public Pais getPais(int index){
        return paises.get(index);
    }
}
