/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetont;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.sparql.core.Prologue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static org.eclipse.jetty.util.IO.delete;

/**
 *
 * @author Saber
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form recherche
     */
    public search() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ComboBox2 = new javax.swing.JComboBox();
        ComboBox1 = new javax.swing.JComboBox();
        TextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search");
        setForeground(new java.awt.Color(0, 102, 51));

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane1.setViewportView(TextArea1);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 0)));

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 0)));

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Identification", "Problem" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        TextField1.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
       ComboBox2.removeAllItems();
        switch (ComboBox1.getSelectedItem().toString()) {
            
            case "Identification":
                ComboBox2.setEnabled(true);
                ComboBox2.addItem("Identifier");
                ComboBox2.addItem("Author");
                ComboBox2.addItem("Name");
                break;
            
            case "Problem":
                ComboBox2.setEnabled(false);
                break;
           
        }
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
File direc = new File("C:\\Users\\Saber\\Documents\\NetBeansProjects\\ProjetOnt\\Result Of Search");
    	if(direc.exists()){
    		
    		
    			File[] list=direc.listFiles();
    			for(int i=0;i<list.length;i++){
                           delete(list[i]);
                        
    }//GEN-LAST:event_jButton2ActionPerformed

        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
 
        
        String SOURCE = "MetaProPOSv2.owl";
    
        
      OntModel model = ModelFactory.createOntologyModel(OntModelSpec.OWL_DL_MEM_TRANS_INF);
		        model.read( SOURCE, "RDF/XML" );
                        
                        
                        
  //****************************************************************************************************
                        
                        
		         
if (("Identification".equals(ComboBox1.getSelectedItem().toString()))&& ("Author".equals(ComboBox2.getSelectedItem().toString()))){
				   
			   
				TextArea1.setText("");
				String queryString =
		     "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                           
		        	  
		        "select ?Pattern " +
                    
		       	"where  {" +
" ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAuthor> ?Author FILTER regex(str(?Author) , \"" + TextField1.getText().toLowerCase()+ "\" ). "+ 
//" ?Identfier   <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#Pattern> ?Pattern   ."+
                                        
                                 "}";
                                        
                       
                      int i=1;
		   Query query = QueryFactory.create(queryString);
		        QueryExecution qexec = QueryExecutionFactory.create(query, model);
                        ResultSet rs3 = qexec.execSelect() ;
              while (  rs3.hasNext()  )
              {
                  
                  String filename="Result Of Search by Author";
                  
                  File f=new File("C:\\Users\\Saber\\Documents\\NetBeansProjects\\ProjetOnt\\Result Of Search\\"+filename + i+".txt");
        PrintWriter p=null;
        try {
             p=new PrintWriter(new FileWriter(f));
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
                  QuerySolution rb3 = rs3.nextSolution() ;
              
              
              RDFNode y4 = rb3.get("Pattern");
              
              //System.out.println(y4);
              String s= y4.toString();
              
              
     String n= s.substring(66);
     
        
     //p.println("Name: "+n);
     //p.println(" ");
           
                                        
            TextArea1.append("Name: "+n);  
             TextArea1.append("\n");
             
             
             
        
             
             String [] tab = new String [9];
             tab[0]="Name";
             tab[1]="Identifier";
             tab[2]="Author";
             tab[3]="Problem";
             tab[4]="Solution";
             tab[5]="Domain";
             tab[6]="Type";
             tab[7]="Collection";
             tab[8]="Abstraction_level";
             
             
              
                   
              String query1 =
                      "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                      
                      
                      "select * " +
                      
                      "where  {" +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasName> ?Name." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasIdentifier> ?Identifier." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAuthor> ?Author." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasProblem> ?Problem." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasSolution> ?Solution." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasDomain> ?Domain." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasType> ?Type." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasCollection> ?Collection." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAbstractionLevel> ?Abstraction_level." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasInitialContext> ?Initial_context." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasResultingContext> ?Resulting_context." +
                      
                      "FILTER regex(str(?Pattern),\""+s+"\")"+
                      
                      "}";
              
              for(int j=0;j<9;j++)
              {
              Query query12;
              query12 = QueryFactory.create(query1);
              QueryExecution qexec1 = QueryExecutionFactory.create(query1, model);
              ResultSet rs1 = qexec1.execSelect() ;
              
               
              
              while (  (rs1.hasNext()) && (j<9)   )
              {  QuerySolution rb12= rs1.nextSolution() ;
              
              String ss=tab[j];
              RDFNode y1 = rb12.get(ss);
              String s1= y1.toString();
              String r1= s1.substring(66);
              System.out.println(ss +": "+r1);
              
              if((j==3) || (j==4) || (j==5) )
              {
                p.println("**********************************************");
              }
              p.println(ss +": "+r1);
              p.println(" ");
              
              }
              
              }
              p.close();
              // Pour l'instant nous nous limitons a des requetes de type SELECT
              
              // Affichage des resultats
             // System.out.print(ResultSetFormatter.asText(rs1));
              
              
             /**String res=ResultSetFormatter.asXMLString(rs1);
                      
                   System.out.println(res);
                  
                      p.println(res);
                    
                      p.close();
                **/      
                      
                  
                      
                      
                      
                      
                      
                      
                      
              
              
            i++;  
              
        
                                           
          
              }
                         
                           }      
       //****************************************************************************************************
                           
                         
                           
else if (("Identification".equals(ComboBox1.getSelectedItem().toString()))&& ("Identifier".equals(ComboBox2.getSelectedItem().toString()))){                           
   
    
    
              TextArea1.setText("");
             
				String queryString2 =
		     "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                           
		        	  
		        "select ?Pattern " +
                    
		       	"where  {" +
" ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasIdentifier> ?Identifier FILTER regex(str(?Identifier) , \"" + TextField1.getText().toLowerCase()+ "\" ). "+ 
//" ?Identfier   <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#Pattern> ?Pattern   ."+
                                        
                                 "}";
                                        
                       
                      int ii=1;
		   Query query122 = QueryFactory.create(queryString2);
		        QueryExecution qexec2 = QueryExecutionFactory.create(query122, model);
                        ResultSet rs33 = qexec2.execSelect() ;
              while (  rs33.hasNext()  )
              {
                  
                  String filename2="Result Of Search by Identifier";
                  
                  File ff=new File("C:\\Users\\Saber\\Documents\\NetBeansProjects\\ProjetOnt\\Result Of Search\\"+filename2 + ii+".txt");
        PrintWriter p1=null;
        try {
             p1=new PrintWriter(new FileWriter(ff));
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
                  QuerySolution rb13 = rs33.nextSolution() ;
              
              
              RDFNode y14 = rb13.get("Pattern");
              
              //System.out.println(y4);
              String ss= y14.toString();
              
              
     String nn= ss.substring(66);
     
        
     //p.println("Name: "+n);
     //p.println(" ");
           
                                        
            TextArea1.append("Name: "+nn);  
             TextArea1.append("\n");
             
             
             
        
             
             String [] tab1 = new String [9];
             tab1[0]="Name";
             tab1[1]="Identifier";
             tab1[2]="Author";
             tab1[3]="Problem";
             tab1[4]="Solution";
             tab1[5]="Domain";
             tab1[6]="Type";
             tab1[7]="Collection";
             tab1[8]="Abstraction_level";
             
             
              
                   
              String query13 =
                      "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                      
                      
                      "select * " +
                      
                      "where  {" +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasName> ?Name." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasIdentifier> ?Identifier." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAuthor> ?Author." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasProblem> ?Problem." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasSolution> ?Solution." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasDomain> ?Domain." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasType> ?Type." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasCollection> ?Collection." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAbstractionLevel> ?Abstraction_level." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasInitialContext> ?Initial_context." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasResultingContext> ?Resulting_context." +
                      
                      "FILTER regex(str(?Pattern),\""+ss+"\")"+
                      
                      "}";
              
              for(int j=0;j<9;j++)
              {
              Query query12;
              query12 = QueryFactory.create(query13);
              QueryExecution qexec1 = QueryExecutionFactory.create(query12, model);
              ResultSet rs1 = qexec1.execSelect() ;
              
               
              
              while (  (rs1.hasNext()) && (j<9)   )
              {  QuerySolution rb12= rs1.nextSolution() ;
              
              String sss=tab1[j];
              RDFNode y1 = rb12.get(sss);
              String s1= y1.toString();
              String r1= s1.substring(66);
              if((j==3) || (j==4) || (j==5) )
              {
                p1.println("**********************************************");
              }
              System.out.println(sss +": "+r1);
              p1.println(sss +": "+r1);
              p1.println(" ");
              
              }
              
              }
              p1.close();
              // Pour l'instant nous nous limitons a des requetes de type SELECT
              
              // Affichage des resultats
             // System.out.print(ResultSetFormatter.asText(rs1));
              
              
             /**String res=ResultSetFormatter.asXMLString(rs1);
                      
                   System.out.println(res);
                  
                      p.println(res);
                    
                      p.close();
                **/      
             
            ii++;  
              }
}
             

else if (("Identification".equals(ComboBox1.getSelectedItem().toString()))&& ("Name".equals(ComboBox2.getSelectedItem().toString()))){                           
   
    
    
              TextArea1.setText("");
				String queryString2 =
		     "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                           
		        	  
		        "select ?Pattern " +
                    
		       	"where  {" +
" ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasName> ?Name FILTER regex(str(?Name) , \"" + TextField1.getText().toLowerCase()+ "\" ). "+ 
                                        
                                 "}";
                                        
                       
                      int ii=1;
		   Query query122 = QueryFactory.create(queryString2);
		        QueryExecution qexec2 = QueryExecutionFactory.create(query122, model);
                        ResultSet rs33 = qexec2.execSelect() ;
              while (  rs33.hasNext()  )
              {
                  
                  String filename2="Result Of Search by Name";
                  
                  File ff=new File("C:\\Users\\Saber\\Documents\\NetBeansProjects\\ProjetOnt\\Result Of Search\\"+filename2 + ii+".txt");
        PrintWriter p1=null;
        try {
             p1=new PrintWriter(new FileWriter(ff));
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
                  QuerySolution rb13 = rs33.nextSolution() ;
              
              
              RDFNode y14 = rb13.get("Pattern");
              
              //System.out.println(y4);
              String ss= y14.toString();
              
              
     String nn= ss.substring(66);
     
        
     //p.println("Name: "+n);
     //p.println(" ");
           
                                        
            TextArea1.append("Name: "+nn);  
             TextArea1.append("\n");
             
             
             
        
             
             String [] tab1 = new String [9];
             tab1[0]="Name";
             tab1[1]="Identifier";
             tab1[2]="Author";
             tab1[3]="Problem";
             tab1[4]="Solution";
             tab1[5]="Domain";
             tab1[6]="Type";
             tab1[7]="Collection";
             tab1[8]="Abstraction_level";
             
             
              
                   
              String query13 =
                      "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                      
                      
                      "select * " +
                      
                      "where  {" +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasName> ?Name." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasIdentifier> ?Identifier." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAuthor> ?Author." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasProblem> ?Problem." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasSolution> ?Solution." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasDomain> ?Domain." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasType> ?Type." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasCollection> ?Collection." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAbstractionLevel> ?Abstraction_level." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasInitialContext> ?Initial_context." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasResultingContext> ?Resulting_context." +
                      
                      "FILTER regex(str(?Pattern),\""+ss+"\")"+
                      
                      "}";
              
              for(int j=0;j<9;j++)
              {
              Query query12;
              query12 = QueryFactory.create(query13);
              QueryExecution qexec1 = QueryExecutionFactory.create(query12, model);
              ResultSet rs1 = qexec1.execSelect() ;
              
               
              
              while (  (rs1.hasNext()) && (j<9)   )
              {  QuerySolution rb12= rs1.nextSolution() ;
              
              String sss=tab1[j];
              RDFNode y1 = rb12.get(sss);
              String s1= y1.toString();
              String r1= s1.substring(66);
              if((j==3) || (j==4) || (j==5) )
              {
                p1.println("**********************************************");
              }
              System.out.println(sss +": "+r1);
              p1.println(sss +": "+r1);
              p1.println(" ");
              
              }
              
              }
              p1.close();
              // Pour l'instant nous nous limitons a des requetes de type SELECT
              
              // Affichage des resultats
             // System.out.print(ResultSetFormatter.asText(rs1));
              
              
             /**String res=ResultSetFormatter.asXMLString(rs1);
                      
                   System.out.println(res);
                  
                      p.println(res);
                    
                      p.close();
                **/      
   
            ii++;  
              }
   
}
 
else if (("Problem".equals(ComboBox1.getSelectedItem().toString()))){
    
              TextArea1.setText("");
              String cont=TextField1.getText().toLowerCase();
if ((" ".equals(cont))|| (".".equals(cont)) || ("?".equals(cont)) || ("!".equals(cont))){
   JOptionPane.showMessageDialog(null, "please write a significant word");
}else{
              
				String queryString2 =
		     "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                           
		        	  
		        "select ?Pattern " +
                    
		       	"where  {" +
" ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasProblem> ?Problem FILTER regex(str(?Problem) , \"" + TextField1.getText().toLowerCase()+ "\" ). "+ 
//" ?Identfier   <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#Pattern> ?Pattern   ."+
                                        
                                 "}";
                                        
                       
                      int ii=1;
		   Query query122 = QueryFactory.create(queryString2);
		        QueryExecution qexec2 = QueryExecutionFactory.create(query122, model);
                        ResultSet rs33 = qexec2.execSelect() ;
              while (  rs33.hasNext()  )
              {
                  
                  String filename2="Result Of Search by Problem";
                  
                  File ff=new File("C:\\Users\\Saber\\Documents\\NetBeansProjects\\ProjetOnt\\Result Of Search\\"+filename2 + ii+".txt");
        PrintWriter p1=null;
        try {
             p1=new PrintWriter(new FileWriter(ff));
        } catch (IOException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
        }
                  QuerySolution rb13 = rs33.nextSolution() ;
              
              
              RDFNode y14 = rb13.get("Pattern");
              
              //System.out.println(y4);
              String ss= y14.toString();
              
              
     String nn= ss.substring(66);
     
        
     //p.println("Name: "+n);
     //p.println(" ");
           
                                        
            TextArea1.append("Name: "+nn);  
             TextArea1.append("\n");
             
             
             
        
             
             String [] tab1 = new String [9];
             tab1[0]="Name";
             tab1[1]="Identifier";
             tab1[2]="Author";
             tab1[3]="Problem";
             tab1[4]="Solution";
             tab1[5]="Domain";
             tab1[6]="Type";
             tab1[7]="Collection";
             tab1[8]="Abstraction_level";
             
             
              
                   
              String query13 =
                      "PREFIX MetaProPOSv2:<http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#>" +
                      
                      
                      "select * " +
                      
                      "where  {" +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasName> ?Name." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasIdentifier> ?Identifier." +
                      " ?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAuthor> ?Author." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasProblem> ?Problem." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#HasSolution> ?Solution." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasDomain> ?Domain." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasType> ?Type." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasCollection> ?Collection." +
                      "?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasAbstractionLevel> ?Abstraction_level." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasInitialContext> ?Initial_context." +
                      //"?Pattern <http://www.semanticweb.org/ontologies/2013/11/20/MetaProPOSv2.owl#hasResultingContext> ?Resulting_context." +
                      
                      "FILTER regex(str(?Pattern),\""+ss+"\")"+
                      
                      "}";
              
              for(int j=0;j<9;j++)
              {
              Query query12;
              query12 = QueryFactory.create(query13);
              QueryExecution qexec1 = QueryExecutionFactory.create(query12, model);
              ResultSet rs1 = qexec1.execSelect() ;
              
               
              
              while (  (rs1.hasNext()) && (j<9)   )
              {  QuerySolution rb12= rs1.nextSolution() ;
              
              String sss=tab1[j];
              RDFNode y1 = rb12.get(sss);
              String s1= y1.toString();
              String r1= s1.substring(66);
              if((j==3) || (j==4) || (j==5) )
              {
                p1.println("**********************************************");
              }
              System.out.println(sss +": "+r1);
              p1.println(sss +": "+r1);
              p1.println(" ");
              
              String res=ResultSetFormatter.asXMLString(rs1);
                      
                   System.out.println(res);
                  
                      p1.println(res);
                    
                      
              }
              
              }
              p1.close();
              // Pour l'instant nous nous limitons a des requetes de type SELECT
              
              // Affichage des resultats
             // System.out.print(ResultSetFormatter.asText(rs1));
              
              
             
                      
             
            ii++;  
              }
    
    
    
    
    
}

}

                           
                           
                           
                           
                           
                           
                                               


        

    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox1;
    private javax.swing.JComboBox ComboBox2;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextField TextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
