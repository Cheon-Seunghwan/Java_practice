
public class Ex8_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception exception = new RuntimeException("에러입니다.");
			throw exception;
			//unchecked exception
		} catch (RuntimeException re) {
			// TODO: handle exception
			System.out.println("runtime exception");
			System.out.println(re.getMessage());
			re.printStackTrace();
			//checked exception - try/catch문 필수
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
