public class ContrasenaNumeroValidador {
	public boolean isValid(String contrasena)
	{
	 if (contrasena.length()>=8 && contrasena.length()<=20) {
	        int i;
	        char l;
	        for (i = 0; i < contrasena.length(); i++) {
	            l = contrasena.charAt(i);

	            if (Character.isDigit(l)) {
	            	return true;
	            }
	        }
		}
	return false;
	 }
}
