
package com.mycompany.taskmanagementsystem;

public class PersonalTask extends Task{
    
    private String type;
    
    public PersonalTask(String task, String category, String status, String priority, String date, String type){
        super(task, category, status, priority,date);
        this.type = type;
    }
    
    @Override
    public String getTypeOrSubject(){
        return type;
    }
    
}
