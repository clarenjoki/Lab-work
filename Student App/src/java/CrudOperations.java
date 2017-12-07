
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apsmu
 */
public class CrudOperations {
    private int ID;
    private String f_name;
    private String last_name;
    private String Gender;
    private String Program;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setf_name(String f_name) {
        this.f_name = f_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setProgram(String Program) {
        this.Program = Program;
    }

    public int getID() {
        return ID;
    }

    public String getf_name() {
        return f_name;
    }

    public String getlast_name() {
        return last_name;
    }

    public String getGender() {
        return Gender;
    }

    public String getProgram() {
        return Program;
    }
    
    //methods
    public int processGender(String g)
    {
        if(g.equalsIgnoreCase("male"))
        {
            return 1;
        }
        return 0;
    }
    public boolean save()
    {
        PreparedStatement pst = null;
        Connection con= new dbconnection().connector();
       try
       {
           pst=con.prepareStatement("INSERT INTO student_details (ID, f_name, last_name, Gender, Program) VALUES(?,?,?,?,?)");
            pst.setInt(1,getID());
            pst.setString(2, getf_name());
            pst.setString(3, getlast_name());
            pst.setInt(4, processGender(getGender()));
            pst.setString(5, getProgram());
            pst.executeUpdate();
            return true;
       }
       catch(SQLException ex)
       {
        System.out.println("Error" + ex.getMessage());
        return false;
       }

    }
    
    public boolean removeRecord(){
        return true;
    }
    
    public boolean updateRecord(){
        return true;
    }

    

    void setlast_name(String last_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
