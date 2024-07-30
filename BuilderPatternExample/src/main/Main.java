package main;

import product.Computer;

public class Main {
    public static void main(String[] args) {
       
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        
        Computer advancedComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setWiFi(true)
                .build();
        System.out.println("Advanced Computer: " + advancedComputer);
    }
}
