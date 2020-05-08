package com.rapidpago.proyec1.Commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServices <Type, ID extends Serializable>{
	
	//metodo para guardar o editar un objeto de una entidad.
	Type save (Type entity);
	
	//metodo para Eliminar un objeto de una entidad.
	void delete (ID id);
	
	//metodo para listar un objeto de una entidad mediante su identificador
	Type get(ID id);
	
	//metodo para listar los objetos de una entidad.
	List <Type> getAll();
}
