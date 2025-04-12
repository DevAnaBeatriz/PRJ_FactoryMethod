/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import buttons.Button;
import buttons.HtmlButton;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class HtmlDialog extends Dialog {

    @Override//Aqui fica o produto concreto do html
    public Button createButton() {
        return new HtmlButton();
    }
}