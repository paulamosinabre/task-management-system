
package com.mycompany.taskmanagementsystem;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> list;
    

    public TaskManager() {
        this.list = new ArrayList<>();
    }

    public void add(Task task) {
        this.list.add(task);
    }

    public ArrayList<Task> getTasks() {
        return list;
    }
    
    public void removeTask(Task task){
         list.remove(task);
    }

    public void clearTasks() {
        list.clear();
    }
    
}
