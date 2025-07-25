/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ed.davidnavarroc.proyecto2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author angel
 */
public class EliminarArticulos extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EliminarArticulos.class.getName());

    private Gestor gestor;//Referencia del gestor centralizado
    private Departamento departamentoSeleccionado;

    
    public void recibirGestor(Gestor gestor){ //Método público para compartir la misma instancia con otras ventanas
        this.gestor = gestor;
        mostrarDepartamentos();
    }
    
    public void mostrarDepartamentos(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaElegirDep.getModel();
        modeloTabla.setRowCount(0);
        
        Departamento[] listaDepartamentos = gestor.getDepartamentos();
        
        for(int i = 0; i <= gestor.getUltimoDep(); i++){
            Departamento departamento = listaDepartamentos[i];
            if(departamento != null){
                modeloTabla.addRow(new Object[]{departamento.getId(), departamento.getNombre()});
            }
        }
    }
    
    public void mostrarArticulos(){
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaArticulosDep.getModel();
        modeloTabla.setRowCount(0);
        
        if(departamentoSeleccionado == null){
            return; //No se sigue ejecutando porque no hay un departamento para tratar
        }
        
        Articulo[] listaArticulosEliminar = departamentoSeleccionado.getArticulos();
        
        for(int i = departamentoSeleccionado.getFrenteCola(); i <= departamentoSeleccionado.getFinalCola(); i++){
            Articulo articulo = listaArticulosEliminar[i];
            if(articulo != null){
                modeloTabla.addRow(new Object[]{
                    articulo.getId(),
                    articulo.getNombre(),
                    articulo.getCategoria()
                });
            }
        }
    }
    /**
     * Creates new form EliminarArticulos
     */
    public EliminarArticulos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaElegirDep = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaArticulosDep = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        depSeleccionado = new javax.swing.JTextField();
        btnEliminarArticulos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaElegirDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaElegirDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaElegirDepMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaElegirDep);

        jLabel1.setText("Elija el departamento para eliminar el artículo");

        tablaArticulosDep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Categoría"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaArticulosDep);

        jLabel2.setText("Los artículos del departamento elegido son los siguientes");

        jLabel3.setText("El departamento seleccionado es: ");

        depSeleccionado.setEditable(false);
        depSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depSeleccionadoActionPerformed(evt);
            }
        });

        btnEliminarArticulos.setText("Eiminar artículo");
        btnEliminarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArticulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(depSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(depSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarArticulos))
                .addContainerGap(425, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaElegirDepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaElegirDepMouseClicked
        // TODO add your handling code here:
        
        int filaClick = tablaElegirDep.getSelectedRow();
        
        if(filaClick != -1){
            int idBuscar = (int)tablaElegirDep.getValueAt(filaClick, 0);
            
            Departamento[] departamentosReg = gestor.getDepartamentos();

            for(int i = 0; i <= gestor.getUltimoDep(); i++){
                Departamento departamento = departamentosReg[i];
                if(departamento.getId() == idBuscar){
                    departamentoSeleccionado = departamento;
                    //System.out.println("Departamento seleccionado: " + departamentoSeleccionado.getNombre());
                    mostrarArticulos();
                    break;
                }
            }
        }  
        
        depSeleccionado.setText(departamentoSeleccionado.getNombre());
    }//GEN-LAST:event_tablaElegirDepMouseClicked

    private void depSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depSeleccionadoActionPerformed

    private void btnEliminarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArticulosActionPerformed
        // TODO add your handling code here:
        if(departamentoSeleccionado == null){
            JOptionPane.showMessageDialog(this, "Debe seleccionar un apartamento para eliminar...");
            return;
        }
        
        boolean articuloEliminado = departamentoSeleccionado.eliminarArtículo();
        
        if(articuloEliminado){
            //System.out.println("se eliminó el artículo");
            mostrarArticulos();
        }else{
            JOptionPane.showMessageDialog(this, "No hay artículos para eliminar...");
        }
    }//GEN-LAST:event_btnEliminarArticulosActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new EliminarArticulos().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarArticulos;
    private javax.swing.JTextField depSeleccionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaArticulosDep;
    private javax.swing.JTable tablaElegirDep;
    // End of variables declaration//GEN-END:variables
}
