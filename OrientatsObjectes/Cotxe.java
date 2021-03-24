
public class Cotxe {
	private String marca,model,color,matricula;
	
	public Cotxe() {
		System.out.println("...creant objecte...");
	}
	public Cotxe(String marca,String model,String color) {
		System.out.println("...creant objecte...");
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public void matricular() {
		String matricula;
		int numero = (int) (Math.random() * (9999-1000+1)+1000);
		matricula = String.valueOf(numero);
		for (int i=0; i<3; i++) {
			matricula = matricula+String.valueOf((char) (int)(Math.random() * (90-65+1)+65));
		}
		this.matricula = matricula;
	}
	
	public void visualitzar() {
		System.out.println("Marca : " +marca);
		System.out.println("Model : " +model);
		System.out.println("Color: " +color);
		System.out.println("Matricula: " +matricula);
		
	}
	
}
