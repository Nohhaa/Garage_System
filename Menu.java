package swassig;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Menu singleton = new Menu();

    private Menu() {

    }

    static Menu getSingleton() {
        return singleton;
    }

    public void startGarage() {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter the name of the garage owner\n");
        String name = so.nextLine();
        System.out.print("Enter the phone of the garage owner\n");
        String phone = so.nextLine();
        GarageOwner own = GarageOwner.getSingleton();
        own.setName(name);
        own.setPhone(phone);
        System.out.print("Enter the capacity of the garage\n");
        int c = so.nextInt();
        Garage g1 = Garage.getSingleton();
        ArrayList<VehicleDetails> vec1 = new ArrayList<VehicleDetails>();
        g1.set_garage(c);
        Fees f1 = Fees.getSingleton();
        int choice = 0;
        while (choice != 6) {
            System.out.println("Enter one of these choices: ");
            System.out.println("1-Park in");
            System.out.println("2-Park out");
            System.out.println("3-View garage details");
            System.out.println("4-View total income");
            System.out.println("5-View number of vehicles");
            System.out.println("6-Exit");
            choice = so.nextInt();


            if (choice == 1) {
                VehicleDetails vecD = new VehicleDetails();
                vecD.request_form();

                int slot;
                if (g1.get_config() == 1) {
                    FCFS obj;
                    obj = FCFS.getSingleton();
                    slot = obj.parkin(g1, vecD);
                } else {
                    BestFit obj2 = BestFit.getSingleton();
                    slot = obj2.parkin(g1, vecD);
                }
                if (slot == -1) {
                    System.out.println("Sorry but there is no slot with these dimensions");

                } else {
                    System.out.println("Slot ID is: " + slot);

                }

                vec1.add(vecD);
            }
            if (choice == 2) {
                System.out.println("Please enter the id of the slot:");
                int id = so.nextInt();
                ParkOut po = new ParkOut();
                boolean see = false;
                for (var x : vec1) {

                    if (x.get_unique_id() == id) {
                        po.parkout(x, g1, id);
                        long sum = f1.calculate_fee(x);
                        see = true;
                        System.out.println("Total Vehicle fee equal : " + sum);
                        break;
                    }

                }
                if (!see) {
                    System.out.println("No such id ");
                }
            }
            if (choice == 3) {
                g1.viewgarage();
            }
            if (choice == 4) {
                System.out.println("Total income equal : " + f1.get_total_income());
            }
            if (choice == 5) {
                VehicleDetails vecNo = new VehicleDetails();
                System.out.println("Number of vehicles: " + vecNo.get_num_vehicles());
            }
        }
    }
}

