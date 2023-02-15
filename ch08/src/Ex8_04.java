
public class Ex8_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			//ArithmeticException occur
			System.out.println(0/0);
			//ArrayIndexOutOfBoundException
//			System.out.println(args[0]);
			//실행되지 않음
			System.out.println(4);
			//예외 발생시 객체 생성 변수는 해당 객체를 가리키게 된다.
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			if (ae instanceof ArithmeticException) {
//				System.out.println("true");
				//호출스택에 있는 내용 알려준다.
				ae.printStackTrace();
			}
//			System.out.println("ArithmeticException");
			//예외 메세지를 string형태로 반환
			System.out.println(ae.getMessage());
		//나머지 예외 전부 받음 = 최고 조상 클래스
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("The other Exception");
		}
		System.out.println(6);
	}

}
