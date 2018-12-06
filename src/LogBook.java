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
	
	
	/*
	* This constructor creates an empty LogBook for the specified month
	* i.e., a logbook in which all the entries are zero.
	* If month is an invalid date, it will default to today's date.
	* */
	public LogBook(int month, int year)
	{
		//	pre-condition	:	the month must be a valid integer [1, 12] (both inclusive)
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
		int logbookMonth = 0;
		
		
		return logbookMonth;
	}
	
	/*
	* This method returns the logbook year.
	* */
	public int year()
	{
		int logBookYear = 0;
		
		return logBookYear;
	}
	
	
	/*
	* This method returns the number of days in the logbook month.
	* */
	public int daysInMonth()
	{
		int days = 0;
		
		return days;
	}
	
	public static void main(String[] args)
	{
	
	}
}
