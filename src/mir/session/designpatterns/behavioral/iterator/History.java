package mir.session.designpatterns.behavioral.iterator;

import java.util.*;
import java.util.stream.Collectors;

public class History implements Iterable<String> {
    private List<String> namesList = new ArrayList<>();

    public void addName(String name) {
        namesList.add(name);
    }

    @Override
    public Iterator<String> iterator() {

        return namesList.iterator();
    }

    public static class HistoryIterator implements Iterator<String> {

        private List<String> names;
        private int counter;

        public HistoryIterator(List<String> namesList) {
            names  = namesList;
        }

        @Override
        public boolean hasNext() {
            return names.size() > counter;
        }

        @Override
        public String next() {
            return names.get(counter++);
        }
    }



}
