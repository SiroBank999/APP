/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.DanhMuc;
import UI.JPHome;
import UI.JPProduct;
import UI.JPUser;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class MenuController {
    private JPanel jpnRoot;
    private String selected;
    private List<DanhMuc> listDanhMuc;

    public MenuController(JPanel jpnRoot) {
        this.jpnRoot = jpnRoot;
    }
    public void setView(JLabel jlbItem){
       selected = "Home";
      
       
       jpnRoot.removeAll();
       jpnRoot.setLayout(new BorderLayout());
       jpnRoot.add(new JPHome());
       jpnRoot.validate();
       jpnRoot.repaint();
    }
    public void setEvent(List<DanhMuc> listDanhMuc){
        this.listDanhMuc = listDanhMuc;
        for (DanhMuc item : listDanhMuc) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),  item.getJlb()));
        }
        
    }
    class LabelEvent implements MouseListener {
        private JPanel node;
        private String kind;
        private JLabel jlbItem;

        public LabelEvent(String kind, JLabel jlbItem) {
            this.kind = kind;
            this.jlbItem = jlbItem;
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "Home":
                    node = new JPHome();
                    break;
                case "User":
                    node = new JPUser();
                    break;
                case  "Product":
                    node = new JPProduct();
               
                // more
                default:
                    break;
           }
           jpnRoot.removeAll();
           jpnRoot.setLayout(new BorderLayout());
           jpnRoot.add(node);
           jpnRoot.validate();
           jpnRoot.repaint();
           
        }

        @Override
        public void mousePressed(MouseEvent e) {
           
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
        
    }
}
