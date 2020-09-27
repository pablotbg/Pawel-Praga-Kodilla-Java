package ModulCzteryPiec;

import java.util.LinkedList;
import java.util.List;

class Application {
    public static void main (String[] args) {
        class Clock {
            public Clock() {
            }
        }

        Clock clock1 = new Clock();
        Clock clock2 = new Clock();
        Clock clock3 = new Clock();
        Clock clock4 = new Clock();
        Clock clock5 = new Clock();

        List<Clock> clockList = new LinkedList<>();
        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);
        clockList.add(clock5);

    }
}
