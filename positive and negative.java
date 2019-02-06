import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{
    public static void main(String[] args) 
    {
        int number;
        Scanner S=new Scanner(System.in);
        number=S.nextInt();
        if(number > 0)
        {
            System.out.println("positive"); 
        }
        else if(number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}

