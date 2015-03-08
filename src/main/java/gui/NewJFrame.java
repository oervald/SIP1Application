/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dto.ProposalDto;
import java.awt.CardLayout;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author ksptsinplanet
 */
public class NewJFrame extends javax.swing.JFrame {

//    Controller C;
    Container pane;
    CardLayout layout;
    DefaultListModel<String> model1;
    DefaultListModel<String> model2;
    DefaultListModel<String> model3;
    ArrayList<ProposalDto> arrayListOfProposalsFromDB;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {

        initComponents();
        //get data from DB
        pane = getContentPane();
        layout = new CardLayout();
        pane.setLayout(layout);

        //c = new Controller();
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        model3 = new DefaultListModel();
        
//        arrayListOfProposalsFromDB= c.getAllProposals();
//        for(ProposalDto dto: arrayListOfProposalsFromDB){
//            model1.addElement(dto.toString());
//        }
        
        jList_AllreadySuggestedProposals.setModel(model1);
        jList_FirstRoundPossibleProposals.setModel(model2);
        jList_FirstRoundFinalProposals.setModel(model3);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        PanelOne = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Teacher = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_AllreadySuggestedProposals = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Description = new javax.swing.JTextArea();
        jButton_AddProposal = new javax.swing.JButton();
        PanelTwo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_FirstRoundFinalProposals = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_FirstRoundPossibleProposals = new javax.swing.JList();
        jButtonRemoveFromApproved = new javax.swing.JButton();
        jButtonAddToApproved = new javax.swing.JButton();
        jButton_doneWithFIrstRound = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuOne = new javax.swing.JMenu();
        menuTwo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Title");

        jLabel2.setText("Suggested teacher");

        jLabel4.setText("Already suggested electives");

        jScrollPane1.setViewportView(jList_AllreadySuggestedProposals);

        jLabel3.setText("Description");

        jTextArea_Description.setColumns(20);
        jTextArea_Description.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Description);

        jButton_AddProposal.setText("Add");
        jButton_AddProposal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddProposalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOneLayout = new javax.swing.GroupLayout(PanelOne);
        PanelOne.setLayout(PanelOneLayout);
        PanelOneLayout.setHorizontalGroup(
            PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelOneLayout.createSequentialGroup()
                        .addGroup(PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelOneLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_AddProposal))
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PanelOneLayout.setVerticalGroup(
            PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelOneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelOneLayout.createSequentialGroup()
                            .addComponent(jTextField_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Teacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_AddProposal))
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(PanelOne, "card2");

        jScrollPane3.setViewportView(jList_FirstRoundFinalProposals);

        jScrollPane4.setViewportView(jList_FirstRoundPossibleProposals);

        jButtonRemoveFromApproved.setText("<---");
        jButtonRemoveFromApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveFromApprovedActionPerformed(evt);
            }
        });

        jButtonAddToApproved.setText("--->");
        jButtonAddToApproved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToApprovedActionPerformed(evt);
            }
        });

        jButton_doneWithFIrstRound.setText("DONE!");
        jButton_doneWithFIrstRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_doneWithFIrstRoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTwoLayout = new javax.swing.GroupLayout(PanelTwo);
        PanelTwo.setLayout(PanelTwoLayout);
        PanelTwoLayout.setHorizontalGroup(
            PanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTwoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTwoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemoveFromApproved)
                            .addComponent(jButtonAddToApproved)))
                    .addGroup(PanelTwoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton_doneWithFIrstRound)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTwoLayout.setVerticalGroup(
            PanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTwoLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(PanelTwoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(PanelTwoLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jButtonAddToApproved)
                .addGap(18, 18, 18)
                .addComponent(jButtonRemoveFromApproved)
                .addGap(58, 58, 58)
                .addComponent(jButton_doneWithFIrstRound)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(PanelTwo, "card3");

        menuOne.setText("one");
        menuOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuOneMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuOne);

        menuTwo.setText("two");
        menuTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTwoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTwo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AddProposalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddProposalActionPerformed
        // check if all fields are set, and if so, pass data to controller
        if (jTextField_Title.getText().isEmpty() || jTextField_Teacher.getText().isEmpty() || jTextArea_Description.getText().isEmpty()) {
            //make error message
        } else {
            //send to controller
            //c.addElectiveSuggestion(jTextField_Title.getText(), jTextField_Teacher.getText(), jTextArea_Description.getText());

        }
    }//GEN-LAST:event_jButton_AddProposalActionPerformed

    private void menuOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuOneMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "card2");
    }//GEN-LAST:event_menuOneMouseClicked

    private void menuTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTwoMouseClicked
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "card3");
    }//GEN-LAST:event_menuTwoMouseClicked

    private void jButtonAddToApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToApprovedActionPerformed
        //take selected electives and move them to final model
        int[] selection = jList_FirstRoundPossibleProposals.getSelectedIndices();

        int counter = 0;
        for (int i : selection) {
            String elective = jList_FirstRoundPossibleProposals.getModel().getElementAt(i).toString();
            model2.remove(counter);
            model3.addElement(elective);
            counter++;
        }
    }//GEN-LAST:event_jButtonAddToApprovedActionPerformed

    private void jButtonRemoveFromApprovedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveFromApprovedActionPerformed
        //take selected electives and remove them from final model
        int[] selection = jList_FirstRoundFinalProposals.getSelectedIndices();
        int counter = 0;
        for (int i : selection) {
            String elective = jList_FirstRoundFinalProposals.getModel().getElementAt(i).toString();
            model3.remove(counter);
            model2.addElement(elective);
            counter++;
        }

    }//GEN-LAST:event_jButtonRemoveFromApprovedActionPerformed

    private void jButton_doneWithFIrstRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_doneWithFIrstRoundActionPerformed
        // Take all proposals from second jList, and pass them to controller
        int[] selection = jList_FirstRoundFinalProposals.getSelectedIndices();
        int[] arrayOfIDs = new int[selection.length];
        
        
        int counter = 0;
        for (int i : selection) {
            String elective = jList_FirstRoundFinalProposals.getModel().getElementAt(i).toString();
            //take Id and push it to array
            int id = Integer.parseInt(elective.split("#")[0]);
            arrayOfIDs[counter] = id;
            
            counter++;
           
        }
        //c.getFirstRoundSelection(intarray);
    }//GEN-LAST:event_jButton_doneWithFIrstRoundActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelOne;
    private javax.swing.JPanel PanelTwo;
    private javax.swing.JButton jButtonAddToApproved;
    private javax.swing.JButton jButtonRemoveFromApproved;
    private javax.swing.JButton jButton_AddProposal;
    private javax.swing.JButton jButton_doneWithFIrstRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList_AllreadySuggestedProposals;
    private javax.swing.JList jList_FirstRoundFinalProposals;
    private javax.swing.JList jList_FirstRoundPossibleProposals;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea_Description;
    private javax.swing.JTextField jTextField_Teacher;
    private javax.swing.JTextField jTextField_Title;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menuOne;
    private javax.swing.JMenu menuTwo;
    // End of variables declaration//GEN-END:variables
}
