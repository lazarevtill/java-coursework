import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class RecordsDialog extends javax.swing.JDialog {
    private static final String RECORDS_FILE_NAME = "records.txt";
    private final int score;
    private final ArrayList<Record> listOfRecords;
    private JLabel[] recordLabels;
    private int minRecord;
    private javax.swing.JLabel JLabelCurrentScore;
    private javax.swing.JLabel JLabelRecord1;
    private javax.swing.JLabel JLabelRecord2;
    private javax.swing.JLabel JLabelRecord3;
    private javax.swing.JLabel JLabelRecord4;
    private javax.swing.JLabel JLabelRecord5;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JTextField jTextFieldName;

    public RecordsDialog(java.awt.Frame parent, boolean modal, int score) {
        super(parent, modal);
        initComponents();
        initRecordLabels();
        minRecord = 0;
        this.score = score;
        listOfRecords = new ArrayList<Record>();
        try {
            readRecords();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        processRecords();
    }
    public void processRecords() {
        JLabelCurrentScore.setText("Your score: " + score);
        if (score > minRecord) {
        } else {
            jLabelName.setVisible(false);
            jTextFieldName.setVisible(false);
        }
    }

    private void readRecords() throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader(RECORDS_FILE_NAME))) {
            int lineCount = 0;
            String line;
            String[] lineRecord = null;
            while ((line = input.readLine()) != null && (lineCount < 5)) {
                lineRecord = line.split(",");
                recordLabels[lineCount].setText(lineRecord[0] + ": " + lineRecord[1]);
                lineCount++;
                listOfRecords.add(new Record(Integer.parseInt(lineRecord[0]), lineRecord[1]));
            }
            if (lineCount >= 5) {
                try {
                    minRecord = Integer.parseInt(lineRecord[0]);
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void initComponents() {
        JLabelRecord3 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        JLabelCurrentScore = new javax.swing.JLabel();
        JLabelRecord2 = new javax.swing.JLabel();
        JLabelRecord4 = new javax.swing.JLabel();
        JLabelRecord5 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        JLabelRecord1 = new javax.swing.JLabel();
        javax.swing.JButton jButtonOK = new javax.swing.JButton();
        JLabel JLabelCurrentScore1 = new JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JLabelRecord3.setText("0 number");
        jTextFieldName.setText("Enter your name");
        JLabelCurrentScore.setText("0 number");
        JLabelRecord2.setText("0 number");
        JLabelRecord4.setText("0 number");
        JLabelRecord5.setText("0 number");
        jLabelName.setText("Name:");
        JLabelRecord1.setText("0 number");
        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        JLabelCurrentScore1.setText("0 nombre");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(27, 27, 27))
                                                        .addComponent(JLabelCurrentScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JLabelRecord2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JLabelRecord3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JLabelRecord4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JLabelRecord5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JLabelRecord1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(JLabelCurrentScore1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(171, 171, 171)
                                                .addComponent(jButtonOK)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(JLabelCurrentScore, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(JLabelCurrentScore1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabelRecord1)
                                .addGap(17, 17, 17)
                                .addComponent(JLabelRecord2)
                                .addGap(18, 18, 18)
                                .addComponent(JLabelRecord3)
                                .addGap(18, 18, 18)
                                .addComponent(JLabelRecord4)
                                .addGap(18, 18, 18)
                                .addComponent(JLabelRecord5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelName)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonOK)
                                .addGap(15, 15, 15))
        );
        pack();
    }
    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {
        if (score > minRecord) {
            try {
                saveRecords();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        dispose();
    }
    private void saveRecords() throws IOException {
        try (PrintWriter output = new PrintWriter(new FileWriter(RECORDS_FILE_NAME))) {
            int lineCounter = 0;
            boolean alredyWrittenScore = false;
            for (Record record : listOfRecords) {
                if (record.record > score && !alredyWrittenScore) {
                    output.println(score + ", " + jTextFieldName.getText());
                    alredyWrittenScore = true;
                    lineCounter++;
                }
                if (lineCounter < 5) {
                    output.println(record.record + ", " + record.name);
                    lineCounter++;
                }
            }
            if (!alredyWrittenScore) {
                output.println(score + ", " + jTextFieldName.getText());
            }
        }
    }

    private void initRecordLabels() {
        recordLabels = new JLabel[5];
        recordLabels[0] = JLabelRecord1;
        recordLabels[1] = JLabelRecord2;
        recordLabels[2] = JLabelRecord3;
        recordLabels[3] = JLabelRecord4;
        recordLabels[4] = JLabelRecord5;
    }
    private static class Record {
        public int record;
        public String name;
        public Record(int record, String name) {
            this.record = record;
            this.name = name;
        }
    }
}
