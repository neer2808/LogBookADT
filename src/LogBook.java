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
	private int MONTH_JAN = 0, MONTH_DEC = 11;
	
	/*
	* This constructor creates an empty LogBook for the specified month
	* i.e., a logbook in which all the entries are zero.
	* If month is an invalid date, it will default to today's date.
	* */
	public LogBook(int month, int year)
	{
		//	pre-condition	:	the month must be a valid integer [1, 12]
		//	(both inclusive)
		
		/*if ( month >= MONTH_JAN && month <= MONTH_DEC )
		//	the value for month is valid
		{
			for (int i = 0; i < entries.length; i++)
			{
				putEntry(i, 0);
				//	initialize all entries as 0 for this month
			}
		}
		else	//	the date is invalid
		{
			logCalendar = new GregorianCalendar(year,
					(month > MONTH_JAN && month <= MONTH_DEC)
							? (month - 1)  : (month),
					1);
			logMonth = month;
			logYear = year;
		}*/
		
		
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
	
	}
}
