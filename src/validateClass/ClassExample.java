package validateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {
    private static final String NAME_REGEX = "[C|A|P]+[0-9]{4}[G|H|I|K|L|M]";

    public ClassExample() {
    }

    public boolean validate(String name){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        System.out.println(classExample.validate("C0318G"));
        System.out.println(classExample.validate("M0318G"));
        System.out.println(classExample.validate("P0323A"));
    }
}
