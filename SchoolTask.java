package com.mycompany.taskmanagementsystem;

public class SchoolTask extends Task {

    private String subject;

    public SchoolTask(String task, String category, String status, String priority, String date, String subject) {
        super(task, category, status, priority, date);
        this.subject = subject;
    }

    @Override
    public String getTypeOrSubject() {
        return subject;
    }

}
