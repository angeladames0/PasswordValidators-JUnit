import org.junit.Assert;
import org.junit.Test;

public class TestContrasena {
	
	String contrasena = "coco";
	
	@Test
	public void TestContrasenaLarga() {
		ContrasenaValidador cv = new ContrasenaValidador();
		Assert.assertEquals(true, cv.isValid(contrasena));
	}
	
	@Test
	public void TestContrasenaNumero() {
		ContrasenaNumeroValidador cn = new ContrasenaNumeroValidador();
		Assert.assertEquals(true, cn.isValid(contrasena));
	}
	
	@Test
	public void TestContrasenaCaracter() {
		ContrasenaCaracterValidador cc = new ContrasenaCaracterValidador();
		Assert.assertEquals(true, cc.isValid(contrasena));
	}
	
	@Test
	public void TestContrasenaLetraMayuscula() {
		ContrasenaLetraMayuscula cl = new ContrasenaLetraMayuscula();
		Assert.assertEquals(true, cl.isValid(contrasena));
	}
	
}