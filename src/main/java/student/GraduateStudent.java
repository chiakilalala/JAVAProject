package student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 60;
    public  GraduateStudent(String name,int english,int math,int thesis){
       super(name,english,math);
       this.thesis = thesis;

    }
    @Override
    public  void print(){

    }
}
