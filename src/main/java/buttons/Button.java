package buttons;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 * 
 * A interface Button representa o
 * produto abstrato no padrão Factory Method. 
 * Ela define as operações que todos os produtos 
 * concretos (botões) devem implementar.
 */

public interface Button {
    void render();
    void onClick();
}
