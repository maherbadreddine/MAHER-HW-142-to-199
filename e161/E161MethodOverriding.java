package org.example.e161;

class Employee{
    public void work(){
        System.out.println("I am an Employee working");
    }
    protected void takeBreak(){
        System.out.println("I am an Employee taking a break");
    }
    void attendMeeting(){
        System.out.println("I am an Employee attending a meeting");
    }
    private void submitReport(){
        System.out.println("I am an Employee submitting a report");
    }
    public void hello(){
        System.out.println("method in Employee class");
    }
}
class Manager extends Employee{
    @Override
    public void work() {
        System.out.println("I am a Manager working");
    }
    protected void takeBreak(){
        System.out.println("I am a Manager taking a break");
    }
    void attendMeeting(){
        System.out.println("I am a Manager attending a meeting");
    }
    public void hello(){
        System.out.println("method in Manager class");
    }
}
class Developer extends Employee{
    @Override
    public void work() {
        System.out.println("I am a Developer working");
    }
    protected void takeBreak(){
        System.out.println("I am a Developer taking a break");
    }
    void attendMeeting(){
        System.out.println("I am a Developer attending a meeting");
    }
    public void hello(){
        System.out.println("method in Developer class");
    }
}
class Intern extends Employee{
    @Override
    public void work() {
        System.out.println("I am an Intern working");
    }
    protected void takeBreak(){
        System.out.println("I am an Intern taking a break");
    }
    void attendMeeting(){
        System.out.println("I am an Intern attending a meeting");
    }
    public void hello(){
        System.out.println("method in Intern class");
    }


}

public class E161MethodOverriding {
    public static void main(String[] args) {
        Manager person1=new Manager();
        Developer person2=new Developer();
        Intern person3=new Intern();
        Employee [] workers ={person1, person2, person3};
        for (Employee person:workers){
            person.hello();
        }
        person2.work();
        person2.takeBreak();
        person2.attendMeeting();
    }
}

