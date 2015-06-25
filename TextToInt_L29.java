public class TextToInt_L29{
	//quick lesson on converting a String to Integer so that arithmetic operations can be formed.
	public static void main(String[] args){
		String stringNumber = "10000";
		int strgConvertedInt = Integer.parseInt(stringNumber);

		System.out.println("The text that is a string : "+stringNumber);
		System.out.println("The coversion of text to a interger : "+strgConvertedInt);
		System.out.println("Dividing :"+strgConvertedInt/4);
	}
}