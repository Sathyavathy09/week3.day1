package week3.day1;

public class StringCOmparison {

	public static void main(String[] args) {
		
		String str1= "I am Learning Java" ;
		String str2= "I am learning java" ;
		
		if (str1.equalsIgnoreCase(str2))
		{
			System.out.println("str1 and str2 are Equal");
		}
		else
			System.out.println("Not Equal");
		
		if (str1.equals(str2))
		{
			System.out.println("str1 and str2 are Equal");
		}
		else
			System.out.println("Not Equal");
		
		if (str1 == str2)
		{
			System.out.println("str1 and str2 are Equal");
		}
		else
			System.out.println("Not Equal");
		
		

	}

}
