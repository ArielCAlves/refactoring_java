package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testAddAddress() {
        User user = new User("Luffy", "luffy@onepiece.com");
        Address address = new Address("Sunny Street", "East Blue", "00000-111", AddressType.RESIDENTIAL);

        user.addAddress(address);
        List<Address> addresses = user.getAddresses();

        assertEquals(1, addresses.size());
        assertEquals("Sunny Street", addresses.get(0).getStreet());
        assertEquals(AddressType.RESIDENTIAL, addresses.get(0).getType());
    }

    @Test
    public void testGetNameAndEmail() {
        User user = new User("Zoro", "zoro@onepiece.com");
        assertEquals("Zoro", user.getName());
        assertEquals("zoro@onepiece.com", user.getEmail());
    }
}
