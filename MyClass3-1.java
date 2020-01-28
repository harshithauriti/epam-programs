/*  Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.*/
import java.util.*;
public class MyClass3-1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int [][]a=new int[100][100];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]>max)
                max=a[i][j];
            }
        }
        System.out.println(max);
    }
}