
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
    public int getHighest(String number)
    {
        int n = Integer.parseInt(number);

        if (n > 0)
        {
              return n + n/2 - 7 ;
        }
        else
        {
            return 0;
        }

    }

    public int getLowest(String number)
    {
        int n = Integer.parseInt(number);

        if (n > 0)
        {
             return n/2 + 7 ;
        }
        else
        {
            return 0;
        }
    }

    
}
