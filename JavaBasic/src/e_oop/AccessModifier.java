package e_oop;

public class AccessModifier {
	//
	// * 접근제한자 사용 이유
	// - 데이터를 보호하기 위해
	// - 불필요한 메서드를 감추기 위해
	//

	public String publicVar = "public : 접근 제한이 없음";
	protected String protectedVar = "protected : 같은 패키지 or 상속받은 클래스에서 접근 가능";
	/* default */ String defaultVar = "default : 같은 패키지 내에서 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	// public > protected > default > private

	public void publicMethod() {
		System.out.println(publicVar);
	}

	protected void protectedMethod() {
		System.out.println(protectedVar);
	}

	/* default */ void defaultMethod() {
		System.out.println(defaultVar);
	}

	private void privateMethod() {
		System.out.println(privateVar);
	}

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();

		System.out.println(am.publicVar);
		am.publicMethod();

		System.out.println(am.protectedVar);
		am.protectedMethod();

		System.out.println(am.defaultVar);
		am.defaultMethod();

		System.out.println(am.privateVar);
		am.privateMethod();

		Student student = new Student(45, 89, 78, "홍길동");
		System.out.println(student);

	}

}
