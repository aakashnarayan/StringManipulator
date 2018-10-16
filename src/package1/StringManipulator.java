package package1;
/*
 * 
 * @author Aakash Narayan
 * String Manipulator
 * Period 7 AP Computer Science
 * 
 */
public class StringManipulator {
	
	//methods
	public String noVowels(String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
				|| str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
			{
				str = str.substring(0, i) + "*" + str.substring(i+1);
			}
		}
		return str;
		
	/*public String reverse(String str)
	{
		for (int i = str.length(); i > 0; i--)
		{
			
		}
	}*/
	}
}
