public abstract class Employee {
  private String name;
  private String niNumber;
  private int salary;

  public Employee(String name, String niNumber, int salary) {
      this.name = name;
      this.niNumber = niNumber;
      this.salary = salary;
      }

      public String getName(){
      return this.name;
      }

      public String getNiNumber(){
      return this.niNumber;
      }

      public int getSalary(){
      return this.salary;
      }

      public double raiseSalary(raise){
      return this.salary += raise;

      }

      public double payBonus(){
      return this.salary * 0.01;
      }
  }



