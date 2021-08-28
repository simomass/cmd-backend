package it.cmd.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "geometry")
public class Geometry extends AuditModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7860914803354158899L;

	@Id
    @GeneratedValue(generator = "geometry_generator")
    @SequenceGenerator(
            name = "geometry_generator",
            sequenceName = "geometry_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String name;

    //TODO : Change with proper coordinate object
    @Column(columnDefinition = "text")
    private String coordinates;

	public Geometry(Long id, @NotBlank @Size(min = 3, max = 100) String name, String coordinates) {
		this.id = id;
		this.name = name;
		this.coordinates = coordinates;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}


}
