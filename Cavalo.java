package Heran�aeInterface;



public class Cavalo extends Animal implements somdosAnimais{
	
	private boolean correr;
	public void setcorrer(boolean correr) {
		this.correr = correr;
		if(correr == true) {
			System.out.println("O cavalo est� correndo!");
		}else {
			System.out.println("O cavalo est� parado!");
		}
	}
	@Override
	public void somAnimal() {
		System.out.println("Som cavalo: HIO");
		
	}
	

}

