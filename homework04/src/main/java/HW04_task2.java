import java.util.*;

public class HW04_task2 {
    public static void main(String[] args) {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        ex1();
    }

    private static void ex1() {
        LinkedList<String> wordList = new LinkedList<>();
        Collections.addAll(wordList, "1 - First", "2 - Second", "3 - Third", "4 - Forth", "5 - Fifth");
        printList(wordList);
        Deque<String> invertedList = new ArrayDeque<String>();
        for (String item: wordList) {
            invertedList.addFirst(item);
        }
        printList(invertedList);
    }

    private static void printList (Deque<String> list){
        for (String item: list) {
            System.out.print("[" + item + "] ");
        }
        System.out.println("\n");
    }
}
