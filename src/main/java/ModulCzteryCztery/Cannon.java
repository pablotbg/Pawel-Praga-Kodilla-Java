package ModulCzteryCztery;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Cannon {
    boolean loaded = true;

    public Cannon() {

    }

    public Cannon(boolean loaded) {
        this.loaded = loaded;

    }

    @Override
    public boolean equals(Object o) {
        Cannon cannon = (Cannon) o;
        return loaded == cannon.loaded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loaded);
    }

    @Override
    public String toString() {
        return " is loaded: " + loaded;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void fire() {
        if(!loaded) {
            System.out.println("The cannon is not loaded");
        } else {
            System.out.println("Ball is in cannon. Fire");
        }
    }
}

class Application {
    public static void main(String[] args) {
        Cannon cannon = new Cannon(false);
        cannon.fire();
        System.out.println();

        List<Cannon> cannonList = new LinkedList<>();
        Cannon cannon1 = new Cannon();
        Cannon cannon2 = new Cannon();
        Cannon cannon3 = new Cannon();
        Cannon cannon4 = new Cannon();
        Cannon cannon5 = new Cannon();

        cannonList.add(cannon1);
        cannonList.add(cannon2);
        cannonList.add(cannon3);
        cannonList.add(cannon4);
        cannonList.add(cannon5);

        for(int i = 0; i < cannonList.size(); i++) {
            cannonList.get(i).isLoaded();
            cannonList.get(i).fire();
        }
    }
}