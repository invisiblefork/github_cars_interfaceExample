package com.tim.cars.engine.impl;

import com.tim.cars.engine.Engine;

public class EngineAccord implements Engine {


    @Override
    public String getEngineSpecs() {

        return "Earth Dreams 3.7L V6 --" +
                "\n\t278hp";
    }

}
