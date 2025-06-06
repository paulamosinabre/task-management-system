package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Registration> users = new ArrayList<>();
    static String username, userTask, priority, date, subject, type;
    static Registration register;

    public static void start() {
        System.out.println("\nChoose an option: ");
        System.out.println("1. Login\n"
                + "2. Sign-up\n"
                + "3. Exit");

        System.out.print("\nEnter your choice: ");
        int registration = scan.nextInt();
        scan.nextLine();

        switch (registration) {
            case 1:
                login();
                break;
            case 2:
                signup();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please choose a number from 1-3.");
                break;
        }
    }

    public static void login() {
        System.out.println("\n================== Log-in ==================");
        System.out.print("Enter your username: ");
        String user = scan.nextLine();

        System.out.print("Enter your password: ");
        String pass = scan.nextLine();

        boolean found = false;
        for (Registration userObj : users) {
            if (userObj.getUsername().equals(user)) {
                found = true;
                if (pass.equals(userObj.getPassword())) {
                    register = userObj;
                    taskInterface();
                } else {
                    System.out.println("Incorrect password!");
                    start();
                }
            }
        }
        if (!found) {
            System.out.println("Create an account first!");
            start();
        }

    }

    public static void signup() {
        System.out.println("\n================== Sign Up ==================");

        System.out.print("Enter your email: ");
        String email = scan.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter your username: ");
        username = scan.nextLine();

        System.out.print("Enter your password: ");
        String password = scan.nextLine();

        register = new Registration(email, firstName, lastName, username, password);
        users.add(register);

        taskInterface();
    }

    public static void taskInterface() {
        TaskManager manager = register.getTaskManager();
        while (true) {
            System.out.println("\n================== Menu ==================");
            System.out.println("Choose an option:\n"
                    + "1. Add Personal Task\n"
                    + "2. Add School Task\n"
                    + "3. Remove\n"
                    + "4. Edit\n"
                    + "5. Search\n"
                    + "6. Show list\n"
                    + "7. Show account details\n"
                    + "8. Back\n"
                    + "9. Exit");

            System.out.print("\nEnter your choice: ");
            int chooseTask = scan.nextInt();
            scan.nextLine();

            switch (chooseTask) {
                case 1:
                    System.out.println("\n================== Add Personal Task ==================");
                    System.out.print("Enter your task: ");
                    userTask = scan.nextLine();

                    System.out.print("Set type (Ex: Health, Household, Errand, Habits, etc..): ");
                    type = scan.nextLine();

                    System.out.print("Set priority (Ex: Low, Medium, High): ");
                    priority = scan.nextLine();

                    System.out.print("Set date (dd-mm-yyyy): ");
                    date = scan.nextLine();

                    Task personalTask = new PersonalTask(userTask, "Personal", priority, date, type);
                    manager.add(personalTask);
                    break;

                case 2:
                    System.out.println("\n================== Add School Task ==================");
                    System.out.print("Enter your task: ");
                    userTask = scan.nextLine();

                    System.out.print("Set priority (Ex: Low, Medium, High): ");
                    priority = scan.nextLine();
                    
                    System.out.println("Set subject: ");
                    subject = scan.nextLine();
                    
                    System.out.print("Set date (dd-mm-yyyy): ");
                    date = scan.nextLine();

                    Task schoolTask = new SchoolTask(userTask, "School", priority, date, subject);
                    manager.add(schoolTask);
                    break;

                case 3:
                    System.out.println("\n================== Remove Task ==================");
                    if (manager.isEmpty()) {
                        System.out.println("Please create a to-do list first!");
                        break;
                    }
                    manager.print();
                    System.out.print("\nChoose a number to remove: ");
                    int removeNum = scan.nextInt();
                    scan.nextLine();
                    manager.remove(removeNum);
                    break;

                case 4:
                    System.out.println("\n================== Edit Task ==================");
                    if (manager.isEmpty()) {
                        System.out.println("Please create a to-do list first!");
                        break;
                    }
                    manager.print();
                    System.out.print("Choose a number to edit: ");
                    int num = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter a new task: ");
                    String newTask = scan.nextLine();

                    manager.edit(num, newTask);
                    break;

                case 5:
                    System.out.println("\n================== Search Task ==================");
                    System.out.print("Search for: ");
                    String search = scan.nextLine();
                    manager.search(search);
                    break;

                case 6:
                    System.out.println("\n================== " + username + "'s List ==================");
                    if (manager.isEmpty()) {
                        System.out.println("Please create a to-do list first!");
                        break;
                    }
                    manager.print();
                    break;

                case 7:
                    System.out.println("\n================== " + username + "'s Account ==================");
                    register.showInformation();
                    break;

                case 8:
                    start();
                    break;

                case 9:
                    System.exit(0);

                default:
                    System.out.println("Please enter a number from 1-9.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("================== Welcome to Taskery ==================");
        start();
    }
}


package com.mycompany.main;


public class Registration {

    private String email, firstName, lastName, username, password;
    private TaskManager taskManager;

    public Registration(String email, String firstName, String lastName, String username, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.taskManager = new TaskManager();
    }

    public String getUsername() { return this.username; }

    public String getPassword() { return this.password; }

    public String getEmail() { return this.email; }

    public String getFirstName() { return this.firstName; }

    public String getLastName() { return this.lastName; }

    public TaskManager getTaskManager() { return this.taskManager;}

    public void showInformation() {
        System.out.println("E-mail: " + email + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nUsername: " + username);
    }

}


package com.mycompany.main;


public class Task {

    private String task, category, priority, date;

    public Task(String task, String category, String priority, String date) {
        this.task = task;
        this.category = category;
        this.priority = priority;
        this.date = date;
    }

    public String getTask() { return task; }
    
    public String getCategory() { return category; }
    
    public String getPriority() { return priority; }
    
    public String getDate() { return date; }

    public void setTask(String task) { this.task = task; }

    public void showDetails() {
        System.out.println("Task: " + task
                + "\nCategory: " + category
                + "\nPriority: " + priority
                + "\nDate: " + date); 
    }
    @Override
    public String toString() {
        return "Task: " + task + " | Category: " + category + " | Priority: " + priority + " | Date: " + date;
    }
}


package com.mycompany.main;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> list;

    public TaskManager() { this.list = new ArrayList<>(); }
    
    public void add(Task task) { this.list.add(task); }
    
    public boolean isEmpty() { return list.isEmpty(); }
    
    public void remove(int index) {
        if (index - 1 >= 0 && index - 1 < list.size()) {
            this.list.remove(index-1);
            System.out.println("Successfully removed.");
        } else {
            System.out.println("Invalid number!");
        }
    }

    public void edit(int index, String updatedTask) {
        if (index - 1 >= 0 && index - 1 < list.size()) {
            System.out.println("You successfully edited! from " + this.list.get(index-1).getTask() + " to " + updatedTask);
            this.list.get(index-1).setTask(updatedTask);  
        } else {
            System.out.println("Invalid number!");
        }
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
                System.out.println((i + 1) + ": " + list.get(i) + "\n");
            }
    }

    public void search(String search) {
        boolean found = false;
        
        for(Task task: list){
            if(task.getTask().equals(search)){
                System.out.println("Found: " + task);
                found = true;
            }
        }
        
        if(!found){
            System.out.println("Not found!");
        }
    }
      
}


package com.mycompany.main;

public class PersonalTask extends Task{
    
    private String type;
    
    public PersonalTask(String task, String category, String priority, String date, String type){
        super(task, category, priority,date);
        this.type = type;
    }
    
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Type: " + type);
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Type: " + type;
    }
}

package com.mycompany.main;

public class SchoolTask extends Task {
    private String subject;

    public SchoolTask(String task, String category, String priority, String date, String subject) {
        super(task, category, priority,date);
        this.subject = subject;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Subject: " + subject);
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Subject: " + subject;
    }
}
