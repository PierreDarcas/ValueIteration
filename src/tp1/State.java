package tp1;

public class State {

    public String label;
    public Boolean murH;
    public Boolean murD;
    public Boolean murB;
    public Boolean murG;

    public State() {
    }

    public State(String label, Boolean murH, Boolean murD, Boolean murB, Boolean murG) {
        this.label = label;
        this.murH = murH;
        this.murD = murD;
        this.murB = murB;
        this.murG = murG;
    }

    public Boolean getMurH() {
        return murH;
    }

    public void setMurH(Boolean murH) {
        this.murH = murH;
    }

    public Boolean getMurD() {
        return murD;
    }

    public void setMurD(Boolean murD) {
        this.murD = murD;
    }

    public Boolean getMurB() {
        return murB;
    }

    public void setMurB(Boolean murB) {
        this.murB = murB;
    }

    public Boolean getMurG() {
        return murG;
    }

    public void setMurG(Boolean murG) {
        this.murG = murG;
    }
}
