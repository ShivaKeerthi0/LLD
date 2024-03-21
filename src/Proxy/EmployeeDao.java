package Proxy;

public interface EmployeeDao {

    public void create(String role, Employee obj) throws Exception;
    public void delete(String role, int id) throws Exception;
    public Employee get(int id) throws  Exception;

}
