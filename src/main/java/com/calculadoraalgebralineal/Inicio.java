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
        metodoDeterminante.setBackground(DefaultColor);
        matrizOperacionesBasicas.setBackground(DefaultColor);
        escalonadaReducida.setBackground(DefaultColor);
        matrizTranspuesta.setBackground(DefaultColor);
        matrizInversa.setBackground(DefaultColor);
        metodoNewton.setBackground(DefaultColor);
        metodoFalsaPosicion.setBackground(DefaultColor);
        programasExtras.setBackground(DefaultColor);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        metodoDeterminante = new javax.swing.JButton();
        matrizOperacionesBasicas = new javax.swing.JButton();
        escalonadaReducida = new javax.swing.JButton();
        matrizTranspuesta = new javax.swing.JButton();
        matrizInversa = new javax.swing.JButton();
        metodoNewton = new javax.swing.JButton();
        metodoFalsaPosicion = new javax.swing.JButton();
        programasExtras = new javax.swing.JButton();
        metodoBiseccion = new javax.swing.JButton();
        triangularSuperior1 = new javax.swing.JButton();
        meotodSecante = new javax.swing.JButton();
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

        metodoDeterminante.setBackground(new java.awt.Color(64, 169, 184));
        metodoDeterminante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        metodoDeterminante.setForeground(new java.awt.Color(255, 255, 255));
        metodoDeterminante.setText("Determinante");
        metodoDeterminante.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        metodoDeterminante.setBorderPainted(false);
        metodoDeterminante.setContentAreaFilled(false);
        metodoDeterminante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        metodoDeterminante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                metodoDeterminanteFocusGained(evt);
            }
        });
        metodoDeterminante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metodoDeterminanteMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                metodoDeterminanteMousePressed(evt);
            }
        });
        metodoDeterminante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoDeterminanteActionPerformed(evt);
            }
        });
        Panel1.add(metodoDeterminante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 210, 40));

        matrizOperacionesBasicas.setBackground(new java.awt.Color(64, 169, 184));
        matrizOperacionesBasicas.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        matrizOperacionesBasicas.setForeground(new java.awt.Color(255, 255, 255));
        matrizOperacionesBasicas.setText("Operaciones Básicas Matriz");
        matrizOperacionesBasicas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        matrizOperacionesBasicas.setBorderPainted(false);
        matrizOperacionesBasicas.setContentAreaFilled(false);
        matrizOperacionesBasicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matrizOperacionesBasicasMouseClicked(evt);
            }
        });
        matrizOperacionesBasicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizOperacionesBasicasActionPerformed(evt);
            }
        });
        Panel1.add(matrizOperacionesBasicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 40));

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
        Panel1.add(escalonadaReducida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 40));

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
        Panel1.add(matrizTranspuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 40));

        matrizInversa.setBackground(new java.awt.Color(64, 169, 184));
        matrizInversa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        matrizInversa.setForeground(new java.awt.Color(255, 255, 255));
        matrizInversa.setText("Matriz Inversa");
        matrizInversa.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        matrizInversa.setBorderPainted(false);
        matrizInversa.setContentAreaFilled(false);
        matrizInversa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matrizInversaMouseClicked(evt);
            }
        });
        Panel1.add(matrizInversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 40));

        metodoNewton.setBackground(new java.awt.Color(64, 169, 184));
        metodoNewton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        metodoNewton.setForeground(new java.awt.Color(255, 255, 255));
        metodoNewton.setText("Método de Newton Raphson");
        metodoNewton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        metodoNewton.setBorderPainted(false);
        metodoNewton.setContentAreaFilled(false);
        metodoNewton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metodoNewtonMouseClicked(evt);
            }
        });
        Panel1.add(metodoNewton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 40));

        metodoFalsaPosicion.setBackground(new java.awt.Color(64, 169, 184));
        metodoFalsaPosicion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        metodoFalsaPosicion.setForeground(new java.awt.Color(255, 255, 255));
        metodoFalsaPosicion.setText("Falsa Posición");
        metodoFalsaPosicion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        metodoFalsaPosicion.setBorderPainted(false);
        metodoFalsaPosicion.setContentAreaFilled(false);
        metodoFalsaPosicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metodoFalsaPosicionMouseClicked(evt);
            }
        });
        Panel1.add(metodoFalsaPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 210, 40));

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
        Panel1.add(programasExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 210, 40));

        metodoBiseccion.setBackground(new java.awt.Color(64, 169, 184));
        metodoBiseccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        metodoBiseccion.setForeground(new java.awt.Color(255, 255, 255));
        metodoBiseccion.setText("Método de Bisección");
        metodoBiseccion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        metodoBiseccion.setBorderPainted(false);
        metodoBiseccion.setContentAreaFilled(false);
        metodoBiseccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                metodoBiseccionMouseClicked(evt);
            }
        });
        Panel1.add(metodoBiseccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 40));

        triangularSuperior1.setBackground(new java.awt.Color(64, 169, 184));
        triangularSuperior1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        triangularSuperior1.setForeground(new java.awt.Color(255, 255, 255));
        triangularSuperior1.setText("Matriz Triangular Superior");
        triangularSuperior1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        triangularSuperior1.setBorderPainted(false);
        triangularSuperior1.setContentAreaFilled(false);
        triangularSuperior1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                triangularSuperior1MouseClicked(evt);
            }
        });
        triangularSuperior1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangularSuperior1ActionPerformed(evt);
            }
        });
        Panel1.add(triangularSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 40));

        meotodSecante.setBackground(new java.awt.Color(64, 169, 184));
        meotodSecante.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        meotodSecante.setForeground(new java.awt.Color(255, 255, 255));
        meotodSecante.setText("Método Secante");
        meotodSecante.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        meotodSecante.setBorderPainted(false);
        meotodSecante.setContentAreaFilled(false);
        meotodSecante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meotodSecanteMouseClicked(evt);
            }
        });
        Panel1.add(meotodSecante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, 40));

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

    private void metodoDeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoDeterminanteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_metodoDeterminanteActionPerformed

    private void metodoDeterminanteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_metodoDeterminanteFocusGained

    }//GEN-LAST:event_metodoDeterminanteFocusGained

    private void metodoDeterminanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoDeterminanteMousePressed
        // TODO add your handling code here:
        metodoDeterminante.setBackground(FocusColor);
        matrizOperacionesBasicas.setBackground(FocusColor);
        escalonadaReducida.setBackground(DefaultColor);
        matrizTranspuesta.setBackground(DefaultColor);
        matrizInversa.setBackground(DefaultColor);
        metodoNewton.setBackground(DefaultColor);
        metodoFalsaPosicion.setBackground(DefaultColor);
        programasExtras.setBackground(DefaultColor);
    }//GEN-LAST:event_metodoDeterminanteMousePressed

    private void matrizOperacionesBasicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizOperacionesBasicasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrizOperacionesBasicasActionPerformed

    
