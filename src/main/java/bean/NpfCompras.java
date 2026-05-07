/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author u71831545136
 */
public class NpfCompras {
    private int npfIdCompras;
    private Date npfData_Compra;
    private int npfFornecedor;
    private String npfUsuario;
    private Double npfTotal;

    /**
     * @return the npfIdCompras
     */
    public int getNpfIdCompras() {
        return npfIdCompras;
    }

    /**
     * @param npfIdCompras the npfIdCompras to set
     */
    public void setNpfIdCompras(int npfIdCompras) {
        this.npfIdCompras = npfIdCompras;
    }

    /**
     * @return the npfData_Compra
     */
    public Date getNpfData_Compra() {
        return npfData_Compra;
    }

    /**
     * @param npfData_Compra the npfData_Compra to set
     */
    public void setNpfData_Compra(Date npfData_Compra) {
        this.npfData_Compra = npfData_Compra;
    }

    /**
     * @return the npfFornecedor
     */
    public int getNpfFornecedor() {
        return npfFornecedor;
    }

    /**
     * @param npfFornecedor the npfFornecedor to set
     */
    public void setNpfFornecedor(int npfFornecedor) {
        this.npfFornecedor = npfFornecedor;
    }

    /**
     * @return the npfUsuario
     */
    public String getNpfUsuario() {
        return npfUsuario;
    }

    /**
     * @param npfUsuario the npfUsuario to set
     */
    public void setNpfUsuario(String npfUsuario) {
        this.npfUsuario = npfUsuario;
    }

    /**
     * @return the npftotal
     */
    public double getNpftotal() {
        return npfTotal;
    }

    /**
     * @param npftotal the npftotal to set
     */
    public void setNpftotal(double npftotal) {
        this.npfTotal = npftotal;
    }
    
}
