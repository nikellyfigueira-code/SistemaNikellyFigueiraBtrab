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
    
    private int npfIdCompra;
    private Date npfDataCompra;
    private int npfFornecedor;
    private int npfUsuario;
    private double npfTotal;

    /**
     * @return the npfIdCompra
     */
    public int getNpfIdCompra() {
        return npfIdCompra;
    }

    /**
     * @param npfIdCompra the npfIdCompra to set
     */
    public void setNpfIdCompra(int npfIdCompra) {
        this.npfIdCompra = npfIdCompra;
    }

    /**
     * @return the npfDataCompra
     */
    public Date getNpfDataCompra() {
        return npfDataCompra;
    }

    /**
     * @param npfDataCompra the npfDataCompra to set
     */
    public void setNpfDataCompra(Date npfDataCompra) {
        this.npfDataCompra = npfDataCompra;
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
    public int getNpfUsuario() {
        return npfUsuario;
    }

    /**
     * @param npfUsuario the npfUsuario to set
     */
    public void setNpfUsuario(int npfUsuario) {
        this.npfUsuario = npfUsuario;
    }

    /**
     * @return the npfTotal
     */
    public double getNpfTotal() {
        return npfTotal;
    }

    /**
     * @param npfTotal the npfTotal to set
     */
    public void setNpfTotal(double npfTotal) {
        this.npfTotal = npfTotal;
    }
}