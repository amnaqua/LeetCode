package main.java.org.example.Algorithms.Easy.Solved;

public class DefangingAnIPAddress {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
