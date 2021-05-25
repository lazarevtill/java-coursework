import javax.swing.*;

public class Tetris extends javax.swing.JFrame {

    private Board board;
    private NextShape nextShape1;
    private ScoreBoard scoreBoard;

    public Tetris() {
        initComponents();
        setLocationRelativeTo(null);
        board.setScoreBoard(scoreBoard);
        board.setNextShape(nextShape1);
        board.setParentFrame(this);
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Lazarev".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tetris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Tetris().setVisible(true));
    }


    private void initComponents() {
        scoreBoard = new ScoreBoard();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        nextShape1 = new NextShape();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        board = new Board();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenuItem jMenuItemInitGame = new javax.swing.JMenuItem();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        scoreBoard.setText("Score:");
        getContentPane().add(scoreBoard, java.awt.BorderLayout.PAGE_END);
        javax.swing.GroupLayout nextShape1Layout = new javax.swing.GroupLayout(nextShape1);
        nextShape1.setLayout(nextShape1Layout);
        nextShape1Layout.setHorizontalGroup(
                nextShape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        nextShape1Layout.setVerticalGroup(
                nextShape1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jLabel1.setText("Next shape:");
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nextShape1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextShape1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(273, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);
        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
                boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 246, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
                boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 398, Short.MAX_VALUE)
        );
        getContentPane().add(board, java.awt.BorderLayout.CENTER);
        jMenuItemInitGame.setText("Start game");
        jMenuItemInitGame.addActionListener(evt -> jMenuItemInitGameActionPerformed());
        jMenuBar1.add(jMenuItemInitGame);
        setJMenuBar(jMenuBar1);
        pack();
    }
    private void jMenuItemInitGameActionPerformed() {
        board.initGame();
        scoreBoard.reset();
    }
}
