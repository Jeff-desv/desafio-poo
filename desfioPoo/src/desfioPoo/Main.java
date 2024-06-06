package desfioPoo;

import java.time.LocalDate;

import br.com.dio.deafio.dominio.Bootcamp;
import br.com.dio.deafio.dominio.Curso;
import br.com.dio.deafio.dominio.Dev;
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
		
		//System.out.println();
		//System.out.println(curso1);
		//System.out.println();
		//System.out.println(curso2);
		
		//Mentoria mentoria = new Mentoria();
		//mentoria.setTitulo("Mentoria Java");
		//mentoria.setDescricao("Descrição mentoria Java");
		//mentoria.setData(LocalDate.now());
		
		//System.out.println();
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		//bootcamp.getConteudos().add(mentoria);
		System.out.println();
		
		Dev devCamila = new Dev();
		
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("*------");
		System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
		System.out.println();
		
		Dev devJoao = new Dev();
		
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("*------");
		System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
		System.out.println();

	}

}
