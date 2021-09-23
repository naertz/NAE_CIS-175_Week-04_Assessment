/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 23, 2021
 */

package model;

public class Picsum implements ImageWebsite {
    // Instance Variable(s) ========
    private int width;     // Width
    private int height;    // Height
    private String seed;   // Seed
    // =============================
    
    // Constructor(s) =================================
    // Default
    public Picsum() {
        this.width  =    128;
        this.height =    128;
        this.seed   = "Java";
    }
    
    // Main
    public Picsum(int width, int height, String seed) {
        this.width  =  width;
        this.height = height;
        this.seed   =   seed;
    }
    // ================================================
    
    // Setter(s) ======================
    // Width
    @Override
    public void setWidth(int width) {
        this.width = width;
    }
    
    // Height
    @Override
    public void setHeight(int height) {
        this.height = height;
    }
    
    // Seed
    public void setSeed(String seed) {
        this.seed = seed;
    }
    // ================================
    
    // Getter(s) ============
    // Width
    @Override
    public int getWidth() {
        return width;
    }
    
    // Height
    @Override
    public int getHeight() {
        return height;
    }
    
    // Seed
    public String getSeed() {
        return seed;
    }
    // ======================
    
    // Method(s) =======================================================================
    // URL
    @Override
    public String getURL() {
        return "https://picsum.photos/seed/" + seed + "/" + width + "/" + height;
    }
    
    // toString
    @Override
    public String toString() {
        return "Picsum [width=" + width + ", height=" + height + ", seed=" + seed + "]";
    }
    // =================================================================================
}
