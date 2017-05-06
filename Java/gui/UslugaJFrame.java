/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import model.Usluga;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

public class UslugaJFrame extends javax.swing.JFrame {

    private ObservableList<Usluga> uslugaList = ObservableCollections.observableList(new ArrayList<Usluga>());

    public ObservableList<Usluga> getUslugaList() {
        return uslugaList;
    }
           
    public UslugaJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        controljPanel1 = new javax.swing.JPanel();
        СоздатьjButton1 = new javax.swing.JButton();
        УдалитьjButton2 = new javax.swing.JButton();
        СохранитьjButton3 = new javax.swing.JButton();
        intojPanel1 = new javax.swing.JPanel();
        namejLabel1 = new javax.swing.JLabel();
        namejTextField1 = new javax.swing.JTextField();
        opisaniejLabel1 = new javax.swing.JLabel();
        opisaniejTextField1 = new javax.swing.JTextField();
        stoimostjLabel1 = new javax.swing.JLabel();
        stoimostjSpinner1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setColumnSelectionAllowed(true);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${uslugaList}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, Table);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${naimenovanie}"));
        columnBinding.setColumnName("Наименование");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stoimost}"));
        columnBinding.setColumnName("Стоимость");
        columnBinding.setColumnClass(Float.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${opisanie}"));
        columnBinding.setColumnName("Описание");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(Table);
        Table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        controljPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        controljPanel1.setLayout(new javax.swing.BoxLayout(controljPanel1, javax.swing.BoxLayout.LINE_AXIS));

        СоздатьjButton1.setText("Создать");
        СоздатьjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                СоздатьjButton1ActionPerformed(evt);
            }
        });
        controljPanel1.add(СоздатьjButton1);

        УдалитьjButton2.setText("Удалить");
        controljPanel1.add(УдалитьjButton2);

        СохранитьjButton3.setText("Сохранить");
        controljPanel1.add(СохранитьjButton3);

        intojPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        intojPanel1.setLayout(new java.awt.GridLayout(3, 2));

        namejLabel1.setText("Наименование");
        intojPanel1.add(namejLabel1);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.naimenovanie}"), namejTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue(null);
        bindingGroup.addBinding(binding);

        namejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextField1ActionPerformed(evt);
            }
        });
        intojPanel1.add(namejTextField1);

        opisaniejLabel1.setText("Описание");
        intojPanel1.add(opisaniejLabel1);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.opisanie}"), opisaniejTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceNullValue(null);
        bindingGroup.addBinding(binding);

        opisaniejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opisaniejTextField1ActionPerformed(evt);
            }
        });
        intojPanel1.add(opisaniejTextField1);

        stoimostjLabel1.setText("Стоимость");
        intojPanel1.add(stoimostjLabel1);

        stoimostjSpinner1.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, Table, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.stoimost}"), stoimostjSpinner1, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        intojPanel1.add(stoimostjSpinner1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(intojPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controljPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intojPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controljPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void СоздатьjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_СоздатьjButton1ActionPerformed
        Usluga usluga = new Usluga();
        usluga.setStoimost(0f);
        uslugaList.add(usluga);
        
        
    }//GEN-LAST:event_СоздатьjButton1ActionPerformed

    private void opisaniejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opisaniejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opisaniejTextField1ActionPerformed

    private void namejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UslugaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UslugaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UslugaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UslugaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UslugaJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JPanel controljPanel1;
    private javax.swing.JPanel intojPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namejLabel1;
    private javax.swing.JTextField namejTextField1;
    private javax.swing.JLabel opisaniejLabel1;
    private javax.swing.JTextField opisaniejTextField1;
    private javax.swing.JLabel stoimostjLabel1;
    private javax.swing.JSpinner stoimostjSpinner1;
    private javax.swing.JButton СоздатьjButton1;
    private javax.swing.JButton СохранитьjButton3;
    private javax.swing.JButton УдалитьjButton2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
