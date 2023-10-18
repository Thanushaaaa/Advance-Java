package com.xworkz.human.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class PresidentDTO implements Comparable<PresidentDTO> {
	private int id;
	private String name;
	private LocalDate durationStart;
	private LocalDate durationEnd;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((durationStart == null) ? 0 : durationStart.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PresidentDTO other = (PresidentDTO) obj;
		if (durationStart == null) {
			if (other.durationStart != null)
				return false;
		} else if (!durationStart.equals(other.durationStart))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(PresidentDTO args) {
		PresidentDTO current = this;
		return args.getName().compareTo(current.getName());
	}

}
