import java.util.List;

import org.w3c.dom.ls.LSException;

public class FP_Functional_Excercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","Azure","Docker","Kubernetes");
        System.out.println("\n>>>> Numeros Impares...");
        Impares(numbers);
        System.out.println("\n\n>>>> Cursos...");
        Imprimir_curso(courses);
        System.out.println(">>>> Cursos que contienen la plabra Spring");
        Imprimir_spring_word(courses);
        System.out.println("\n\n>>>> Palabras con mas de 4 letras...");
        Imprimir_word_mayor_4(courses);
        System.out.println("\n\nValor cubico de los numeros impares");
        Cubo_de_numeros(numbers);
        System.out.println("\n\n>>>> Numero de Caracteres por palabra ...");
        Num_Caracteres(courses);
    }

    
    private static void Impares(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(number -> System.out.print(number+","));
    }

    private static void Imprimir_curso(List<String> courses){
        courses.stream().forEach(curso -> System.out.println("-> "+curso));
    }
    
    private static void Imprimir_spring_word(List<String> courses){
        courses.stream()
                .filter(curso -> curso.contains("Spring"))
                .forEach(curso -> System.out.print("-> "+curso));
    }

    private static void Imprimir_word_mayor_4(List<String> courses){
        courses.stream()
                .filter(curso -> curso.length() >= 4)
                .forEach(curso -> System.out.print(curso+", "));
    }

    private static void Cubo_de_numeros(List<Integer> numbers){
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number *number * number)
                .forEach(number -> System.out.print(number+", "));
    }

    private static void Num_Caracteres(List<String> courses){
        courses.stream().forEach(curso -> System.out.print(curso.length()+", "));
    }
}
