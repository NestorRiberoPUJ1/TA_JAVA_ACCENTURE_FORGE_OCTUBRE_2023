package listaEnlazada;

public class SinglyLinkedList {

    public Node head;

    public SinglyLinkedList() {
        // su codigo aqui
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        if (head != null) {

            Node runner = head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;

        }
    }

    public void printValues() {
        if (head != null) {

            Node runner = head;
            System.out.println(runner.value);
            while (runner.next != null) {
                runner = runner.next;
                System.out.println(runner.value);
            }
        }
    }

    public Node find(int value) {
        if (head != null) {

            Node runner = head;
            while (runner.next != null) {
                if (runner.value == value) {
                    return runner;
                }
                runner = runner.next;
            }

            return null;
        }
        return null;
    }

    public void removeAt(int idx) {
        if (head != null) {
            if (idx == 0) {
                head = head.next;
            } else {
                Node runner = head;
                int count = 0;
                while (count != idx-1) {
                    runner = runner.next;
                    count++;
                    if (runner == null) {
                        break;
                    }
                }
                if (runner.next.next != null) {
                    runner.next = runner.next.next;
                } else {
                    runner.next = null;
                }

            }

        }
    }

}
