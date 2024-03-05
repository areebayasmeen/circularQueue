import javax.naming.PartialResultException;

public class Main {
    public static void main(String[] args) {
        circularQueue circularQueue=new circularQueue();
        circularQueue.enqueue(5);
        circularQueue.enqueue(3);
        circularQueue.enqueue(1);
        circularQueue.enqueue(0);
        circularQueue.enqueue(1);



        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());


circularQueue.enqueue(101);







    }
}