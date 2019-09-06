//Write a java program to find two elements in an array such that the difference between them is the largest
import java.util.Scanner;
class MaxDiff
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
        int max=a[0] ,min = a[0];
        System.out.println("The array : ");
        for(int x : a)
        {
            if(x>max) max = x;
            if(x<min) min = x;
            System.out.print(x+" ");
        }
        System.out.println("The required numbers are : "+max+" , "+min);
        System.out.println("The required difference is : "+(max-min));
    }
}