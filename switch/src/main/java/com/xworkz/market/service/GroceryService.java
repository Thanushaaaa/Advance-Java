package com.xworkz.market.service;

import java.util.Collection;

import org.eclipse.jdt.internal.compiler.ast.Annotation.AnnotationTargetAllowed;

import com.xworkz.market.dto.GroceryDTO;

public interface GroceryService {
	boolean validateAndSave(GroceryDTO groceryDTO);
	
	default int total() {
		return 0;
	}
	default Collection<GroceryDTO> getAll()
	{
		return null;
	}
}
