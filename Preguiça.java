package Heran�aeInterface;

public class Pregui�a extends Animal implements somdosAnimais{
	
	private boolean escalar;
	public void setescalar(boolean escalar) {
		this.escalar = escalar;
		if(escalar == true) {
			System.out.println("A pregui�a est� escalando a �rvore!");
		}else {
			System.out.println("A pregui�a est� parada!");
		}
	}
	@Override
	public void somAnimal() {
		System.out.println("Som pregui�a: shishi");
		
	}
	
}


