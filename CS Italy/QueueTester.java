public class QueueTester {
    public static void main(String[] args){
        QGrowArr kø = new QGrowArr();

        kø.enqueue("Hej");
        kø.enqueue("DJ");
        kø.enqueue(1);
        kø.enqueue(2);
        kø.enqueue("Hej");
        kø.enqueue("DJ");
        kø.enqueue(1);
        kø.enqueue(2);
        kø.enqueue("Hej");
        kø.enqueue("DJ");
        kø.enqueue(1);
        kø.enqueue(2);

        System.out.println(kø.size());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());
        System.out.println(kø.dequeue());


    }
}