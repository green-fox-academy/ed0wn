package exercise1;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;


public class Exercise1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    List<Integer> evenNumbers = numbers.stream()
            .filter( s -> s%2==0)
            .collect(Collectors.toList());
    System.out.println(evenNumbers);

    List<Integer> squaredPositiveNumbers= numbers.stream()
            .filter(s -> s>0)
            .map(num -> num*num)
            .collect(Collectors.toList());
    System.out.println(squaredPositiveNumbers);

    List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squaredValueIsBiggerThan20 = numbers2.stream()
            .filter(num -> num * num > 20)
            .collect(Collectors.toList());
    System.out.println(squaredValueIsBiggerThan20);

    numbers.stream()
            .filter(num -> num%2 == 1)
            .mapToInt(num -> num).average().ifPresent(s -> System.out.println(s));


    List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
    int sumOfOddNumbers = numbers3.stream()
            .filter(num -> num%2 == 1)
            .mapToInt(num -> num).sum();
    System.out.println(sumOfOddNumbers);

    String something ="ROME anyAd PARIS";
    List<Character> string = something.codePoints()
            .mapToObj(c -> (char) c)
            .filter(Character::isUpperCase)
            .collect(Collectors.toList());
    System.out.println(string);

    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    String c= "n";
    List <String> cityStartsWith= cities.stream()
            .filter(city ->city.startsWith(c.toUpperCase()))
            .collect(Collectors.toList());
    System.out.println(cityStartsWith);

    List<Character> characters= Arrays.asList('A', 'B', 'C', 'd');
    String concChars = characters.stream()
            .map(String :: valueOf)
            .collect(Collectors.joining());
    System.out.println(concChars);

    String string2 = "kfkshdgkjncjkvbshdvdjsabnl";
    Map<Character, Integer> frequencies = string2.chars().boxed()
            .collect(toMap(
                    k -> (char) k.intValue(),
                    v -> 1,
                    Integer::sum));
    System.out.println(frequencies);
  }
}
