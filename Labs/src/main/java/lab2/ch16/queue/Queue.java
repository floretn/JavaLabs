package lab2.ch16.queue;

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

    private Node first;
    private Node current;
    private Node last;
    private int counter;

    public Queue(){
        counter = 0;
        //first = new Node();
        //current = new Node();
        //last = new Node();
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

    public String remove(){
        String b = null;

        if(counter > 0) {
            b = first.s;
            first.s = null;
            first = first.next;
            counter--;
        }

        return b;
    }

    public String show(){
        if(counter > 0) {
            current = first;
            StringBuilder builder = new StringBuilder();
            builder.append(current.s);
            current = current.next;
            for (int i = 2; i <= counter; i++) {
                builder.append(", ");
                builder.append(current.s);
                current = current.next;
            }
            String result = builder.toString();
            return result;
        }else{
            return null;
        }
    }
}
