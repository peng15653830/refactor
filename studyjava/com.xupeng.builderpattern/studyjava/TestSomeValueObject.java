package studyjava;

import org.junit.Test;

public class TestSomeValueObject {

	@Test
	public void test() {
		Object com1 = new String("com1");
		Object com2 = new String("com2");
		Object com3 = new String("com3");
		Object com4 = new String("com4");
		Object com5 = new String("com5");
		SomeValueObject svo = new SomeValueObject.Builder(com1, com2).com3(com3).com4(com4).com5(com5).build();
		System.out.println(svo.toString());
	}

}
