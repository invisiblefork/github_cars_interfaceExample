package com.tim.cars.engine;

import com.tim.cars.Car;
import com.tim.cars.engine.impl.EngineAccord;
import com.tim.cars.engine.impl.EngineMustang;
import com.tim.cars.impl.FordMustang;
import com.tim.cars.impl.HondaAccord;

public class EngineFactory {


    /**
     * Create a specific engine for a model of car.
     * @param car
     * @return Car engine
     */
    public static Engine createEngine( Car car ) {

        if ( car instanceof FordMustang ) {
            return new EngineMustang();
        }

        else if ( car instanceof HondaAccord ) {
            return new EngineAccord();
        }

        return null;
    }


}
