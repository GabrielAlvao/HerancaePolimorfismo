package Heran�aeInterface;


public class cachorro extends Animal implements somdosAnimais{
	
	private boolean correr;
	
	public void setcorrer(boolean correr) {
		this.correr = correr;
		if(correr == true) {
			System.out.println("O cachorro est� correndo!");
		}else {
			System.out.println("O cachorro est� parado!");
		}
	}

	@Override
	public void somAnimal() {
		System.out.println("Som cachorro: Auau");
		
	}
	

}