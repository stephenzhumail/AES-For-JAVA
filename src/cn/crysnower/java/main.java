package cn.crysnower.java;


public class main {
	
	public static void main(String[] args){ 
		
		AES aes = new AES();
		String conten = "1";
		String str2 = aes.encrypt(conten.getBytes());
		System.out.println("======"+str2);
		
	
    } 
	
}
