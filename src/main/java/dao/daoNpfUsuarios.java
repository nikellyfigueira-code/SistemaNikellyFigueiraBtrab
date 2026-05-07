/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.NpfUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import teste.JdbcCrud;

/**
 *
 * @author u71831545136
 */
 
public class daoNpfUsuarios extends DaoAbstract {
    
    @Override
    public void insert(Object object) {
        NpfUsuarios npfUsuarios = (NpfUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_nikelly_figueira_IFMS";
            user = "nikelly_figueira";
            password = "nikelly_figueira";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into npf_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, npfUsuarios.getNpfIdUsuarios());
            pst.setString(2, npfUsuarios.getNpfNome());
            pst.setString(3, npfUsuarios.getNpfApelido());
            pst.setString(4, npfUsuarios.getNpfCpf());
            pst.setDate(5, null);
            pst.setInt(6, npfUsuarios.getNpfNivel());
            pst.setString(7, npfUsuarios.getNpfSenha());
            pst.setString(8, npfUsuarios.getNpfAtivo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    


    @Override
    public Object list(int id) {

        return null;

    }

    @Override
    public Object listAll() {

        return null;

    }

}   

