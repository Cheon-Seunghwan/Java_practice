class myPoint{
	int x;
	int y;
}

//상속
class circle extends myPoint{
	int r;
}

//포함
class Circlecontain{
	myPoint p = new myPoint();
	int r;
}
public class InhertanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
//		System.out.println(""+c.x+c.y+c.r);
//		
//		Circlecontain c1 = new Circlecontain();
//		c1.p.x = 4;
//		c1.p.y = 5;
//		c1.r = 6;
//		System.out.println(""+c1.p.x+c1.p.y+c1.r);
		
		//tostring 자동호출
		System.out.println(c);
		System.out.println(c.toString());
	}

}
