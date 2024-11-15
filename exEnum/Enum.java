package exEnum;

//enum = กลุ่มข้อมูลที่เป็นค่าคงที่
enum Grade {
	A(4.0, "Genius"),
	B(3.0, "Very Good"),
	C(2.0, "Good"),
	D(1.0, "Not Bad"),
	F(0.0, "Fail");
	public final double POINT;
	public final String DES;

	private Grade(double point, String des) {
		this.POINT= point;
		this.DES= des;
	}
}

public class Enum {
	public static void main(String[] args) {
		Grade myGrade = Grade.A;
		System.out.println("เกรดของคุณคือ " + myGrade + " | " + myGrade.POINT + " | " + myGrade.DES);
	} // end_main
} // end_class
