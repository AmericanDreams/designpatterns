package mir.session.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class History {
    private Map<Character, String> namesMap = new HashMap<>();

    public void addName(String name) {
        namesMap.put(name.charAt(0), name);
    }

    public Map<Character, String> getNamesMap() {
        return namesMap;
    }

    public void setNamesMap(Map<Character, String> namesMap) {
        this.namesMap = namesMap;
    }
}
