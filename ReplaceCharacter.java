package week3.day1;

public class ReplaceCharacter {

	// String sentence = "I am working with Java8"
	// replace 8 to 11

	public static void main(String[] args) {
		
		String sentence = "I am working with Java8";
		
		String replaceString=sentence.replace('8','1');
		String newSentence = replaceString+1;
		System.out.println(newSentence);
		
		char[] sentenceArray = newSentence.toCharArray();
		
		System.out.println("*** Printing from position 5 to 14 ****" );
		
		  for (int i = 5; i<=14; i++) 
		  { 
			  System.out.print(sentenceArray[i]);
		  }
			 
		
		  
	   
	}
}

