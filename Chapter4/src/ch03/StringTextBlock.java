package ch03;

public class StringTextBlock {

	public static void main(String[] args) {
			
		String strblock = """
				This
				is
				text
				block
				test.
				""";
		
		System.out.println(strblock);
		System.out.println(getBlockHtml());
		
		
	}
	
	public static String getBlockHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					</body>
				</html>""";
				
	}

}
