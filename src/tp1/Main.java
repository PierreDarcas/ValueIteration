package tp1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MDP mdp = new MDP();
        State s0 = new State("s0",1,1,0,1);
        State s1 = new State("s1",0,0,1,1);
        State s2 = new State("s2",0,1,1,0);
        State s3 = new State("s3",1,1,0,1);
        List<State> states = new ArrayList<State>();
        states.add(s0);
        states.add(s1);
        states.add(s2);
        states.add(s3);
        Action up = new Action("up",1);
        Action right = new Action("right",2);
        Action down = new Action("down",3);
        Action left = new Action("left",4);
        List<Action> actions = new ArrayList<Action>();
        actions.add(up);
        actions.add(right);
        actions.add(down);
        actions.add(left);
        mdp.etats=states;
        mdp.actions=actions;



    }
}
