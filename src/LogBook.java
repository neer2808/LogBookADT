import java.util.Calendar;
import java.util.GregorianCalendar;

/*
* Filename	:	LogBook.java
* Author	:	Divyansh Bhardwaj
* Aim		:	To create a log book using Data Structures with Java
* */
public class LogBook
{
	
	/*
	* Data Members
	* */
	private int logMonth = 0, logYear = 0;	//	logBook month and year
	private int[] entries = new int[31];	//	array of the logbook entries
	private GregorianCalendar logCalendar;	//	Java's built-in Calendar class
	
	private int MONTH_JAN = GregorianCalendar.JANUARY;
	private int MONTH_DEC = GregorianCalendar.DECEMBER;	//	integer constants for months
	
	private int FIRST_DAY_OF_THE_MONTH = 1;
	private int LAST_DAY_OF_THE_MONTH = 31;
	
	/*
	* This constructor creates an empty LogBook for the specified month
	* i.e., a logbook in which all the entries are zero.
	* If month is an invalid date, it will default to today's date.
	* */
	public LogBook(int month, int year)
	{
		//	pre-condition	:	the month must be a valid integer [1, 12]
		//	(both inclusive)
		
		if ( month >= MONTH_JAN && month <= MONTH_DEC )
		//	the value for month is valid
		{
			logCalendar = new GregorianCalendar(year, month - 1, 1);
			logMonth = month;
			logYear = year;
		}
		else	//	the date is invalid
		{
			logCalendar = new GregorianCalendar(Calendar.YEAR, Calendar.MONTH,
					Calendar.DAY_OF_MONTH);
		}
		
		for (int i = 0; i < entries.length; i++)
		{
			putEntry(i, 0);
			//	initialize all entries as 0 for this month
		}
		
	}
	
	/*
	* This method stores the 'value' as the logbook entry for the specified 'day'.
	* */
	public void putEntry(int day, int value)
	{
		//	pre-condition	:	 day is less than or equal to the number of days
		//	in the logbook month
	}
	
	
	/*
	* This method returns the logbook entry for the specified 'day' or '-1' if there
	* is no such day.
	* */
	public int getEntry(int day)
	{
		//	pre-condition	:	 day is less than or equal to the number of days
		//	in the logbook month
		
		int entry = -1;
		
		if ( day >= FIRST_DAY_OF_THE_MONTH && day <= LAST_DAY_OF_THE_MONTH )
		{
			//	valid day value for the month
			entry = entries[day];
		}
		
		return entry;
	}
	
	
	/*
	* This method returns the logbook month.
	* */
	public int month()
	{
		return logMonth;
	}
	
	/*
	* This method returns the logbook year.
	* */
	public int year()
	{
		return logYear;
	}
	
	
	/*
	* This method returns the number of days in the logbook month.
	* */
	public int daysInMonth()
	{
		int days = 0;
		
		return days;
	}
	
	/*
	* This methods returns true if the 'year' is a leap year.
	* */
	private boolean leapYear(int year)
	{
		boolean isLeapYear = false;
		
		isLeapYear = logCalendar.isLeapYear(year);
		
		return isLeapYear;
	}
	
	public static void main(String[] args)
	{
		LogBook logBook = new LogBook(1, 2018);
		logBook.putEntry(22, 1000);
		int rupees = logBook.getEntry(22);
		System.out.println("This " + rupees);
	}
}
