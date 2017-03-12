package com.galvanize;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Business implements Addressable {

    private final String name;
    private final ArrayList<Address> addresses = new ArrayList<Address>();

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses(){
        return addresses
                .stream()
                .map(address -> address)
                .collect(Collectors.toList());
    }

    public void addAddress(Address address){

        addresses.add(address);

    }


}
