package dao;

import java.util.List;

import model.Computer;

public interface ComputerDAO {
  public boolean addComputer(Computer c);
  public List<Computer> getAllComputer();
 /* public boolean deleteComputer(int price);
  public void deleteAllComputer();
  public boolean updateComputer(int price,String cName);
  public Computer findComputer(int price);*/
}
