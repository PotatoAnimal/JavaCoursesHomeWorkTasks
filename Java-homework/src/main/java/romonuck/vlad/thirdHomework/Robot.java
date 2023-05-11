package romonuck.vlad.thirdHomework;

/*
Завдання 4
Створити клас Robot. Задати йому стан з декількох полів, наприклад:
рівень заряду, активний, сон, вимкнений… Створити декілька методів для
визначення поведінки об’єкту. Протестувати власну розробку.
 */
public class Robot {
    private int battery;
    private boolean isActive;
    private boolean isSleep;
    private boolean isOff;
    private String name;

    public String myParameters() {
        String ans = "";
        if (getName() != null && getBattery() >= 1) {
            ans = ans + "My name is: " + name + ". % battery is " + battery + ". ";
        }
        if (battery >= 70 && isActive) {
            ans = ans + "I`m totally ok, let`s find friend to me)";
        }
        if (battery >= 40 && battery <= 70 && isActive) {
            ans = ans + "zzzzz. I`m sleeppinnn.... zzzz";
        }
        if (battery < 40 && isOff) {
            ans = ans + "shi** I`m gonna be dead. HELP! They trying to off me! I`m OFFFF....";
        }
        return ans;
    }

    public Robot() {
    }

    public Robot(int battery, boolean isActive, boolean isSleep, boolean isOff, String name) {
        this.battery = battery;
        this.isActive = isActive;
        this.isSleep = isSleep;
        this.isOff = isOff;
        this.name = name;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSleep() {
        return isSleep;
    }

    public void setSleep(boolean sleep) {
        isSleep = sleep;
    }

    public boolean isOff() {
        return isOff;
    }

    public void setOff(boolean off) {
        isOff = off;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "battery=" + battery +
                ", isActive=" + isActive +
                ", isSleep=" + isSleep +
                ", isOff=" + isOff +
                ", name='" + name + '\'' +
                '}';
    }
}
