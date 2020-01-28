/*  Write a program to find greatest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.*/
import java.util.*;
public class MyClass3-2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int [][]a=new int[100][100];
        int []b=new int[100];
        int k=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[k]=a[i][j];
                k++;
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(b[n-i+1]+" ");
            if(i==n-1)
                System.out.println("");
        }
        
    }
}