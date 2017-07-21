package com.tim.cars.impl;

import com.tim.cars.Ford;
import com.tim.cars.engine.Engine;
import com.tim.cars.engine.EngineFactory;

public class FordMustang implements Ford {


    Engine engine;


    /**
     * Instantiate a Mustang engine.
     */
    public FordMustang() {
        engine = EngineFactory.createEngine(this );
    }


    /**
     * Specifies how starting the engine sounds.
     * @return The sound of starting.
     */
    @Override
    public String startEngine() {
        return "gurgle gurgle";
    }


    /**
     * Detailed engine specifications.
     * @return Short description of specs.
     */
    @Override
    public String getEngineSpecs() {
        return engine.getEngineSpecs();
    }


    /**
     * Specifies how a drive sounds.
     * @return The sound of driving.
     */
    @Override
    public String drive() {
        return "grrrrrrrrr";
    }


    /**
     * Specifies how a race sounds.
     * @return The sound of racing.
     */
    @Override
    public String race() {
        return "GGGRRRRRRRRRRa";
    }


    /**
     * Ensure the center console is not in a position that works well for a stick shift.
     * @return true
     */
    @Override
    public Boolean hasCenterConsoleInTheWrongLocation() {
        return true;
    }


}
