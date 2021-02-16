package tp1;

import java.util.List;

public class Actions {

    public String Label;
    //1: up, 2: right, 3: down, 4: left
    public int direction;

    public Actions(String label, int direction) {
        Label = label;
        this.direction = direction;
    }
}
