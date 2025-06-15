package com.mycompany.taskmanagementsystem;

public class CalendarPage extends javax.swing.JFrame {

    public CalendarPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blue = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        btnUser = new javax.swing.JButton();
        btnAddTask = new javax.swing.JButton();
        btnAllTask = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        btnProjects = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blue.setBackground(new java.awt.Color(4, 28, 126));

        javax.swing.GroupLayout blueLayout = new javax.swing.GroupLayout(blue);
        blue.setLayout(blueLayout);
        blueLayout.setHorizontalGroup(
            blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        blueLayout.setVerticalGroup(
            blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(blue, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 10, 40));

        lblWelcome.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lblWelcome.setText("Welcome back,");
        getContentPane().add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, -1));

        lblDate.setText("Date:");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 150, -1));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\search.png")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        searchField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        searchField.setText("          Type here to search...");
        searchField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 330, 40));

        btnUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\user.png")); // NOI18N
        btnUser.setBorder(null);
        btnUser.setBorderPainted(false);
        btnUser.setContentAreaFilled(false);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 40, 50, -1));

        btnAddTask.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnAddTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\add.png")); // NOI18N
        btnAddTask.setBorder(null);
        btnAddTask.setBorderPainted(false);
        btnAddTask.setContentAreaFilled(false);
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 40, -1));

        btnAllTask.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnAllTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\all task.png")); // NOI18N
        btnAllTask.setText(" All task");
        btnAllTask.setBorder(null);
        btnAllTask.setBorderPainted(false);
        btnAllTask.setContentAreaFilled(false);
        btnAllTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnAllTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        btnCalendar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnCalendar.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\calendar.png")); // NOI18N
        btnCalendar.setText(" Calendar");
        btnCalendar.setBorder(null);
        btnCalendar.setBorderPainted(false);
        btnCalendar.setContentAreaFilled(false);
        btnCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, -1));

        btnProjects.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnProjects.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\project.png")); // NOI18N
        btnProjects.setText(" Projects");
        btnProjects.setBorder(null);
        btnProjects.setBorderPainted(false);
        btnProjects.setContentAreaFilled(false);
        btnProjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectsActionPerformed(evt);
            }
        });
        getContentPane().add(btnProjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\3.png")); // NOI18N
        bg.setText("jLabel1");
        bg.setMaximumSize(new java.awt.Dimension(1110, 630));
        bg.setMinimumSize(new java.awt.Dimension(1110, 630));
        bg.setPreferredSize(new java.awt.Dimension(1110, 630));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed

    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void btnAllTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllTaskActionPerformed

    private void btnCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalendarActionPerformed

    private void btnProjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProjectsActionPerformed

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
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel blue;
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnAllTask;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnProjects;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
