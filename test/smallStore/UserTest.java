package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUpAndRunFirst() {
    }

    @AfterEach
    void tearDownAndDestroy() {
    }

    @Test
    void userCanRegisterTest(){
        User newUser = new User();
        newUser.setName("Bisi");
        newUser.setPhone("zeroEightZero");
        newUser.setHomeAddress("312, Herbert Macaulay Way");
        newUser.setEmailAddress("meteouzoma@gmail.com");

        assertEquals(newUser.getName(), "Bisi");
    }


    @Test
    void userCanRegisterInAStoreTest(){
        User newUser = new User();
        newUser.setName("Bisi");
        newUser.setPhone("zeroEightZero");
        newUser.setHomeAddress("312, Herbert Macaulay Way");
        newUser.setEmailAddress("meteouzoma@gmail.com");

        EStore newStore = new EStore();
        newStore.setEStoreName("Amadi's Store");

        newStore.registerUser(newUser);

        assertFalse(newStore.getRegisteredUsers().isEmpty());
        assertTrue(newStore.getRegisteredUsers().contains(newUser));



        User secondUser = new User();
        secondUser.setName("Ojo");
        secondUser.setPhone("zeroEightZero");
        secondUser.setHomeAddress("312, Herbert Macaulay Way");
        secondUser.setEmailAddress("ojo@gmail.com");


        newStore.registerUser(secondUser);
        assertTrue(newStore.getRegisteredUsers().contains(secondUser));



        newStore.getRegisteredUsers().forEach(user-> {
            System.out.println(user.toString());
        });

//        assertEquals(newUser.getName(), "Bisi");
    }
}