public class Computer {

    public final static int PARAM = 1;

    private String ComputerName;
    private int ComputerId;

    public Computer() {
    }

    public Computer(String computerName, int computerId) {
        ComputerName = computerName;
        ComputerId = computerId;
    }

    public String getComputerName() {
        return ComputerName;
    }

    public void setComputerName(String computerName) {
        ComputerName = computerName;
    }

    public int getComputerId() {
        return ComputerId;
    }

    public void setComputerId(int computerId) {
        ComputerId = computerId;
    }

    class PowerSupply {
        public final static int PowerSupplyUnit = 850;
        private String color;

        public PowerSupply() {
        }

        public PowerSupply(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
