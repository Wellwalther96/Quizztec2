/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.antonioalves.quiz;

/**
 *
 * @author 07158
 */
public class util {
    public static void main(String[] args) {
        System.out.println("Diretorio atual"+System.getProperty("user.dir"));
        String frase = "Eu adoro programar em java";
        String[] partes = frase.split(";");
        System.out.println(partes[2]);
    }
}
