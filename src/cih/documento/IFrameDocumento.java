package cih.documento;

import cci.CIDocumento;
import javax.swing.JTabbedPane;

public class IFrameDocumento extends javax.swing.JInternalFrame {

    CIDocumento ciDocumento;
    
    public IFrameDocumento(CIDocumento ciDocumento) {
        initComponents();
        this.ciDocumento = ciDocumento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooserDocumentoDoc = new javax.swing.JFileChooser();
        jTabPane = new javax.swing.JTabbedPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Documento");
        setPreferredSize(new java.awt.Dimension(564, 465));

        jTabPane.setPreferredSize(new java.awt.Dimension(548, 431));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTabbedPane getjTabPane() {
        return jTabPane;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooserDocumentoDoc;
    private javax.swing.JTabbedPane jTabPane;
    // End of variables declaration//GEN-END:variables
}
