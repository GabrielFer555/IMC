/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraimc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Pichau
 */
public class Calcularimc {
    private double altura;
    private int peso;
    private String imc;
    private static final DecimalFormat df = new DecimalFormat("0.00");

public Calcularimc(int peso, double altura){
    this.altura = altura;
    this.peso = peso;
}
    public String calcularimc(){
        double soma = (this.peso / (this.altura * this.altura));
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        this.imc = df.format(soma);
        return imc;
    }
   

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public String pesoideal(){
        String pesocerto ="";
        double soma = (this.peso / (this.altura * this.altura));
        if(soma <= 18.5){
            pesocerto = "Você está magro demais";
            
        }
        if (soma > 18.5 && soma <= 24 ){
            pesocerto = "Você tem um peso ideal";
            
        }
        if(soma > 25){
            pesocerto = "Você está sobrepeso";
            
        }
        
        return pesocerto;
    }
    
}