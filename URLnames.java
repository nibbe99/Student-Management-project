package studentManagementSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;


public class URLnames {
	public static void main(String args[]) {
		
	}
	
	public static String stream(URL url) throws IOException {
	    try (InputStream input = url.openStream()) {
	        InputStreamReader isr = new InputStreamReader(input);
	        BufferedReader reader = new BufferedReader(isr);
	        StringBuilder json = new StringBuilder();
	        int c;
	        while ((c = reader.read()) != -1) {
	            json.append((char) c);
	
	        
	        }

	        return json.toString();
	    }
	    
	    
	}
	

	

}

//https://github.com/dominictarr/random-name