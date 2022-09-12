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

    public void searchEndVertex(){
        for (int i = 0; i < testList.length; i++) {
            if (testList[i].size() == 1) System.out.print(testList[i]);
        }
    }
    public void addItem(int index, int value){
        for (int i = 0; i < testList.length; i++) {
            if (testList[i].getFirst().equals(index)) {
                testList[i].add(value);
            }
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < testList.length; i++) {
            System.out.print("[" + testList[i].getFirst() + "]" + " -> ");
            printLinkedList(testList[i]);
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
