package com.aes;

public class AESEncrption {

	public static void main(String[] args)
	{
	    final String secretKey = "secret-key";
	     
	    String originalString = "passcode-key";
	    String encryptedString = AES.encrypt(originalString, secretKey) ;
	    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
	     
	    System.out.println("Original String :: " + originalString);
	    System.out.println("----------------------------------------");
	    System.out.println("Encrypted String :: " + encryptedString);
	    System.out.println("----------------------------------------");
	    System.out.println("Decrypted String :: " + decryptedString);
	}

}
