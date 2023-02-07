
public class isExactMultiple {
    public static void main(String[] args) {
        int input1 = 8;
        int input2 = 4;
        if (input1 % input2 == 0)
            System.out.println("2");
        else if (input1 == 0 || input2 == 0)
            System.out.println("1");
        else
            System.out.println("3");
    }
}