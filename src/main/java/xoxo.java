
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

public class xoxo extends javax.swing.JFrame {

    String[] Name = new String[100];
    String[] cBox = new String[100];
    int[] richtig = new int[100];

    Random zufall = new Random();
    int zufall1, zufall2, zufall3, zufall4, zufall5, zufall6, zufall7, zufall8, zufall9;

    int runde = 0;
    int nummer = 0;
    int zahl = 0;
    int okeingabe = 0;
    int x = 0;
    int z = 9;

    public xoxo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xo1 = new javax.swing.JButton();
        xo4 = new javax.swing.JButton();
        xo5 = new javax.swing.JButton();
        xo6 = new javax.swing.JButton();
        xo7 = new javax.swing.JButton();
        xo8 = new javax.swing.JButton();
        xo9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        oder = new javax.swing.JLabel();
        xodero = new javax.swing.JComboBox<>();
        nameeingabe = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ausgabe = new javax.swing.JTextArea();
        xo3 = new javax.swing.JButton();
        xo2 = new javax.swing.JButton();
        info = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fertig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X / O");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        xo1.setBackground(new java.awt.Color(51, 51, 51));
        xo1.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo1.setForeground(new java.awt.Color(204, 204, 204));
        xo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo1ActionPerformed(evt);
            }
        });

        xo4.setBackground(new java.awt.Color(51, 51, 51));
        xo4.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo4.setForeground(new java.awt.Color(204, 204, 204));
        xo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo4ActionPerformed(evt);
            }
        });

        xo5.setBackground(new java.awt.Color(51, 51, 51));
        xo5.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo5.setForeground(new java.awt.Color(204, 204, 204));
        xo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo5ActionPerformed(evt);
            }
        });

        xo6.setBackground(new java.awt.Color(51, 51, 51));
        xo6.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo6.setForeground(new java.awt.Color(204, 204, 204));
        xo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo6ActionPerformed(evt);
            }
        });

        xo7.setBackground(new java.awt.Color(51, 51, 51));
        xo7.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo7.setForeground(new java.awt.Color(204, 204, 204));
        xo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo7ActionPerformed(evt);
            }
        });

        xo8.setBackground(new java.awt.Color(51, 51, 51));
        xo8.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo8.setForeground(new java.awt.Color(204, 204, 204));
        xo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo8ActionPerformed(evt);
            }
        });

        xo9.setBackground(new java.awt.Color(51, 51, 51));
        xo9.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo9.setForeground(new java.awt.Color(204, 204, 204));
        xo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo9ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("PT Serif", 3, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name der Spieler:");

        oder.setBackground(new java.awt.Color(0, 0, 0));
        oder.setFont(new java.awt.Font("PT Serif", 3, 13)); // NOI18N
        oder.setForeground(new java.awt.Color(255, 255, 255));
        oder.setText("X ODER O?");

        xodero.setFont(new java.awt.Font("PT Serif", 3, 13)); // NOI18N
        xodero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "wählen:", "X", "O" }));
        xodero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                xoderoItemStateChanged(evt);
            }
        });

        nameeingabe.setFont(new java.awt.Font("PT Serif", 3, 13)); // NOI18N

        start.setFont(new java.awt.Font("PT Serif", 3, 13)); // NOI18N
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        ok.setBackground(new java.awt.Color(255, 255, 255));
        ok.setFont(new java.awt.Font("PT Serif", 3, 13)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        ausgabe.setColumns(20);
        ausgabe.setRows(5);
        jScrollPane1.setViewportView(ausgabe);

        xo3.setBackground(new java.awt.Color(51, 51, 51));
        xo3.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo3.setForeground(new java.awt.Color(204, 204, 204));
        xo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo3ActionPerformed(evt);
            }
        });

        xo2.setBackground(new java.awt.Color(51, 51, 51));
        xo2.setFont(new java.awt.Font("PT Serif", 3, 60)); // NOI18N
        xo2.setForeground(new java.awt.Color(204, 204, 204));
        xo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xo2ActionPerformed(evt);
            }
        });

        info.setFont(new java.awt.Font("PT Serif", 3, 14)); // NOI18N
        info.setText("INFOS");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("PT Serif", 3, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIC TAC TOK OX SPIEL!");

        fertig.setFont(new java.awt.Font("PT Serif", 3, 14)); // NOI18N
        fertig.setText("Fertig");
        fertig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fertigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(xo4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xo5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(xo6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(oder, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(xodero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(nameeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(xo1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(xo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(info))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fertig)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(start))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(xo3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(xo7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xo8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xo9, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameeingabe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(oder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xodero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(start)
                            .addComponent(fertig))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(info)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(xo1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(xo2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(xo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xo4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xo5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xo6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xo7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xo8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xo9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        runde++;

        ausgabe.setEnabled(false);
        xo1.setEnabled(false);
        xo2.setEnabled(false);
        xo3.setEnabled(false);
        xo4.setEnabled(false);
        xo5.setEnabled(false);
        xo6.setEnabled(false);
        xo7.setEnabled(false);
        xo8.setEnabled(false);
        xo9.setEnabled(false);
        xo1.setText("");
        xo2.setText("");
        xo3.setText("");
        xo4.setText("");
        xo5.setText("");
        xo6.setText("");
        xo7.setText("");
        xo8.setText("");
        xo9.setText("");
        xo1.setBackground(Color.BLACK);
        xo2.setBackground(Color.BLACK);
        xo3.setBackground(Color.BLACK);
        xo4.setBackground(Color.BLACK);
        xo5.setBackground(Color.BLACK);
        xo6.setBackground(Color.BLACK);
        xo7.setBackground(Color.BLACK);
        xo8.setBackground(Color.BLACK);
        xo9.setBackground(Color.BLACK);

        info.setEnabled(false);
        ok.setEnabled(false);
        nameeingabe.setEnabled(true);
        xodero.setEnabled(true);
        start.setEnabled(true);

        if (zahl > 1) {
            xodero.removeAllItems();
            xodero.addItem("O");
            xodero.addItem("X");
        }

        x = 0;
    }//GEN-LAST:event_startActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        nummer++;
        okeingabe++;

        for (int i = runde; i <= nummer; i++) {
            Name[nummer] = nameeingabe.getText();
            cBox[nummer] = xodero.getSelectedItem().toString();
        }

        nameeingabe.setText(" ");

        if (okeingabe >= 1) {
            nameeingabe.setEnabled(false);
            xodero.setEnabled(false);
            xo1.setEnabled(true);
            xo2.setEnabled(true);
            xo3.setEnabled(true);
            xo4.setEnabled(true);
            xo5.setEnabled(true);
            xo6.setEnabled(true);
            xo7.setEnabled(true);
            xo8.setEnabled(true);
            xo9.setEnabled(true);
            ok.setEnabled(false);

            okeingabe = 0;

        }

        if (xodero.getSelectedItem() == "O") {
            xodero.removeItem("O");
            xodero.addItem("X");

        } else if (xodero.getSelectedItem() == "X") {
            xodero.removeItem("X");
            xodero.addItem("O");

        }

    }//GEN-LAST:event_okActionPerformed

    private void xoderoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_xoderoItemStateChanged

        if (xodero.getSelectedIndex() != 0 || xodero.getSelectedIndex() == 0) {
            xodero.removeItem("wählen:");

            if (xodero.getSelectedItem() == "O") {
                xodero.removeItem("X");
                zahl++;
            } else if (xodero.getSelectedItem() == "X") {
                xodero.removeItem("O");
                zahl++;
            }
        }

        ok.setEnabled(true);
    }//GEN-LAST:event_xoderoItemStateChanged

    private void xo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo1ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo1.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");

            zufall1 = Math.abs(zufall.nextInt()) % z;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            //xo1.setText(String.valueOf(zufall1));
            switch (zufall1) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo1.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");

            zufall1 = Math.abs(zufall.nextInt()) % z;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall1) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }

            if (xo1.getText() == "X" && xo4.getText() == "X" && xo7.getText() == "X") {

                xo1.setBackground(Color.green);
                xo4.setBackground(Color.green);
                xo7.setBackground(Color.green);

                //xo1.setEnabled(false);
                xo2.setEnabled(false);
                xo3.setEnabled(false);
                //xo4.setEnabled(false);
                xo5.setEnabled(false);
                xo6.setEnabled(false);
                //xo7.setEnabled(false);
                xo8.setEnabled(false);
                xo9.setEnabled(false);

            } else if (xo1.getText() == "X" && xo2.getText() == "X" && xo3.getText() == "X") {

                xo1.setBackground(Color.green);
                xo2.setBackground(Color.green);
                xo3.setBackground(Color.green);

                //xo1.setEnabled(false);
                //xo2.setEnabled(false);
                //xo3.setEnabled(false);
                xo4.setEnabled(false);
                xo5.setEnabled(false);
                xo6.setEnabled(false);
                xo7.setEnabled(false);
                xo8.setEnabled(false);
                xo9.setEnabled(false);

            } else if (xo1.getText() == "X" && xo5.getText() == "X" && xo9.getText() == "X") {

                xo1.setBackground(Color.green);
                xo5.setBackground(Color.green);
                xo9.setBackground(Color.green);

                //xo1.setEnabled(false);
                xo2.setEnabled(false);
                xo3.setEnabled(false);
                xo4.setEnabled(false);
                //xo5.setEnabled(false);
                xo6.setEnabled(false);
                xo7.setEnabled(false);
                xo8.setEnabled(false);
                //xo9.setEnabled(false);
            }
        }
    }//GEN-LAST:event_xo1ActionPerformed

    private void xo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo2ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo2.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");

            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall2) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo2.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");

            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall2) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo2.getText() == "X" && xo5.getText() == "X" && xo8.getText() == "X") {

            xo2.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo8.setBackground(Color.green);

            xo1.setEnabled(false);
            //xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            //xo8.setEnabled(false);
            xo9.setEnabled(false);

        } else if (xo1.getText() == "X" && xo2.getText() == "X" && xo3.getText() == "X") {

            xo1.setBackground(Color.green);
            xo2.setBackground(Color.green);
            xo3.setBackground(Color.green);

            //xo1.setEnabled(false);
            //xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);

        }


    }//GEN-LAST:event_xo2ActionPerformed

    private void xo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo3ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo3.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall3) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo3.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall3) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo3.getText() == "X" && xo6.getText() == "X" && xo9.getText() == "X") {

            xo3.setBackground(Color.green);
            xo6.setBackground(Color.green);
            xo9.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            //xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            //xo9.setEnabled(false);

        } else if (xo3.getText() == "X" && xo5.getText() == "X" && xo7.getText() == "X") {

            xo3.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo7.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);

        } else if (xo1.getText() == "X" && xo2.getText() == "X" && xo3.getText() == "X") {

            xo1.setBackground(Color.green);
            xo2.setBackground(Color.green);
            xo3.setBackground(Color.green);

            //xo1.setEnabled(false);
            //xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        }

    }//GEN-LAST:event_xo3ActionPerformed

    private void xo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo4ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo4.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall4) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo4.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall4) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo1.getText() == "X" && xo4.getText() == "X" && xo7.getText() == "X") {

            xo1.setBackground(Color.green);
            xo4.setBackground(Color.green);
            xo7.setBackground(Color.green);

            //xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            //xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);

        } else if (xo5.getText() == "X" && xo4.getText() == "X" && xo6.getText() == "X") {

            xo5.setBackground(Color.green);
            xo4.setBackground(Color.green);
            xo6.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            //xo4.setEnabled(false);
            //xo5.setEnabled(false);
            //xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        }

    }//GEN-LAST:event_xo4ActionPerformed

    private void xo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo5ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo5.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall5) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo5.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall5) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo2.getText() == "X" && xo5.getText() == "X" && xo8.getText() == "X") {

            xo2.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo8.setBackground(Color.green);

            xo1.setEnabled(false);
            //xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            //xo8.setEnabled(false);
            xo9.setEnabled(false);
        } else if (xo5.getText() == "X" && xo4.getText() == "X" && xo6.getText() == "X") {

            xo5.setBackground(Color.green);
            xo4.setBackground(Color.green);
            xo6.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            //xo4.setEnabled(false);
            //xo5.setEnabled(false);
            //xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        } else if (xo3.getText() == "X" && xo5.getText() == "X" && xo7.getText() == "X") {

            xo3.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo7.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        } else if (xo1.getText() == "X" && xo5.getText() == "X" && xo9.getText() == "X") {

            xo1.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo9.setBackground(Color.green);

            //xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            //xo9.setEnabled(false);
        }

    }//GEN-LAST:event_xo5ActionPerformed

    private void xo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo6ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo6.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall6) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo6.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall6) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo3.getText() == "X" && xo6.getText() == "X" && xo9.getText() == "X") {

            xo3.setBackground(Color.green);
            xo6.setBackground(Color.green);
            xo9.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            //xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            //xo9.setEnabled(false);
        } else if (xo5.getText() == "X" && xo4.getText() == "X" && xo6.getText() == "X") {

            xo5.setBackground(Color.green);
            xo4.setBackground(Color.green);
            xo6.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            //xo4.setEnabled(false);
            //xo5.setEnabled(false);
            //xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        }

    }//GEN-LAST:event_xo6ActionPerformed

    private void xo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo7ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo7.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall7) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo7.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");
            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            zufall7 = Math.abs(zufall.nextInt()) % 9;
            //zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall7) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo8.setText(String.valueOf(zufall8));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo1.getText() == "X" && xo4.getText() == "X" && xo7.getText() == "X") {

            xo1.setBackground(Color.green);
            xo4.setBackground(Color.green);
            xo7.setBackground(Color.green);

            //xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            //xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        } else if (xo3.getText() == "X" && xo5.getText() == "X" && xo7.getText() == "X") {

            xo3.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo7.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            xo8.setEnabled(false);
            xo9.setEnabled(false);
        } else if (xo7.getText() == "X" && xo8.getText() == "X" && xo9.getText() == "X") {

            xo7.setBackground(Color.green);
            xo8.setBackground(Color.green);
            xo9.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            //xo8.setEnabled(false);
            //xo9.setEnabled(false);
        }

    }//GEN-LAST:event_xo7ActionPerformed

    private void xo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo8ActionPerformed

        if (xodero.getSelectedItem() == "O") {
            xo8.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");

            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall8) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo1.setText(String.valueOf(zufall1));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        } else if (xodero.getSelectedItem() == "X") {
            xo8.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");

            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            //zufall2 = Math.abs(zufall.nextInt()) % 9;
            //zufall3 = Math.abs(zufall.nextInt()) % 9;
            //zufall4 = Math.abs(zufall.nextInt()) % 9;
            //zufall5 = Math.abs(zufall.nextInt()) % 9;
            //zufall6 = Math.abs(zufall.nextInt()) % 9;
            //zufall7 = Math.abs(zufall.nextInt()) % 9;
            zufall8 = Math.abs(zufall.nextInt()) % 9;
            //zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall8) {
                case 0:
                    xo2.setText(String.valueOf(zufall2));
                    break;
                case 1:
                    xo3.setText(String.valueOf(zufall3));
                    break;
                case 2:
                    xo4.setText(String.valueOf(zufall4));
                    break;
                case 3:
                    xo5.setText(String.valueOf(zufall5));
                    break;
                case 4:
                    xo6.setText(String.valueOf(zufall6));
                    break;
                case 5:
                    xo7.setText(String.valueOf(zufall7));
                    break;
                case 6:
                    xo1.setText(String.valueOf(zufall1));
                    break;
                case 7:
                    xo9.setText(String.valueOf(zufall9));
                    break;

            }
        }
        if (xo2.getText() == "X" && xo5.getText() == "X" && xo8.getText() == "X") {

            xo2.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo8.setBackground(Color.green);

            xo1.setEnabled(false);
            //xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            //xo8.setEnabled(false);
            xo9.setEnabled(false);
        } else if (xo7.getText() == "X" && xo8.getText() == "X" && xo9.getText() == "X") {

            xo7.setBackground(Color.green);
            xo8.setBackground(Color.green);
            xo9.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            //xo8.setEnabled(false);
            //xo9.setEnabled(false);
        }


    }//GEN-LAST:event_xo8ActionPerformed

    private void xo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xo9ActionPerformed
       // z--;
        if (xodero.getSelectedItem() == "O") {
            xo9.setText("O");
            xodero.removeItem("O");
            xodero.addItem("X");

            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            zufall2 = Math.abs(zufall.nextInt()) % 9;
            zufall3 = Math.abs(zufall.nextInt()) % 9;
            zufall4 = Math.abs(zufall.nextInt()) % 9;
            zufall5 = Math.abs(zufall.nextInt()) % 9;
            zufall6 = Math.abs(zufall.nextInt()) % 9;
            zufall7 = Math.abs(zufall.nextInt()) % 9;
            zufall8 = Math.abs(zufall.nextInt()) % 9;
            zufall9 = Math.abs(zufall.nextInt()) % z;
            switch (zufall9) {

                case 0:
                    if (zufall9 == 0) {
                        xo2.setText(String.valueOf(zufall2));
                        break;
                    }

                case 1:
                    if (zufall9 == 1) {
                        xo3.setText(String.valueOf(zufall3));
                        break;
                    }
                case 2:
                    if (zufall9 == 2) {
                        xo4.setText(String.valueOf(zufall4));
                        break;
                    }
                case 3:
                    if (zufall9 == 3) {
                        xo5.setText(String.valueOf(zufall5));
                        break;
                    }
                case 4:
                    if (zufall9 == 4) {
                        xo6.setText(String.valueOf(zufall6));
                        break;
                    }
                case 5:
                    if (zufall9 == 5) {
                        xo7.setText(String.valueOf(zufall7));
                        break;
                    }
                case 6:
                    if (zufall9 == 6) {
                        xo8.setText(String.valueOf(zufall8));
                        break;
                    }
                case 7:
                    if (zufall9 == 7) {
                        xo1.setText(String.valueOf(zufall1));
                        break;
                    }

            }
        } else if (xodero.getSelectedItem()
                == "X") {
            xo9.setText("X");
            xodero.removeItem("X");
            xodero.addItem("O");

            //zufall1 = Math.abs(zufall.nextInt()) % 9;
            zufall2 = Math.abs(zufall.nextInt()) % 9;
            zufall3 = Math.abs(zufall.nextInt()) % 9;
            zufall4 = Math.abs(zufall.nextInt()) % 9;
            zufall5 = Math.abs(zufall.nextInt()) % 9;
            zufall6 = Math.abs(zufall.nextInt()) % 9;
            zufall7 = Math.abs(zufall.nextInt()) % 9;
            zufall8 = Math.abs(zufall.nextInt()) % 9;
            zufall9 = Math.abs(zufall.nextInt()) % 9;
            switch (zufall9) {

                case 0:
                    if (zufall9 == 0) {
                        xo2.setText(String.valueOf(zufall2));
                        break;
                    }

                case 1:
                    if (zufall9 == 1) {
                        xo3.setText(String.valueOf(zufall3));
                        break;
                    }
                case 2:
                    if (zufall9 == 2) {
                        xo4.setText(String.valueOf(zufall4));
                        break;
                    }
                case 3:
                    if (zufall9 == 3) {
                        xo5.setText(String.valueOf(zufall5));
                        break;
                    }
                case 4:
                    if (zufall9 == 4) {
                        xo6.setText(String.valueOf(zufall6));
                        break;
                    }
                case 5:
                    if (zufall9 == 5) {
                        xo7.setText(String.valueOf(zufall7));
                        break;
                    }
                case 6:
                    if (zufall9 == 6) {
                        xo8.setText(String.valueOf(zufall8));
                        break;
                    }
                case 7:
                    if (zufall9 == 7) {
                        xo1.setText(String.valueOf(zufall1));
                        break;
                    }

            }
        }

        if (xo3.getText()
                == "X" && xo6.getText() == "X" && xo9.getText() == "X") {

            xo3.setBackground(Color.green);
            xo6.setBackground(Color.green);
            xo9.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            //xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            //xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            //xo9.setEnabled(false);
        } else if (xo7.getText()
                == "X" && xo8.getText() == "X" && xo9.getText() == "X") {

            xo7.setBackground(Color.green);
            xo8.setBackground(Color.green);
            xo9.setBackground(Color.green);

            xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            xo5.setEnabled(false);
            xo6.setEnabled(false);
            //xo7.setEnabled(false);
            //xo8.setEnabled(false);
            //xo9.setEnabled(false);
        } else if (xo1.getText()
                == "X" && xo5.getText() == "X" && xo9.getText() == "X") {

            xo1.setBackground(Color.green);
            xo5.setBackground(Color.green);
            xo9.setBackground(Color.green);

            //xo1.setEnabled(false);
            xo2.setEnabled(false);
            xo3.setEnabled(false);
            xo4.setEnabled(false);
            //xo5.setEnabled(false);
            xo6.setEnabled(false);
            xo7.setEnabled(false);
            xo8.setEnabled(false);
            //xo9.setEnabled(false);
        }

    }//GEN-LAST:event_xo9ActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed

        JOptionPane.showMessageDialog(this, "Ergebniss: " + Name[1], "Gewinn", HEIGHT);

        //for (int r = 1; r <= runde; r++) {
        //ausgabe.append(r + ". Runde \n");
        for (int i = 1; i <= nummer; i++) {
            JOptionPane.showMessageDialog(this, "Ergebniss: " + Name[i], "Gewinn", HEIGHT);
            //ausgabe.append("\t" + i + ". Name des mitSpielers:  " + Name[i] + ", Gewählt: " + cBox[i] + "\n");
        }

        //}
        // TODO add your handling code here:
    }//GEN-LAST:event_infoActionPerformed

    private void fertigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fertigActionPerformed

        xo1.setEnabled(false);
        xo2.setEnabled(false);
        xo3.setEnabled(false);
        xo4.setEnabled(false);
        xo5.setEnabled(false);
        xo6.setEnabled(false);
        xo7.setEnabled(false);
        xo8.setEnabled(false);
        xo9.setEnabled(false);
        xo1.setText("");
        xo2.setText("");
        xo3.setText("");
        xo4.setText("");
        xo5.setText("");
        xo6.setText("");
        xo7.setText("");
        xo8.setText("");
        xo9.setText("");

        info.setEnabled(true);
        ok.setEnabled(false);
        nameeingabe.setEnabled(false);
        xodero.setEnabled(false);
        start.setEnabled(false);
        ausgabe.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_fertigActionPerformed

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
            java.util.logging.Logger.getLogger(xoxo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xoxo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xoxo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xoxo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xoxo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ausgabe;
    private javax.swing.JButton fertig;
    private javax.swing.JButton info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameeingabe;
    private javax.swing.JLabel oder;
    private javax.swing.JButton ok;
    private javax.swing.JButton start;
    private javax.swing.JButton xo1;
    private javax.swing.JButton xo2;
    private javax.swing.JButton xo3;
    private javax.swing.JButton xo4;
    private javax.swing.JButton xo5;
    private javax.swing.JButton xo6;
    private javax.swing.JButton xo7;
    private javax.swing.JButton xo8;
    private javax.swing.JButton xo9;
    private javax.swing.JComboBox<String> xodero;
    // End of variables declaration//GEN-END:variables
}
