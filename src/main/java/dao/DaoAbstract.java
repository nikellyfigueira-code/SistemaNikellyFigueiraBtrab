/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author u71831545136
 */
public abstract class DaoAbstract {
    public abstract void insert(Object object);
    public abstract Object list(int id);
    public abstract Object listAll();
}
