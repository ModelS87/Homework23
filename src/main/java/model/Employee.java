package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
        @JsonProperty("firstName")
    private final String name;
       @JsonProperty("lastName")
        private final String surname;
       private int department;
       private int salary;


        public Employee(String name,
                        String surname,
                        int department,
                        int salary) {
            this.name = name;
            this.surname = surname;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return this.name;
        }

        public String getSurname() {
            return this.surname;
        }
    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

        @Override
        public boolean equals (Object o) {
            if (this == o) {
                return true;
        }
            if (o == null || getClass() != o.getClass()){
                return false;
            }
            Employee employee = (Employee)  o;
            return name.equals(employee.name) && surname.equals(employee.surname);
        }
        @Override
    public String toString(){
            return String.format("Ф.И.: %s %s",surname,name);
        }
    }

