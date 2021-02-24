package yomi.com;

public class SetValueTest {
    public static void main(String[] args) {
        int i1 = 10;
        int j1 = 10;

        int i2,j2;
        //連續復職
        i2 = j2 =10;

        int i3  =10, j3=20;

        int num1 =10;
        num1 +=2; //num1 = num+2
        System.out.println(num1); //12

        int num2 = 12; // 編譯失敗
        num2 %= 5; //num2 = num2 % 5;
        System.out.println(num2);

        short s1 =10;
        //s1 =s1+2 編譯失敗 不能強轉
        s1 += 2; //不會改變變量本身數據類型
        System.out.println(s1);

        //開發中 如果希望變量實現+2操作 有幾種方法  前提int num =10;
        // 方式 1 num = num +2;;
        // 方式 2 num +=2;
        //開發中 如果希望變量實現＋1  操作  有幾種方法（int num =10）
        // 方式 1 num = num +1;
        // 方式 2 num +=1;
        // 方式 3 num ++; (推薦)



    }
}
