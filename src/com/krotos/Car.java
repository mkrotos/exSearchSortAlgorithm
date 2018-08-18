package com.krotos;

import java.time.LocalDate;

public class Car {
    String name;
    LocalDate productionDate;
    Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", productionDate=" + productionDate +
                ", engine=" + engine +
                '}';
    }

    public Car(String name, LocalDate productionDate, int horsePower, int maxSpeed) {
        this.name = name;
        this.productionDate = productionDate;
        engine=new Engine(horsePower,maxSpeed);
    }

     class Engine {
        private int horsePower;
        private int maxSpeed;

        public int getHorsePower() {
            return horsePower;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public Engine() {
        }

        public Engine(int horsePower, int maxSpeed) {
            this.horsePower = horsePower;
            this.maxSpeed = maxSpeed;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    ", maxSpeed=" + maxSpeed +
                    '}';
        }
    }
}
