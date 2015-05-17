package unit9_b;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlumnosTest1 {

	@Test
	public void testValidaNif2() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
	
	@Test
	public void testValidaNif5() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("1234567890N");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
	
	@Test
	public void testValidaNif1() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("15421619G");
		boolean resul_esperado = true;
		assertEquals(resul_esperado, resul_real);
	}
	
	@Test
	public void testValidaNif3() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("G21378943");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
	
	@Test
	public void testValidaNif4() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("11A");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
	
	
	@Test
	public void testValidaNif6() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("12345G678");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
	
	@Test
	public void testValidaNif7() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("12345678Ñ");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
	
	@Test
	public void testValidaNif8() {
		Alumnos aTest = new Alumnos();
		boolean resul_real = aTest.validaNif("123456789");
		boolean resul_esperado = false;
		assertEquals(resul_esperado, resul_real);
	}
}
