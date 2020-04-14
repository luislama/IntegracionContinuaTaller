package IntegracionJenkins;

public class RelationalOperator {

	/**
	 * Function to know if one number is greater than another
	 * @param num1
	 * @param num2
	 * @return true if num1 is greater than or equal to num2, false otherwise 
	 */
	public boolean isGreater(int num1, int num2){
		return num1 > num2;
	}
	
	/**
	 * Function to know if one number is less than another
	 * @param num1
	 * @param num2
	 * @return true if num1 is less than num2, false otherwise
	 */
	public boolean isLess(int num1, int num2){
		return num1 <= num2;
	}
}
