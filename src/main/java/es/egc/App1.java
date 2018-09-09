package es.egc;
import org.apache.log4j.*; 

/**
 * MULTIPLICACION
 *
 */
public class App1 
{
	static Logger log=Logger.getLogger(App1.class); 

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		System.out.println(a + "*" + b + " = " + App1.multiplica(a,b));
	}
	
	public static int multiplica(int a, int b){
		int result= a*b;
		log.info("Returning "+a+"*"+b+"="+result);
		return result;
	}
}
