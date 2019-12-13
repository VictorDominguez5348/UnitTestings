public class UnitTestingsIfStatements
{
    private int num1, num2, num3;
    private String string1, string2;

    public UnitTestingsIfStatements(int num1, int num2, int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }//end constructor

    public UnitTestingsIfStatements(String string1, String string2)
    {
        this.string1 =string1;
        this.string2 =string2;
    }//end constructor

    public boolean num1LessThan()
    {
        if(num1 <= num3 && num3 <= num2)
        {
            return true;
        }
        return false;
    }

    public String messageSender()
    {
        return string1 + string2;
    }

    public int minFinder()
    {
        if(num1 <= num3 && num1 <=num2 )
        {
            return num1;
        }
        else if((num2 <= num3 && num2 <=num1 ))
        {
            return num2;

        }
        else
            {
                return num3;
            }
    }

    public boolean sumGreaterThanTen()
    {
        int sum = num1 + num2 + num3;
        if(sum > 10)
        {
            return true;
        }

        else
        {
            return false;
        }
    }




}
