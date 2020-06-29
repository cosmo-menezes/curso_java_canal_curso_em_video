/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;
import static javafx.scene.input.KeyCode.X;

/**
 *
 * @author Cosmo Menezes
 */
public class ResolucaoDaTela {

    private static Toolkit Toolkittk;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();  
      System.out.println(“A resolução do seu sistema é: ” + d.width +” X ” + d.height);  
       
    }
    
}
