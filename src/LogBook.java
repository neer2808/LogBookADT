/*
* Filename	:	LogBook.java
* Author	:	Divyansh Bhardwaj
* Aim		:	To create a log book using Data Structures with Java
* */
public class LogBook
{
	
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
	void putEntry(int day, int value)
	{
		//	pre-condition	:	 day is less than or equal to the number of days
		//	in the logbook month
	}
	
	
	/*
	* This method returns the logbook entry for the specified 'day' or '-1' if there
	* is no such day.
	* */
	int getEntry(int day)
	{
		//	pre-condition	:	 day is less than or equal to the number of days
		//	in the logbook month
		
		int entry = -1;
		
		return entry;
	}
	
	public static void main(String[] args)
	{
	
	}
}
