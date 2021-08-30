package validatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneExample {
    private static final String PHONE_REGEX = "[(]+[0-9]{2}[)]+[-]+[(][0-9]{10}[)]+";

    public PhoneExample() {
    }

    public boolean validate(String name){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneExample phoneExample = new PhoneExample();
        System.out.println(phoneExample.validate("(84)-(0978489648)"));
        System.out.println(phoneExample.validate("(a8)-(22222222)"));
    }
}
