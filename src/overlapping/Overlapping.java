
package overlapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 
public class Overlapping {

    public static ArrayList<Integer> sort(List a)
    {
        int i=0,j=0,k=0;

	for(i=0; i< a.size(); i+=2)
	{
		for(j=0;j<a.size();j++)
		{       
                       
			if((int)a.get(i) > (int)a.get(j) && (int)a.get(i+1)<(int)a.get(j+1))
			{
				a.remove(i);
                                a.remove(i+1);

			}
			else if ((int)a.get(i) > (int)a.get(j) && (int)a.get(i+1)>(int)a.get(j+1))
			{
				a.remove(i);
                                a.remove(j+1);
                            
			
			}
    
                }
       }
        return (ArrayList<Integer>) a;
    }
    public static void main(String[] args) {
     System.out.println(" Enter the number of test cases T (integer number) ");
     int T=0;
     int N=0;
     int x;
     int y;
     List <Integer> A= new ArrayList();;
     Scanner s= new Scanner (System.in);
     if (s.nextInt()>50||s.nextInt()<1)
     {
              System.out.println(" Enter a number between 1 and 50 ");

     }
     else if(s.nextInt()<50&&s.nextInt()>1)
     {
         T=s.nextInt();
     }
        int i=0;
        int j=0;
        while (i<T)
        {
            System.out.print(" Enter hte number of intervals N (integer number) ");
            Scanner e= new Scanner(System.in);
             if (e.nextInt()>100||s.nextInt()<1)
            {
              System.out.println(" Enter a number between 1 and 100 ");

            }
             else if(s.nextInt()<100&&s.nextInt()>1)
            {
              N=e.nextInt();
            }
            for(j=0;j<N;j++) {
              System.out.println(" Enter the starting  position 'x' and ending  position 'y'for the interval");
		x=e.nextInt();
                y=e.nextInt();
            A.add(x);
            A.add(y);
            }
            System.out.println(sort(A));
            i++;
        }
    }
    
    
}
