package edu.bsu.cs;

import javafx.application.Application;
import javafx.stage.Stage;

public class ValidationTest extends Application {

    public static void main(String[] args) {
        ValidationTest validationTest = new ValidationTest();
        validationTest.testValidation();
    }

    public void testValidation() {
        // Test valid room dimensions
        double validLength = 10.0;
        double validWidth = 8.0;
        boolean isValid = Validation.isValidRoomDimensions(validLength, validWidth);
        System.out.println("Are dimensions valid? " + isValid);

        // Test invalid room dimensions (negative length)
        double invalidLength = -5.0;
        double width = 8.0;
        isValid = Validation.isValidRoomDimensions(invalidLength, width);
        System.out.println("Are dimensions valid? " + isValid);

        // Test invalid room dimensions (zero width)
        double length = 10.0;
        double invalidWidth = 0.0;
        isValid = Validation.isValidRoomDimensions(length, invalidWidth);
        System.out.println("Are dimensions valid? " + isValid);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}