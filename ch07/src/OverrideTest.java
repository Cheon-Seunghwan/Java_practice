class MyPoint3{
	int x;
	int y;
	String getLocation() {
		return "x: "+x+", y: "+y;
	}
}
class MyPoint3D extends MyPoint3{
	int z;
	//오버라이딩-메서드 변경
	String getLocation() {
		return "x: "+x+", y: "+y+", z: "+z;
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint3D m3d = new MyPoint3D();
		m3d.x = 3;
		m3d.y = 4;
		m3d.z = 5;
		System.out.println(m3d.getLocation());
	}

}
