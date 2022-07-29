package by.kursy.annaburdys.javatasks.Homework.Stage30;

import java.io.FileReader;
import java.io.IOException;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class BracketsCheck {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        try(FileReader reader = new FileReader("/Users/annaburdys/Desktop/flower.txt")) {
            int c;
            while((c = reader.read()) != -1) {
                text.append((char) c);
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }
        System.out.println(text);
        System.out.println(isCorrectBrackets(String.valueOf(text)));
    }

    private static boolean isCorrectBrackets(String input) {
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        Deque<Character> textFromFile = new LinkedList<>();
        for (char c : input.toCharArray()) {
            if (bracketsMap.containsValue(c)) {
                textFromFile.push(c);
            } else if (bracketsMap.containsKey(c)) {
                if (textFromFile.isEmpty() || textFromFile.pop() != bracketsMap.get(c)) {
                    return false;
                }
            }
        }
        return textFromFile.isEmpty();
    }
}