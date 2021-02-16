package tp1;

import java.util.List;

public class Action {

    public String Label;
    //1: up, 2: right, 3: down, 4: left
    public int direction;

    public Action(String label, int direction) {
        Label = label;
        this.direction = direction;
    }
}
