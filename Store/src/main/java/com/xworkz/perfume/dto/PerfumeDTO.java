package com.xworkz.perfume.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class PerfumeDTO implements Comparable<PerfumeDTO> {

	private String name;
	private int price;
	private String country;
	private int quantity;
	
	@Override
    public int compareTo(PerfumeDTO args) {
        PerfumeDTO current=this;
        return current.getName().compareTo(args.getName());
    }

}
