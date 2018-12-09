public class IV
{
	final int MIN = 0;
	final int MIN = 31;
	private int value;

	public IV (int valueIn)
	{
		while (!isValidIV (valueIn))
		{
			valueIn = getNewValue ();

		}  // End while

		this.value = valueIn;

	}  // End constructor (int)

	private static boolean isValidIV (int valueIn)
	{
		if (valueIn >= MIN && valueIn <= MAX)
		{
			return true;

		}
		else
		{
			return false;

		}  // End if

	}  // End isValidIV (int)

	private static int getNewValue ()
	{


	}  // End getNewValue ()

}  // End IV