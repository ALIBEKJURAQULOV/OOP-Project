package exersize9;

public class Configuration {
    private int ram;
    private int rom;
    private String cpu;
    private double display;
    private String registor;

    @Override
    public String toString() {
        return "Configuration{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", cpu='" + cpu + '\'' +
                ", display=" + display +
                ", registor='" + registor + '\'' +
                '}';
    }

    public Configuration(int ram, int rom, String cpu, double display, String registor) {
        this.ram = ram;
        this.rom = rom;
        this.cpu = cpu;
        this.display = display;
        this.registor = registor;
    }

    public Configuration(){

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public String getRegistor() {
        return registor;
    }

    public void setRegistor(String registor) {
        this.registor = registor;
    }
}

