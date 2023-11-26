package com.calculadoraalgebralineal;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Inicio extends javax.swing.JFrame {
    
    Color DefaultColor = new Color(64,169,184);
    Color FocusColor = new Color(27, 142, 146);

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        
      /*  DefaultColor = new Color(64,169,184);
        FocusColor = new Color(	27, 142, 146);*/
        
        Panel1.setBackground(DefaultColor);
        metodoMatrices.setBackground(DefaultColor);
        triangularSuperior.setBackground(DefaultColor);
        escalonadaReducida.setBackground(DefaultColor);
        matrizTranspuesta.setBackground(DefaultColor);
        transpuestaInversa.setBackground(DefaultColor);
        determinante.setBackground(DefaultColor);
        metodoBiseccion.setBackground(DefaultColor);
        programasExtras.setBackground(DefaultColor);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        metodoMatrices = new javax.swing.JButton();
        triangularSuperior = new javax.swing.JButton();
        escalonadaReducida = new javax.swing.JButton();
        matrizTranspuesta = new javax.swing.JButton();
        transpuestaInversa = new javax.swing.JButton();
        determinante = new javax.swing.JButton();
        metodoBiseccion = new javax.swing.JButton();
        programasExtras = new javax.swing.JButton();
        tabDashboard = new javax.swing.JTabbedPane();
        panelDefault = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        subtitulo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        panelTriangularSuperior = new javax.swing.JPanel();
        panelEscalonadaReducida = new javax.swing.JPanel();
        panelDependencia = new javax.swing.JPanel();
        panelMetodoSarrus = new javax.swing.JPanel();
        panelTranspuesta = new javax.swing.JPanel();
        panelDeterminante = new javax.swing.JPanel();
        panelBiseccion = new javax.swing.JPanel();
        panelProgramasExtras = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 156, 168));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        Panel1.setBackground(new java.awt.Color(64, 169, 184));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        metodoMatrices.setBackground(new java.awt.Color(64, 169, 184));
        metodoMatrices.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        metodoMatrices.setForeground(new java.awt.Color(255, 255, 255));
        metodoMatrices.setText("Sarrus, Gauss & Cofactores");
        metodoMatrices.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        metodoMatrices.setBorderPainted(false);
        metodoMatrices.setContentAreaFilled(false);
        metodoMatrices.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        metodoMatrices.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                metodoMatricesFocusGained(evt);
            }
        });
        metodoMatrices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metodoMatricesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                metodoMatricesMousePressed(evt);
            }
        });
        metodoMatrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoMatricesActionPerformed(evt);
            }
        });
        Panel1.add(metodoMatrices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 40));

        triangularSuperior.setBackground(new java.awt.Color(64, 169, 184));
        triangularSuperior.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        triangularSuperior.setForeground(new java.awt.Color(255, 255, 255));
        triangularSuperior.setText("Matriz Triangular Superior");
        triangularSuperior.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        triangularSuperior.setBorderPainted(false);
        triangularSuperior.setContentAreaFilled(false);
        triangularSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                triangularSuperiorMouseClicked(evt);
            }
        });
        triangularSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangularSuperiorActionPerformed(evt);
            }
        });
        Panel1.add(triangularSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 40));

        escalonadaReducida.setBackground(new java.awt.Color(64, 169, 184));
        escalonadaReducida.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        escalonadaReducida.setForeground(new java.awt.Color(255, 255, 255));
        escalonadaReducida.setText("Escalonada Reducida");
        escalonadaReducida.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        escalonadaReducida.setBorderPainted(false);
        escalonadaReducida.setContentAreaFilled(false);
        escalonadaReducida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                escalonadaReducidaMouseClicked(evt);
            }
        });
        Panel1.add(escalonadaReducida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 40));

        matrizTranspuesta.setBackground(new java.awt.Color(64, 169, 184));
        matrizTranspuesta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        matrizTranspuesta.setForeground(new java.awt.Color(255, 255, 255));
        matrizTranspuesta.setText("Matriz Transpuesta");
        matrizTranspuesta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        matrizTranspuesta.setBorderPainted(false);
        matrizTranspuesta.setContentAreaFilled(false);
        matrizTranspuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matrizTranspuestaMouseClicked(evt);
            }
        });
        Panel1.add(matrizTranspuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 40));

        transpuestaInversa.setBackground(new java.awt.Color(64, 169, 184));
        transpuestaInversa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        transpuestaInversa.setForeground(new java.awt.Color(255, 255, 255));
        transpuestaInversa.setText("Transpuesta e Inversa");
        transpuestaInversa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        transpuestaInversa.setBorderPainted(false);
        transpuestaInversa.setContentAreaFilled(false);
        Panel1.add(transpuestaInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 40));

        determinante.setBackground(new java.awt.Color(64, 169, 184));
        determinante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        determinante.setForeground(new java.awt.Color(255, 255, 255));
        determinante.setText("Determinante");
        determinante.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        determinante.setBorderPainted(false);
        determinante.setContentAreaFilled(false);
        Panel1.add(determinante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 210, 40));

        metodoBiseccion.setBackground(new java.awt.Color(64, 169, 184));
        metodoBiseccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        metodoBiseccion.setForeground(new java.awt.Color(255, 255, 255));
        metodoBiseccion.setText("Método de Bisección");
        metodoBiseccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        metodoBiseccion.setBorderPainted(false);
        metodoBiseccion.setContentAreaFilled(false);
        Panel1.add(metodoBiseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 40));

        programasExtras.setBackground(new java.awt.Color(64, 169, 184));
        programasExtras.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        programasExtras.setForeground(new java.awt.Color(255, 255, 255));
        programasExtras.setText("Programas Extras");
        programasExtras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        programasExtras.setBorderPainted(false);
        programasExtras.setContentAreaFilled(false);
        programasExtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                programasExtrasMouseClicked(evt);
            }
        });
        Panel1.add(programasExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, 40));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 510));

        panelDefault.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(227, 246, 248));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(64, 169, 184));
        subtitulo.setText("Álgebra Lineal");
        jPanel3.add(subtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(64, 169, 184));
        titulo.setText("CALCULADORA");
        jPanel3.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        panelDefault.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 520));

        tabDashboard.addTab("tab0", panelDefault);

        panelTriangularSuperior.setBackground(new java.awt.Color(227, 246, 248));
        panelTriangularSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tabDashboard.addTab("tab1", panelTriangularSuperior);

        panelEscalonadaReducida.setBackground(new java.awt.Color(227, 246, 248));
        panelEscalonadaReducida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tabDashboard.addTab("tab2", panelEscalonadaReducida);

        panelDependencia.setBackground(new java.awt.Color(227, 246, 248));
        tabDashboard.addTab("tab3", panelDependencia);

        panelMetodoSarrus.setBackground(new java.awt.Color(227, 246, 248));
        tabDashboard.addTab("tab4", panelMetodoSarrus);

        panelTranspuesta.setBackground(new java.awt.Color(227, 246, 248));
        tabDashboard.addTab("tab5", panelTranspuesta);

        panelDeterminante.setBackground(new java.awt.Color(227, 246, 248));
        tabDashboard.addTab("tab6", panelDeterminante);

        panelBiseccion.setBackground(new java.awt.Color(227, 246, 248));
        tabDashboard.addTab("tab7", panelBiseccion);

        panelProgramasExtras.setBackground(new java.awt.Color(227, 246, 248));
        panelProgramasExtras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        tabDashboard.addTab("tab8", panelProgramasExtras);

        getContentPane().add(tabDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 700, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void metodoMatricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoMatricesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_metodoMatricesActionPerformed

    private void metodoMatricesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_metodoMatricesFocusGained

    }//GEN-LAST:event_metodoMatricesFocusGained

    private void metodoMatricesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoMatricesMousePressed
        // TODO add your handling code here:
        metodoMatrices.setBackground(FocusColor);
        triangularSuperior.setBackground(FocusColor);
        escalonadaReducida.setBackground(DefaultColor);
        matrizTranspuesta.setBackground(DefaultColor);
        transpuestaInversa.setBackground(DefaultColor);
        determinante.setBackground(DefaultColor);
        metodoBiseccion.setBackground(DefaultColor);
        programasExtras.setBackground(DefaultColor);
    }//GEN-LAST:event_metodoMatricesMousePressed

    private void triangularSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangularSuperiorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triangularSuperiorActionPerformed

    
