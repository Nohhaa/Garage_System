package swassig;

import java.time.Instant;
import java.util.Calendar;
import java.util.Scanner;

public class VehicleDetails {
    int model_name;
    String model_year;
    int unique_id = 0;
    int v_width;
    int v_length;
    int v_height;
    private Instant arrival_time;
    private Instant departure_time;

    private static int num_vehicle = 0;
    private VehicleType obj;


    public VehicleDetails(VehicleType obj) {
        this.obj = obj;
    }

    public VehicleDetails() {

    }


    public void request_form() {
        System.out.println("Please fill this form");
        System.out.println("Enter the number of vehicle's model from these options: \n1.Car 2.Bike 3.Motorbike 4.Truck 5.Limousine\n");
        Scanner input1 = new Scanner(System.in);
        this.model_name = input1.nextInt();
        System.out.println("Vehicle's model year: ");
        Scanner input2 = new Scanner(System.in);
        this.model_year = input2.nextLine();
        System.out.println("Vehicle's height: ");
        Scanner input6 = new Scanner(System.in);
        this.v_height = input6.nextInt();
        System.out.println("Vehicle's length: ");
        Scanner input5 = new Scanner(System.in);
        this.v_length = input5.nextInt();
        System.out.println("Vehicle's width: ");
        Scanner input4 = new Scanner(System.in);
        this.v_width = input4.nextInt();

    }


    public void set_arrival_time(Instant arr) {
        arrival_time = arr;
      /* arr_h=arr1;
       arr_m=arr2;
       arr_s=arr3;*/
    }

    public void set_departure_time(Instant dep) {
        departure_time = dep;
    }

    public void set_unique_id(int id) {
        unique_id = id;
    }

    public int get_unique_id() {
        return unique_id;
    }

    public void add_num_vehicles() {
        ++num_vehicle;
    }

    public void sub_num_vehicles() {
        --num_vehicle;
    }

    public int get_num_vehicles() {
        return num_vehicle;
    }

    public Instant get_arrival_time() {
        return arrival_time;
    }

    public Instant get_departure_time() {
        return departure_time;
    }
}


