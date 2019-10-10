package branching;

public class word_count {

	public static void main(String[] args) {
		System.out.println(countWords("fkj nsd km ds"));
	}// main

	static int countWords(String sentence) {
		String[] lst = sentence.split(" ");
		return (lst.length);
	}
}// class