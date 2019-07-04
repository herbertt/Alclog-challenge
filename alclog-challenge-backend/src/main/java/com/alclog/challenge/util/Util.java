package com.alclog.challenge.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.alclog.challenge.model.Caracteristica;
import com.alclog.challenge.model.Produto;
import com.alclog.challenge.model.Unidade;

public class Util {

	public Util() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Produto>pesistenceBagConverter(List<Produto> list){
		List<Produto> listCache = new ArrayList<Produto>();
		Set<Unidade> listUn;
		Set<Caracteristica> listCarac; 
		Produto prod;
		for (Produto p : list) {
			listUn = new HashSet<Unidade>();
			listCarac = new HashSet<Caracteristica>();
			for (Caracteristica c : p.getCaracteristicas()) {
				listCarac.add(c);
			}
			for (Unidade u : p.getUnidades()) {
				listUn.add(u);
			}
			prod = new Produto(p.getId(), p.getCodigo(), p.getNome(), p.getDescricao(), p.getImagem(), p.getCodigo_barras(), listCarac, listUn);
			listCache.add(prod);
		}
		
		return listCache;
		
	}

}
