package controlador;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import modelo.Model;

public class Controler implements ActionListener {
	PInicial pini;
	PArticulo pArticulo;
	Model modelo;
	@Override
	public void actionPerformed(ActionEvent e) {
		pini.setVisible(false);
		
	}
	public Controler(PInicial pini,Model modelo){
		this.pini=pini;
		this.modelo=modelo;
		this.pini.BotonArticulo.addActionListener(this);
		pini.setVisible(false);
		
		
	}
	public void iniciar() {
	pini.setTitle("Prueba");
	pini.BotonArticulo.addActionListener(this);
	pini.setLocationRelativeTo(null);
	pini.setVisible(true);
	}

}
