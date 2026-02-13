import java.util.*;
public class MaxElementMethod{
    static int findMax(int[] a){
        int max = a[0];
        for(int i=0;i<a.length-1;i++){
            if(a[i]>max){
                max=a[i];
        }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(findMax(a));
    }
}
