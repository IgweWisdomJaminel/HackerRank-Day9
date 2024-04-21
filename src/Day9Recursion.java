import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Day9Recursion {

    /*
    Compilation of function

    f{f{f{a}--- a=20
    f{a}==5+a
    f{a}==5+20=245

    f{f{f{20}}}----f{f{25}}
    f{25}= 25+5=30

     f{f{f{a}--- a=20----f{f{25}}-----f{30}
    f{30}= 5+30=35
     f{f{f{a}--- a=20----f{f{25}}-----f{30}---35

     */

    public static int factorial(int n){
        if(n<=0){

            return 1;
        }
        else {

            return n*factorial(n-1);
        }
    }  public static int summation(int n){
        if(n<=0){

            return 1;
        }
        else {

            return n+summation(n-1);
        }
    }
    public static void removeDuplicates() {
        int[] ar = {1, 1, 2, 2, 5, 7, 8, 9};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        for(int check:set){
            System.out.println(check);
        }
    }
    public static void stdinRemoveDuplicates2() {
        Scanner sc = new Scanner(System.in);
        int num,length;

        length=sc.nextInt();
        int[] ar = new int[length];
        for(int i=0; i<ar.length; i++){
            num=sc.nextInt();
            ar[i]=num;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            set.add(ar[i]);
        }
        for(int check:set){
            System.out.println(check);
        }
    }

    public static int HackerRankWork(int n){
        if(2<=n&&n<=12){
            return n* factorial(n);
        }else {
            return 1;
        }
    }

    public static int exponentiation(int n,int p){
        if( p <= 0){
            return 1;//Multi x
        }else{
            return n * exponentiation(n,n-1);
        }

    }



    public static void main(String[] args) {
        System.out.println(factorial(3));
        removeDuplicates();
    }

}
