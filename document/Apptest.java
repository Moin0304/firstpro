Package com.mycompany.app

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import Static org.junit.Assert.*;

/**
 *unit test for simple App.
 */

Public Class AppTest
{
	Private final ByteArrayOutputStream outcontent = new ByteArrayOutputStream

	@Before
	Public Void SetUpStream(){
		system.setout(new PrintStream(outcontent));
	}

	@Test
	Public Void testAppConstructor(){
		try{
			new App();
		} catch (Exception e) {
			fail("construction failed.");
		}
	}
	
	@Test
	Public Void testAppMain()
	{
		App.main(null);
		try{
			assertEqual("Hello World!")+System.getProperty("line.seperator")
		} catch(AssertionError e) {
			fail("\"message\" is not \"Hello World!\*");
		}
	}

	@After 
	Public Void CleanUpStreams(){
		System.Setout(null);
	}
}
