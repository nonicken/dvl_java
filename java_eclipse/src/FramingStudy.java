/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */

public class FramingStudy {
	
	class FrameJDialog01 {
		Frame frame;
		Dialog dialog;
		
		public FrameJDialog01() {
			// TODO Auto-generated constructor stub
			
		}
		
		class Dialog extends JDialog{
			
		}
		
		class Frame extends JFrame{
			
		}
	}
	
	class FrameJDialog extends JFrame implements ActionListener{
		
		JButton button ;
		ExtJDialog extJDialog;
		
		public FrameJDialog() 
//				throws HeadlessException 
		{
//			super();
			setTitle("title");
			setBounds(0, 0, 500, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			
			button = new JButton("click");
			getContentPane().add(button);
			button.addActionListener(this);
			setVisible(true);
		}

		class ExtJDialog extends JDialog {
			ExtJPanel extJPanel;
			
			class ExtJPanel extends JPanel{
				JLabel label;

				public ExtJPanel() {
					label = new JLabel("label difficult");
					this.add(label);
				}
				
			}

			public ExtJDialog(JFrame jfr) {
				super(jfr, "title", true);
				extJPanel = new ExtJPanel();
				setPreferredSize(new Dimension(200, 100));
				getContentPane().add(extJPanel);
				pack();
				setVisible(true);
			}
			
			
			
		}
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			extJDialog = new ExtJDialog(this);
		}
		
	}
	
    class FrameKeyListener extends JFrame implements KeyListener {

        public FrameKeyListener() {
            setTitle("title");
            setBounds(0, 0, 500, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            addKeyListener(this);
            setVisible(true);
        }

        @Override
        public void keyTyped(KeyEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void keyPressed(KeyEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
            int hit = e.getKeyCode();
            switch(hit) {
                case KeyEvent.VK_UP:
                    System.out.println("up hit");
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("down hit");
                    break;
                case KeyEvent.VK_LEFT:
                    System.out.println("left hit");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("right hit");
                    break;
                default:
                    System.out.println("not yet implemented");
                    System.out.println("touche enfoncee: " + e.getKeyText(hit));
//                    System.out.println(KeyEvent.VK_UP);
//                    System.out.println(hit);
            }
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
    
    
    class FrameJTable extends JFrame {
//        String[] cols = {"col01", "col02"};
//        Object[][] data = {
//            {"1-1", "1-2"}, 
//            {"2-1", "2-2"}, 
//            {"3-1", "3-2"}
//        };
        DefaultTableModel tablemodel;
    

        public FrameJTable() {
            setTitle("title");
            setBounds(0, 0, 500, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
//            JTable table = new JTable(data, cols);
            tablemodel = new DefaultTableModel();
            JTable table = new JTable(tablemodel);
            tablemodel.addColumn("col01");
            tablemodel.addColumn("col02");
            
            tablemodel.insertRow(0, new Object[]{"1-1", "1-2"});
            tablemodel.insertRow(1, new Object[]{"2-1", "2-2"});
            tablemodel.insertRow(2, new Object[]{"3-1", "3-2"});
            tablemodel.insertRow(3, new Object[]{"4-1", "4-2"});
            tablemodel.insertRow(4, new Object[]{"5-1", "5-2"});
            tablemodel.insertRow(5, new Object[]{"6-1", "6-2"});
            
            
            
            JScrollPane scrollpane = new JScrollPane(table);
            
            getContentPane().add(scrollpane);
            setVisible(true);
        }
        
    }

    
    class FrameList extends JFrame {
        JList list;
//        String[] data = {
//            "1", "2", "3", "4"
//        };
        DefaultListModel listmodel;
        JButton buttonAdd, buttonRem;
        
        public FrameList() {
            setTitle("title");
            setBounds(0, 0, 500, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            buttonAdd = new JButton("add");
            buttonRem = new JButton("Remove");
            listmodel = new DefaultListModel();
            
            listmodel.addElement("elt 1");
            listmodel.addElement("elt 2");
            listmodel.addElement("elt 3");
            listmodel.addElement("elt 4");
            listmodel.addElement("elt 5");
            listmodel.addElement("elt 6");
            listmodel.addElement("elt 7");
            listmodel.addElement("elt 8");
            listmodel.addElement("elt 9");
            listmodel.addElement("elt 10");
            listmodel.addElement("elt 11");
            listmodel.addElement("elt 12");
            listmodel.addElement("elt 13");
            listmodel.addElement("elt 14");
            listmodel.addElement("elt 15");
            
            buttonAdd.addActionListener(new ActionListening());
            buttonRem.addActionListener(new ActionListening());
//            list = new JList(data);
            list = new JList(listmodel);
            JScrollPane scrollpane = new JScrollPane(list);
            setLayout(new FlowLayout());
            
            getContentPane().add(scrollpane);
            getContentPane().add(buttonAdd);
            getContentPane().add(buttonRem);
            setVisible(true);
        }
        
        class ActionListening implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
//                throw new UnsupportedOperationException("Not supported yet.");
                if(e.getSource() == buttonAdd){
                    listmodel.addElement("new elt");
                }
                if (e.getSource() == buttonRem){
                    listmodel.removeElementAt(1);
                }
            }
            
        }
        
    }
    
    class FrameScrollPane extends JFrame{
        JButton button;
        JTextArea textarea;
        JLabel label;
        
        public FrameScrollPane() {
            setTitle("title");
            setBounds(0, 0, 500, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            button = new JButton("click");
            textarea = new JTextArea("default", 3, 50);
            JScrollPane scrollpane = new JScrollPane(textarea);
            label = new JLabel("label");
            
            Container container = getContentPane();
            
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
//                    throw new UnsupportedOperationException("Not supported yet.");
                    label.setText(textarea.getText());
                }
            });
            
            container.add(button, BorderLayout.SOUTH);
            container.add(scrollpane, BorderLayout.CENTER);
            container.add(label, BorderLayout.EAST);
            
            setVisible(true);
        }
        
    }
    
    class FrameProgressBar extends JFrame{
        JProgressBar progressbar;
        JButton button;
        Thread thread;

        public FrameProgressBar() {
            setTitle("title");
            setBounds(0, 0, 500, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            
            progressbar = new JProgressBar();
            button = new JButton("go");
            
            progressbar.setMaximum(100);
            progressbar.setMinimum(0);
            progressbar.setStringPainted(true);
            
            setVisible(true);
            
            for(int i = 0; i < 10; i++){
                try {
                    progressbar.setValue(i*10);
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
//                    Logger.getLogger(Framing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            getContentPane().add(progressbar, BorderLayout.NORTH);
//            setVisible(true);
        }
    }
    
    class Regexing01{
        
        public Regexing01() {
            Pattern pattern = Pattern.compile("^[ab]");
            Matcher matcher = pattern.matcher("akondro");
            boolean b = matcher.matches();
            
            System.out.println("b: " + b);
        }        
    }
    
    class FrameTextField extends JFrame implements ActionListener{

    JTextField textfield01, textfield02;
    JButton button;
    JLabel label;
    
    public FrameTextField() {
        setTitle("title");
        setBounds(0, 0, 500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        textfield01 = new JTextField(20);
        textfield02 = new JTextField(20);
        button = new JButton("click");
        label = new JLabel("this is a label");
        textfield01.setDragEnabled(true);
        textfield02.setDragEnabled(true);
        
        button.addActionListener(this);
        setLayout(new FlowLayout());
        getContentPane().add(textfield01);
        getContentPane().add(button);
        getContentPane().add(textfield02);
        getContentPane().add(label);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet.");
            textfield02.setText(textfield01.getText());
        }
    
}   
    
}

