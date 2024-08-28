package swassig;

import java.time.Duration;

public class Fees {
    private long fees = 0;
    private static int total_fees = 0;
    static Fees singleton = new Fees();

    private Fees() {

    }

    static Fees getSingleton() {
        return singleton;
    }

    public long calculate_fee(VehicleDetails obj) {
        Duration time = Duration.between(obj.get_arrival_time(), obj.get_departure_time());
        long Minutes = time.toMinutes();
        if (Minutes % 60 != 0) {
            Minutes = Minutes / 60 + 1;
        } else {
            Minutes = Minutes / 60;
        }
        if (Minutes == 0) {
            fees = 5;
        } else {
            fees = Minutes * 5;
        }

        total_fees += fees;
        return fees;
    }

    public int get_total_income() {
        return total_fees;
    }
}