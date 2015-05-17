package unit9_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlumnosTest2 {

	@Test
	public void testCalculaTasaMatricula1() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(15, false, true);
		float resul_esperado = 2000.00f;
		assertEquals(resul_esperado, resul_real,0.00f);
	}
	
	@Test
	public void testCalculaTasaMatricula2() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(26, false, true);
		float resul_esperado = 500.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula3() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(24, true, true);
		float resul_esperado = 250.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula4() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(24, true, false);
		float resul_esperado = 250.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula5() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(24, false, false);
		float resul_esperado = 500.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula6() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(26, false, false);
		float resul_esperado = 500.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula7() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(27, true, true);
		float resul_esperado = 250.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula8() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(27, true, false);
		float resul_esperado = 250.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula9() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(65, true, false);
		float resul_esperado = 250.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula10() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(66, false, false);
		float resul_esperado = 250.00f;
		assertEquals(resul_esperado, resul_real,0);
	}
	
	@Test
	public void testCalculaTasaMatricula11() {
		Alumnos aTest = new Alumnos();
		float resul_real = aTest.calculaTasaMatricula(51, false, false);
		float resul_esperado = 400.00f;
		assertEquals(resul_esperado, resul_real,0);
	}







}
