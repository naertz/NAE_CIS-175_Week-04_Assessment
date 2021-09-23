/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 23, 2021
 */

package model;

public class Unsplash implements ImageWebsite {
    // Instance Variable(s) ===============
    private int width;       // Width
    private int height;      // Height
    private String keywords; // Keywords
    // =================================
    
    // Constructor(s) =======================================
    // Default
    public Unsplash() {
        this.width    =    128;
        this.height   =    128;
        this.keywords = "Java";
    }
    
    // Main
    public Unsplash(int width, int height, String keywords) {
        this.width    =      width;
        this.height   =     height;
        this.keywords =   keywords;
    }
    // ======================================================
    
    // Setter(s) =============================
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
    
    // Keywords
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
    // =======================================
    
    // Getter(s) ================
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
    
    // Keywords
    public String getKeywords() {
        return keywords;
    }
    // ==========================
    
    // Method(s) ===============================================================================
    // URL
    @Override
    public String getURL() {
        return "https://source.unsplash.com/" + width + "x" + height + "/?" + keywords;
    }
    
    
    // toString
    @Override
    public String toString() {
        return "Picsum [width=" + width + ", height=" + height + ", keywords=" + keywords + "]";
    }
    // =========================================================================================
}
