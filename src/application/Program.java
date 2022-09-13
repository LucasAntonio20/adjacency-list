package application;

import adjacencyList.AdjacencyList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int vertices = 0;
        int edges = 0;

        Scanner in = new Scanner(System.in);
        AdjacencyList adjacencyList = new AdjacencyList();


        String path = "src\\application\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    vertices = Integer.parseInt(line);
                    adjacencyList = new AdjacencyList(vertices);
                } else if (i == 1) {
                    i++;
                    edges = Integer.parseInt(line);
                } else {
                    String[] s = line.split(" ");
                    adjacencyList.addItem(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(adjacencyList);;
        System.out.println("Ordem: " + vertices);
        System.out.println("Tamanho: " + edges);
        System.out.print("Vertices isolados: ");
        adjacencyList.searchIsolatedVertex();
        System.out.print("Vertices de extremidades: ");
        adjacencyList.searchEndVertex();
        adjacencyList.degreeALlVertex();
    }

}
