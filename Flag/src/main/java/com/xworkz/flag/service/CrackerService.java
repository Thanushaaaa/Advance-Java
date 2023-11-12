package com.xworkz.flag.service;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.flag.dto.CrackerDTO;

@Component
public interface CrackerService {

	public boolean validate(CrackerDTO dto, Model model);

}
