package swassig;

import java.time.Instant;
import java.util.Calendar;

public class FCFS implements ParkIn {
    static FCFS singleton = new FCFS();

    private FCFS() {

    }

    static FCFS getSingleton() {
        return singleton;
    }

    public int parkin(Garage obj, VehicleDetails obj2) {
        for (int i = 0; i < obj.capacity; i++) {
            if (obj.s1[i].get_height() >= obj2.v_height && obj.s1[i].get_length() >= obj2.v_length && obj.s1[i].get_width() >= obj2.v_width && !obj.s1[i].get_taken()) {
                obj.s1[i].set_taken(true);
                obj2.set_arrival_time(Instant.now());
                obj2.add_num_vehicles();
                obj2.set_unique_id(obj.s1[i].get_slotID());
                return obj.s1[i].get_slotID();
            }
        }
        return -1;
    }
}

