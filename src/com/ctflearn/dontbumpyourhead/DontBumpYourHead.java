package com.ctflearn.dontbumpyourhead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DontBumpYourHead {

	public static void main(String[] args) throws IOException {
		 
	//URL
	URL hackURL = new URL("https://ctflearn.com/header.php");
	//Open URL
        URLConnection conn = hackURL.openConnection();
        //Change User Agent
        conn.setRequestProperty("User-Agent", "Sup3rS3cr3tAg3nt");
	//Change Referer
        conn.setRequestProperty("referer","awesomesauce.com");
        
	BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
		
	String inputLine;
        while ((inputLine = br.readLine()) != null) {
            System.out.println(" ");
            System.out.println(inputLine);
        }
        br.close();
		
		
	}

}
