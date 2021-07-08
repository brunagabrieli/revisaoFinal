
import javax.swing.JOptionPane;


public class PetShopGUI extends javax.swing.JFrame {
    String raca, sexo, porte;
    int idade, opcaoPagamento,quantParcelas;
    double valorTotal;
    
   
    public PetShopGUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdade = new javax.swing.JTextField();
        jcbRaca = new javax.swing.JComboBox<>();
        jcbSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jrbMedio = new javax.swing.JRadioButton();
        jrbGrande = new javax.swing.JRadioButton();
        jrbGigante = new javax.swing.JRadioButton();
        jrbPequeno = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jtfQuantParcelas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfValorDaParcela = new javax.swing.JTextField();
        jbCalculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Raça:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORÇAMENTO PARA BANHO E TOSA");

        jLabel3.setText("Sexo:");

        jLabel4.setText("Idade:");

        jtfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdadeActionPerformed(evt);
            }
        });

        jcbRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Dálmata", "Doberman", "Pinscher", "Poodle", "Outra" }));

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "M", "F" }));
        jcbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSexoActionPerformed(evt);
            }
        });

        jLabel5.setText("Porte:");

        buttonGroup1.add(jrbMedio);
        jrbMedio.setText("Médio");

        buttonGroup1.add(jrbGrande);
        jrbGrande.setText("Grande");

        buttonGroup1.add(jrbGigante);
        jrbGigante.setText("Gigante");

        buttonGroup1.add(jrbPequeno);
        jrbPequeno.setText("Pequeno");

        jLabel6.setText("Parcelas:");

        jtfQuantParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfQuantParcelasActionPerformed(evt);
            }
        });

        jLabel7.setText("de");

        jtfValorDaParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorDaParcelaActionPerformed(evt);
            }
        });

        jbCalculo.setText("CALCULAR VALOR");
        jbCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(28, 28, 28)
                                    .addComponent(jtfQuantParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtfValorDaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrbPequeno)
                                    .addGap(28, 28, 28)
                                    .addComponent(jrbMedio)
                                    .addGap(37, 37, 37)
                                    .addComponent(jrbGrande)
                                    .addGap(32, 32, 32)
                                    .addComponent(jrbGigante))))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbPequeno)
                    .addComponent(jrbMedio)
                    .addComponent(jrbGrande)
                    .addComponent(jrbGigante))
                .addGap(28, 28, 28)
                .addComponent(jbCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfQuantParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValorDaParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdadeActionPerformed

    private void jtfQuantParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfQuantParcelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfQuantParcelasActionPerformed

    private void jtfValorDaParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorDaParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorDaParcelaActionPerformed

    private void jcbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbSexoActionPerformed

    private void jbCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalculoActionPerformed
        // TODO add your handling code here:
        String raca = jcbRaca.getSelectedItem().toString();
        String sexo = jcbSexo.getSelectedItem().toString();
        int idade = Integer.parseInt(jtfIdade.getText());
        if (jrbPequeno.isSelected()){
            porte="Pequeno";
            
        }
        if (jrbMedio.isSelected()){
            porte="Médio";
            
        }
        if (jrbGrande.isSelected()){
            porte="Grande";
            
        }
        if (jrbGigante.isSelected()){
            porte="Gigante";
            
        }
        
        
        switch (raca) {
            case "Dálmata":
                valorTotal=100;
                break;
            case "Doberman":
                valorTotal=80;
                break;
            case "Pinscher":
                valorTotal=60;
                break;
            case "Poodle":
                valorTotal=85;
                break;
            case "Outra":
                valorTotal=90;
                break;            
        }
        
        switch (idade) {
            case 1:
                valorTotal+=10;
                break;
            case 2:
                valorTotal+=12;
                break;
            case 3:
                valorTotal+=14;
                break;
            case 4:
                valorTotal+=16;
                break;
            case 5:
                valorTotal+=20;
                break;    
            case 6:
                valorTotal+=25;
                break;
            default: 
                valorTotal+=35;
                break;      
        }
        
        switch (sexo){
            case "M":
                valorTotal+=50;
                break;
            case "F":
                valorTotal+=40;
                break;
        }
        
        switch (porte){
            case "Pequeno":
                valorTotal+=50;
                break;
            case "Médio":
                valorTotal+=80;
                break;
            case "Grande":
                valorTotal+=110;
                break;
            case "Gigante":
                valorTotal+=150;
                break;     
        }
        
        String []opcoes = {"Cheque", "Cartão", "Dinheiro"};
        int op = JOptionPane.showOptionDialog(null, "Escolha uma opção!!", "Opções", 1, 3, null, opcoes, null);
        
         switch (op){
             case 1:
                 valorTotal=valorTotal*1.02;
                break;
             case 2:
                 valorTotal=valorTotal*0.95;
                 break;
         }
         
         String []opcoes1 = {"Uma", "Duas", "Três"};
        int op1 = JOptionPane.showOptionDialog(null, "Escolha uma opção!!", "Opções", 1, 3, null, opcoes1, null);
        
         switch (op){
            case 1:
                 valorTotal=valorTotal/2;
                 break;
             case 2:
                 valorTotal=valorTotal/3;
                 break;
         }
         
        jtfQuantParcelas.setText(op1+1+"");
        jtfValorDaParcela.setText(""+valorTotal);
    }//GEN-LAST:event_jbCalculoActionPerformed

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
            java.util.logging.Logger.getLogger(PetShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetShopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetShopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbCalculo;
    private javax.swing.JComboBox<String> jcbRaca;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JRadioButton jrbGigante;
    private javax.swing.JRadioButton jrbGrande;
    private javax.swing.JRadioButton jrbMedio;
    private javax.swing.JRadioButton jrbPequeno;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfQuantParcelas;
    private javax.swing.JTextField jtfValorDaParcela;
    // End of variables declaration//GEN-END:variables
}
