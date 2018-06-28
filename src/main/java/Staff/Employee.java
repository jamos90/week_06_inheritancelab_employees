package Staff;

public abstract class Employee {
  protected String name;
  protected String niNumber;
  protected double salary;

  public Employee(String name, String niNumber, double salary) {
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

      public double getSalary(){
      return this.salary;
      }

      public double raiseSalary(double raise) {
         double raise_amount = this.salary += raise;
          if (raise_amount < this.salary)
          {
              return this.salary;
          } else {
              return raise_amount;
          }

      }


      public double payBonus(){
      return this.salary * 0.01;
      }
  }



