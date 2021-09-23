/**
 * @author NAE (Noah Ertz) - naertz
 * CIS-175 - Fall 2021
 * Sep 23, 2021
 */

package model;

public interface ImageWebsite {    
    // Setter(s) =====================
    // Width
    public void setWidth(int width);
    
    // Height
    public void setHeight(int height);
    // ===============================
    
    // Getter(s) ==========
    // Width
    public int getWidth();
    
    // Height
    public int getHeight();
    // ====================
    
    // Method(s) ============
    // URL
    public String getURL();
    
    // toString
    @Override
    public String toString();
    // ======================
}
