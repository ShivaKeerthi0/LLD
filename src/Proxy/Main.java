package Proxy;

public class Main {

    public static void main(String [] args){

        try{
            Employee emp = new Employee();
            EmployeeDao employeeDao = new EmployeeDAoProxy();
            employeeDao.create("ADMIN", emp);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
