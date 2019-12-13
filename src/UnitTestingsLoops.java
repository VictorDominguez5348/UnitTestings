public class UnitTestingsLoops
{
    private int hours, days, weeks;
    public UnitTestingsLoops(int hours, int days, int weeks)
    {
     this.hours = hours;
    this.days = days;
    this.weeks = weeks;

    }

    public int numOfMinutes()
    {

      int minutes;
      minutes = 0;
        for (int i = 0; i >= 365; i++)
        {
            minutes = hours * 60 ;
        }
        return  minutes;
    }
}
