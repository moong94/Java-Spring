package ch11;

public class MakeReport {

	StringBuffer buffer = new StringBuffer();
	
	private String line = "=========================\n";
	private String title = "   이름\t주소\t\t전화번호\n";
	
	//메소드나 속성을 외부에 공개를 할 것인지 아닌지 여부.
	//어떤 정보를 공개 할 것인지 아닌지 고려해야할 것.
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("James\t");
		buffer.append("Seoul Korea\t");
		buffer.append("010-1234-5678\n");
		
		buffer.append("Tomas\t");
		buffer.append("NewYork US\t");
		buffer.append("010-1234-5679\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}
