package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import com.nt.sbeans.Sum;

public class AppTest 
{
	private Sum sum;
	  
	
	@Test
	public void test()
	{
		sum=new Sum();
		int x=10;
		int y=20;
		int ex=30;
		int at=sum.sum(x, y);
		assertEquals(at,ex);
	}
	
	
	
	
}
