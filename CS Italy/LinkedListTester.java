public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList enListe = new LinkedList();
        ListNode etTal = new ListNode();
        
        // Empty linkedList
        System.out.println(enListe.isEmpty());

        // Add first
        enListe.addFirst("Hej");
        System.out.println(enListe.isEmpty());
        System.out.println(enListe.getFirst());
        
        etTal.setElement(1);
        enListe.addNodeLast(etTal);
        System.out.println(enListe.getLast());
        
        

        


    }

}