
package co.edu.unicauca.openmarket.presentation;

import co.edu.unicauca.openmarket.service.ProductService;

/**
 *
 * @author Libardo Pantoja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductService productService = new ProductService();
        GUIProducts instance = new GUIProducts(productService);
        instance.setVisible(true);
    }
    
}
