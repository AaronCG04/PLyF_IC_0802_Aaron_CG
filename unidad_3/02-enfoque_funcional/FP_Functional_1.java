import java.util.List;

public class FP_Functional_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        
        System.out.println("USANDO ---> [System.out::print] por defecto");
        printAllBumbersInListFunctional_Tow(numbers);
        System.out.println("\n--* printAllBumbersInListfunctional *--");
        printAllBumbersInListfunctional(numbers);
        System.out.println("\n--* printEvenNumbersInListFunctional *--");
        printEvenNumbersInListFunctional(numbers);
        System.out.println("\n--* printSquaresOfEvenNumbersInListFunctional *--");
        printSquaresOfEvenNumbersInListFunctional(numbers);
        System.out.println();
    }
    private static void print(int number){
        System.out.print(number+", ");
    }

    private static boolean isEven(int number){
        return (number%2 == 0);
    }

    private static void printAllBumbersInListFunctional_Tow(List<Integer> numbers){
        numbers.stream().forEach(System.out::print);
        System.out.println();
    }

    private static void printAllBumbersInListfunctional(List<Integer> numbers){
        numbers.stream().forEach(FP_Functional_1::print);
        System.out.println();
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(FP_Functional_1::isEven)
                .forEach(FP_Functional_1::print);
        System.out.println();
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(FP_Functional_1::print);
        System.out.println();
    }
}
