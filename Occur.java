//Write a java program to count the total number of occurances of an integer in an array
import java.util.Scanner;
class Occur
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the array : ");
        for(int i=0;i<10;i++)
        {
            a[i] = S.nextInt();
        }
        System.out.println("The array : ");
        for(int x : a)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Enter the no to count occurances : ");
        int n = S.nextInt();
        int c=0;
        for(int x : a)
        {
            if(x==n) c++;
        }
        System.out.println("The occurance of "+n+" in the array is "+c);
    }
}