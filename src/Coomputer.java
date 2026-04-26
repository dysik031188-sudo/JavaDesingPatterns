class Computer {
    private final String cpu;
    private final String ram;
    private final boolean isGraphicsCardEnabled;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private boolean isGraphicsCardEnabled;

        public Builder setCpu(String cpu) { this.cpu = cpu; return this; }
        public Builder setRam(String ram) { this.ram = ram; return this; }
        public Builder setGPU(boolean isEnabled) { this.isGraphicsCardEnabled = isEnabled; return this; }
        public Computer build() { return new Computer(this); }
    }
}