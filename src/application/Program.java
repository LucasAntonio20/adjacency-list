package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int vertice = 0;
        int aresta = 0;

        Scanner in = new Scanner(System.in);

        String path = "src\\application\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    vertice = Integer.parseInt(line);
                } else if (i == 1) {
                    i++;
                    aresta = Integer.parseInt(line);
                }

                //System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ordem: " + vertice);
        System.out.println("Tamanho: " + aresta);
    }

}
