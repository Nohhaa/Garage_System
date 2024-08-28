package swassig;

import java.time.Instant;
import java.util.Calendar;

public class BestFit implements ParkIn {
    static BestFit singleton = new BestFit();

    private BestFit() {

    }

    static BestFit getSingleton() {
        return singleton;
    }

    public int parkin(Garage obj, VehicleDetails obj2) {
        int pos = 0;
        boolean found = false;
        boolean ent = false;
        for (int i = 0; i < obj.capacity; i++) {

            if (obj.s1[i].get_height() >= obj2.v_height && obj.s1[i].get_length() >= obj2.v_length && obj.s1[i].get_width() >= obj2.v_width && !obj.s1[i].get_taken() && !ent) {
                pos = i;
                obj2.set_arrival_time(Instant.now());
                found = true;
                ent = true;
            }
            if ((ent && obj.s1[i].get_height() <= obj.s1[pos].get_height() && obj.s1[i].get_height() >= obj2.v_height) && (obj.s1[i].get_length() <= obj.s1[pos].get_length() && obj.s1[i].get_length() >= obj2.v_length) && (obj.s1[i].get_width() <= obj.s1[pos].get_width() && obj.s1[i].get_width() >= obj2.v_width) && !obj.s1[i].get_taken()) {
                pos = i;
            }
        }
        if (found) {
            obj2.add_num_vehicles();
            obj.s1[pos].set_taken(true);
            obj2.set_unique_id(obj.s1[pos].get_slotID());
            return obj.s1[pos].get_slotID();
        } else {
            return -1;
        }
    }
}
