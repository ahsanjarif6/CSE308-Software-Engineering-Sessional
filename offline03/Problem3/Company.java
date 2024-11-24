import java.util.ArrayList;
import java.util.List;

public class Company{
    private String name;
    private List< ProjectManager > managers;

    public String getName() {
        return name;
    }

    public List<ProjectManager> getManagers() {
        return managers;
    }

    public Company(String name){
        this.name = name;
        managers = new ArrayList<ProjectManager>();
    }

    public void hierarchy(){
        System.out.println("\t-" + name);
        for(ProjectManager e : managers){
            System.out.println("\t\t-" + e.getName() + "(" + e.getProject() + ")");
            e.hierarchyHelper();
        }
    }

    public void addManager(ProjectManager manager){
        managers.add(manager);
    }

    public void removeManager(String name){
        for(ProjectManager manager : managers){
            if(name.equals(manager.getName())){
                managers.remove(manager);
                return;
            }
        }
    }

    public void removeCompany(){
        while(managers.size() > 0){
            ProjectManager manager = managers.get(0);
            manager.removeAllDeveloper();
        }
    }
}