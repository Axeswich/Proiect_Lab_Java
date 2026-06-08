package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;

public class Main {
    static void main() throws FileNotFoundException {
        File fiser = new File("judete.txt");
        Scanner scan = new Scanner(fiser);
        List<Judet> judete = new ArrayList<>();
        int i=0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] split = line.split(" ");
            judete.get(i).ISO = split[0];
            judete.get(i).judet = split[1];
            judete.get(i).Regiunea = split[2];
            judete.get(i).nrLocuitori = split[3];
            judete.get(i).suprafata = split[4];
            i++;
            }
            judete.sort(Comparator.comparing(judete.nrLocuitori));
            File out = new File("output.txt");

        }



        }

    }
