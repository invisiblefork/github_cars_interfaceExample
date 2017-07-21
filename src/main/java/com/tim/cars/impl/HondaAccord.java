package com.tim.cars.impl;

import com.tim.cars.Honda;
import com.tim.cars.engine.Engine;
import com.tim.cars.engine.EngineFactory;

public class HondaAccord implements Honda {


    Engine engine;


    public HondaAccord() {
        engine = EngineFactory.createEngine(this );
    }


    /**
     * Specifies how starting the engine sounds.
     * @return The sound of starting.
     */
    @Override
    public String startEngine() {
        return "zzzzzzzzzz";
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
        return "bzzzzzzz";
    }


    /**
     * Specifies how a race sounds.
     * @return The sound of racing.
     */
    @Override
    public String race() {
        return "RRAAAAAAAAAAA";
    }


    /**
     * Ensure the buttons and controls are at an ergonomically reasonable position.
     * @return true
     */
    @Override
    public Boolean hasAttentionToDetail() {
        return true;
    }


}
