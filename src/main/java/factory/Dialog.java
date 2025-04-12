/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import buttons.Button;


/**
 *
 * @author FATEC ZONA LESTE
 */

/**
 * Classe abstrata que define o método fábrica abstrato: createButton().
 * 
 * Essa classe representa o "Creator" no padrão Factory Method. Ela possui uma implementação genérica
 * do método renderWindow(), mas delega a criação do objeto Button para suas subclasses.
 */
public abstract class Dialog {

    public void renderWindow() {
        // Método de uso genérico que chama o método fábrica para criar o botão.
        // Isso demonstra a inversão de controle na criação de objetos.
        Button okButton = createButton();
        okButton.render();
    }

    // Método fábrica abstrato que será implementado pelas subclasses concretas
    public abstract Button createButton();
}

