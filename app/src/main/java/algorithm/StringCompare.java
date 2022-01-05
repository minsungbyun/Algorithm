package algorithm;

public class StringCompare {
	public static void main(String[] args) {
		
		//apple = false;
		//banana = false;
		//abcde = true;
				
		
		String[] word = {"a","x","y","l","e"};
		
		
		System.out.println(solution(word));
		
	}
	
	static boolean solution(String[] words) {
		
		boolean result = true;
		
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				System.out.println("i = "+ words[i] + " <------> j = " +words[j]);
				if (words[i] == words[j]) {
					result = false;
				}
			}
		}
		
		return result;
	}
}