package lab2.dop.circle;

import java.util.Objects;

public class Circle {

    private static class Node{
        String s;
        Node next;

        public Node(Node next) {
            this.s = s;
            this.next = next;
        }

        public void setS(String s) {
            this.s = s;
        }

        public String getS() {
            return s;
        }
    }

    private final int number;
    private Node current;

    public Circle(int number) {
        this.number = number;
        if (number > 0) {
            Node first = new Node(null);
            current = first;
            for (int i = 1; i < number; i++) {
                Node node = new Node(current);
                current = node;
            }
            first.next = current;
        }
    }

    public String add(String s){
        String change = null;
        if (number > 0) {
            change = current.getS();
            current.setS(s);
            current = current.next;
        }
        return change;
    }

    public String show(){
        String result = null;
        if(number > 0) {
            result = current.getS();
            this.nextCurr();
        }
        return result;
    }

    private void nextCurr(){
        current = current.next;
    }

}
