package com.tavant.model;

public class Friend {

	@Override
	public String toString() {
		return "Friend [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber="
				+ contactNumber + ", mailId=" + mailId + ", designation=" + designation + ", homeTown=" + homeTown
				+ ", collegeName=" + collegeName + ", companyName=" + companyName + ", companyLocation="
				+ companyLocation + "]";
	}

	private int id;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String mailId;
	private String designation;
	private String homeTown;
	private String collegeName;
	private String companyName;
	private String companyLocation;

	public Friend() {
	}

	public Friend(String firstName, String lastName, String contactNumber, String mailId, String designation,
			String homeTown, String collegeName, String companyName, String companyLocation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.mailId = mailId;
		this.designation = designation;
		this.homeTown = homeTown;
		this.collegeName = collegeName;
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public String getCollegeName() {
		return collegeName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((collegeName == null) ? 0 : collegeName.hashCode());
		result = prime * result + ((companyLocation == null) ? 0 : companyLocation.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((homeTown == null) ? 0 : homeTown.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mailId == null) ? 0 : mailId.hashCode());
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
		Friend other = (Friend) obj;
		if (collegeName == null) {
			if (other.collegeName != null)
				return false;
		} else if (!collegeName.equals(other.collegeName))
			return false;
		if (companyLocation == null) {
			if (other.companyLocation != null)
				return false;
		} else if (!companyLocation.equals(other.companyLocation))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (homeTown == null) {
			if (other.homeTown != null)
				return false;
		} else if (!homeTown.equals(other.homeTown))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mailId == null) {
			if (other.mailId != null)
				return false;
		} else if (!mailId.equals(other.mailId))
			return false;
		return true;
	}




}
