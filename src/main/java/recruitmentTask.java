import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class recruitmentTask {
    public static void getNumbersOfEachChar(String inputString) {

        int stringLength = inputString.length();
        Map<Character, Integer> characters = new HashMap<Character, Integer>();

        for (int i = 0; i < stringLength; ++i) {
            char charAt = inputString.charAt(i);
            // Converting Upper Case Letters to Lower Case
            if(Character.isUpperCase(charAt)){
                charAt = Character.toLowerCase(charAt);
            }
            if (!characters.containsKey(charAt)) {
                characters.put(charAt, 1);
            } else {
                characters.put(charAt, characters.get(charAt) + 1);
            }
        }

        TreeMap<Character, Integer> sorted = new TreeMap<>(characters);
        System.out.println("In provided string: '" + inputString + "' we have: \n");
        for (Map.Entry<Character, Integer> entry : sorted.entrySet()) {
            //Skipping " " sign
            if(!entry.getKey().toString().equals(" ")){
                System.out.println(String.format("%s repeated %s times", entry.getKey(), entry.getValue()));
            }
        }
    }
    public static void main(String[] args) {

        getNumbersOfEachChar("Java Academy");
    }

}