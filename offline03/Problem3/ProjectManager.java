import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
    private String name;
    private String role;
    private String project;
    private int cnt;
    private List< Developer > list;

    public ProjectManager(String name , String project){
        this.name = name ;
        this.project = project;
        role = "Manager";
        list = new ArrayList<Developer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<Developer> getList() {
        return list;
    }

    public void setList(List<Developer> list) {
        this.list = list;
    }

    public void hierarchyHelper(){
        for(Developer e : list){
            System.out.println("\t\t\t-" + e.getName());
        }
    }

    public void details(){
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Current Project: " + project);
        System.out.println("Number of Supervisees: " + list.size());
    }

    public void addDeveloper(Developer developer){
        list.add(developer);
    }

    public void removeDeveloper(String name){
        for(Developer developer : list){
            if(name.equals(developer.getName())){
                list.remove(developer);
            }
        }
    }
    
    public void removeAllDeveloper(){
        while(list.size() > 0){
            Developer developer = list.get(0);
            list.remove(developer);
        }
    }
}
