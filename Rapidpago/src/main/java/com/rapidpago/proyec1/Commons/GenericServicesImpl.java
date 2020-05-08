package com.rapidpago.proyec1.Commons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service 
public abstract class GenericServicesImpl <Type, ID extends Serializable > implements GenericServices <Type,ID>{

	
	//metodo para guardar o editar un objeto de una entidad.
	public Type save(Type entity) {
		return getDao().save(entity);
	}

	//metodo para Eliminar un objeto de una entidad.
	public void delete (ID id) {
		getDao().deleteById(id);
	}
	
	//metodo para listar un objeto de una entidad mediante su identificador
	public Type get(ID id) {
		Optional<Type> obj = getDao().findById(id);
		if(obj.isPresent()) {
		return obj.get();
		}
		return null;
	}
	
	//metodo para listar los objetos de una entidad.
	public List<Type> getAll() {
		List<Type> returnList = new ArrayList<>();
		getDao().findAll().forEach(obj-> returnList.add(obj));
		return returnList;
	}
	
	//metodo para obtener el repositorio de una entidad.
	public abstract CrudRepository <Type, ID> getDao();

}
