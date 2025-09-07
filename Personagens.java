package jogo.recursos.classes;

public class Personagens {
	
	private String nome;
	private float danoBase;
	private float vida;
	private float danoEspecial;
	private int carga;
	private float critico;
	private int tipo;
	private float regeneracao;
	private float defesa;
	
	public float getDanoBase() {
		return this.danoBase;
	}
	public float getDanoEspecial() {
		return this.danoEspecial;
	}
	public float getVida() {
		return this.vida;
	}
	public float getCritico() {
		return this.critico;
	}
	public String getNome() {
		return this.nome;
	}
	public float getTipo() {
		return this.tipo;
	}
	public float getRegeneracao() {
		return this.regeneracao;
	}
	public float getDefesa() {
		return this.defesa;
	}
	public int setCarga() {
		this.carga--;
		return this.carga;
	}
	
	
	public float setDano(float dano) {
		return  -dano;
	}
	public float setDanoEspecial(float danoEspecial, int tipo) {
		
		if(tipo == 2) {
			
			for(int i = 0; i <= 3; i++) danoEspecial++;
		}	
		
		if(tipo == 3) {
			for(int i = 0; i <= 5; i++) danoEspecial++;
			
	}
		 return -danoEspecial;
}
	
	public Personagens(String nome, float danoBase, float vida, float danoEspecial, float critico, int tipo, float regeneracao, float defesa, int carga) {
    	
        // inicializa variáveis de instância
        this.nome = nome;
        this.danoBase = danoBase;
        this.vida = vida;
        this.danoEspecial = danoEspecial;
        this.critico = critico;
        this.tipo = tipo;
        this.regeneracao = regeneracao;
        this.defesa = defesa;
        this.carga = carga;
              
    }
}
