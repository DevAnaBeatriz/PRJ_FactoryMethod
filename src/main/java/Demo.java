
import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
// Classe principal que simula a execução de uma aplicação baseada no padrão Factory Method
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure(); // Aqui escolhemos qual fábrica concreta será usada (Windows ou HTML)
        runBusinessLogic(); // Executamos a lógica principal da aplicação
    }

    /**
     * O método configure() decide qual classe concreta será instanciada com base no sistema operacional.
     * Essa é a ideia central do Factory Method: delegar a criação dos objetos para subclasses específicas.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog(); // Fábrica concreta para Windows
        } else {
            dialog = new HtmlDialog(); // Fábrica concreta para HTML
        }
    }

    /**
     * Toda a lógica do cliente interage apenas com a interface abstrata 'Dialog', e não com implementações concretas.
     * Isso garante baixo acoplamento e maior flexibilidade para trocar implementações.
     */
    static void runBusinessLogic() {
        dialog.renderWindow(); // O botão é criado e renderizado sem o cliente saber sua implementação exata
    }
}

