//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> myllist = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
        myllist.add(i);
        }
        System.out.println(myllist);
        System.out.println(revert(myllist));
    }

    private static LinkedList<Integer> revert(LinkedList<Integer> myllist) {
        for (int j = 1; j < myllist.size(); j++) {
            myllist.addFirst(myllist.remove(j));
        }
        return myllist;
    }
}
