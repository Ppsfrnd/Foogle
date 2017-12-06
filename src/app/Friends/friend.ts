export class Friend {
    id: number
    firstName: string
    lastName: string
    contactNumber: number
    mailId: string
    designation: string
    homeTown: string
    collegeName: string
    companyName: string
    companyLocation: string
    constructor(id: number, firstName: string, lastName: string, contactNumber: number, mailId: string, designation: string, homeTown: string, collegeName: string, companyName: string, companyLocation: string) {
        this.id = id;
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

}