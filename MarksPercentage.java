import java.util.*;
// Outcomes
// Scanner class
// Operators
public class MarksPercentage {
    static void marksPercentage(int s1, int s2, int s3, int s4, int s5){
        float percentage = (s1+s2+s3+s4+s5)/5;
        System.out.println("This is the Percentage of your marks : "+percentage+" %");
    }
    public static void main(String[]args){
        //marksPercentage(90,90,90,90,90);

        Scanner sc = new Scanner (System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        marksPercentage(sub1,sub2,sub3,sub4,sub5);



    }
}
