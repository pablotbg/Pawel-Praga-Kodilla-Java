package ModulCzteryPiec;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Application {
    public static void main (String[] args) {
        class Clock {
            String clock;
            LocalTime time;

            public Clock() {
                //this.time = this.time.plusMinutes(1);
            }

            public Clock(String clock, int hour, int minute) {
                this.clock = clock;
                this.time = LocalTime.of(hour, minute).plusMinutes(1);
            }

            @Override
            public boolean equals(Object o) {
                Clock clocks = (Clock) o;
                return Objects.equals(clock, clocks.clock) &&
                        Objects.equals(time.getHour(), clocks.getTime().getHour()) &&
                        Objects.equals(time.getMinute(), clocks.getTime().getMinute());
            }

            @Override
            public int hashCode() {
                return time.getHour() + time.getMinute();
            }

            @Override
            public String toString() {
                return "Now in my " + clock + " time is: " + time;
            }

            public String getClock() {
                return clock;
            }

            public LocalTime getTime() {
                return time;
            }
        }

        Clock clock1 = new Clock("Timex", 12, 15);
        Clock clock2 = new Clock("Timex", 13, 29);
        Clock clock3 = new Clock("Timex", 7, 53);
        Clock clock4 = new Clock("Timex", 21, 19);
        Clock clock5 = new Clock("Timex", 3, 3);

        List<Clock> clockList = new LinkedList<>();
        clockList.add(clock1);
        clockList.add(clock2);
        clockList.add(clock3);
        clockList.add(clock4);
        clockList.add(clock5);

        for(int i = 0; i < clockList.size(); i++) {
            System.out.println(clockList.get(i));
        }
    }
}
