package aula;

import br.ufpb.dcx.poo.biblioteca.Fabrica;
import br.ufpb.dcx.poo.biblioteca.contrato.Biblioteca;
import br.ufpb.dcx.poo.biblioteca.contrato.excecoes.BibliotecaException;

public class DemostracaoErro {
    public static void main(String[] args)  throws BibliotecaException {
        Biblioteca biblioteca = Fabrica.novaBiblioteca();
        biblioteca.acervo().cadastrarItem("l1", "POO em Java", "Ayla", "Livro", 2020);

        String cogigo = new StringBuilder("L").append(1).toString();

        System.out.println("Comparação usando equals: " + cogigo.equals("L1"));
        System.out.println("Comparação usando ==: " + (cogigo == "l1)"));

        biblioteca.acervo().cadastrarItem(cogigo, "Engenhario de software Moderna", "Ryan", "Livro", 2026);

        while (true){
            System.out.println(biblioteca.acervo().listarItens().iterator().next().codigo());
            System.out.println(biblioteca.acervo().listarItens().iterator().next().codigo());

            if (!biblioteca.acervo().listarItens().iterator().hasNext()) break;
            
        }




    }
}
