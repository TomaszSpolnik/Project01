import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
                                                                                /**
                                                                                 * @author Tomasz Spolnik
                                                                                 */
public class GSJFrame extends javax.swing.JFrame {                              //GUI for Spendings   
    String area1;
    String read1;
    String paths;
    Double value;
    Double read2;
    Double newearn;
    int Earnings;
    int a;
    int b;
    int i;
    PrintWriter Zapisane;    
    double[] currentWeek = new double[8];		    
    void simpleMessage() throws FileNotFoundException{
    }    
    public GSJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")                  
    private void initComponents() {                                             //Creating buttons and binding them with listeners + autogenerated code
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();       
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        jButton1.setText("Monday");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton2.setText("Tuesday");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton3.setText("Wednesday");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton4.setText("Thursday");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton5.setText("Friday");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton6.setText("Saturday");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton7.setText("Sunday");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        textArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textArea1MouseClicked(evt);
            }
        });
        textArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textArea1KeyPressed(evt);
            }
        });
        jButton8.setText("Flush");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton9.setText("Sum it up!");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton10.setText("Directory");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton11.setText("Set limit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(0, 3, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(61, 61, 61)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addComponent(textArea1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pack();
    }                     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {      //day selected message                                      
        textArea1.setText("Write in your today's expenses");
                a = 1;                
    }                                        
    private void textArea1KeyPressed(java.awt.event.KeyEvent evt) {             //void that manages day choosing and limit                                     
        if (evt.getKeyCode() == evt.VK_ENTER) {
                area1 = (textArea1.getText());
                double value = Double.parseDouble(area1);                      
                if (a==1){
                    File file1 = new File(paths, "Monday.txt");      
                        if(file1.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Monday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[0] = read2;
                        }
                        else{
                    currentWeek[0] = value;
                    textArea1.setText("Monday's    expenses: £" + currentWeek[0]);                   	
                    try {
                        Zapisane = new PrintWriter("Monday.txt");
                        Zapisane.println(currentWeek[0]);
                        Zapisane.close();                       
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }
                if (a==2){
                    File file2 = new File(paths, "Tuesday.txt");      
                        if(file2.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Tuesday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[1] = read2;
                        }
                        else{
                    currentWeek[1] = value;
                    textArea1.setText("Tuesday's    expenses: £" + currentWeek[1]);                   	
                    try {
                        Zapisane = new PrintWriter("Tuesday.txt");
                        Zapisane.println(currentWeek[1]);
                        Zapisane.close();                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }
                if (a==3){
                    File file3 = new File(paths, "Wednesday.txt");      
                        if(file3.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Wednesday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[2] = read2;
                        }
                        else{
                    currentWeek[2] = value;
                    textArea1.setText("Wednesday's    expenses: £" + currentWeek[2]);                   	
                    try {
                        Zapisane = new PrintWriter("Wednesday.txt");
                        Zapisane.println(currentWeek[2]);
                        Zapisane.close();                     
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }
                if (a==4){
                    File file4 = new File(paths, "Thursday.txt");      
                        if(file4.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Thursday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[3] = read2;
                        }
                        else{
                    currentWeek[3] = value;
                    textArea1.setText("Thursday's    expenses: £" + currentWeek[3]);                   	
                    try {
                        Zapisane = new PrintWriter("Thursday.txt");
                        Zapisane.println(currentWeek[3]);
                        Zapisane.close();              
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }
                if (a==5){
                    File file5 = new File(paths, "Friday.txt");      
                        if(file5.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Friday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[4] = read2;
                        }
                        else{
                    currentWeek[4] = value;
                    textArea1.setText("Friday's    expenses: £" + currentWeek[4]);                   	
                    try {
                        Zapisane = new PrintWriter("Friday.txt");
                        Zapisane.println(currentWeek[4]);
                        Zapisane.close();       
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }
                if (a==6){
                    File file6 = new File(paths, "Saturday.txt");      
                        if(file6.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Saturday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[5] = read2;
                        }
                        else{
                    currentWeek[5] = value;
                    textArea1.setText("Saturday's    expenses: £" + currentWeek[5]);                   	
                    try {
                        Zapisane = new PrintWriter("Saturday.txt");
                        Zapisane.println(currentWeek[5]);
                        Zapisane.close();   
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }
                if (a==7){
                    File file7 = new File(paths, "Sunday.txt");      
                        if(file7.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Sunday.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("file already exists £" + read1);
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[6] = read2;
                        }
                        else{
                    currentWeek[6] = value;
                    textArea1.setText("Sunday's    expenses: £" + currentWeek[6]);                   	
                    try {
                        Zapisane = new PrintWriter("Sunday.txt");
                        Zapisane.println(currentWeek[6]);
                        Zapisane.close();      
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                } 
                if (a==8){             
                File file0 = new File(paths, "Limit.txt");      
                    currentWeek[7] = value;
                    textArea1.setText("Weekly limit is now overwritten to: £" + currentWeek[7]);
                    newearn = value;
                    Integer i = newearn.intValue();
                    Earnings = i;
                    try {
                        Zapisane = new PrintWriter("Limit.txt");
                        Zapisane.println(currentWeek[7]);
                        Zapisane.close();                       
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }    
                    }
                }         
    }                                    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textArea1.setText("Write in your today's expenses");
                a = 2;   
    }                                        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textArea1.setText("Write in your today's expenses");
                a = 3;   
    }                                        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textArea1.setText("Write in your today's expenses");
                a = 4;   
    }                                        
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textArea1.setText("Write in your today's expenses");
                a = 5;   
    }                                        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textArea1.setText("Write in your today's expenses");
                a = 6;   
    }                                        
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        textArea1.setText("Write in your today's expenses");
                a = 7;   
    }                                        
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {      //void that deletes old data                                      
        File file1 = new File(paths, "Monday.txt");      
        if(file1.delete()){
            textArea1.setText("Files deleted");
        }
        File file2 = new File(paths, "Tuesday.txt");      
        if(file2.delete()){
            textArea1.setText("Files deleted");
        }
        File file3 = new File(paths, "Wednesday.txt");      
        if(file3.delete()){
            textArea1.setText("Files deleted");
        }
        File file4 = new File(paths, "Thursday.txt");      
        if(file4.delete()){
            textArea1.setText("Files deleted");
        }
        File file5 = new File(paths, "Friday.txt");      
        if(file5.delete()){
            textArea1.setText("Files deleted");
        }
        File file6 = new File(paths, "Saturday.txt");      
        if(file6.delete()){
            textArea1.setText("Files deleted");
        }
        File file7 = new File(paths, "Sunday.txt");      
        if(file7.delete()){
            textArea1.setText("Files deleted");
        }     	
    }                                        
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {      //void that manages Saldo and Spendings                                       		
        double Spendings = currentWeek[0] + currentWeek[1] + currentWeek[2] + currentWeek[3] + currentWeek[4] + currentWeek[5] + currentWeek[6];
	double Saldo = Earnings - Spendings;	
	textArea1.setText("You can still spend: £" + Saldo);               
    }                                        
    private void textArea1MouseClicked(java.awt.event.MouseEvent evt) {         //screen focus on mouse                                      
        textArea1.setText("");
    }                                      
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {     //check paths                                          
        String paths = new File(".").getAbsolutePath();
        textArea1.setText(paths);
    }                                         
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {     //changing limit                                          
        textArea1.setText("Change your weekly spendings limit");
                a = 8;
    }                                         
    private void formWindowOpened(java.awt.event.WindowEvent evt) {             //welcome screen and reading the files as the program starts                                
                        File file0 = new File(paths, "Limit.txt");      
                        if(file0.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Limit.txt"));
                                String read1 = in.nextLine();
                                textArea1.setText("The limit is set up to £" + read1 + "\nFlush memory to delete old data \nTo set a new limit click Set limit \nTo check files directory click Directory");
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[7] = read2;
                            newearn = currentWeek[7];
                            int i = newearn.intValue();
                            Earnings = i;  
                        }
                        File file1 = new File(paths, "Monday.txt");      
                        if(file1.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Monday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[0] = read2; 
                        }
                        File file2 = new File(paths, "Tuesday.txt");      
                        if(file2.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Tuesday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[1] = read2;
                        }
                        File file3 = new File(paths, "Wednesday.txt");      
                        if(file3.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Wednesday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[2] = read2;
                        }
                        File file4 = new File(paths, "Thursday.txt");      
                        if(file4.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Thursday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[3] = read2;
                        }
                        File file5 = new File(paths, "Friday.txt");      
                        if(file5.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Friday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[4] = read2;
                        }
                        File file6 = new File(paths, "Saturday.txt");      
                        if(file6.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Saturday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[5] = read2;
                        }
                        File file7 = new File(paths, "Sunday.txt");      
                        if(file7.exists()){
                            try {
                                Scanner in = new Scanner(new FileReader("Sunday.txt"));
                                String read1 = in.nextLine();
                                read2 = Double.parseDouble(read1);
                            } catch (FileNotFoundException ex) {
                                Logger.getLogger(GSJFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            currentWeek[6] = read2;
                        }
                        else{                                                   //default limit value
                            Earnings = 75;
                            textArea1.setText("The limit is set up to £" + Earnings + "\nFlush memory to delete old data \nTo set a new limit click Set limit \nTo check files directory click Directory");
                        }                                         
    }                                 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GSJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GSJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GSJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GSJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GSJFrame().setVisible(true);
            }           
        });
    }                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private java.awt.TextArea textArea1;                
}
