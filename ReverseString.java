import java.util.*;
public class ReverseString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = s.length();i>0;i--){
            System.out.print(s.charAt(i-1));
        }
    }
}
