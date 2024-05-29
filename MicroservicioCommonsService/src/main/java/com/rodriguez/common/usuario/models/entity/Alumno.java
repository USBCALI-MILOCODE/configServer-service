package com.rodriguez.common.usuario.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
@Table(name = "alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;

	 @Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			} if (!(obj instanceof Alumno)) {
				return false;
			}
			
			Alumno alumno = (Alumno) obj;
			
			return this.id != null && this.id.equals(alumno.getId());
		}

		@Column(name = "create_at")
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date createAt;

	    @PrePersist
	    public void prePersist() {
	        this.createAt = new Date();
	    }
}
