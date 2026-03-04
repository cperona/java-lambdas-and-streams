import java.util.*;

public class Main {
    public static void main() {
        //# Exercise 1
        List<String> stringList = new ArrayList<>();
        stringList.add("Ortogonal");
        stringList.add("Brocoly");
        stringList.add("Coming");
        stringList.add("Ocasionally");
        stringList.add("Seeing");

        //String list with only o
        List<String> stringListWithOnlyO = StringListUtils.stringListContainingO(stringList);
        System.out.println(stringListWithOnlyO);

        //# Exercise 2
        //String list with only o and more than 5 characters
        List<String> stringWithOnlyOandMoreThan5Letters = StringListUtils.stringListContainingOandMoreThan5Letters(stringList);

        //# Exercise 3
        //Create a list with months
        List<String> months =  new ArrayList<>();
        months.add("January");
        months.add("January");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print all elements with a Lambda
        StringListUtils.printMonthsWithLambda(months);

        //# Exercise 4
        //The same but with method reference
        StringListUtils.printMonthsWithMethodReference(months);

        //# Exercise 5
        //Create a Functional Interface and use it
        PiValue piValue = () -> 3.1415;
        System.out.println("\nPi Value: " + piValue.getPiValue());

        //# Exercise 6
        //Order a stringList by length from shortest to longest.
        //Using a lambda
        Collections.sort(stringList, (o1, o2) -> o1.length() - o2.length());

        //# Exercise 7
        //Order stringList by length from longest to shortest.
        Collections.sort(stringList, (o1, o2) -> o2.length() - o1.length());

        //# Exercise 8
        //Create a Functional Interface with reverse() method and inject lambda
        Reverser reverser = s -> new StringBuilder(s).reverse().toString();
        
        String testString = "Hello";
        String reversedString = reverser.reverse(testString);

        System.out.println("Reversed string: " + reversedString);
    }
}
