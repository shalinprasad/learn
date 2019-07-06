import java.util.Scanner;
     
    class learn
    {
       public static void main(String args[])
       {
          int x, y, z,m;
     
          System.out.println("Enter two integers to calculate their sum");
          Scanner in = new Scanner(System.in);
         
          x = in.nextInt();
          y = in.nextInt();
          z = x + y;
          m = x * y;
	  p=  x - y;

	  p=  x / y;

          System.out.println("Sum of the integers = " + z);
	  System.out.println("Product of the integers = " + m);
       }
    }

