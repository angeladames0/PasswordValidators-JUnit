import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContrasenaLetraMayuscula {
	public boolean isValid(String contrasena)
	{
        Pattern special = Pattern.compile("[A-Z]");
        Matcher hasSpecial = special.matcher(contrasena);
	 if (contrasena.length()>=8 && contrasena.length()<=20) {
	        int i;
	        char l;
	        for (i = 0; i < contrasena.length(); i++) {

	            if (hasSpecial.find()) {
	            	return true;
	            }
	        }
		}
	return false;
	 }
}