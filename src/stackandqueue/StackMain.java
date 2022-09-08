package stackandqueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack customStack = new CustomStack();

        customStack.push(34);
        customStack.push(45);
        customStack.push(2);
        customStack.push(9);
        customStack.push(18);



        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
    }
}
