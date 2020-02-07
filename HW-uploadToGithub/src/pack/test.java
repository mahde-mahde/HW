package pack;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		
		hello h=new hello();
		assertEquals(8,h.add(3, 5));
		assertEquals(8,h.sub(9, 1));
		assertEquals(8,h.mul(2, 4));
	}

}
