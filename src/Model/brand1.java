/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author turtle
 */
public class brand1 implements ComboBoxModel<String> {

    private List<String> vinfast;
    private Object selected;

    public brand1() {
        vinfast = new ArrayList<String>();
        vinfast.add("Lux A2.0");
        vinfast.add("SA2.0");
        vinfast.add("ePremium S");
        vinfast.add("Premium V");
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selected = anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return vinfast.size();
    }

    @Override
    public String getElementAt(int index) {
        return vinfast.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
