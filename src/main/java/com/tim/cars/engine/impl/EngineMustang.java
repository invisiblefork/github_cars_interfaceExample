package com.tim.cars.engine.impl;

import com.tim.cars.engine.Engine;

public class EngineMustang implements Engine {


    @Override
    public String getEngineSpecs() {

        return "Coyote 5.0 --\n\t11:1 compression" +
                "\n\t0.472/0.433-inch lift, and duration of 260/263 degrees. " +
                "\n\tThe engine includes a windage tray and an 8-quart oil pan, " +
                "\n\twith a 1-5-4-8-6-3-7-2 firing order. " +
                "\n\t412 hp at 6,500 rpm and 390 lb-ft of torque at 4,250 rpm.";
    }


}
