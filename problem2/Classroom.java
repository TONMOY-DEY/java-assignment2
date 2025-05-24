package problem2;

public class Classroom {
    String classname;
    String teachername;

    public Classroom(String classname,String teachername){
        this.classname=classname;
        this.teachername=teachername;
        
    }
    public void setclassname(String classname){
        this.classname=classname;
    }
    public String getclassname(){
        return classname;
    }
    public void setteachername(String teachername){
        this.teachername=teachername;
    }
     
    public String getteachername(){
        return teachername;
    }

    public void display(){
        System.out.println("class name:"+classname);
        System.out.println("teacher name:"+teachername);
    }

    }

    

