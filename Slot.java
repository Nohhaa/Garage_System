package swassig;

public class Slot {
    private int length;
    private int width;
    private int height;
    private int slotID;
    private boolean taken = false;

    public void set_taken(boolean t) {
        taken = t;
    }

    public boolean get_taken() {
        return taken;
    }

    public Slot(int l, int w, int h, int id) {
        this.length = l;
        this.width = w;
        this.height = h;
        this.slotID = id;

    }

    public Slot() {
    }

    public int get_length() {
        return length;
    }

    public int get_width() {
        return width;
    }

    public int get_height() {
        return height;
    }

    public int get_slotID() {
        return slotID;
    }
}