/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


//import gnu.prolog.term.AtomTerm;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

//import gnu.prolog.vm.Environment;
//import gnu.prolog.vm.Interpreter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.InputEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author root
 */

class FrameJpanel extends JFrame {
    
    Panel panel;
    
    public class Panel extends JPanel {
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawLine(0, 0, 100, 100);
            
            g.setColor(Color.red);
            g.drawString("coucou", 100, 50);
            g.setColor(Color.blue);
            g.drawString("je suis la", 150, 50);
            
            String fontes[] = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames() ;
            Study_java.printSimpleArrString(fontes);
        }
    }
    
    public FrameJpanel(){
        setTitle("title");
        setBounds(0, 0, 500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel();
        Container c = getContentPane();
        c.add(panel);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing( WindowEvent w){
                System.out.println("u closed it");
            }
        });
    }
    
}

class FrameMouseListener extends JFrame implements MouseListener{

    public JButton button;
    public JLabel label;
    
    public FrameMouseListener(){
        setTitle("titire");
        setBounds(10, 10, 500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("button");
        label = new JLabel("this is a label");
        Container container = getContentPane();
        setLayout(new FlowLayout());
        container.add(button);
        container.add(label);
        button.addMouseListener(this);
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("mouse_clicked");
        if((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0){
            System.out.println("clicked on left");
//        }else if((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0){
//            System.out.println("clicked on right");
        }else if (((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) & e.isControlDown()){
            System.out.println("ctrl_down and button_right_clicked");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("mouse_pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("mouse_released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("mouse_entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("mouse_exited");
    }
    
}

class Frame02 extends JFrame implements ActionListener{
    JButton button;
    Frame02(){
        setTitle("tiitle");
        setBounds(50, 100, 300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button=new JButton("button");
        Container c=getContentPane();
        c.setLayout(new FlowLayout());
        c.add(button);
        button.addActionListener(this);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("button_clicked");
    }
    
}

class Frame01 extends JFrame implements MouseListener, ActionListener{

    public JButton button01;
    
    public Frame01(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("title00");
        setBounds(50, 100, 300, 100);
        button01=new JButton("button01");
        addMouseListener(this);
        button01.addActionListener(this);
        setVisible(true);
        addMouseListener(this);
        add(button01);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("tadan");
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("button clicked");
    }
    
}



class Framing00 extends JFrame implements ActionListener{

    JButton button;
    public Framing00() {
        button=new JButton("button");
        setTitle("title");
        setBounds(10, 10, 300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(button);
        button.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("u clicked");
    }
    
}



class Framing01 extends JFrame implements ActionListener{

    JButton button;
    JCheckBox jcb01, jcb02;
    
    public Framing01() {
        setTitle("title");
        setBounds(50, 50, 500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button = new JButton("click");
        jcb01 = new JCheckBox("coucou");
        jcb02 = new JCheckBox("coco");
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jcb01);
        container.add(jcb02);
        container.add(button);
        
        button.addActionListener(this);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        if(e.getSource() == button){
//            System.out.println("");
            if(jcb01.isSelected())
                System.out.println("01 is selected");
            if(jcb02.isSelected())
                System.out.println("02 is selected");
        }
            
    }
    
}


class extJFrame extends JFrame {
    extJPanel extJp;

    public extJFrame() {
        setTitle("title");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        extJp = new extJPanel();
        Container container=getContentPane();
//        container.setLayout(new FlowLayout());
        add(extJp);
        setVisible(true);
    }
    
}

class extJPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawLine(10, 0, 500, 50);
        g.drawLine (15, 10, 100, 50);

    }
}


class FrameJTextArea extends JFrame{
    JTextArea textArea = new JTextArea("default", 5, 50);

    public FrameJTextArea() {
        setTitle("title");
        setBounds(0, 0, 500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        textArea.setPreferredSize(new Dimension(50, 50));
        
        JScrollPane scrollpane= new JScrollPane(textArea);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        setVisible(true);
    }
}


class FrameSplitPane extends JFrame {

    public FrameSplitPane() {
        setTitle("title");
        setBounds(0, 0, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel01 panel01 = new Panel01();
        Panel02 panel02 = new Panel02();
        JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                panel01, panel02);
        splitpane.setOneTouchExpandable(true);
        splitpane.setDividerLocation(50);
        getContentPane().add(splitpane, BorderLayout.CENTER);
        setVisible(true);
    }
    
    class Panel02 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            g.setColor(Color.red);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            setBackground(Color.red);
        }
    }
    
    class Panel01 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            g.setColor(Color.blue);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            setBackground(Color.blue);
        }
    }
}


class FrameTabbedPane extends JFrame {
    class Panel01 extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.green);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
    }
    
    class Panel02 extends JPanel{
        Panel02 () {
            setBackground(Color.black);
        }
//        @Override
//        public void paintComponent(Graphics g) {
////            g.setColor(Color.red);
////            g.fillRect(0, 0, this.getWidth(), this.getHeight());
//        }
    }

    public FrameTabbedPane(){
        setTitle("title");
        setBounds(0, 0, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        Panel01 pan01 = new Panel01();
        Panel02 pan02 = new Panel02();
        
        pan01.add(new JButton("button"));
        JTabbedPane tabbedPane = new JTabbedPane();
        
        tabbedPane.add("green", pan01);
//        tabbedPane.setIconAt(0, new ImageIcon(
//                "/srv/mmedia/pic/axe.jpeg"));

        tabbedPane.add("red", pan02);
        
        getContentPane().add(tabbedPane);
        setVisible(true);
    }
    
}



class FrameSlider extends JFrame implements ChangeListener{

    public FrameSlider() {
        setTitle("title");
        setBounds(0, 0, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JSlider slide = new JSlider();
        
        slide.setMaximum(100);
        slide.setMinimum(0);
        slide.setValue(30);
        slide.setPaintTicks(true);
        slide.setPaintLabels(true);
        slide.setMinorTickSpacing(10);
        slide.setMajorTickSpacing(20);

        slide.addChangeListener(this);
        
        this.getContentPane().add(slide, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        System.out.println(""+(
                    (JSlider)(e.getSource())
                ).getValue()
             );
    }
    
}


class FrameJList extends JFrame{

    public FrameJList() {
        setTitle("title");
        setBounds(0, 0, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        String[] data = {
            "1", "2", "3", "4", "5",
            "1", "2", "3", "4", "5"
        };
        JList list = new JList(data);
//        list.setVisibleRowCount(2);
        
        JTextArea textarea = new JTextArea("default", 2, 50);
        JScrollPane scrollpane=new JScrollPane(textarea);
        scrollpane.setPreferredSize(new Dimension(200, 100));
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(scrollpane
//        		, BorderLayout.WEST
        		);
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));
        getContentPane().add( panel
//        		, BorderLayout.CENTER
        		);
        setVisible(true);
    }
    
}

public class Study_java {
    
    /**
     * @param args the command line arguments
     */
    enum d {adsqwe};
    enum Jour { lundi, mardi, mercredi, jeudi, vendredi, samedi, dimanche }
    public static void main00(String[] args) {
//        Framing00 f = new Framing00();
//        Framing01 f = new Framing01();
//        extJFrame e = new extJFrame();
    
//        int a = sum(4, 6, 8, 3);
//        System.out.println("a: " + a);
//        try{
//            writeOut();
//        }
//        catch (IOException ioe){
//            System.out.println("ioexception launched");
//        }
        
//        new FrameMouseListener();
//        new FrameJpanel();
//        testdoWhile();
//        new FrameJTextArea();
//        new FrameSplitPane();
//        new FrameTabbedPane();
//        new FrameSlider();
//        new FrameJList();
}
    
    public static void testdoWhile(){
        int x = 0;
        do{
            System.out.println("x: "+x );
            x++;
        }while(x < 5);
    }
    
    public static void printSimpleArrString(String[] strArr) {
        for ( int i = 0; i < strArr.length; i++){
            if ( i != strArr.length - 1 ){
                System.out.print(strArr[i] + ", ");
            }else{
                System.out.println(strArr[i] );
            }
        }
    }

    
    public static void writeOut()throws IOException{
        String path00 = "/root/dvl/java/coucou.coco";
        DataOutputStream dops = new DataOutputStream(
                new FileOutputStream(path00)
                );
        dops.writeInt(3);
    }
    
    public static int sum(int ... ints){
        int res = 0;
        for (int i = 0; i < ints.length; i++){
            res += ints[i];
        }
        return res;
    }
    
    public static int fibo(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n<0)   return -1;
        else    return fibo(n - 1) + fibo (n - 2);
    }
    
    public static int add(int a, int b){
        return a+b;
    }
    
    public static int facto(int n) {
        if(n>1){
            return n*facto(n - 1);
        }else if (n == 1) {
            return 1;
        }
        else{
            return -1;
        }
    
    }
    
    public static String readStr(String txt){
        Scanner s = new Scanner(System.in);
        System.out.print(txt);

        String t = s.nextLine();
//        System.out.println(t);
        return t;
    }

    public static void studyLinkedList(){
    	LinkedList<String> ll = new LinkedList<String>();
    	ll.add("coucou");
    	ll.add("tt");
    	
    	for (int a = 0; a < ll.size(); a++){
    		System.out.println(ll.get(a));
    	}
    	
    	ListIterator li = ll.listIterator();
    	li.next();
    	
    	li.remove();
    	li.next();
    	li.remove();
    	for (int a = 0; a < ll.size(); a++){
    		System.out.println(ll.get(a));
    	}
    }
    
    public static void studyArrayList(){
    	ArrayList<String> al = new ArrayList<String>();
    	al.add("coucou");
    	al.add("patate");
    	al.add("akondro");
    	
    	al.remove(0);
    	
    	System.out.println(al);
    }
    
    public static void nothing00(){
//    	int[] ia = new int[3];
    	int []ia = {
    			1,
    			2,
    			4
    	};
    }
    
    public static void studyHashMap(){
    	HashMap hs = new HashMap();
    	hs.put(0, "the first");
    	String a = (String)hs.get(0);
    }
}