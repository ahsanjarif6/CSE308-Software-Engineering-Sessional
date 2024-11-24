import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Company> companies = new ArrayList<Company>();
        while(true){
            System.out.println("Do you want to:");
            System.out.println("1.Add new company");
            System.out.println("2.Show Existing companies:");
            System.out.println("3.Remove Company");
            System.out.println("4.Exit");
            int a = scanner.nextInt();
            if(a == 4) break;
            if(a == 1){
                System.out.println("Enter name for new company:");
                String s = scanner.next();
                companies.add(new Company(s));
            }
            else if(a == 2){
                Company company = null;
                while(true){
                    if(companies.size() == 0){
                        System.out.println("No company exists!");
                        break;
                    }
                    System.out.println("Currently existing companies are: ");
                    for(Company c : companies){
                        System.out.println(c.getName());
                    }
                    System.out.println("Enter the name of the company you want to edit:");
                    String s = scanner.next();
                    for(Company c : companies){
                        if(s.equals(c.getName())){
                            company = c ; break;
                        }
                    }
                    if(company == null){
                        System.out.println("Wrong name entered!");
                    }
                    else break;
                }
                while(true && company != null){
                    System.out.println("What do you want to do with company: " + company.getName());
                    System.out.println("1.Add Project and manager");
                    System.out.println("2.Remove Project and manager");
                    System.out.println("3.See hierarchy");
                    System.out.println("4.Exit");
                    int b = scanner.nextInt();
                    if(b == 1){
                        System.out.println("Enter Project Name:");
                        String project = scanner.next();
                        System.out.println("Enter Manager Name:");
                        String manager = scanner.next();
                        ProjectManager projectManager = new ProjectManager(manager,project);
                        company.addManager(projectManager);
                        System.out.println("Manager added");
                        while(true){
                            System.out.println("Do you want to add developers under " + manager);
                            System.out.println("1.Yes");
                            System.out.println("2.No");
                            int c = scanner.nextInt();
                            if(c == 2) break;
                            System.out.println("Enter the name of developer");
                            String dev = scanner.next();
                            Developer developer = new Developer(dev, project);
                            projectManager.addDeveloper(developer);
                        }
                        while(true){
                            System.out.println("Do you want to see manager's info?");
                            System.out.println("1.Yes");
                            System.out.println("2.No");
                            int d = scanner.nextInt();
                            if(d == 1){
                                projectManager.details();
                            }
                            else break;
                        }
                    }
                    else if(b == 2){
                        if(company.getManagers().size() == 0){
                            System.out.println("No managers to remove");
                            continue;
                        }
                        System.out.println("Enter the name of manager to remove : ");
                        String manager = scanner.next();
                        company.removeManager(manager);
                    }
                    else if(b == 3){
                        company.hierarchy();
                    }
                    else break;
                }
            }
            else if(a == 3){
                System.out.println("Enter the name of the company that you want to remove:");
                String name = scanner.next();
                for(Company company : companies){
                    if(name.equals(company.getName())){
                        company.removeCompany();
                        companies.remove(company);
                    }
                }
            }
        }
    }
}
