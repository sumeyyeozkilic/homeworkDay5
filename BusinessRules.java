package homeWork.core;

public class BusinessRules {
	public static boolean run(boolean... logics) {
	   	 for(boolean b : logics) {
	   		 if(!b) return false;
	   	 }
	   	 return true;
	    }
}
