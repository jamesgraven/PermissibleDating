
/**
 * Write a description of class model here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class model
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class model
     */
    public static int getHighest(int n)
    {
        if (n > 15)
        {
              return n + n/2 - 7 ;
        }
        else
        {
            return 0;
        }

    }

    public static int getLowest(int n)
    {
     
        if (n > 15)
        {
        	if(n/2 + 7 <= 15)
        	{
        		return 16;
        	}
        	else
        	{
        		return n/2 + 7 ;
        	}
        }
        else
        {
            return 0;
        }
    }

    
}
