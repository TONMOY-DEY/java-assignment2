package problem2;

public class Person {
    String name;
    int age;
    String gender;
    public Person(){
        System.out.println("...............");
    }
    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getage(){
        return age;
    }
    public void setgrnder(String  gender){
        this.gender=gender;
    }
    public String getgender(){
        return gender;
    }
    public void display(){
        System.out.println("person name:"+name);
        System.out.println("person age:"+age);
        System.out.println("person gender:"+gender);
    }
    
}
