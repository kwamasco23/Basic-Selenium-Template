package Utilities;

import Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void Before()
    {
       // Driver.get().manage().window().maximize();
    }

    @After
    public void After()
    {
        Driver.closeDriver();
    }

}
