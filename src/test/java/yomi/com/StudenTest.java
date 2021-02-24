package yomi.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import student.Student;

public class StudenTest {
  @Test
    public void highestScoreTest(){
      Student student = new Student("Hank ",60 ,90);
      Assertions.assertEquals(80,student.hightest());

  }
  @Test
    public  void averageTest(){
      Student student = new Student("hank",60,60);
      Assertions.assertEquals((60+80)/2,student.getAverage());
  }

}
