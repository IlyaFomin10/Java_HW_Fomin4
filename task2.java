import java.util.LinkedList;

//Реализуйте очередь с помощью LinkedList со следующими методами:
// - enqueue() - помещает элемент в конец очереди,
// - dequeue() - возвращает первый элемент из очереди и удаляет его,
// - first() - возвращает первый элемент из очереди, не удаляя.



public class task2 {
    private LinkedList elements = new LinkedList();

    public void enqueue(Object element) {
        elements.add(element);
    }

    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public Object first() {
        return elements.getFirst();
    }

    public LinkedList getElements() {
        return elements;
    }

    public static void main(String[] args) {
        task2 queue = new task2();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(10);
        System.out.println(queue.getElements());
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
        System.out.println(queue.getElements());
    }
}
