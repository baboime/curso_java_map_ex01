package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		cookies.put("phone", "984683504");
		
		System.out.println("Contem a chave chamada phone: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		
		
		System.out.println("Todos os cookies:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key) );
		}

	}

}
