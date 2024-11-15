package exGeneric;

//GenericMedthod = medthod ที่สามารถมีพารามิเตอร์ได้ทุกชนิด

class Data {
	// medthod ที่ไม่ return
	static <T> void showMessage(T mes) {
		System.out.println(mes);
	}
	
	// medthod ที่มี return
	static <T> T showMessageReturn(T mes) {
		return mes;
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		Data.showMessage("Kanisorn");
		
		String name = Data.showMessageReturn("Teen Return");
		System.out.println(name);
	}

}
