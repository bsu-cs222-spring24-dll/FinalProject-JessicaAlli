package edu.bsu.cs;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class FurnitureImageLoader {
    private Map<String, ImageIcon> furnitureImages;

    public FurnitureImageLoader() {
        furnitureImages = new HashMap<>();
        loadFurnitureImages();
    }

    void loadFurnitureImages() {
        // Load images for each furniture type and store in the map
        try {
            furnitureImages.put("Bed", new ImageIcon("src/main/ObjectImages/Bed.png"));
            furnitureImages.put("Dresser", new ImageIcon("src/main/ObjectImages/dresser.png"));
            furnitureImages.put("Nightstand", new ImageIcon("src/main/ObjectImages/nightstand.png"));
            furnitureImages.put("Chair", new ImageIcon("src/main/ObjectImages/chair.png"));
            // Add more furniture types at a later date, possibly for release v0.3.0
        } catch (Exception e) {
            System.err.println("Error loading furniture images: " + e.getMessage());

        }
    }

    public ImageIcon getFurnitureImage(String furnitureName) {
        return furnitureImages.get(furnitureName);
    }
}