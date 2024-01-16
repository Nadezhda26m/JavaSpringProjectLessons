package ru.myproj.les1FirstSpringProject.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component
@Service
public class Car {

    // 3
    @Autowired // (или перед конструктором)
    private Engine engine;

    public void start() {
        engine.go();
    }

    // 1
    // public Car(Engine engine) {
    //     this.engine = engine;
    //     engine.go();
    // }

    // 2
    // public Car() {
    // }
    //
    // public void setEngine(Engine engine) {
    //     this.engine = engine;
    //     engine.go();
    // }
}
