public class Computer {

    private String motherboard;

    private int ram;

    private int hdd;

    private String cpu;

    private int monitor;

    public Computer() {
    }

    public Computer(String motherboard, int ram, int hdd, String cpu, int monitor) {
        this.motherboard = motherboard;
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.monitor = monitor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    public void start() {
        System.out.println("PC turn ON");
    }

    public void switchOff() {
        System.out.println("PC switch OFF");
    }

    class PowerSupply {
        private int powerSupply;

        public PowerSupply() {
        }

        public PowerSupply(int powerSupply) {
            this.powerSupply = powerSupply;
        }

        public int getPowerSupply() {
            return powerSupply;
        }

        public void setPowerSupply(int powerSupply) {
            this.powerSupply = powerSupply;
        }
    }
}
