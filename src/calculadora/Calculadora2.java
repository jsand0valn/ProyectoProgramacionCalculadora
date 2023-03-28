
package calculadora;

import javax.swing.JOptionPane;

public class Calculadora2 extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    public double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    public Calculadora2() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonraiz = new javax.swing.JButton();
        botondivision = new javax.swing.JButton();
        botonce = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonmultiplicacion = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonresta = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonsuma = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        botoncero = new javax.swing.JButton();
        botonpunto = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new java.awt.GridLayout(5, 4));

        botonC.setBackground(new java.awt.Color(255, 153, 0));
        botonC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonC.setForeground(new java.awt.Color(0, 0, 0));
        botonC.setText("CE");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        Panel.add(botonC);

        botonraiz.setBackground(new java.awt.Color(204, 204, 204));
        botonraiz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonraiz.setForeground(new java.awt.Color(0, 0, 0));
        botonraiz.setText("^2");
        botonraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonraizActionPerformed(evt);
            }
        });
        Panel.add(botonraiz);

        botondivision.setBackground(new java.awt.Color(204, 204, 204));
        botondivision.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botondivision.setForeground(new java.awt.Color(0, 0, 0));
        botondivision.setText("/");
        botondivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondivisionActionPerformed(evt);
            }
        });
        Panel.add(botondivision);

        botonce.setBackground(new java.awt.Color(255, 153, 0));
        botonce.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        botonce.setForeground(new java.awt.Color(0, 0, 0));
        botonce.setText("←");
        botonce.setAlignmentY(0.0F);
        botonce.setMaximumSize(new java.awt.Dimension(75, 80));
        botonce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonceActionPerformed(evt);
            }
        });
        Panel.add(botonce);

        boton7.setBackground(new java.awt.Color(204, 204, 204));
        boton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton7.setForeground(new java.awt.Color(0, 0, 0));
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        Panel.add(boton7);

        boton8.setBackground(new java.awt.Color(204, 204, 204));
        boton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton8.setForeground(new java.awt.Color(0, 0, 0));
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        Panel.add(boton8);

        boton9.setBackground(new java.awt.Color(204, 204, 204));
        boton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton9.setForeground(new java.awt.Color(0, 0, 0));
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        Panel.add(boton9);

        botonmultiplicacion.setBackground(new java.awt.Color(204, 204, 204));
        botonmultiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonmultiplicacion.setForeground(new java.awt.Color(0, 0, 0));
        botonmultiplicacion.setText("*");
        botonmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmultiplicacionActionPerformed(evt);
            }
        });
        Panel.add(botonmultiplicacion);

        boton4.setBackground(new java.awt.Color(204, 204, 204));
        boton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton4.setForeground(new java.awt.Color(0, 0, 0));
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        Panel.add(boton4);

        boton5.setBackground(new java.awt.Color(204, 204, 204));
        boton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton5.setForeground(new java.awt.Color(0, 0, 0));
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        Panel.add(boton5);

        boton6.setBackground(new java.awt.Color(204, 204, 204));
        boton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton6.setForeground(new java.awt.Color(0, 0, 0));
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        Panel.add(boton6);

        botonresta.setBackground(new java.awt.Color(204, 204, 204));
        botonresta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonresta.setForeground(new java.awt.Color(0, 0, 0));
        botonresta.setText("-");
        botonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonrestaActionPerformed(evt);
            }
        });
        Panel.add(botonresta);

        boton1.setBackground(new java.awt.Color(204, 204, 204));
        boton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton1.setForeground(new java.awt.Color(0, 0, 0));
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        Panel.add(boton1);

        boton2.setBackground(new java.awt.Color(204, 204, 204));
        boton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(0, 0, 0));
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        Panel.add(boton2);

        boton3.setBackground(new java.awt.Color(204, 204, 204));
        boton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boton3.setForeground(new java.awt.Color(0, 0, 0));
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        Panel.add(boton3);

        botonsuma.setBackground(new java.awt.Color(204, 204, 204));
        botonsuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonsuma.setForeground(new java.awt.Color(0, 0, 0));
        botonsuma.setText("+");
        botonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsumaActionPerformed(evt);
            }
        });
        Panel.add(botonsuma);

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("+/-");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        Panel.add(jButton17);

        botoncero.setBackground(new java.awt.Color(204, 204, 204));
        botoncero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botoncero.setForeground(new java.awt.Color(0, 0, 0));
        botoncero.setText("0");
        botoncero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonceroActionPerformed(evt);
            }
        });
        Panel.add(botoncero);

        botonpunto.setBackground(new java.awt.Color(204, 204, 204));
        botonpunto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonpunto.setForeground(new java.awt.Color(0, 0, 0));
        botonpunto.setText(".");
        botonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonpuntoActionPerformed(evt);
            }
        });
        Panel.add(botonpunto);

        botonigual.setBackground(new java.awt.Color(204, 204, 204));
        botonigual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonigual.setForeground(new java.awt.Color(0, 0, 0));
        botonigual.setText("=");
        botonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonigualActionPerformed(evt);
            }
        });
        Panel.add(botonigual);

        etiquetaNumeros.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        etiquetaMuestra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMuestra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton3ActionPerformed

    private void botonceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonceroActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_botonceroActionPerformed

    private void botonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonigualActionPerformed
        double segundoNumero;

        if (operacion.equals("nula")) {
            etiquetaNumeros.setText(cadenaNumeros);

        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            Suma Sumar=new Suma(primerNumero,segundoNumero);
            resultado = Suma.sumar();//aqui llama la clase suma
            JOptionPane.showMessageDialog(this,Suma.sumar());

            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convierte double a string
            operacion = "nula";

        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            Resta Restar=new Resta(primerNumero,segundoNumero);
            resultado =Resta.restar() ;//aqui llama la clase resta
            JOptionPane.showMessageDialog(this,Resta.restar());

            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convierte double a string
            operacion = "nula";
            
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            Multiplicacion Multiplicar=new Multiplicacion(primerNumero,segundoNumero);
            resultado = Multiplicacion.multiplicar();//aqui llama la clase Multi
            JOptionPane.showMessageDialog(this,Multiplicacion.multiplicar());

            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convierte double a string
            operacion = "nula";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            Division Dividir=new Division(primerNumero,segundoNumero);
            resultado = Division.dividir();//aqui llama la clase divi
            JOptionPane.showMessageDialog(this,Division.dividir());
            
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);//convierte double a string
        }

        etiquetaMuestra.setText("");
        activado = true;
        punto = false;
    }//GEN-LAST:event_botonigualActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;//uso la calculadora
    }//GEN-LAST:event_boton2ActionPerformed

    private void botonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsumaActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            activado = false;

        }
    }//GEN-LAST:event_botonsumaActionPerformed

    private void botonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonrestaActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            activado = false;
        }
    }//GEN-LAST:event_botonrestaActionPerformed

    private void botonmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmultiplicacionActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            activado = false;
        }
    }//GEN-LAST:event_botonmultiplicacionActionPerformed

    private void botondivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondivisionActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            activado = false;
        }
    }//GEN-LAST:event_botondivisionActionPerformed

    private void botonraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonraizActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        resultado = Math.pow(primerNumero, 2);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);


    }//GEN-LAST:event_botonraizActionPerformed

    private void botonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonpuntoActionPerformed
        if (punto == true) {
            if (cadenaNumeros.equals("")) {
                cadenaNumeros = "0.";

            } else {
                cadenaNumeros += ".";

            }
            etiquetaNumeros.setText(cadenaNumeros);
        }

    }//GEN-LAST:event_botonpuntoActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if (cadenaNumeros.charAt(0) != '-') {//CAMBIO DE SIGNO
            cadenaNumeros = '-' + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }

        etiquetaNumeros.setText(cadenaNumeros);

    }//GEN-LAST:event_jButton17ActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        // SE BORRA TODO

        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        operacion = "nula";
        cadenaNumeros = "";
        activado = true;
        punto = true;

    }//GEN-LAST:event_botonCActionPerformed

    private void botonceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonceActionPerformed
        int tamano = cadenaNumeros.length();
        if (tamano > 0) {
            if (tamano == 1) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonceActionPerformed
    
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
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonce;
    private javax.swing.JButton botoncero;
    private javax.swing.JButton botondivision;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botonmultiplicacion;
    private javax.swing.JButton botonpunto;
    private javax.swing.JButton botonraiz;
    private javax.swing.JButton botonresta;
    private javax.swing.JButton botonsuma;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButton17;
    // End of variables declaration//GEN-END:variables
}
