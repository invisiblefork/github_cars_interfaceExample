package com.tim.cars;

import com.tim.cars.impl.FordMustang;
import com.tim.cars.impl.HondaAccord;
import org.junit.Assert;
import org.junit.Test;

public class CarTest {


    /**
     * Create a Honda Accord and test its basic functionality.
     */
    @Test
    public void makeAccord() {

        Car car = new HondaAccord();

        Assert.assertTrue( "Wrong engine start sound.", car.startEngine().equals("zzzzzzzzzz") );
        Assert.assertTrue( "Wrong drive sound.", car.drive().equals("bzzzzzzz") );
        Assert.assertTrue( "Wrong engine specs.", car.getEngineSpecs().contains("Earth Dreams") );
        Assert.assertTrue( "Wrong race sound.", car.race().equals("RRAAAAAAAAAAA") );

        Assert.assertTrue ( "Error: No attention to detail", ((HondaAccord)car).hasAttentionToDetail() );

    }


    /**
     * Create a Ford Mustang and test its basic functionality.
     */
    @Test
    public void makeMustang() {

        Car car = new FordMustang();

        Assert.assertTrue( "Wrong engine start sound.", car.startEngine().equals("gurgle gurgle") );
        Assert.assertTrue( "Wrong drive sound.", car.drive().equals("grrrrrrrrr") );
        Assert.assertTrue( "Wrong engine specs.", car.getEngineSpecs().contains("Coyote") );
        Assert.assertTrue( "Wrong race sound.", car.race().equals("GGGRRRRRRRRRRa") );

        Assert.assertTrue ( "Error: We put the console in the correct location.",((FordMustang)car).hasCenterConsoleInTheWrongLocation() );
    }


}
