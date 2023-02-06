package Dao;

import java.util.List;

import Model.Employees;

public interface EmployeesDaoI {
	public Employees leerUno(int employees_id);
	public List<Employees> leerTodosEmpleados()throws Exception;
	public int actualizar(Employees employees);
	public int delete (Employees employees);
	public int delete (int employees_id);
	public Employees insert(Employees employees);

}