public static void open(String targetFilePath) throws IOException
{
    Desktop desktop = Desktop.getDesktop();

    desktop.open(new File(targetFilePath));
}

    private void matrizOperacionesBasicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matrizOperacionesBasicasMouseClicked
       
     try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\matrizOperacionesBasicas.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
     
     
    }//GEN-LAST:event_matrizOperacionesBasicasMouseClicked

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

    private void metodoDeterminanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoDeterminanteMouseClicked
          try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\metodosMatrices.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
    }//GEN-LAST:event_metodoDeterminanteMouseClicked

    private void programasExtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_programasExtrasMouseClicked

//E3F6F8
      try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\programasExtra.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }

    }//GEN-LAST:event_programasExtrasMouseClicked

    private void matrizInversaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matrizInversaMouseClicked
       try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\matrizInversa.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }


    }//GEN-LAST:event_matrizInversaMouseClicked

    private void metodoBiseccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoBiseccionMouseClicked
               try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\metodoBiseccion.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }

    }//GEN-LAST:event_metodoBiseccionMouseClicked

    private void metodoNewtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoNewtonMouseClicked
        
      try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\metodoNewtonRaphson.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
    }//GEN-LAST:event_metodoNewtonMouseClicked

    private void metodoFalsaPosicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_metodoFalsaPosicionMouseClicked
         try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\metodoFalsaPosicion.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }

    }//GEN-LAST:event_metodoFalsaPosicionMouseClicked

    private void triangularSuperior1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangularSuperior1MouseClicked
                try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\matrizTriangularSuperior.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
        
        
    }//GEN-LAST:event_triangularSuperior1MouseClicked

    private void triangularSuperior1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangularSuperior1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triangularSuperior1ActionPerformed

    private void meotodSecanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meotodSecanteMouseClicked

      try {
            
          open("C:\\\\Users\\\\perez\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\CalculadoraAlgebraLineal\\\\src\\\\test\\\\java\\\\metodoSecante.exe");
      } catch (IOException ex) {
      
          System.out.println(ex);
        
      }
        

    }//GEN-LAST:event_meotodSecanteMouseClicked

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
    private javax.swing.JButton escalonadaReducida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton matrizInversa;
    private javax.swing.JButton matrizOperacionesBasicas;
    private javax.swing.JButton matrizTranspuesta;
    private javax.swing.JButton meotodSecante;
    private javax.swing.JButton metodoBiseccion;
    private javax.swing.JButton metodoDeterminante;
    private javax.swing.JButton metodoFalsaPosicion;
    private javax.swing.JButton metodoNewton;
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
    private javax.swing.JButton triangularSuperior1;
    // End of variables declaration//GEN-END:variables

}
