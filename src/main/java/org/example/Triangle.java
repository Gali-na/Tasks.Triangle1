package org.example;

import java.util.Objects;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            System.out.println("Incorrect side A length entered, please try again");
            return;
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            System.out.println("Incorrect side B length entered, please try again");
            return;
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            System.out.println("Incorrect side C length entered, please try again ");
            return;
        }
        this.sideC = sideC;
    }

    public double getSquare() {
        return sideA * sideB * sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, sideA) == 0
                && Double.compare(triangle.sideB, sideB) == 0
                && Double.compare(triangle.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}
