package swassig;

import java.util.*;

public class Garage {
    int capacity;
    int config;
    Slot[] s1;
    static Garage singleton=new Garage();
    private Garage(){

    }
    static Garage getSingleton(){
        return singleton;
    }
    public void display_empty_slots() {
        for (int i = 0; i < capacity; i++) {
            if (!s1[i].get_taken()) {
                System.out.print("the slot  " + s1[i].get_slotID() + "\n");
                System.out.print("the height of the slot " + s1[i].get_height() + "\n");
                System.out.print("the length of the slot " + s1[i].get_length() + "\n");
                System.out.print("the width of the slot " + s1[i].get_width() + "\n");
                System.out.print("-------------------------------------------------\n");
            }
        }

    }

    public void set_garage(int c) {


        capacity = c;
        s1 = new Slot[capacity];
        this.set_config();

        for (int i = 0; i < capacity; i++) {
            // s1[i].set_taken(false);
            int hi = 0, le = 0, wi = 0, id = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the information of slot number " + i + "\n");
            System.out.print("Enter the id of the slot ");
            id = sc.nextInt();
            System.out.print("Enter the height of the slot ");
            hi = sc.nextInt();
            System.out.print("Enter the length of the slot ");
            le = sc.nextInt();
            System.out.print("Enter the width of the slot ");
            wi = sc.nextInt();
            System.out.print("-------------------------------------------------\n");

            s1[i] = new Slot(le, wi, hi, id);

        }

    }

    public void set_config() {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the configuration you want from the following:\n");
        System.out.print("1) first come first served approach\n");
        System.out.print("2) best-fit approach \n");
        ch = sc.nextInt();
        if (ch == 1) {
            config = 1;
        } else if (ch == 2) {
            config = 2;
        } else {
            System.out.println("Invalid option");
        }

    }

    public int get_config() {
        return config;
    }

    public void viewgarage() {
        System.out.println("Choose one option from these options:\n1-View capacity \n2-View empty slots\n");
        Scanner so = new Scanner(System.in);
        int c = so.nextInt();
        if (c == 1) {
            System.out.println("\nCapacity equal: " + capacity);
        } else if (c == 2) {
            System.out.println("\nEmpty slots:\n");
            display_empty_slots();
        } else {
            System.out.println("Invalid option");
        }

    }

}