public class Manager extends Employee{

    protected String deptName;

    public Manager(String name, String niNumber, int salary, String deptName){
        super(name, niNumber, salary);
        this.deptName = deptName;
    }



    public String getDeptName(){
        return this.deptName;
    }


}
