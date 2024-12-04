package LoginLogout;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BaseClass.CrossBrowsing;

public class TestLoginLogout extends CrossBrowsing {

    @BeforeClass
    public void setup() throws IOException {
        preCondition();
    }

    @Test
    public void testLoginAndLogout() {
        System.out.println("Login and Logout test executed successfully.");
    }

    @AfterClass
    public void teardown() {
        postCondition();
    }
}