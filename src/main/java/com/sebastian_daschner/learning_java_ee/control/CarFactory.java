package com.sebastian_daschner.learning_java_ee.control;

import com.sebastian_daschner.learning_java_ee.entity.Car;
import com.sebastian_daschner.learning_java_ee.entity.Color;
import com.sebastian_daschner.learning_java_ee.entity.Specification;

import javax.inject.Inject;
import java.util.UUID;

public class CarFactory {

    @Inject
//    @Named("diesel")
    @Diesel
    Color defaultColor;

    public Car createCar(Specification specification) {
        Car car = new Car();
        car.setIdentifier(UUID.randomUUID().toString());
        car.setColor(specification.getColor() == null ? defaultColor : specification.getColor());
        car.setEngineType(specification.getEngineType());
        return car;
    }
}