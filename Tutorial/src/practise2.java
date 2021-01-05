

public class practise2 {
	
	char calc (int num1, int num2, String message)
	{
		int sum = num1 + num2;
		char result = message.charAt(sum);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practise2 obj = new practise2();
		
		char ch = obj.calc(25, 0, "hello");
		System.out.println(ch);
	}

}
