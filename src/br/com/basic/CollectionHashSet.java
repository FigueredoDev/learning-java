package src.br.com.basic;

import java.util.HashSet;

public class CollectionHashSet {
    public static void main(String[] args) {
        /*
         * Note - O HashSet não permite busca pelo index
         * Não tem ordenação dos itens
         */
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.remove(3);

        boolean isNumberThreeContains = numbers.contains(3);

        System.out.println("is the number three contains in numbers set? " + isNumberThreeContains);

        numbers.forEach(number -> System.out.println("using forEach: " + number));

        for (Integer number : numbers) {
            System.err.println("The number value is: " + number);
        }
    }
}
