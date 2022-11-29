public class ContrasenaValidador {
	public boolean isValid(String contrasena)
	{
		if (contrasena.length()>=8 && contrasena.length()<=20)
		{
			return true;
		} else 
			return false;
	}
}

