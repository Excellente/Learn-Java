package Basics;

public class Swap {
    public static void main(String[] args) {

        // Value swap using two variables
        int firstVar = 10;
        int secondVar = 20;

        System.out.println("======================= Before swap ========================");
        System.out.println("firstVar: "+firstVar+"\n"+"secondVar: "+secondVar);

        firstVar += secondVar;
        secondVar = firstVar - secondVar;
        firstVar -= secondVar;

        System.out.println("======================= After swap ========================");
        System.out.println("firstVar: "+firstVar+"\n"+"secondVar: "+secondVar);
    }
}
