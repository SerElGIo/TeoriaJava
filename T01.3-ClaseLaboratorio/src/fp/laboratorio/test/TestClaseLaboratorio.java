package fp.laboratorio.test;

import fp.laboratorio.ClaseLaboratorio;
import fp.laboratorio.ClaseLaboratorioImpl;
import fp.laboratorio.Estudiante;
import fp.laboratorio.EstudianteImpl;

public class TestClaseLaboratorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseLaboratorio c1 = new ClaseLaboratorioImpl(10);
		
		System.out.println(c1.getNumeroEstudiantes());
		
		Estudiante e1 = new EstudianteImpl("Ada", "Lovelace", "uvus:adalov");
		Estudiante e2 = new EstudianteImpl("Grace", "Murray", "uvus:gramur");
		Estudiante e3 = new EstudianteImpl("Frances", "Allen", "uvus:fraall");
		
		
		c1.inscribeEstudiante(e1);
		c1.inscribeEstudiante(e2);
		c1.inscribeEstudiante(e3);
		System.out.println(c1);
		
		
		Estudiante e4 = new EstudianteImpl("Hedy", "Lamarr", "uvus:hedlam");
		Estudiante e5 = new EstudianteImpl("Ángela", "Ruiz", "uvus:angrui");
		Estudiante e6 = new EstudianteImpl("Margaret", "Hamilton", "uvus:marham");
		
		e4.sumarPuntos(22.0);
		e5.sumarPuntos(14.0);
		e6.sumarPuntos(23.0);
		
		
		c1.inscribeEstudiante(e4);
		c1.inscribeEstudiante(e5);
		c1.inscribeEstudiante(e6);
		
		c1.setProfesor("Toñi Reina");
		c1.setAula("A0.13");
		
		System.out.println(c1);
		
		
	}
}
