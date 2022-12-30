import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.undo.UndoManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
public class TextEditors extends JFrame{
    JFrame frame;
    public void editor(){
    frame = new JFrame();
    frame.setTitle("TextEditor");
    frame.setBounds(100, 100, 1000, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(new BorderLayout(0, 0));
    
    // creating a textArea
    JTextArea textArea = new JTextArea();
    frame.getContentPane().add(textArea, BorderLayout.CENTER);
    textArea.setFont(new Font("Arial",Font.PLAIN,20));
    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);
    UndoManager undo = new UndoManager();
    textArea.getDocument().addUndoableEditListener(undo);

    JMenu file = new JMenu("File");
    menuBar.add(file);
    // adding menuitem 
    JMenuItem newFile = new JMenuItem("New");
    // adding actionlistener for 'new'
    newFile.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent ae){
        textArea.setText("");
      }
    });
    file.add(newFile);
    
    JMenuItem saveFile = new JMenuItem("Save");
    // adding actionlistener for 'Save'
    saveFile.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JFileChooser filechooser = new JFileChooser("f:");
            int t = filechooser.showSaveDialog(null);
    
              if(t == JFileChooser.APPROVE_OPTION){
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
              try{
                    FileWriter filewriter = new FileWriter(file, false);
                    BufferedWriter bufferwr = new BufferedWriter(filewriter);
                    bufferwr.write(textArea.getText());
                    bufferwr.flush();
                    bufferwr.close();
                 }
               catch (Exception ex){
                  JOptionPane.showMessageDialog(frame, ex.getMessage());
               }
            }
         }
   });
   file.add(saveFile);

   JMenuItem openFile = new JMenuItem("Open");
    // Adding actionlistener for "Open"
    openFile.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
         JFileChooser filechooser = new JFileChooser("f:");
            int t = filechooser.showOpenDialog(null);
    
              if(t == JFileChooser.APPROVE_OPTION){
                  File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                  try{
                    String str="",str1="";
                    FileReader fileread = new FileReader(file);
                    BufferedReader bufferrd = new BufferedReader(fileread);
                    str1=bufferrd.readLine();
                    while((str=bufferrd.readLine())!=null){
                        str1=str1+"\n"+str;
                     }
                    textArea.setText(str1);
                  }
                  catch(Exception ex){
                  JOptionPane.showMessageDialog(frame, ex.getMessage());
                  }
               }
         }      
   });
   file.add(openFile);

   JMenuItem print = new JMenuItem("print");
   // adding actionlistener for 'print'
   print.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
            try{
              textArea.print();
            }catch (Exception ex){
               JOptionPane.showMessageDialog(frame, ex.getMessage());
            }
         }
   });
   file.add(print);
   JMenuItem close = new JMenuItem("Close");
   close.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e){
   frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
   }
   });
    file.add(close);
    JMenu edit = new JMenu("Edit");
    menuBar.add(edit);
    
    JMenuItem cut = new JMenuItem("Cut");
    cut.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
      textArea.cut();
    }
    });
    edit.add(cut);
    
    JMenuItem copy = new JMenuItem("Copy");
    copy.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        textArea.copy();
    }
    });
    edit.add(copy);
    
    JMenuItem paste = new JMenuItem("Paste");
    paste.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        textArea.paste();
    }
    });
    edit.add(paste);
    
    JMenuItem undoItem = new JMenuItem("Undo");
    undoItem.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        undo.undo();
    }
    });
    edit.add(undoItem);

    JMenu help = new JMenu("Help");
    menuBar.add(help);
    // create a menuitem for 'help'
    JMenuItem info = new JMenuItem("Info");
    info.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
      JOptionPane.showMessageDialog(frame, "This application is developed by Sana Siddiqui","Information",JOptionPane.PLAIN_MESSAGE);
    }
    });
    help.add(info);
     JScrollPane scrollPane = new JScrollPane(textArea);  
     scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);  
     scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
     frame.getContentPane().add(scrollPane);  
    
  }
   public TextEditors(){
   editor();
  }

  public static void main(String[] args){
    
      TextEditors s = new TextEditors();
      s.frame.setVisible(true);
   }
}
