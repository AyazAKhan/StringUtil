
/**
 * Utility class for string encoding.
 * 
 * @author  Ayaz Khan
 */

public class StringEncoding {

	/**
	 * The method will return the offset value for string literals with characters a-z.
	 * Any character other than a-z will not be changed.
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
		
		if (offset == 1) {
			for (char ch: charArr) {
				int chVal = (int)ch;
				if (chVal > 96 && chVal < 122) {
					offsetValue.append((char) ++chVal);
					
				} else if (chVal == 122) {
					offsetValue.append('a');
				} else {
					offsetValue.append((char) chVal);
				}
			}
		} else if (offset == -1) {
			for (char ch: charArr) {
				int chVal = (int)ch;
				if (chVal > 97 && chVal < 123) {
					offsetValue.append((char) --chVal);
					
				} else if (chVal == 97) {
					offsetValue.append('z');
				} else {
					offsetValue.append((char) chVal);
				}
			}
		} else {
			
			// for any other offset value, no action performed.
			return original;
		}
		
		return offsetValue.toString();
	}
}
