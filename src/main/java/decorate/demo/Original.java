package decorate.demo;

import javax.swing.*;
import java.awt.*;

public class Original extends JFrame implements Morrigan {

  private static final long serialVersionUID = 1L;
  private String t = "0.png";

  public Original(){
    super("《恶魔战士》中的莫莉卡·安斯兰");
  }

  public void setImage(String t){
    this.t = t;
  }

  @Override
  public void display() {
    this.setLayout(new FlowLayout());
    JLabel jLabel = new JLabel(new ImageIcon("D:\\xdfworkspace\\java-pattern\\src\\main\\resources\\" + t));
    this.add(jLabel);
    this.pack();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }




}
