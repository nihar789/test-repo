package CompositeMethod;

// Client code
public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Method DP - Structural DP");

        Company softwareCompany = new Software(1, "Software");
        Company hrCompany = new HR(2, "HR");

        CompanyHead companyHead = new CompanyHead(3, "ABC Company");
        companyHead.addDepartment(softwareCompany);
        companyHead.addDepartment(hrCompany);

        companyHead.displayName();
    }
}
