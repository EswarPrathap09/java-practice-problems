import java.util.Locale;
/*
Outcomes
1.Creating Functions
2.For Loops
*/

public class Palindrome {
    static boolean Ispalin(String str){
        str= str.toLowerCase();
        if (str.length() == 0) {
            return true;
        }
        for(int i=0;i<=str.length()/2;i++){
            char Start = str.charAt(i);
            char End = str.charAt(str.length()-1-i);
            if (Start == End){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        String arr = "abcdcba";
        String s ="";
        System.out.println(Ispalin(arr));
        System.out.println(Ispalin(s));

    }
}
