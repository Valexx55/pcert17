package jcp17.herencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.FilerException;

class UnaMas {

	public List<CharSequence> transform(Set<CharSequence> list) {
		return null;
	}
	
	protected Number dameNUm (int a) throws IOException
	{
		return null;
	}
}

class Derived extends UnaMas {
	
	//@Override
	public List<CharSequence> transform(Set<CharSequence> id) {
		return null;
	}
	
	@Override
	Integer dameNUm (int a) 
	{
		return null;
	}
}
