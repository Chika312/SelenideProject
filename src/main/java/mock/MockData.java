package mock;

import com.github.javafaker.Faker;

import java.util.*;

public class MockData {
    public static Faker faker = new Faker(new Locale("En"));

    public static String generateName() {
        return faker.name().firstName();
    }

    public static String generateEmail() {
        return faker.name().lastName() + "@gmail.com";
    }

    public static String generateCurrentAddress() {
        return faker.internet().safeEmailAddress();
    }

    public static String generatePermanentAddress() {
        return faker.address().secondaryAddress();
    }

    public static void main(String[] args) {
        int[]numbers = {9,8,7,6,9,5,1,6,2};
        boolean bool = false;
        int num  = 0;
        while (!bool){
            bool=true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i]>numbers[i+1]){
                    num=numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=num;
                    bool=false;

                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        Set <Integer>result = new TreeSet<>();
        Arrays.stream(numbers).forEach(e->result.add(e));
        System.out.println(result);
    }
}
