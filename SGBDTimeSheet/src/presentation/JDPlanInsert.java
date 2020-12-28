/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import bean.Employé;
import bean.Jour;
import bean.Planning;
import bean.Projet;
import dao.DaoException;
import dao.DaoFactory;
import dao.EmployeDao;
import dao.JourDao;
import dao.PlanningDao;
import dao.ProjetDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabien
 */
public class JDPlanInsert extends javax.swing.JDialog {
    
    private DaoFactory factory = DaoFactory.getInstance();
    private PlanningDao daoPlan = factory.getPlanningDao();
    private EmployeDao employeDao = factory.getEmployeDao();
    private ProjetDao projetDao = factory.getProjetDao();
    private JourDao jourDao = factory.getJourDao();
            
    
    private TableModelPlanning myPlanModel = new TableModelPlanning(daoPlan.selectPlanning());
    
    

    public JDPlanInsert(java.awt.Frame parent, String titre) {
        super(parent, titre,true);
        initComponents();
        fillComponents();
        //getRootPane().setDefaultButton(JButtonOk);
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employé = new java.awt.Label();
        projet = new java.awt.Label();
        jour = new java.awt.Label();
        heure = new java.awt.Label();
        JComboBoxEmp = new javax.swing.JComboBox();
        jComboBoxproj = new javax.swing.JComboBox();
        jComboBoxJour = new javax.swing.JComboBox();
        jTextFieldnbH = new javax.swing.JTextField();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        employé.setText("employé:");

        projet.setText("projet:\n");

        jour.setText("jour:\n\n");

        heure.setText("Nombre d'Heure");

        JComboBoxEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxEmpActionPerformed(evt);
            }
        });

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jButtonOK.setText("OK\n");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employé, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JComboBoxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxproj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnbH))
                .addGap(67, 67, 67))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(jButtonOK)
                    .addContainerGap(286, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employé, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JComboBoxEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxproj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldnbH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jButtonAnnuler)
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(jButtonOK)
                    .addGap(30, 30, 30)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBoxEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxEmpActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed

   Planning planning = new Planning();
   planning.setEmployé((Employé)JComboBoxEmp.getSelectedItem());
   planning.setProjet((Projet)jComboBoxproj.getSelectedItem());
   planning.setJour((Jour)jComboBoxJour.getSelectedItem());
   planning.setNbHeures(Integer.parseInt(jTextFieldnbH.getText()));
   
        
        try {
            daoPlan.insertPlan(planning);
        } catch (DaoException e) {
            JOptionPane.showMessageDialog(null,"Insertion impossible ! ","Avertissement",JOptionPane.ERROR_MESSAGE);
        }

        this.dispose();
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
     this.dispose();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

   private void fillComponents()
    {
        
        /* charger toutes les catégories */
        ArrayList <Employé> emp = employeDao.selectEmployes();
        for (int i=0;i<emp.size();i++)
            JComboBoxEmp.addItem(emp.get(i));
        
           ArrayList <Projet> pro = projetDao.selectProjets();
        for (int i=0;i<pro.size();i++)
            jComboBoxproj.addItem(pro.get(i));
       
             ArrayList <Jour> jour = jourDao.selectJours();
        for (int i=0;i<jour.size();i++)
            jComboBoxJour.addItem(jour.get(i));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComboBoxEmp;
    private java.awt.Label employé;
    private java.awt.Label heure;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JComboBox jComboBoxJour;
    private javax.swing.JComboBox jComboBoxproj;
    private javax.swing.JTextField jTextFieldnbH;
    private java.awt.Label jour;
    private java.awt.Label projet;
    // End of variables declaration//GEN-END:variables
}
