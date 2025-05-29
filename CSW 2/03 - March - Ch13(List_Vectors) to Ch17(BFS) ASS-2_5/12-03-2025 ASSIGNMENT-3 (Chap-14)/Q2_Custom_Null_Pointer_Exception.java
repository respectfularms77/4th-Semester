class CustomNullPointerException extends NullPointerException {
    public CustomNullPointerException(String message) {
        super(message);             // Call superclass constructor with message
    }
}
public class Q2_Custom_Null_Pointer_Exception {
    public static void main(String[] args) {
		try {
			int[] ar = null;											//{1,2,3};
			if (ar==null)		throw new CustomNullPointerException("Array is Null");
		}	catch (CustomNullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}