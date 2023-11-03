package controlador;
import vista.*;
import modelo.*;

public class app {
	public static void main(String[] args) {
		PInicial principal=new PInicial();
		Model modelo=new Model();
		Controler control=new Controler(principal, modelo);
		control.iniciar();
	
	}
}
// faltan los titulos 