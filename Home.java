package com.mycompany.taskmanagementsystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Home extends javax.swing.JFrame {

    private int total = 0, notStarted = 0, inProgress = 0, done = 0;

    private Registration user;

    public Home(Registration user) {
        initComponents();
        this.user = user;
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));
        lblWelcomeName.setText(user.getUsername());
        refreshTaskList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        lblWelcomeName = new javax.swing.JLabel();
        lblWelcomeBack = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotalTask = new javax.swing.JLabel();
        lblInProgress = new javax.swing.JLabel();
        lblNotStarted = new javax.swing.JLabel();
        lblDone = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnProjects = new javax.swing.JButton();
        btnCalendar = new javax.swing.JButton();
        btnAllTask = new javax.swing.JButton();
        btnAddTask = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        taskPanel = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taskery");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(4, 28, 126));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 10, 40));

        lblWelcomeName.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lblWelcomeName.setText("[name]");
        getContentPane().add(lblWelcomeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 190, -1));

        lblWelcomeBack.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        lblWelcomeBack.setText("Welcome,");
        getContentPane().add(lblWelcomeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 190, -1));

        btnSearch.setBackground(new java.awt.Color(140, 136, 136));
        btnSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\search.png")); // NOI18N
        btnSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnSearch.setFocusPainted(false);
        btnSearch.setFocusable(false);
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 40, 40));

        btnAccount.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\user.png")); // NOI18N
        btnAccount.setBorder(null);
        btnAccount.setBorderPainted(false);
        btnAccount.setContentAreaFilled(false);
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 50, -1));

        searchField.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        searchField.setText(" Type here to search...");
        searchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 310, 40));

        jLabel2.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Task");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 150, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel4.setText("In progress");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel5.setText("Not started");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\queue.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\progress.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\done.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        lblTotalTask.setFont(new java.awt.Font("Lucida Console", 0, 36)); // NOI18N
        lblTotalTask.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTask.setText("0");
        getContentPane().add(lblTotalTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        lblInProgress.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lblInProgress.setText("0");
        getContentPane().add(lblInProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, -1));

        lblNotStarted.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lblNotStarted.setText("0");
        getContentPane().add(lblNotStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, -1, -1));

        lblDone.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lblDone.setText("0");
        getContentPane().add(lblDone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel14.setText("Type/Subject");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, -1, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        jLabel16.setText("Done");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel17.setText("Status");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel18.setText("Priority");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel19.setText("Date");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, -1, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel20.setText("Task");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        btnProjects.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnProjects.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\project.png")); // NOI18N
        btnProjects.setText(" Projects");
        btnProjects.setBorder(null);
        btnProjects.setBorderPainted(false);
        btnProjects.setContentAreaFilled(false);
        getContentPane().add(btnProjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        btnCalendar.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnCalendar.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\calendar.png")); // NOI18N
        btnCalendar.setText(" Calendar");
        btnCalendar.setBorder(null);
        btnCalendar.setBorderPainted(false);
        btnCalendar.setContentAreaFilled(false);
        getContentPane().add(btnCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, -1));

        btnAllTask.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        btnAllTask.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\all task.png")); // NOI18N
        btnAllTask.setText(" All task");
        btnAllTask.setBorder(null);
        btnAllTask.setBorderPainted(false);
        btnAllTask.setContentAreaFilled(false);
        getContentPane().add(btnAllTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

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
        getContentPane().add(btnAddTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 40, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("(dd/mm/yyyy)");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 80, 10));

        jLabel23.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Finances, etc..)");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 110, 10));

        jLabel22.setFont(new java.awt.Font("Lucida Console", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("(Ex: Household, ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 110, -1));

        jLabel21.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        jLabel21.setText("Category");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        taskPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout taskPanelLayout = new javax.swing.GroupLayout(taskPanel);
        taskPanel.setLayout(taskPanelLayout);
        taskPanelLayout.setHorizontalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        taskPanelLayout.setVerticalGroup(
            taskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        getContentPane().add(taskPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 750, 280));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\TaskManagement\\Home.png")); // NOI18N
        bg.setText("jLabel1");
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        // TODO add your handling code here:
        AccountPage accPage = new AccountPage(user);
        accPage.setVisible(true);
        accPage.setResizable(false);
        accPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
        total++;

        // Create components as local variables
        JTextField txtTask = new JTextField(15);
        String[] categories = {"Personal", "School"};
        JComboBox<String> categoryBox = new JComboBox<>(categories);

        String[] statuses = {"Not Started", "In Progress", "Done"};
        JComboBox<String> statusBox = new JComboBox<>(statuses);

        String[] priorities = {"Low", "Medium", "High"};
        JComboBox<String> priorityBox = new JComboBox<>(priorities);

        JTextField typeSubject = new JTextField(10);
        JTextField dateField = new JTextField(7);

        // Create a new row panel for the task input
        JPanel rowPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 5));
        rowPanel.setBackground(Color.white);
        rowPanel.setPreferredSize(new Dimension(taskPanel.getWidth(), 40));
        rowPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
// prevent vertical stretching

        // Add components with spacing same as existing code
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(txtTask);
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(categoryBox);
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(statusBox);
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(priorityBox);
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(typeSubject);
        rowPanel.add(Box.createHorizontalStrut(10));
        rowPanel.add(dateField);

        // Before adding input row, add vertical gap if needed
        taskPanel.add(Box.createVerticalStrut(5));  // gap before input row
// Add the input row panel here
        taskPanel.add(rowPanel);
        taskPanel.add(Box.createVerticalStrut(5));  // gap after input row
        taskPanel.revalidate();
        taskPanel.repaint();
        
        Runnable saveTask = () -> {
            String taskName = txtTask.getText().trim();
            String date = dateField.getText().trim();
            String category = (String) categoryBox.getSelectedItem();
            String status = (String) statusBox.getSelectedItem();
            String priority = (String) priorityBox.getSelectedItem();
            String typeOrSubject = typeSubject.getText().trim();

            if (taskName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Task name cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Task newTask;
            if ("Personal".equalsIgnoreCase(category)) {
                newTask = new PersonalTask(taskName, category, status, priority, date, typeOrSubject);
            } else if ("School".equalsIgnoreCase(category)) {
                newTask = new SchoolTask(taskName, category, status, priority, date, typeOrSubject);
            } else {
                newTask = new Task(taskName, category, status, priority, date);
            }

            lblTotalTask.setText(Integer.toString(total));
            updateStatusCount(status, 1);
            user.getTaskManager().add(newTask);

            // Remove the input row panel after adding task
            taskPanel.remove(rowPanel);

            // Add task panel row and refresh
            JPanel taskRow = createTaskPanel(newTask);
            taskPanel.add(taskRow);

            taskPanel.revalidate();
            taskPanel.repaint();
        };

        dateField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    saveTask.run();
                }
            }
        });

    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void refreshTaskList() {
        taskPanel.removeAll();

        ArrayList<Task> tasks = user.getTaskManager().getTasks();
        total = tasks.size();
        notStarted = 0;
        inProgress = 0;
        done = 0;

        for (Task task : tasks) {
            JPanel taskRow = createTaskPanel(task);
            taskPanel.add(taskRow);
            // Count statuses for total labels
            switch (task.getStatus()) {
                case "Not Started":
                    notStarted++;
                    break;
                case "In Progress":
                    inProgress++;
                    break;
                case "Done":
                    done++;
                    break;
            }
        }

        for (int i = 0; i < tasks.size(); i++) {
            JPanel taskRow = createTaskPanel(tasks.get(i));
            taskPanel.add(taskRow);
            // Add a vertical gap **after** each task except the last one
            if (i < tasks.size() - 1) {
                taskPanel.add(Box.createVerticalStrut(5));  // 5px gap
            }
        }
        taskPanel.removeAll();

        lblTotalTask.setText(Integer.toString(total));
        lblNotStarted.setText(Integer.toString(notStarted));
        lblInProgress.setText(Integer.toString(inProgress));
        lblDone.setText(Integer.toString(done));

        taskPanel.revalidate();
        taskPanel.repaint();

    }

    private JPanel createTaskPanel(Task task) {
        JPanel taskRow = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 5)); // Use FlowLayout
        taskRow.setBackground(Color.WHITE);
        taskRow.setBorder(new EmptyBorder(2, 0, 2, 0));

        JLabel taskLabel = new JLabel(task.toString());
        JButton optionsButton = new JButton("...");
        optionsButton.setPreferredSize(new Dimension(30, 20));

        // Show dialog for edit or remove
        optionsButton.addActionListener(e -> {
            String[] options = {"Edit", "Remove"};
            int choice = JOptionPane.showOptionDialog(this, "What would you like to do?", "Task Options",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (choice == 0) {
                editTask(task, taskRow);
            } else if (choice == 1) {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this task?", "Confirm Removal", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    total--;
                    lblTotalTask.setText(Integer.toString(total));
                    updateStatusCount(task.getStatus(), -1);

                    user.getTaskManager().removeTask(task);
                    refreshTaskList(); // Refresh the task list after removal
                }
            }
        });

        taskRow.add(taskLabel); // Add the task label
        taskRow.add(optionsButton); // Add the options button

        return taskRow;

    }

    private void editTask(Task task, JPanel taskRow) {

        if (task == null || taskRow == null) {
            return;
        }

        // Create editable fields with current task data
        JTextField txtTask = new JTextField(task.getTask(), 15);
        JComboBox<String> categoryBox = new JComboBox<>(new String[]{"Personal", "School"});
        categoryBox.setSelectedItem(task.getCategory());
        JComboBox<String> statusBox = new JComboBox<>(new String[]{"Not Started", "In Progress", "Done"});
        statusBox.setSelectedItem(task.getStatus());
        JComboBox<String> priorityBox = new JComboBox<>(new String[]{"Low", "Medium", "High"});
        priorityBox.setSelectedItem(task.getPriority());
        JTextField typeSubject = new JTextField(10);
        JTextField dateField = new JTextField(task.getDate(), 7);

        if (task instanceof PersonalTask) {
            typeSubject.setText(((PersonalTask) task).getTypeOrSubject());
        } else if (task instanceof SchoolTask) {
            typeSubject.setText(((SchoolTask) task).getTypeOrSubject());
        }

        // Create an edit panel with the same layout as add task row (FlowLayout left)
        JPanel editPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 5));
        editPanel.setBackground(Color.white);
        editPanel.setPreferredSize(new Dimension(taskPanel.getWidth(), 40));
        editPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));

        editPanel.add(Box.createHorizontalStrut(10));
        editPanel.add(txtTask);
        editPanel.add(Box.createHorizontalStrut(10));
        editPanel.add(categoryBox);
        editPanel.add(Box.createHorizontalStrut(10));
        editPanel.add(statusBox);
        editPanel.add(Box.createHorizontalStrut(10));
        editPanel.add(priorityBox);
        editPanel.add(Box.createHorizontalStrut(10));
        editPanel.add(typeSubject);
        editPanel.add(Box.createHorizontalStrut(10));
        editPanel.add(dateField);

        // Find index of the taskRow in taskPanel
        int index = -1;
        for (int i = 0; i < taskPanel.getComponentCount(); i++) {
            if (taskPanel.getComponent(i) == taskRow) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            taskPanel.remove(index);
            taskPanel.add(editPanel, index);
            taskPanel.revalidate();
            taskPanel.repaint();
        }

        final int finalIndex = index; // effectively final for use in lambda

        Runnable saveChanges = () -> {
             String newStatus = (String) statusBox.getSelectedItem(); // Get the new status
           String oldStatus = task.getStatus(); // Get the old status
           // Update the status counts
           if (!oldStatus.equals(newStatus)) {
               updateStatusCount(oldStatus, -1); // Decrement the old status count
               updateStatusCount(newStatus, 1); // Increment the new status count
           }
            String taskName = txtTask.getText().trim();
            if (taskName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Task name cannot be empty.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String category = (String) categoryBox.getSelectedItem();
            String status = (String) statusBox.getSelectedItem();
            String priority = (String) priorityBox.getSelectedItem();
            String typeOrSubject = typeSubject.getText().trim();
            String date = dateField.getText().trim();

            user.getTaskManager().removeTask(task);

            Task updatedTask;
            if ("Personal".equalsIgnoreCase(category)) {
                updatedTask = new PersonalTask(taskName, category, status, priority, date, typeOrSubject);
            } else if ("School".equalsIgnoreCase(category)) {
                updatedTask = new SchoolTask(taskName, category, status, priority, date, typeOrSubject);
            } else {
                updatedTask = new Task(taskName, category, status, priority, date);
            }

            user.getTaskManager().add(updatedTask);

            taskPanel.remove(finalIndex);
            taskPanel.add(createTaskPanel(updatedTask), finalIndex);
            taskPanel.revalidate();
            taskPanel.repaint();
        };

        dateField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    saveChanges.run();
                }
            }
        });
    }

    private void updateStatusCount(String status, int num) {
        switch (status) {
            case "Not Started":
                notStarted += num;
                lblNotStarted.setText(Integer.toString(notStarted));
                break;
            case "In Progress":
                inProgress += num;
                lblInProgress.setText(Integer.toString(inProgress));
                break;
            case "Done":
                done += num;
                lblDone.setText(Integer.toString(done));
                break;
        }
    }


    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchTask();
        }
    }//GEN-LAST:event_searchFieldKeyPressed

    private void searchTask() {
        String query = searchField.getText().trim().toLowerCase();
        ArrayList<Task> tasks = user.getTaskManager().getTasks();
        StringBuilder results = new StringBuilder();

        for (Task task : tasks) {
            if (task.getTask().toLowerCase().contains(query)) {
                results.append(task.showDetails()).append("\n");
            }
        }

        if (results.length() > 0) {
            JOptionPane.showMessageDialog(this, results.toString(), "Search Results", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No tasks found matching: " + query, "Search Results", JOptionPane.INFORMATION_MESSAGE);

        }
    }

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registration user = new Registration("email", "firstname", "lastname", "username", "password");
                new Home(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton btnAllTask;
    private javax.swing.JButton btnCalendar;
    private javax.swing.JButton btnProjects;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblDone;
    private javax.swing.JLabel lblInProgress;
    private javax.swing.JLabel lblNotStarted;
    private javax.swing.JLabel lblTotalTask;
    private javax.swing.JLabel lblWelcomeBack;
    private javax.swing.JLabel lblWelcomeName;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel taskPanel;
    // End of variables declaration//GEN-END:variables
}
