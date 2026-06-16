package Singleton;

/**
 * @author Aswin Senthilkumar
 *
 */
public class test {
public static void main(String args[]) {
	
	Logger log = Logger.getInstance();
	log.checkInstance();
	
	Logger log2 = Logger.getInstance();
	log2.checkInstance();
	
	System.out.println(log == log2 ? "Same Instance - (same address) \nSINGLETON ACHIEVED " : "different Instance - (different address) \n SINGLETON  NOT ACHIEVED ");
	
	
}
}
