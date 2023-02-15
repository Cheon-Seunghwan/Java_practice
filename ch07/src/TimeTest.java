class Time{
	private int hour; //0~23
	private int minute; //0~59
	private int second; //0~59
	
	public void setHour(int hour) {
		//option+command+m
		if (isNotValidHour(hour)) {
			return;
		}
		this.hour = hour;
	}
	//함수 추출
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	public int getHour() {
		return hour;
	}
}
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
//		t.hour = 25;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
	}

}
