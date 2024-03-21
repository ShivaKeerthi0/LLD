package Proxy;

public class EmployeeDaoImplementation implements  EmployeeDao{
    @Override

    public void create(String role, Employee obj) throws Exception {

            System.out.println("EMPLOYEE CREATED SUCCESSFULLY!!!");


    }

    @Override
    public void delete(String role, int id) throws Exception {

            System.out.println("EMPLOYEE DELETED SUCCESSFULLT!!!");


    }

    @Override
    public Employee get(int id) throws Exception {
        return new Employee();
    }
}