public static void open(String targetFilePath) throws IOException
{
    Desktop desktop = Desktop.getDesktop();

    desktop.open(new File(targetFilePath));
}

    private void triangularSuperiorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangularSuperiorMouseClicked
       
     try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\matrizTriangularSuperior.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
     
     
    }//GEN-LAST:event_triangularSuperiorMouseClicked

    private void escalonadaReducidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_escalonadaReducidaMouseClicked
        
        try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\matrizReducida.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      } 

    }//GEN-LAST:event_escalonadaReducidaMouseClicked

    private void matrizTranspuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matrizTranspuestaMouseClicked
         try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\matrizTranspuesta.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }

    }//GEN-LAST:event_matrizTranspuestaMouseClicked

    private void metodoMatricesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoMatricesMouseClicked
          try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\metodosMatrices.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
    }//GEN-LAST:event_metodoMatricesMouseClicked

    private void programasExtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programasExtrasMouseClicked

//E3F6F8
      try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\programasExtra.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }

    }//GEN-LAST:event_programasExtrasMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton determinante;
    private javax.swing.JButton escalonadaReducida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton matrizTranspuesta;
    private javax.swing.JButton metodoBiseccion;
    private javax.swing.JButton metodoMatrices;
    private javax.swing.JPanel panelBiseccion;
    private javax.swing.JPanel panelDefault;
    private javax.swing.JPanel panelDependencia;
    private javax.swing.JPanel panelDeterminante;
    private javax.swing.JPanel panelEscalonadaReducida;
    private javax.swing.JPanel panelMetodoSarrus;
    private javax.swing.JPanel panelProgramasExtras;
    private javax.swing.JPanel panelTranspuesta;
    private javax.swing.JPanel panelTriangularSuperior;
    private javax.swing.JButton programasExtras;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTabbedPane tabDashboard;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton transpuestaInversa;
    private javax.swing.JButton triangularSuperior;
    // End of variables declaration//GEN-END:variables

}
