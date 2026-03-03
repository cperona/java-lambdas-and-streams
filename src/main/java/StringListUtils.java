import java.util.ArrayList;
import java.util.List;

public class StringListUtils {
    public List<String> months;
    public StringListUtils() {
        months =  new ArrayList<>();
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
    }

    public static List<String> stringListContainingO(List<String> stringList) {
        return stringList
                .stream()
                .filter(p-> p.contains("o"))
                .toList();
    }

    public static List<String> stringListContainingOandMoreThan5Letters(List<String> stringList) {
        return stringList
                .stream()
                .filter(p-> p.contains("o")).filter(p -> p.length() > 5)
                .toList();
    }

    public static void printMonth(String month) {
        System.out.println(month);
    }

    public static void printMonthsWithLambda(List<String> months) {
        System.out.println("\nMonths:");
        months.forEach(m -> printMonth(m));
    }

    public static void printMonthsWithMethodReference(List<String> months) {
        System.out.println("\nMonths:");
        months.forEach(StringListUtils::printMonth);
    }
}
