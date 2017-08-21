import java.rml.*;
import java.io.*;
public Interface Adder extends Remote
 {
  public add(int x,int y)throws RemoteException;
 }