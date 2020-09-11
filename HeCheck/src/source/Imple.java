package source;
import java.util.List;
import getersetter.Data;

public interface Imple {
  public boolean addComputer(Data c);
  public List<Data> getAllComputer();
  public boolean deleteComputer(int price);
  public boolean deleteAllComputer();
  //public boolean updateComputer(int price,String cName);
  //public Computer findComputer(int price);
}
