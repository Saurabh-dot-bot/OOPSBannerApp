import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp8 {

    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ******",
                "*     *",
                "*     *",
                " ******",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ******"
        });

        return map;
    }

    public static void printBanner(String text, Map<Character, String[]> map) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        printBanner("OOPS", characterMap);
    }
}