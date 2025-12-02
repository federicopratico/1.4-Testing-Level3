package Level1.Ex3;

public class ThrowExceptionClass {
    private int [] myArray = new int[5];

    public int get(int index) throws IndexOutOfBoundsException {
        return myArray[index];
    }
}
