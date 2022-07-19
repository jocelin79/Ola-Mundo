package br.com.dio.collection.list;

import java.util.*;

class ExemploList {
	public static void main (String[] args) {
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0)
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas.toString());
		
		System.out.println("Exiba a posição da nota 5.0" + notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4");
		notas.add(4, 8d);
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0");
		notas.set(notas.indexOf(5d), 6.0);
		
		("Confira se a nota 5.0 está na lista")
		notas.contains(5d)
		
		("Exiba todas as notas na ordem em que foram informadas");
		for (Double nota : notas) System.out.printl(nota);
		
		("Exiba a terceira nota adicionada")
		System.out.println(notas.get(2));
		System.out.println(notas.String());
		
		System.out.println("Exiba a menor nota");
		System.out.println(Collection.min(notas));
		
		System.out.println("Exiba a maior nota");
		System.out.println(Collection.max(notas));
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos vaores: " + soma);
		
		System.out.println("Exiba a média das notas:" + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		("Remova as notas menores que 7");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasnext()) {
			Double next = iterator1.next();
			if (next < 7) iterator.remove();
		}
		System.out.println(notas);
		
		System.out.println("notas está vazio:" + notas.Empty());
	}
}

meusGatos.sort(Comparator.comparing(Gato::gato.nome));

