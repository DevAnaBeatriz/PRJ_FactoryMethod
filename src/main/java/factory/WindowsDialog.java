/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 *
 * @author FATEC ZONA LESTE
 */

/*
Essas duas classes são Concrete Creators, e são responsáveis por
instanciar diferentes tipos de botões (produtos concretos).
A vantagem é que podemos facilmente estender esse código
para suportar novos tipos de botões (por exemplo, MacButton) 
sem modificar o código do cliente (classe Demo), respeitando 
o princípio Open/Closed.
*/
public class WindowsDialog extends Dialog {

    @Override//Aqui fica o produto concreto do Windows
    public Button createButton() {
        return new WindowsButton();
    }
}
