/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Employé;
import java.util.ArrayList;


public interface EmployeDao {

    public  ArrayList<Employé> selectEmployes() throws DaoException;

    public void insertEmp(Employé employe);

    public void deleteEmploye(int idEmploye);

    public void updateEmploye(Employé employe);

    public boolean existEmp(Employé employe);
}