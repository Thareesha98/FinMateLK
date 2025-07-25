package thareesha.career.CareerProject.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "careers")
public class Career {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer avgSalary;

    @Column(columnDefinition = "TEXT")
    private String skillsRequired;

    @Column(columnDefinition = "TEXT")
    private String detailedInfo;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAvgSalary() {
		return avgSalary;
	}

	public void setAvgSalary(Integer avgSalary) {
		this.avgSalary = avgSalary;
	}

	public String getSkillsRequired() {
		return skillsRequired;
	}

	public void setSkillsRequired(String skillsRequired) {
		this.skillsRequired = skillsRequired;
	}

	public String getDetailedInfo() {
		return detailedInfo;
	}

	public void setDetailedInfo(String detailedInfo) {
		this.detailedInfo = detailedInfo;
	}
    
    

    // Getters and Setters
}