package HerançaeInterface;


public class TestaAnimais {
	public static void main(String[] args) {
		
		cachorro c = new cachorro();
		Cavalo c2 = new Cavalo();
		Preguiça p = new Preguiça();
		c.setnome("Thor");
		c.setidade(10);
		
		
		System.out.println("Nome: " + c.getnome());
		System.out.println("Idade: " + c.getidade());
		c.somAnimal();
		c.setcorrer(true);
		System.out.println("==================================");
		c2.setnome("Loki");
		c2.setidade(8);
		
		
		System.out.println("Nome: " + c2.getnome());
		System.out.println("Idade: " + c2.getidade());
		c2.somAnimal();
		c2.setcorrer(true);
		System.out.println("==================================");
		
		p.setnome("Odin");
		p.setidade(30);
		
		
		
		System.out.println("Nome: " + p.getnome());
		System.out.println("Idade: " + p.getidade());
		
		p.somAnimal();
		p.setescalar(true);
		System.out.println("==================================");
		
		
	}
}