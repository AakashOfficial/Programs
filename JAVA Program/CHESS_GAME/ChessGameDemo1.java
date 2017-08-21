
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 
public class ChessGameDemo1 extends JFrame implements MouseListener, MouseMotionListener
 {
    JLayeredPane layeredPane;
    JPanel chessBoard;
    JLabel chessPiece;
    int xAdjustment;
    int yAdjustment;
 
   public ChessGameDemo1() 
{
  Dimension boardSize = new Dimension(600, 600);
 
  //  Use a Layered Pane for this this application

  layeredPane = new JLayeredPane();
  getContentPane().add(layeredPane);
  layeredPane.setPreferredSize(boardSize);
  layeredPane.addMouseListener(this);
  layeredPane.addMouseMotionListener(this);
 
 //Add a chess board to the Layered Pane 
 
  chessBoard = new JPanel();
  layeredPane.add(chessBoard, JLayeredPane.DEFAULT_LAYER);
  chessBoard.setLayout( new GridLayout(8, 8) );
  chessBoard.setPreferredSize( boardSize );
  chessBoard.setBounds(0, 0, boardSize.width, boardSize.height);
 
  for (int i = 0; i < 64; i++)
 {
  JPanel square = new JPanel( new BorderLayout() );
  chessBoard.add( square );
 
  int row = (i / 8) % 2;
  if (row == 0)
  square.setBackground( i % 2 == 0 ? Color.blue : Color.white );
  else
  square.setBackground( i % 2 == 0 ? Color.white : Color.blue );
  }
 
  //Add a few pieces to the board
 
  JLabel piece = new JLabel( new ImageIcon("image/e.png") );
  JPanel panel = (JPanel)chessBoard.getComponent(0);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/ki.png"));
  panel = (JPanel)chessBoard.getComponent(1);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/c.png"));
  panel = (JPanel)chessBoard.getComponent(2);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/king.png"));
  panel = (JPanel)chessBoard.getComponent(3);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/m.png"));
  panel = (JPanel)chessBoard.getComponent(4);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/c.png"));
  panel = (JPanel)chessBoard.getComponent(5);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/ki.png"));
  panel = (JPanel)chessBoard.getComponent(6);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/e.png"));
  panel = (JPanel)chessBoard.getComponent(7);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(8);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(9);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(10);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(11);
  panel.add(piece);

  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(12);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(13);
  panel.add(piece);

  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(14);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w.png"));
  panel = (JPanel)chessBoard.getComponent(15);
  panel.add(piece);


  piece = new JLabel( new ImageIcon("image/w1.png") );
  panel = (JPanel)chessBoard.getComponent(48);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(49);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(50);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(51);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(52);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(53);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(54);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/w1.png"));
  panel = (JPanel)chessBoard.getComponent(55);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/e1.png"));
  panel = (JPanel)chessBoard.getComponent(56);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/ki1.png"));
  panel = (JPanel)chessBoard.getComponent(57);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/c1.png"));
  panel = (JPanel)chessBoard.getComponent(58);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/m1.png"));
  panel = (JPanel)chessBoard.getComponent(59);
  panel.add(piece);

  piece = new JLabel(new ImageIcon("image/king1.png"));
  panel = (JPanel)chessBoard.getComponent(60);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/c1.png"));
  panel = (JPanel)chessBoard.getComponent(61);
  panel.add(piece);

  piece = new JLabel(new ImageIcon("image/ki1.png"));
  panel = (JPanel)chessBoard.getComponent(62);
  panel.add(piece);
  piece = new JLabel(new ImageIcon("image/e1.png"));
  panel = (JPanel)chessBoard.getComponent(63);
  panel.add(piece);
  }
 
  public void mousePressed(MouseEvent e){
  chessPiece = null;
  Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
 
  if (c instanceof JPanel) 
  return;
 
  Point parentLocation = c.getParent().getLocation();
  xAdjustment = parentLocation.x - e.getX();
  yAdjustment = parentLocation.y - e.getY();
  chessPiece = (JLabel)c;
  chessPiece.setLocation(e.getX() + xAdjustment, e.getY() + yAdjustment);
  chessPiece.setSize(chessPiece.getWidth(), chessPiece.getHeight());
  layeredPane.add(chessPiece, JLayeredPane.DRAG_LAYER);
  }
 
  //Move the chess piece around
  
  public void mouseDragged(MouseEvent me) {
  if (chessPiece == null) return;
 chessPiece.setLocation(me.getX() + xAdjustment, me.getY() + yAdjustment);
 }
 
  //Drop the chess piece back onto the chess board
 
  public void mouseReleased(MouseEvent e) {
  if(chessPiece == null) return;
 
  chessPiece.setVisible(false);
  Component c =  chessBoard.findComponentAt(e.getX(), e.getY());
 
  if (c instanceof JLabel){
  Container parent = c.getParent();
  parent.remove(0);
  parent.add( chessPiece );
  }
  else {
  Container parent = (Container)c;
  parent.add( chessPiece );
  }
 
  chessPiece.setVisible(true);
  }
 
  public void mouseClicked(MouseEvent e) {
  
  }
  public void mouseMoved(MouseEvent e) {
 }
  public void mouseEntered(MouseEvent e){
  
  }
  public void mouseExited(MouseEvent e) {
  
  }


  public static void main(String[] args)  
{
  JFrame frame = new ChessGameDemo1();
  frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE );
  frame.pack();
  frame.setResizable(true);
  frame.setLocationRelativeTo( null );
  frame.setVisible(true);
 }
}
 