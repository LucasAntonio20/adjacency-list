package adjacencyList;

import java.util.Arrays;
import java.util.LinkedList;

public class AdjacencyList {
    LinkedList[] testList;

    public AdjacencyList(){};
    public AdjacencyList(int size){
        testList = new LinkedList[size];
        for (int i = 0; i < testList.length; i++) {
            testList[i] = new LinkedList<>();
            testList[i].add(i);
        }
    }

    public void degreeALlVertex(){
        for (LinkedList list : testList) {
            System.out.println("[" + list.getFirst() + "]: " + (list.size() - 1));
        }
    }

    public void searchEndVertex(){
        for (LinkedList list : testList) {
            if ((list.size() - 1) == 1) System.out.print(list.getFirst() + " ");
        }
        System.out.println();
    }

    public void searchIsolatedVertex() {
        for (LinkedList list : testList) {
            if ((list.size() - 1) == 0) System.out.print(list.getFirst() + " ");
        }
        System.out.println();
    }

    public void addItem(int index, int value){
        for (LinkedList list : testList) {
            if (list.getFirst().equals(index)) {
                list.add(value);
                testList[value].add(index);
            }
        }
    }

    @Override
    public String toString() {
        for (LinkedList list : testList) {
            System.out.print("[" + list.getFirst() + "]" + " -> ");
            printLinkedList(list);
            System.out.println();
        }
        return "";
    }

    private void printLinkedList(LinkedList list){
        for (int i = 1; i < list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
        }
    }
}
