package part8.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        Tree tree = new Tree();
        tree.insert(50, 1.5);
        tree.insert(25, 1.2);
        tree.insert(75, 1.7);
        tree.insert(12, 1.5);
        tree.insert(37, 1.2);
        tree.insert(43, 1.7);
        tree.insert(30, 1.5);
        tree.insert(33, 1.2);
        tree.insert(87, 1.7);
        tree.insert(93, 1.5);
        tree.insert(97, 1.5);

        while(true) {
            System.out.print("Enter first letter of show, ");
            System.out.print("insert, find, delete or travese: ");
            int choice = getChar();
            switch (choice) {
                case 's':
                    tree.displayTree(); break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = getInt();
                    tree.insert(value, value + 0.9); break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = tree.find(value);

                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    }
            }
        }
    }

    public static String getString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        return Integer.parseInt(getString());
    }
}
