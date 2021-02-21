package A3DLL;


import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuUpdate{
     public static void main (String[] args){
         
    DLL<Integer> List = new DLL<>();
   /* char menuItem = 'y';
    Scanner MenuItem = new Scanner(System.in);
    Scanner ListItem = new Scanner(System.in);*/
    
    JButton insertItem = new JButton("add item");
    JButton removeItem = new JButton("remove item");
    JLabel isEmpty = new JLabel("true");
    JLabel numItems = new JLabel("0");
    JLabel firstItem = new JLabel("none");
    JLabel lastItem = new JLabel("none");
    
    String[] menuOptions = {"Save", "Load"};
    JComboBox Menu = new JComboBox(menuOptions);
    Menu.setSelectedIndex(1);
    
    Menu.addActionListener(
            new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            //adds function to dropdown menu
            String selection = (String)Menu.getSelectedItem();
                switch(selection){
                    case "Save":
                    {
                        try {
                            PrintWriter listSave = new PrintWriter("F:/sample.txt");
                           
                             listSave.write(List.getList().toString());
                            
                            listSave.flush();
                            listSave.close();
                        } catch (FileNotFoundException ex) {
                            System.out.println("no file");
                        }
                        catch (NullPointerException NE) {
                            System.out.println("null pointer");
                        }
                    }
                       System.out.println(List.getList());
                        System.out.println("saving");
                        break;
                    case "Load":
                        System.out.println("loading");
                        break;
                    default:
                        break;
                }
        }
                
            }
    );
    
    JPanel MenuPanel = new JPanel();
    MenuPanel.setLayout(new FlowLayout());
        
    JPanel top = new JPanel();
    top.setLayout(new FlowLayout());
    
    JPanel middle = new JPanel();
    
    JPanel bottom = new JPanel();
    bottom.setLayout(new FlowLayout());
    
    insertItem.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rand = new Random();
                List.insertFirstItem(rand.nextInt()%20);
                isEmpty.setText(String.valueOf(List.isEmpty()));
                numItems.setText(String.valueOf(List.size()));
                firstItem.setText(String.valueOf(List.getFirstItem()));
                lastItem.setText(String.valueOf(List.getLastItem()));
                }
                
            }
        );
    
    removeItem.addActionListener(
            new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                List.removeFirstItem();
                isEmpty.setText(String.valueOf(List.isEmpty()));
                numItems.setText(String.valueOf(List.size()));
                firstItem.setText(String.valueOf(List.getFirstItem()));
                lastItem.setText(String.valueOf(List.getLastItem()));
                 }catch(NullPointerException np){System.out.println("List is null");};
                }
                
            }
        );
    
    JFrame Frame = new JFrame("DLL Interface");
    Frame.setSize(640, 480);
    Frame.setLayout(new GridLayout(5, 1));
    
    MenuPanel.add(Menu);
     
    top.add(insertItem);
    top.add(removeItem);
     
    middle.add(isEmpty);
    middle.add(numItems);
     
    bottom.add(firstItem);
    bottom.add(lastItem);
     
    Frame.add(MenuPanel);
    Frame.add(top);
    Frame.add(middle);
    Frame.add(bottom);
     
    Frame.setVisible(true);
     
    Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
   /* do {
        menuItem = MenuItem.next().charAt(0);
        
        switch(menuItem){
            
            //size
            case '1':
                try{
                    System.out.println(List.size());
                    break;
                }
                catch(Exception e){}
            
            //list is empty
            case '2':
                try{
                    System.out.println(List.isEmpty());
                   break; 
                }
                catch(Exception e){}
             
            //get first item
            case '3':
                try{
                    System.out.println(List.getFirstItem());
                    break;
                }
                catch(Exception e){}
            
            //get last item
            case '4':
                try{
                   System.out.println(List.getLastItem());
                   break; 
                }
                catch(Exception e){}
                
            //insert first item
            case '5':
                try{
                    List.insertFirstItem(ListItem.nextInt());
                    break;
                }
                catch(Exception e){}
                
            //insert last item
            case '6':
                try{
                  List.insertLastItem(ListItem.nextInt());
                  break;  
                }
                catch(Exception e){}
                
            //remove first item
            case '7':
                try{
                   List.removeFirstItem();
                   break; 
                }
                catch(Exception e){}
                
            //remove last item
            case '8':
                try{
                   List.removeLastItem();
                   break; 
                }
                catch(Exception e){}
                
            default:
                System.out.println("Invalid Input");
            
        }
        
    }while(menuItem != 'e');
    
     */}
}