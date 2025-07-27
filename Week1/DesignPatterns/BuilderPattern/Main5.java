public class Main5
{
    public static void main(String[] args)
    {
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB").build();
        basicComputer.displayConfig();
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setWiFi(true)
                .setBluetooth(true)
                .build();
        gamingPC.displayConfig();
        Computer businessLaptop = new Computer.Builder("Intel i5", "16GB")
                .setStorage("512GB SSD")
                .setWiFi(true)
                .build();
        businessLaptop.displayConfig();
    }
}
