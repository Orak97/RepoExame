package View;

import java.util.ArrayList;
import java.util.List;

public class StringCheck {
	private String[] parola;
	
	public StringCheck(String[] stringa) {
		this.parola = stringa;
	}
	
	public int countString(String check) {
		int count = 0;
		for (String string : parola) {
			if (string.contains(check)) {
				count +=1;
			}
			
		}
		return count;
	}
	
	public int countTotalLenght() {
		int count = 0;
		for (String string : parola) {
			count += string.length();
			
		}
		return count;
	}
	
	public List<String> invertStringNotEqual(String check){
		ArrayList<String> lista = new ArrayList<>();
		for (String lettera : parola) {
			if(!lettera.equals(check)) {
				lista.add(lettera);
			}
			
		}
		return lista;
		
	}
	
}
