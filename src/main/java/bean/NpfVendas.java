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
public class NpfVendas {
    private int npfIdPedido;
    private Date npfDataPedido;
    private int npfCliente;
    private int npfUsuario;
    private int npfVendedor;
    private double npfTotal;

    /**
     * @return the npfIdPedido
     */
    public int getNpfIdPedido() {
        return npfIdPedido;
    }

    /**
     * @param npfIdPedido the npfIdPedido to set
     */
    public void setNpfIdPedido(int npfIdPedido) {
        this.npfIdPedido = npfIdPedido;
    }

    /**
     * @return the npfDataPedido
     */
    public Date getNpfDataPedido() {
        return npfDataPedido;
    }

    /**
     * @param npfDataPedido the npfDataPedido to set
     */
    public void setNpfDataPedido(Date npfDataPedido) {
        this.npfDataPedido = npfDataPedido;
    }

    /**
     * @return the npfCliente
     */
    public int getNpfCliente() {
        return npfCliente;
    }

    /**
     * @param npfCliente the npfCliente to set
     */
    public void setNpfCliente(int npfCliente) {
        this.npfCliente = npfCliente;
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
     * @return the npfVendedor
     */
    public int getNpfVendedor() {
        return npfVendedor;
    }

    /**
     * @param npfVendedor the npfVendedor to set
     */
    public void setNpfVendedor(int npfVendedor) {
        this.npfVendedor = npfVendedor;
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
