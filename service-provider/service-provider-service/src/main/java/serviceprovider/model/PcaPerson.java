package serviceprovider.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class PcaPerson {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "NAME", length = 1024)
	private String name;

	@ManyToMany
	List<PcaManagementJob> managementJobs;

	@ManyToMany
	List<PcaPoliticalJob> politicalJobs;

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized List<PcaManagementJob> getManagementJobs() {
		return managementJobs;
	}

	public synchronized void setManagementJobs(List<PcaManagementJob> managementJobs) {
		this.managementJobs = managementJobs;
	}

	public synchronized List<PcaPoliticalJob> getPoliticalJobs() {
		return politicalJobs;
	}

	public synchronized void setPoliticalJobs(List<PcaPoliticalJob> politicalJobs) {
		this.politicalJobs = politicalJobs;
	}

	public synchronized Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		PcaPerson other = (PcaPerson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
