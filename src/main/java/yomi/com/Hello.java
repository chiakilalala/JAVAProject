package yomi.com;

public class Hello {
    public static void main(String[] args)  {
        String s = null;
        System.out.println(s.charAt(3)); //靠其他
        System.out.println(s.substring(1,4));
      Person p = new Person(66.5f,1.7f); //專門存放  person 的物件  叫做p
      p.hello();
      p.weight =66.5f;
      p.height =1.7f;
        System.out.println(p.bmi());
//      int age =19;
//      Integer age2 =10;
//
//      char c ='我';
//      Character c2 = 'A'; //包裝類別
//      byte b =123;
//      float weight= 66.5f;
//      float  height =1.7f;
//      boolean enroll = false;
//      String name ="Tom";


    }
}

