import javax.swing.*;
class TestFrame{
  public static void main(String[] args){
    // 画一个窗口

    JFrame frame = new JFrame("new frame");
    JPanel panel = new JPanel();
    // 画组件 one two
    JTextField oneField = new JTextField(10);
    JTextField twoField = new JTextField(10);
    JTextField resultField = new JTextField(10);

    // 按钮
    JButton add = new JButton("+");
    JButton subtract = new JButton("-");
    JButton multiple = new JButton("*");
    JButton divide = new JButton("/");
    // 调整位置
    panel.setLayout(null);
    oneField.setBounds(10,10,150,20);
    twoField.setBounds(10,40,150,20);

    // 画布上组合组件
    panel.add(oneField);
    panel.add(twoField);
    panel.add(add);
    panel.add(subtract);
    panel.add(multiple);
    panel.add(divide);
    panel.add(resultField);

    frame.add(panel);
    // 展示窗口
    frame.setBounds(500, 200, 300, 260);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(3);
  }
}
