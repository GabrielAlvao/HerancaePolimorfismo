package HerançaeInterface;

public class Preguiça extends Animal implements somdosAnimais{
	
	private boolean escalar;
	public void setescalar(boolean escalar) {
		this.escalar = escalar;
		if(escalar == true) {
			System.out.println("A preguiça está escalando a árvore!");
		}else {
			System.out.println("A preguiça está parada!");
		}
	}
	@Override
	public void somAnimal() {
		System.out.println("Som preguiça: shishi");
		
	}
	
}


