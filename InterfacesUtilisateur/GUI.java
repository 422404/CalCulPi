/*
 * Pour calcul methode disque graphique
 */
package calculpi;

/**
 *
 * @author Elyan
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        cadreDessin = new javax.swing.JPanel();
        txtResultatScrollPane = new javax.swing.JScrollPane();
        txtResultats = new javax.swing.JTextArea();
        btnCalculer = new javax.swing.JButton();
        sliderTaillePoint = new javax.swing.JSlider();
        txtTaillePoint = new javax.swing.JTextField();
        lblTaillePoint = new javax.swing.JLabel();
        sliderNbPoints = new javax.swing.JSlider();
        lblNbPoints = new javax.swing.JLabel();
        txtNbPoints = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cacul Pi : Méthode du quart de disque");
        setResizable(false);

        cadreDessin.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout cadreDessinLayout = new javax.swing.GroupLayout(cadreDessin);
        cadreDessin.setLayout(cadreDessinLayout);
        cadreDessinLayout.setHorizontalGroup(
            cadreDessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        cadreDessinLayout.setVerticalGroup(
            cadreDessinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtResultats.setEditable(false);
        txtResultats.setColumns(20);
        txtResultats.setRows(5);
        txtResultatScrollPane.setViewportView(txtResultats);

        btnCalculer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalculer.setText("Calculer !");
        btnCalculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculerActionPerformed(evt);
            }
        });

        sliderTaillePoint.setMajorTickSpacing(1);
        sliderTaillePoint.setMaximum(5);
        sliderTaillePoint.setMinimum(1);
        sliderTaillePoint.setPaintTicks(true);
        sliderTaillePoint.setSnapToTicks(true);
        sliderTaillePoint.setValue(1);
        sliderTaillePoint.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderTaillePointStateChanged(evt);
            }
        });

        txtTaillePoint.setEditable(false);
        txtTaillePoint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTaillePoint.setText("1 px");

        lblTaillePoint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaillePoint.setText("Taille point :");

        sliderNbPoints.setMajorTickSpacing(1000);
        sliderNbPoints.setMaximum(20000);
        sliderNbPoints.setMinimum(100);
        sliderNbPoints.setPaintTicks(true);
        sliderNbPoints.setToolTipText("");
        sliderNbPoints.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderNbPointsStateChanged(evt);
            }
        });

        lblNbPoints.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNbPoints.setText("Nombre points :");

        txtNbPoints.setEditable(false);
        txtNbPoints.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNbPoints.setText("100 pts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btnCalculer, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadreDessin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sliderNbPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sliderTaillePoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultatScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNbPoints)
                            .addComponent(lblTaillePoint))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNbPoints, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtTaillePoint))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadreDessin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtResultatScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderTaillePoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaillePoint)
                            .addComponent(txtTaillePoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sliderNbPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNbPoints)
                        .addComponent(txtNbPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnCalculer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculerActionPerformed

    private void sliderTaillePointStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderTaillePointStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sliderTaillePointStateChanged

    private void sliderNbPointsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderNbPointsStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sliderNbPointsStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculer;
    private javax.swing.JPanel cadreDessin;
    private javax.swing.JLabel lblNbPoints;
    private javax.swing.JLabel lblTaillePoint;
    private javax.swing.JSlider sliderNbPoints;
    private javax.swing.JSlider sliderTaillePoint;
    private javax.swing.JTextField txtNbPoints;
    private javax.swing.JScrollPane txtResultatScrollPane;
    private javax.swing.JTextArea txtResultats;
    private javax.swing.JTextField txtTaillePoint;
    // End of variables declaration//GEN-END:variables
}
