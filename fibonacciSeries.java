public class fibonacciSeries {
    public static void main(String[]args){
        int a = 5;
        int b = 7;
        int z = 5;
        System.out.print(a + " ");
        System.out.print(b+" ");
        fiSe(a,b,z);

    }
    public static void fiSe(int first, int second, int noofTimes){
        if (noofTimes == 0){
           return;
        }

        int three = first+second;
        System.out.print(three+" ");
        fiSe(second,three,noofTimes-1);
    }
}
