package es.egc;
import org.apache.log4j.*; 

/**
<<<<<<< HEAD:src/main/java/es/egc/MisMatematicas.java
 * DIVISION
 *
=======
 * MULTIPLICACION
 * DIVISION
>>>>>>> next:src/main/java/es/egc/App1.java
 */
public class MisMatematicas 
{
	static Logger log=Logger.getLogger(MisMatematicas.class); 

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println(a + "/" + b + " = " + MisMatematicas.divide(a,b));
	}
	
	public static int divide(int a, int b){
		int result= a/b;
		log.info("Returning "+a+"/"+b+"="+result);
		return result;
	}
	
	public static int multiplica(int a, int b){
		int result= a*b;
		log.info("Returning "+a+"*"+b+"="+result);
		return result;
	}
}
