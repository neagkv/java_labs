package part_05.architect;

public class Art {

    String name;
    boolean hangable;

    public Art(String name, boolean hangable) {
        this.name = name;
        this.hangable = hangable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHangable() {
        return hangable;
    }

    public void setHangable(boolean hangable) {
        this.hangable = hangable;
    }
}
