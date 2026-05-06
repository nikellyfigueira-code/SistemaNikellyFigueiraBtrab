/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcCrud {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://10.7.0.51:33062/db_nikelly_figueira_IFMS";
            String user = "nikelly_figueira";
            String password = "nikelly_figueira";

            Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "insert into npf_usuarios (npf_idusuarios, npf_nome, npf_apelido, npf_cpf) values (?, ?, ?, ?)";

            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, 610);
            pst.setString(2, "nikelly");
            pst.setString(3, "npf");
            pst.setString(4, "23626");

            pst.executeUpdate();

            System.out.println("Executou");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}