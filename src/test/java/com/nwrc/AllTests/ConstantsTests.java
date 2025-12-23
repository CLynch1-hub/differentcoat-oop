package com.nwrc.AllTests;

import com.nwrc.DataAccess.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConstantsTests {

    @Test // check coverage returned - Test 5.1
    public void checkCoverageValue() {
        Assert.assertEquals(Constants.COVERAGE, 350);
    }

    @Test // check litres returned - Test 5.2
    public void checkLitresValue() {
        Assert.assertEquals(Constants.LITRES, 4.54);
    }

    @Test // check Door returned - Test 5.3
    public void checkDoorValue() {
        Assert.assertEquals(Constants.DOOR, 20);
    }

    @Test // check Window returned - Test 5.4
    public void checkWindowValue() {
        Assert.assertEquals(Constants.WINDOW, 25);
    }

}
