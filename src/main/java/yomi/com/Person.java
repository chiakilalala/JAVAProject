package yomi.com;

public class Person {
    String name; //name weight height 都是person 的屬性
    float weight;
    float height;

    public  Person(float weight,float height){ //建構子
        this.weight =weight;
        this.height =height;
    }
    public Person(String name,float weight,float height){
        this(weight,height); //()
        this.name = name;
    }
    public float bmi(){
        float bmi=weight/(height*height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello Word");
    }
}
