package desfioPoo;

import java.time.LocalDate;

import br.com.dio.deafio.dominio.Curso;
import br.com.dio.deafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição Curso Java");
		curso1.setCargaHoraria(10);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso Javascript");
		curso2.setDescricao("Descrição Curso Javascript");
		curso2.setCargaHoraria(8);
		
		System.out.println();
		System.out.println(curso1);
		System.out.println();
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println();
		System.out.println(mentoria);

	}

}
