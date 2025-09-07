package jogo.recursos.classes;

import java.io.IOException;
import java.util.Scanner;

import jogo.recursos.classes.*;

public class Partida {
	
	 public static void main( String args[] ) throws IOException {
	     
	       Personagens personagens = new Personagens(null, 0, 0, 0, 0, 0, 0, 0, 0);
	       Personagens p1;
	       Personagens p2;
	       int acao = 0;
	       
	       p1 = new Personagens(null, 0, 0, 0, 0, 0, 0, 0, 0);
	       p2 = new Personagens(null, 0, 0, 0, 0, 0, 0, 0, 0);
	       
	       Scanner scan = new Scanner(System.in);
   
		 System.out.println("Selecione o primeiro personagem:");
		 System.out.println("Personagem 1: Guerreira da Lua");
		 System.out.println("Personagem 2: Claymore");
		 System.out.println("Personagem 3: Vampiro");
		 System.out.println("Personagem 4: Litch");
		 
		 int selecao = scan.nextInt();
		 
		 switch (selecao) {
			 case 1:
				 p1 = new Personagens("Guerreira da Lua", 15.0f, 150.0f, 80.0f, 8.0f, 1, 10.0f, 20.0f, 6);
				 System.out.println("Guerreira da Lua selecionada");
				 break;
			 case 2:
				 p1 = new Personagens("Claymore", 25.5f, 200.0f, 15.5f, 5.0f, 5, 10.0f, 25.0f, 4);
				 System.out.println("Claymore selecionada");
				 break;
			 case 3:
				 p1 = new Personagens("Vampiro", 20.0f, 200.0f, 70.0f, 5.0f, 2, 20.0f, 30.0f, 5);
				 System.out.println("Vampiro selecionado");
				 break;
			 case 4:
				 p1 = new Personagens("Litch", 25.0f, 150.0f, 20.0f, 6.0f, 1, 10.0f, 20.0f, 3);
				 System.out.println("Litch selecionado");
				 break;
		 }
		 
		 System.out.println("Selecione o primeiro personagem:");
		 System.out.println("Personagem 1: Guerreira da Lua");
		 System.out.println("Personagem 2: Claymore");
		 System.out.println("Personagem 3: Vampiro");
		 System.out.println("Personagem 4: Litch");
		 
		 selecao = scan.nextInt();
		 
		 switch (selecao) {
			 case 1:
				 p2 = new Personagens("Guerreira da Lua", 15.0f, 150.0f, 80.0f, 8.0f, 1, 10.0f, 20.0f, 6);
				 System.out.println("Guerreira da Lua selecionada");
				 break;
			 case 2:
				 p2 = new Personagens("Claymore", 25.5f, 200.0f, 15.5f, 5.0f, 5, 10.0f, 25.0f, 4);
				 System.out.println("Claymore selecionada");
				 break;
			 case 3:
				 p2 = new Personagens("Vampiro", 20.0f, 200.0f, 70.0f, 5.0f, 2, 20.0f, 30.0f, 5);
				 System.out.println("Vampiro selecionado");
				 break;
			 case 4:
				 p2 = new Personagens("Litch", 25.0f, 150.0f, 20.0f, 6.0f, 1, 10.0f, 20.0f, 3);
				 System.out.println("Litch selecionado");
				 break;
		 }
		 
		 do {
			 acao = scan.nextInt();
			 
			 switch (acao) {
			 case 1:
				 System.out.println(p1.getNome() + " atacou " + p2.getNome());
				 System.out.println("Vida atual: " + p1.getVida());
				 break;
				 
			 
			 }
			 
		 } while (p1.getVida() > 0 | p2.getVida() > 0 );
		 
		 
	 }
}
