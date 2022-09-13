package adjacencyList;

import java.util.LinkedList;

public class AdjacencyList {
    private LinkedList<Integer>[] adjList;

    public AdjacencyList(){};
    public AdjacencyList(int size){
        adjList = new LinkedList[size];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>();
            adjList[i].add(i);
        }
    }

    public void degreeALlVertex(){
        for (LinkedList list : adjList) {
            System.out.println("[" + list.getFirst() + "]: " + (list.size() - 1));
        }
    }

    public void searchEndVertex(){
        for (LinkedList list : adjList) {
            if ((list.size() - 1) == 1) System.out.print(list.getFirst() + " ");
        }
        System.out.println();
    }

    public void searchIsolatedVertex() {
        for (LinkedList list : adjList) {
            if ((list.size() - 1) == 0) System.out.print(list.getFirst() + " ");
        }
        System.out.println();
    }

    public void addEdge(int index, int value){
        for (LinkedList list : adjList) {
            if (list.getFirst().equals(index)) {
                list.add(value);
                adjList[value].add(index);
            }
        }
    }

    @Override
    public String toString() {
        for (LinkedList list : adjList) {
            System.out.print("[" + list.getFirst() + "]" + " -> ");
            printLinkedList(list);
        }
        return "";
    }

    private void printLinkedList(LinkedList list){
        for (int i = 1; i < list.size(); i++) {
            if (i == list.size()-1) System.out.println(list.get(i));
            else System.out.print(list.get(i)+" -> ");
        }
    }
}
