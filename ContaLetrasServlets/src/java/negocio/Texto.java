/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

public class Texto {

    private String frase;
    private int vogais;
    private int consoantes;
    private int outros;

    public Texto(String frase) {
        this.frase = frase;
        this.vogais = 0;
        this.consoantes = 0;
        this.outros = 0;

    }

    private void processaFrase() {
        this.setFrase(this.getFrase().toLowerCase());
        for (int i = 0; i < this.getFrase().length(); i++) {
            char c = this.getFrase().charAt(i);
            if (Character.isLetter(c)) {
                if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                    this.vogais++;
                } else {
                    this.consoantes++;
                }
            } else {
                this.outros++;
            }
        }
    }
   
    public String getVogais() {
        this.processaFrase();
        String resp = "O número de Vogais é: " + this.vogais;
        return resp;
    }

    public String getConsoantes() {
        this.processaFrase();
        return "O número de consonates é: " + this.consoantes;
    }
    
    public String getOutros() {
        this.processaFrase();
        return  "O número de outros é: " + this.outros;
    }
    
    private String getFrase() {
        return frase;
    }

    private void setFrase(String frase) {
        this.frase = frase;
    }

}