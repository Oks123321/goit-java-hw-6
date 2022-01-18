import java.util.Arrays;
import java.lang.String;

class NameParser {
    public String parse(String[] names) {
        StringBuilder result = new StringBuilder();

        for (String name : names) {
            String[] fullName = name.split(" ");
            String[] firstName = Arrays.copyOf(fullName, fullName.length - 1);
            String stringName = firstName[0];
            result.append(stringName).append(", ");
        }

        String stringResult = String.valueOf(result).trim();
        char[] charResult = stringResult.toCharArray();
        if (charResult.length>0){

        char[] newCharResult = Arrays.copyOf(charResult, charResult.length - 1);
        String finalResult = String.valueOf(newCharResult);


        return finalResult;}
        return stringResult;
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}