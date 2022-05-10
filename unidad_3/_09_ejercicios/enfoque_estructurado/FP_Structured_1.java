import java.util.List;

public class FP_Structured_1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        FP_Structured_1.printAllBumbersInListStructured(numbers);
        FP_Structured_1.printEvenNumbersInListStrucutred(numbers);
        System.out.println();

        printAllBumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
        printEvenNumbersInListStrucutred(List.of(12,9,13,4,6,2,4,12,15));
        System.out.println();
    }
    private static void printAllBumbersInListStructured(List<Integer> numbers){
        for(int number : numbers){
            System.out.print(number+", ");
        }
        System.out.println();
    }
    
    private static void printEvenNumbersInListStrucutred(List<Integer> numbers){
        for(int number:numbers){
            if(number%2 ==0 ){
                System.out.print(number + ", ");
            }
        }
        System.out.println();
    }
}
