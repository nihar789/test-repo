public class TASKex008{
    static class MyException extends Exception { // exception is a predefined class – parent class for MyException
        public MyException(String m) {
//inr age ====> scan in put ===> if clock if age <0 ==? Throw an exception
            super(m); // calling the parent class constructor with parameters
        }
    }
        public static void main(String args[]) {
            System.out.println("Programme startd.");
            try {
                // Throw an object of user-defined exception
                throw new TASKex008.MyException("This is a custom exception");
            }
            catch (TASKex008.MyException ex) {
                System.out.println("Caught");
                System.out.println("Exception message: "+ex.getMessage());
            }
        }
    }

