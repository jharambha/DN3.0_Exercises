package product;

public class Computer {
    private final String CPU;
    private final String RAM;
    private final String Storage;
    private final boolean hasGraphicsCard;
    private final boolean hasWiFi;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWiFi = builder.hasWiFi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Storage='" + Storage + '\'' +
                ", hasGraphicsCard=" + hasGraphicsCard +
                ", hasWiFi=" + hasWiFi +
                '}';
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;
        private String Storage = "256GB SSD";
        private boolean hasGraphicsCard = false;
        private boolean hasWiFi = false;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.Storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
