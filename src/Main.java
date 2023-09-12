public class Main {
    public static void main(String[] args){
        int resultOne = add(5,6);
        System.out.println(resultOne);
        String resultTwo = greeting("Olivia");
        System.out.println(resultTwo);
        int resultThree = add(1,2,3,4);
        System.out.println(resultThree);
        printMe("Hello!");
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, "+name+"!";
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int sum1 = add(numOne,numTwo);
        int sum2 = add(sum1,numThree);
        int sum3 = add(sum2, numFour);
        return sum3;
    }
    public static void printMe(String toBePrinted) {
        System.out.println(toBePrinted);
    }


}