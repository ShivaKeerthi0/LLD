package Proxy;

public class EmployeeDAoProxy implements  EmployeeDao{

    EmployeeDao empdao;

    EmployeeDAoProxy(){

        empdao = new EmployeeDaoImplementation();

    }


    public void create(String role, Employee obj) throws Exception {

        if(role.equals("USER")){
            throw new Exception("ACCESS DENIED TO CREATE RESOURCE");
        } else {

            empdao.create(role,obj);
         //   System.out.println("EMPLOYEE CREATED SUCCESSFULLY!!!");
        }

    }

    @Override
    public void delete(String role, int id) throws Exception {

        if(role.equals("USER")){
            throw new Exception("ACCESS DENIED TO DELETE RESOURCE!!!");
        } else {
            empdao.delete(role,id);
            //System.out.println("EMPLOYEE DELETED SUCCESSFULLT!!!");
        }

    }

    @Override
    public Employee get(int id) throws Exception {
        return empdao.get(id);
    }
}
