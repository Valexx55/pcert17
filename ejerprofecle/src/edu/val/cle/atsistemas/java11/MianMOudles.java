package edu.val.cle.atsistemas.java11;

import java.lang.module.ModuleDescriptor.Requires;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class MianMOudles {
	
	public static void main(String[] args) {
		Set<Module> modules = ModuleLayer.boot().modules();
		//java --list-modules > salida1.txt DESDES SRC
		modules.stream().sorted(Comparator.comparing(Module::getName)).forEach(modulo -> {
			System.out.println("MODULO");
			System.out.println(modulo.getName());
			System.out.println("REQUIERE");
			modulo.getDescriptor().requires().forEach(rq -> System.out.println(" " +rq.name()));
			System.out.println("EXPORTA");
			modulo.getDescriptor().exports().forEach(ex -> System.out.println(" " +ex.source()));;
			
		});
		
		//Set<Requires> requires = module.getDescriptor().requires();
	}

}
