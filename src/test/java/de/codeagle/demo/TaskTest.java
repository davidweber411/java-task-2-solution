package de.codeagle.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TaskTest {

	@Test
	void doorsTests() {
		assertThrows(IllegalArgumentException.class, () -> {
			Task.doors(0);
		});
		assertEquals(1, Task.doors(1));
		assertEquals(1, Task.doors(2));
		assertEquals(1, Task.doors(3));
		assertEquals(2, Task.doors(4));
		assertEquals(2, Task.doors(5));
		assertEquals(3, Task.doors(10));
		assertEquals(10, Task.doors(100));
		assertThrows(IllegalArgumentException.class, () -> {
			Task.doors(100001);
		});
	}

}
