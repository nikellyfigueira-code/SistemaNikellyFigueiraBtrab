/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.NpfClientes;
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
public class DaoNpfClientes extends DaoAbstract {
     @Override
    public void insert(Object object) {

        NpfClientes npfClientes = (NpfClientes) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_nikelly_figueira_IFMS";
            user = "nikelly_figueira";
            password = "nikelly_figueira";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into npf_clientes values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, npfClientes.getNpfIdClientes());
            pst.setString(2, npfClientes.getNpfNome());
            pst.setString(3, npfClientes.getNpfCpf());
            pst.setDate(4, null);
            pst.setInt(5, npfClientes.getNpfGenero());
            pst.setString(6, npfClientes.getNpfTelefone());
            pst.setString(7, npfClientes.getNpfEmail());
            pst.setString(8, npfClientes.getNpfEndereco());
            pst.setString(9, npfClientes.getNpfNumero());
            pst.setString(10, npfClientes.getNpfBairro());
            pst.setString(11, npfClientes.getNpfCidade());
            pst.setString(12, npfClientes.getNpfEstado());
            pst.setString(13, npfClientes.getNpfCep());
            pst.setString(14, npfClientes.getNpfPreferencia_Perfume());
            pst.setString(15, npfClientes.getNpfAtivo());

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