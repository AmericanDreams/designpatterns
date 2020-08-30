package mir.session.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterFactory {

    private static Map<Character, Letter> letters = new HashMap<>();

    public static Letter createLetter(char c ,int x, int y) {
        if (!letters.containsKey(c)) {
            Letter letter = new Letter(c, x, y);
            letters.put(c, letter);
        } else {
            Letter letter = letters.get(c);
            letter.setX(x);
            letter.setY(y);
            return letter;
        }
        return letters.get(c);
    }
}
