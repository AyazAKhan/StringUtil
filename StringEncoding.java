
/**
 * Utility class for string encoding.
 * 
 * @author  Ayaz Khan
 */

public class StringEncoding {

	/**
	 * The method will return the string with provided offset value for characters.
	 *  
	 * @param 	offset		value to determine the action of function
	 * @param 	original	the original string value
	 * @return	string value after the changes done
	 */
	public static String encode(int offset, String original) {
		
		if (original == null) {
			return null;
		}
		
		/** offsetValue Store the value after encoding */
		StringBuffer offsetValue = new StringBuffer();
		
		/** charArr Character array of the original string */
		char[] charArr = original.toCharArray();
		
		for (char ch: charArr) {
			int chVal = (int)ch;
			if (chVal > 96 && chVal < 123) {
				if ((chVal + offset) < 97) {
					offsetValue.append((char)(chVal + offset + 26));
				} else if ((chVal + offset) > 122) {
					offsetValue.append((char)(chVal + offset - 26));
				} else {
					offsetValue.append((char)(chVal + offset));
				}
			} else if (chVal > 64 && chVal < 91) {
				if ((chVal + offset) < 65) {
					offsetValue.append((char)(chVal + offset + 26));
				} else if ((chVal + offset) > 90) {
					offsetValue.append((char)(chVal + offset - 26));
				} else {
					offsetValue.append((char)(chVal + offset));
				}
				
			} else {
				offsetValue.append((char) chVal);
			}
		}
		
		return offsetValue.toString();
	}
}
