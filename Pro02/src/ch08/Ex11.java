package ch08.Exception;

import java.io.InputStream;

public class Ex11 {

	public static void main(String[] args) {	

		InputStream is=System.in;
		
		try {
			int x=is.read();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
