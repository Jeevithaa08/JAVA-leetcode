package Leetcode;
//Java program to check whether Java is installed on your computer or not. 
public class Task48JavaInstallation {
	public static void main(String[] args) {
		String javaVersion = System.getProperty("java.version");
		if(javaVersion != null) {
			System.out.println("Java is installed.  Version :" + javaVersion);
			
		}else {
			System.out.println("Java is not installed");
		}
	}

}
