package ch17.queue;

public class Queue {
    private static class Node{
        String s;
        Node next;

        public Node(){
            this.s = null;
            next = null;
        }

        public Node(String s){
            this.s = s;
            next = null;
        }

    }

    public class Iterator{
        private Node current;
        private Iterator(){
            current = new Node();
        }

        public void next(){
            if (counter > 0 && current.s == null && this.hasNext() != false) {
                current = first;
            }else {
                if (counter > 0){
                    current = current.next;
                }
            }
        }

        public boolean hasNext(){
            if(current != last){
                return true;
            }else{
                return false;
            }
        }

        public void newIter(){
            current = new Node();
        }
    }

    private Node first;
    private Node last;
    private Iterator iter;
    private int counter;

    public Queue(){
        counter = 0;
        first = new Node();
        last = new Node();
        iter = new Iterator();
    }

    public void add(String s){
        Node a = new Node(s);
        if (counter == 0){
            first = a;
        }else{
            last.next = a;
        }
        last = a;
        counter++;
    }

    public boolean remove(){
        boolean b = false;

        if(counter == 1){
            first = new Node();
            counter--;
            b = true;
        }

        if(counter > 1) {
            first = first.next;
            counter--;
            b = true;
        }
        return b;
    }

    public boolean show(){
        if(counter > 0) {
            if (counter > 1) {
                iter.next();
                boolean a = iter.hasNext();
                while (a == true) {
                    System.out.println(iter.current.s);
                    a = iter.hasNext();
                    iter.next();
                }
            }else{
                iter.next();
                System.out.println(iter.current.s);
            }
            iter.newIter();
            return true;

        }else{
            return false;
        }

    }
}
