package com.sm.projectArray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DemoArraySumTest {
	
	 private final DemoArraySum demoArray = new DemoArraySum();

	    @Test
	    public void testSumArray() {
	        int[] arr = {1, 2, 3, 4, 5};
	        int result = demoArray.findSumArray(arr);
	        assertEquals(15, result, "The sum of the array elements should be 15");
	    }

	    @Test
	    public void testMaxArray() {
	        int[] arr = {1, 2, 3, 4, 5};
	        int result = demoArray.findMaxArray(arr);
	        assertEquals(5, result, "The maximum value in the array should be 5");
	    }

	    @Test
	    public void testMaxArrayEmpty() {
	        int[] arr = {};
	        assertThrows(IllegalArgumentException.class, () -> {
	        	demoArray.findMaxArray(arr);
	        }, "Array cannot be null or empty");
	    }
	
}
