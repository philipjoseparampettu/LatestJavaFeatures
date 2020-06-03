package pj.java14.TextBlocks;

public class TextBlockExample {
	public static void main(String[] args) {
		@SuppressWarnings("preview")
		String tb = """
				Hello
				World

				*	Please notice that formatting is maintained even if we
					did not explicitly code for world to come in next line.
					How ever we put into java, it would come in to console  * """;
		System.out.println(tb);

	}
}
