import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class My_Tic_Tac_Toe_Game{
String x = "X";
String x1 = "";
String x2 = "";
String x3 = "";
String x4 = "";
String x5 = "";
String x6 = "";
String x7 = "";
String x8 = "";
String x9 = "";
String p1 = "";
String p2 = "";
String p3 = "";
String p4 = "";
String p5 = "";
String p6 = "";
String p7 = "";
String p8 = "";
String p9 = "";
String w = "";
JFrame frame = new JFrame("Tic-Tac-Toe");
JButton button1 = new JButton();
JButton button2 = new JButton();
JButton button3 = new JButton();
JButton button4 = new JButton();
JButton button5 = new JButton();
JButton button6 = new JButton();
JButton button7 = new JButton();
JButton button8 = new JButton();
JButton button9 = new JButton();
JTextField tf = new JTextField();
public My_Tic_Tac_Toe_Game(){
button1.setFont(new Font("", Font.BOLD, 50));
button2.setFont(new Font("", Font.BOLD, 50));
button3.setFont(new Font("", Font.BOLD, 50));
button4.setFont(new Font("", Font.BOLD, 50));
button5.setFont(new Font("", Font.BOLD, 50));
button6.setFont(new Font("", Font.BOLD, 50));
button7.setFont(new Font("", Font.BOLD, 50));
button8.setFont(new Font("", Font.BOLD, 50));
button9.setFont(new Font("", Font.BOLD, 50));
tf.setFont(new Font("", Font.BOLD, 20));
button1.setBounds(45, 30, 100, 100);
button2.setBounds(145, 30, 100, 100);
button3.setBounds(245, 30, 100, 100);
button4.setBounds(45, 130, 100, 100);
button5.setBounds(145, 130, 100, 100);
button6.setBounds(245, 130, 100, 100);
button7.setBounds(45, 230, 100, 100);
button8.setBounds(145, 230, 100, 100);
button9.setBounds(245, 230, 100, 100);
tf.setBounds(45, 330, 300, 30);
frame.add(button1);
frame.add(button2);
frame.add(button3);
frame.add(button4);
frame.add(button5);
frame.add(button6);
frame.add(button7);
frame.add(button8);
frame.add(button9);
frame.add(tf);
frame.setLayout(null);
frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400, 400);
frame.setResizable(false);
tf.setText(x + " Turn");
button1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p1==""){
	button1.setText(x);
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x1 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x1 = "O";}
	p1 = "1";
	}
	if(x2==x1 && x1==x3 && x2==x3 && x2!="" && x1!="" && x3!=""){
	winner();
	w = "winner";}
	else if(x1==x5 && x5==x9 && x5==x9 && x1!="" && x5!="" && x9!=""){
	winner();
	w = "winner";}
	else if(x1==x4 && x4==x7 && x1==x7 && x1!="" && x4!="" && x7!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p2==""){
	x2 = x;
	button2.setText(x);
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x2 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x2 = "O";}
	p2 = "2";
	}
	if(x1==x2 && x2==x3 && x1==x3 && x2!="" && x1!="" && x3!=""){
	winner();
	w = "winner";}
	else if(x2==x5 && x5==x8 && x2==x8 && x2!="" && x5!="" && x8!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p3==""){
	x3 = x;
	button3.setText(x);
	tf.setText(x + " Turn");
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x3 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x3 = "O";}
	p3 = "3";
	}
	if(x2==x1 && x1==x3 && x2==x3 && x2!="" && x1!="" && x3!=""){
	winner();
	w = "winner";}
	else if(x3==x5 && x5==x7 && x3==x7 && x3!="" && x5!="" && x7!=""){
	winner();
	w = "winner";}
	else if(x3==x6 && x6==x9 && x3==x9 && x3!="" && x6!="" && x9!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent	e){
if(w==""){
	if(p4==""){
	button4.setText(x);
	tf.setText(x + " Turn");
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x4 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x4 = "O";}
	p4 = "4";
	}
	if(x4==x5 && x4==x6 && x5==x6 && x4!="" && x5!="" && x6!=""){
	winner();
	w = "winner";}
	else if(x1==x4 && x4==x7 && x1==x7 && x1!="" && x4!="" && x7!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button5.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p5==""){
	button5.setText(x);
	tf.setText(x + " Turn");
	x5 = x;
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x5 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x5 = "O";}
	p5 = "5";
	}
	if(x4==x5 && x4==x6 && x5==x6 && x4!="" && x5!="" && x6!=""){
	winner();
	w = "winner";}
	else if(x1==x5 && x5==x9 && x5==x9 && x1!="" && x5!="" && x9!=""){
	winner();
	w = "winner";}
	else if(x3==x5 && x5==x7 && x3==x7 && x3!="" && x5!="" && x7!=""){
	winner();
	w = "winner";}
	else if(x2==x5 && x5==x8 && x2==x8 && x2!="" && x5!="" && x8!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button6.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p6==""){
	button6.setText(x);
	tf.setText(x + " Turn");
	x6 = x;
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x6 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x6 = "O";}
	p6 = "6";
	}
	if(x4==x5 && x4==x6 && x5==x6 && x4!="" && x5!="" && x6!=""){
	winner();
	w = "winner";}
	else if(x3==x6 && x6==x9 && x3==x9 && x3!="" && x6!="" && x9!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button7.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p7==""){
	button7.setText(x);
	tf.setText(x + " Turn");
	x7 = x;
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x7 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x7 = "O";}
	p7 = "7";
	}
	if(x7==x8 && x7==x9 && x8==x9 && x7!="" && x8!="" && x9!=""){
	winner();
	w = "winner";}
	else if(x3==x5 && x5==x7 && x3==x7 && x3!="" && x5!="" && x7!=""){
	winner();
	w = "winner";}
	else if(x1==x4 && x4==x7 && x1==x7 && x1!="" && x4!="" && x7!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button8.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p8==""){
	button8.setText(x);
	tf.setText(x + " Turn");
	x8 = x;
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x8 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x8 = "O";}
	p8 = "8";
	}
	if(x7==x8 && x7==x9 && x8==x9 && x7!="" && x8!="" && x9!=""){
	winner();
	w = "winner";}
	else if(x2==x5 && x5==x8 && x2==x8 && x2!="" && x5!="" && x8!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
button9.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
if(w==""){
	if(p9==""){
	button9.setText(x);
	tf.setText(x + " Turn");
	x9 = x;
	if(x=="X"){
	x = "O";
	tf.setText(x + " Turn");
	x9 = "X";}
	else{
	x = "X";
	tf.setText(x + " Turn");
	x9 = "O";}
	p9 = "9";
	}
	if(x7==x8 && x7==x9 && x8==x9 && x7!="" && x8!="" && x9!=""){
	winner();
	w = "winner";}
	else if(x1==x5 && x5==x9 && x5==x9 && x1!="" && x5!="" && x9!=""){
	winner();
	w = "winner";}
	else if(x3==x6 && x6==x9 && x3==x9 && x3!="" && x6!="" && x9!=""){
	winner();
	w = "winner";}
	else if(p1!="" && p2!="" && p3!="" && p4!="" && p5!="" && p6!="" && p7!="" && p8!="" && p9!="")
    tf.setText("The Game Was Draw");
}
}
});
}
public void winner(){
if(x=="X")
x = "O";
else
x = "X";
tf.setText(x + " Win The Game");
}
public static void main(String args[]){
new My_Tic_Tac_Toe_Game();
}
}