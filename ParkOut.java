package swassig;

import java.time.Instant;
import java.util.Calendar;

public class ParkOut {
    public void parkout(VehicleDetails obj, Garage obj2, int s) {
        int c = 0;
        for (int i = 0; i < obj2.capacity; i++) {
            c++;
            if (s == obj2.s1[i].get_slotID()) {
                obj2.s1[i].set_taken(false);
                obj.sub_num_vehicles();
                obj.set_departure_time(Instant.now());
                obj.set_unique_id(0);
                System.out.print("Parked out successfully ");
                break;
            } else if (c == obj2.capacity) {
                System.out.print("Could not find the slot id");
            }
        }

    }

}
