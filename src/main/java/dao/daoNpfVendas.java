/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.NpfVendas;
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
public class daoNpfVendas extends DaoAbstract{
   @Override
    public void insert(Object object) {

        NpfVendas npfVendas = (NpfVendas) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_nikelly_figueira_IFMS";
            user = "nikelly_figueira";
            password = "nikelly_figueira";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into npf_pedido values (?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, npfVendas.getNpfIdPedido());

            pst.setDate(2,
                    new java.sql.Date(
                            npfVendas.getNpfDataPedido().getTime()
                    )
            );

            pst.setInt(3, npfVendas.getNpfCliente());
            pst.setInt(4, npfVendas.getNpfUsuario());
            pst.setInt(5, npfVendas.getNpfVendedor());
            pst.setDouble(6, npfVendas.getNpfTotal());

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