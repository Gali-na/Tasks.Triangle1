package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getSideA_Should_ReturnSideA_When_TriangleHasSizeA() {
        Triangle triangletest = new Triangle();
        triangletest.setSideA(5);
        assertEquals(5, triangletest.getSideA());
    }

    @Test
    void getSideA_Should_ReturnZero_When_TriangleHasNotSizeA() {
        Triangle triangletest = new Triangle();
        assertEquals(0, triangletest.getSideA());
    }

    @Test
    void setSideA_Should_ReturnWarning_When_Argument_Less_Than_Zero() {
        String cousoleOutputStream = "";
        String result = "Incorrect side A length entered, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Triangle triangletest = new Triangle();
            triangletest.setSideA(-5);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setSideA_Should_ReturnWarning_When_Argument_Zero() {
        String cousoleOutputStream = "";
        String result = "Incorrect side A length entered, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Triangle triangletest = new Triangle();
            triangletest.setSideA(0);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setSideA_Should_Аccepts0_When_Argument_Less_Than_Zero() {
        Triangle triangletest = new Triangle();
        triangletest.setSideA(-1);
        assertEquals(0, triangletest.getSideA());
    }

    @Test
    void setSideA_Should_Аccepts0_When_Argument_Zero() {
        Triangle triangletest = new Triangle();
        triangletest.setSideA(0);
        assertEquals(0, triangletest.getSideA());
    }

    @Test
    void getSideB_Should_ReturnSideB_When_TriangleHasSizeB() {
        Triangle triangletest = new Triangle();
        triangletest.setSideB(5);
        assertEquals(5, triangletest.getSideB());
    }

    @Test
    void getSideB_Should_ReturnZero_When_TriangleHasNotSizeB() {
        Triangle triangletest = new Triangle();
        assertEquals(0, triangletest.getSideB());
    }

    @Test
    void setSideB_Should_ReturnWarning_When_Argument_Less_Than_Zero() {
        String cousoleOutputStream = "";
        String result = "Incorrect side B length entered, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Triangle triangletest = new Triangle();
            triangletest.setSideB(-5);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setSideB_Should_ReturnWarning_When_Argument_Zero() {
        String cousoleOutputStream = "";
        String result = "Incorrect side B length entered, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Triangle triangletest = new Triangle();
            triangletest.setSideB(0);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setSideB_Should_Аccepts0_When_Argument_Less_Than_Zero() {
        Triangle triangletest = new Triangle();
        triangletest.setSideA(-1);
        assertEquals(0, triangletest.getSideB());
    }

    @Test
    void setSideB_Should_Аccepts0_When_Argument_Zero() {
        Triangle triangletest = new Triangle();
        triangletest.setSideB(0);
        assertEquals(0, triangletest.getSideB());
    }

    @Test
    void getSideC_Should_ReturnSideC_When_TriangleHasSizeC() {
        Triangle triangletest = new Triangle();
        triangletest.setSideC(5);
        assertEquals(5, triangletest.getSideC());
    }

    @Test
    void getSideC_Should_ReturnZero_When_TriangleHasNotSizeC() {
        Triangle triangletest = new Triangle();
        assertEquals(0, triangletest.getSideC());
    }


    @Test
    void setSideC_Should_ReturnWarning_When_Argument_Less_Than_Zero() {
        String cousoleOutputStream = "";
        String result = "Incorrect side C length entered, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Triangle triangletest = new Triangle();
            triangletest.setSideC(-5);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setSideC_Should_ReturnWarning_When_Argument_Zero() {
        String cousoleOutputStream = "";
        String result = "Incorrect side C length entered, please try again\r\n";

        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(200);
            PrintStream capture = new PrintStream(outputStream);
            System.setOut(capture);
            Triangle triangletest = new Triangle();
            triangletest.setSideC(0);
            capture.flush();
            cousoleOutputStream = outputStream.toString();
            PrintStream originalOut = System.out;
            System.setOut(originalOut);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(result, cousoleOutputStream);
    }

    @Test
    void setSideC_Should_Аccepts0_When_Argument_Less_Than_Zero() {
        Triangle triangletest = new Triangle();
        triangletest.setSideC(-1);
        assertEquals(0, triangletest.getSideC());
    }

    @Test
    void setSideC_Should_АcceptsArgument_When_Argument_Positive() {
        Triangle triangletest = new Triangle();
        triangletest.setSideC(5);
        assertEquals(0, triangletest.getSideC());
    }

    @Test
    void getSquare() {
        Triangle triangle = new Triangle();
        triangle.setSideA(5);
        triangle.setSideB(5);
        triangle.setSideC(5);
        assertEquals(125,triangle.getSquare());
    }
}