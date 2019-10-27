/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Autor aut1 = new Autor("William Shakespeare", 1564, "william_shake@hotmail.com", new Livro("Sonet 116", "Scipione", 1609));
        Autor aut2 = new Autor("Monteiro Lobato", 1882, "monteiro_lobato@hotmail.com", new Livro("O Saci", "Brasiliense", 1921));
        Autor aut3 = new Autor("ailssdaui", 1990, "asdasdh@hotmail.com", new Livro("Seila", "Duolingo", 2005));
        
        aut1.getObra().setEscritores(aut1);
        
        System.out.print("Escritor: ");
        aut1.getObra().getEscritores();
        System.out.println("Obra: " + aut1.getObra().getTitulo());
    }
}
