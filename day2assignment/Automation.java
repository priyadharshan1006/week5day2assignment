package week5.day2assignment;

public class Automation extends MultipleLangauge implements TestTool,Language {

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}
public static void main(String[] args) {
	Automation obj = new Automation();
	obj.java();
	obj.selenium();
	obj.ruby();
	obj.python();
}
}
