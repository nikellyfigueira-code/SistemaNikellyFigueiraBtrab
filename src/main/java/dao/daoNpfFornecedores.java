/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import bean.NpfFornecedores;
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
public class daoNpfFornecedores extends DaoAbstract{
     @Override
    public void insert(Object object) {

        NpfFornecedores npfFornecedores = (NpfFornecedores) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url, user, password;

            url = "jdbc:mysql://10.7.0.51:33062/db_nikelly_figueira_IFMS";
            user = "nikelly_figueira";
            password = "nikelly_figueira";

            Connection cnt;

            cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into npf_fornecedor values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, npfFornecedores.getNpfIdFornecedor());
            pst.setString(2, npfFornecedores.getNpfNomeEmpresa());
            pst.setString(3, npfFornecedores.getNpfCnpj());
            pst.setString(4, npfFornecedores.getNpfTipoFornecedor());
            pst.setString(5, npfFornecedores.getNpfCategoriaProduto());
            pst.setString(6, npfFornecedores.getNpfFormaPagamento());
            pst.setString(7, npfFornecedores.getNpfTelefone());
            pst.setString(8, npfFornecedores.getNpfEmail());
            pst.setString(9, npfFornecedores.getNpfEndereco());
            pst.setString(10, npfFornecedores.getNpfNumero());
            pst.setString(11, npfFornecedores.getNpfBairro());
            pst.setString(12, npfFornecedores.getNpfCidade());
            pst.setString(13, npfFornecedores.getNpfEstado());
            pst.setString(14, npfFornecedores.getNpfCep());
            pst.setString(15, npfFornecedores.getNpfContatoResponsavel());
            pst.setString(16, npfFornecedores.getNpfAtivo());

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

