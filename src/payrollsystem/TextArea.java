package payrollsystem;
/**
 *
 * @author Wycliffe
 */
public class TextArea extends javax.swing.JFrame {  
  
    /** Creates new form TextArea */  
    public TextArea() 
    {  
        initComponents();  
    }  
    
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">  
    private void initComponents() {  
  
        jScrollPane1 = new javax.swing.JScrollPane();  
        textArea = new javax.swing.JTextArea();  
  
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
  
        textArea.setColumns(20);  
        textArea.setEditable(false);  
        textArea.setLineWrap(true);  
        textArea.setRows(5);  
        jScrollPane1.setViewportView(textArea);  
  
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
        getContentPane().setLayout(layout);  
        layout.setHorizontalGroup(  
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
            .addGroup(layout.createSequentialGroup()  
                .addGap(20, 20, 20)  
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)  
                .addContainerGap(108, Short.MAX_VALUE))  
        );  
        layout.setVerticalGroup(  
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
            .addGroup(layout.createSequentialGroup()  
                .addGap(22, 22, 22)  
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)  
                .addContainerGap(21, Short.MAX_VALUE))  
        );  
  
        pack();  
    }// </editor-fold>  
  
  
     private java.util.ArrayList getShowText()
     {  
        //go to tShow and get its text, put it into one string  
        String dvd = textArea.getText();  
  
        java.util.ArrayList myList = new java.util.ArrayList();  
        java.util.StringTokenizer one = new java.util.StringTokenizer(dvd, "\n");  
  
        while(one.hasMoreElements())
        {  
            myList.add(one.nextToken());  
        }  
  
  
        return myList;  
    }  
  
    public void setShowText(java.util.ArrayList myList){  
  
        String show = new String();  
        for (int sub = 0; sub < myList.size(); sub++)  
            show += myList.get(sub) + "\n";  
  
        textArea.setText(show);  
    }  
  
  
    /** 
    * @param args the command line arguments 
    */  
    public static void main(String args[]) 
    {  
        java.awt.EventQueue.invokeLater(new Runnable() 
        {  
            public void run() {  
                new TextArea().setVisible(true);  
            }  
        }); 
        
    }  
  
    // Variables declaration - do not modify  
    private javax.swing.JScrollPane jScrollPane1;  
    private javax.swing.JTextArea textArea;  
    // End of variables declaration  
  
}  