package problem2;

public class Student extends Person {
    String studentid;
    int gradlevel;
    private Classroom ac[];

    public Student(String name,int age,String gender,String student,int gradelevel,int size){
        super(name,age,gender);
        this.studentid=studentid;
        this.gradlevel=gradelevel;
        this.ac=new Classroom[size];

    }
    public void setstudentid(String studentid){
        this.studentid=studentid;
    }
    public String getstudentid(){
        return studentid;
    }
    public void setgradlevel(int gradelevel){
        this.gradlevel=gradelevel;
    }
    public int getgradelevel(){
        return gradlevel;
    }
    public void addclassroom(Classroom A){
        for(int i=0;i<this.ac.length;i++){
            if(ac[i]==null){
                ac[i]=A;
                System.out.println(A);
                break;
            }
        }
    }
    public void removeclassroom(Classroom A){
        for(int i=0;i<this.ac.length;i++){
            if(ac[i]==A){
                ac[i]=null;
                System.out.println("null");
            }
        }
    }
    public void allClaassroom(){
        for(Classroom acc:ac){
            if(acc!=null){
                acc.display();
            }
        }
    }

    
}
