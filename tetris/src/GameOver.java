import java.awt.*;


public class GameOver extends javax.swing.JDialog {

    private javax.swing.JLabel showScore;


    public GameOver(java.awt.Frame parent, boolean modal, ScoreBoard sb) {
        super(parent, modal);
        initComponents();
        showScore.setText("" + sb.printScore());


    }


    private void initComponents() {

        javax.swing.JTextField jTextField1 = new javax.swing.JTextField();

        javax.swing.JButton jButton2 = new javax.swing.JButton();
        showScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Dialog", Font.BOLD, 48));
        jTextField1.setText("GAME OVER");
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jButton2.setText("exit");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        showScore.setFont(new java.awt.Font("Dialog", Font.BOLD, 36));
        showScore.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(showScore)))
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(showScore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(23, 23, 23))
        );

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }


}
