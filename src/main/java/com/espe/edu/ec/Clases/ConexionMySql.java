/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.edu.ec.Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author solan
 */
public class ConexionMySql {
    Connection con = null;
    Operaciones op = new Operaciones();

    public Connection conexionmySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/control_de_ventas_pico_espinosa", "root", "1234");
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "error de conexion " + e);
        }
        return con;
    }

    public String buscarCliente(String CI) {
        Connection reg = conexionmySQL();
        String sql, ci = "", nom = "", ape = "", apemate = "", fijo="", celu = "", direc = "", correo = "";
        String ans = "No existe registro";
        try {

            sql = "select * FROM CLIENTE where cli_cedula = '" + CI + "'";
            PreparedStatement pst = reg.prepareStatement(sql);
            ResultSet resul = pst.executeQuery();
            while (resul.next()) {
                ci = resul.getString(1);
                nom = resul.getString(2);
                ape = resul.getString(3);
                apemate = resul.getString(4);
                fijo = resul.getString(5);
                celu = resul.getString(6);
                direc = resul.getString(7);
                correo = resul.getString(8);
                ans = ci + " " + nom + " " + ape + " " + apemate + " " + fijo + " " + celu + " " + direc + " " + correo;
            }
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return ans;
    }

    public void IngresoClientes(String ci, String nombre, String apellido, String apellidoMate, String fijo, String celu, String direccion, String correo) {
        Connection reg = conexionmySQL();
        try {
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            PreparedStatement sentencia = reg.prepareStatement("INSERT INTO cliente VALUES (?,?,?,?,?,?,?,?)");
            sentencia.setString(8, correo);
            sentencia.setString(7, direccion);
            sentencia.setString(6, celu);
            sentencia.setString(5, fijo);
            sentencia.setString(4, nombre);
            sentencia.setString(3, apellidoMate);
            sentencia.setString(2, apellido);
            sentencia.setString(1, ci);
            //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
            int res = sentencia.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "OK, DATOS GUARDADOS");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR, DATOS FALLIDOS");
            }
        } catch (SQLException ex) {
            System.out.println("Algo Salio mal :(");
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel cargarDatosCliente(DefaultTableModel modeloCliente) {
        int cont1 = 1;
        Connection reg = conexionmySQL();
        Object[] tcliente = new Object[9];
        try {
            Statement sentenciaSQL = reg.createStatement();
            ResultSet p = sentenciaSQL.executeQuery("select * from CLIENTE");
            while (p.next()) {
                tcliente[0] = cont1;
                tcliente[1] = p.getString("cli_cedula");
                tcliente[2] = p.getString("cli_nombres");
                tcliente[3] = p.getString("cli_apellidopaterno");
                tcliente[4] = p.getString("cli_apellidomaterno");
                tcliente[5] = p.getString("cli_fijo");
                tcliente[6] = p.getString("cli_celular");
                tcliente[7] = p.getString("cli_direccion");
                tcliente[8] = p.getString("cli_correo");
                modeloCliente.addRow(tcliente);
                cont1 = cont1 + 1;
            }
            System.out.println(":'v");
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return modeloCliente;
    }

    public DefaultTableModel cargarDatosProducto(DefaultTableModel modeloCliente) {
        int cont1 = 1;
        Connection reg = conexionmySQL();
        Object[] tproducto = new Object[7];
        try {
            Statement sentenciaSQL = reg.createStatement();
            ResultSet p = sentenciaSQL.executeQuery("select * from PRODUCTO");
            while (p.next()) {
                tproducto[0] = cont1;
                tproducto[1] = p.getString("pro_codigo");
                tproducto[2] = p.getString("pro_serie");
                tproducto[3] = p.getString("pro_marca");
                tproducto[4] = p.getString("pro_precio");
                tproducto[5] = p.getString("pro_descripcion");
                tproducto[6] = p.getString("pro_tipo");
                modeloCliente.addRow(tproducto);
                cont1 = cont1 + 1;
            }
            System.out.println(":'v");
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return modeloCliente;
    }

    public int eliminarCliente(String codigo) {
        int val = 0;
        Connection reg = conexionmySQL();
        try {
            PreparedStatement sentencia = reg.prepareStatement("DELETE FROM CLIENTE WHERE cli_cedula= ?");
            sentencia.setString(1, codigo);
            sentencia.execute();
            sentencia.close();
            System.out.println("Se ha eliminado: " + codigo);
            val = 1;
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return val;
    }

    public int modificarCliente(String cedula, String fijo) {
        int val = 0;
        Connection reg = conexionmySQL();
        try {
            PreparedStatement sentencia = reg.prepareStatement("UPDATE CLIENTE SET cli_fijo= ? WHERE cli_cedula= ?");
            sentencia.setString(1, fijo);
            sentencia.setString(2, cedula);
            sentencia.execute();
            sentencia.close();
            System.out.println("Se ha modificado: " + cedula + " a: " + fijo);
            val = 1;
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return val;
    }
    
    public int modificarCliente1(String cedula, String fijo, String celu, String dire, String correo) {
        int val = 0;
        Connection reg = conexionmySQL();
        try {
            PreparedStatement sentencia = reg.prepareStatement("UPDATE CLIENTE SET cli_fijo= ?, cli_celular = ?, cli_direccion = ?, cli_correo = ? WHERE cli_cedula= ?");
            sentencia.setString(1, fijo);
            sentencia.setString(2, celu);
            sentencia.setString(3, dire);
            sentencia.setString(4, correo);  
            sentencia.setString(5, cedula);
            sentencia.execute();
            sentencia.close();
            //System.out.println("Se ha modificado: " + cedula + " a: " + nombre);
            val = 1;
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return val;
    }

    public void ActCantidad(String cod, float ncantidad) {
        Connection reg = conexionmySQL();
        try {
            PreparedStatement sentencia = reg.prepareStatement("UPDATE PRODUCTO SET PRO_CANTIDAD= ? WHERE PRO_CODIGO= ?");
            sentencia.setFloat(1, ncantidad);
            sentencia.setString(2, cod);
            sentencia.execute();
            sentencia.close();
            System.out.println("Se ha modificado: el saldo");
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
    }
    
    public float buscarCantidadProducto(String serie) {
        Connection reg = conexionmySQL();
        float cantidad = 0;
        try {
            String sql1 = "select PRO_CANTIDAD FROM PRODUCTO where PRO_CODIGO = '" + serie + "'";
            PreparedStatement pst1 = reg.prepareStatement(sql1);
            ResultSet resul1 = pst1.executeQuery();
            while (resul1.next()) {
                cantidad = resul1.getFloat(1);
                System.out.println("Se recibio: " + cantidad);
            }
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return cantidad;
    }
    
    public void IngresoCompra(String numficha, String cicliente, String serie, String tipo, String fecha, float cantidad, float stock, float precio) throws SQLException {
        int numRegistros = 0;
        int ultimoRegistro = 0;
        /*if (tipo.equals("DEB")) {
            monto = monto * -1;
        }*/
        Connection reg = conexionmySQL();
        Statement sentenciaSQL = reg.createStatement();
        try {
            ResultSet p = sentenciaSQL.executeQuery("Select count(*) from COMPRA order by _COM_CODIGO");
            while (p.next()) {
                numRegistros = Integer.parseInt(p.getString("count(*)"));
            }
            if (numRegistros != 0) {
                p = sentenciaSQL.executeQuery("select _COM_CODIGO from COMPRA order by _COM_CODIGO desc limit 1");
                while (p.next()) {
                    ultimoRegistro = p.getInt("_COM_CODIGO");
                }
            }
            if (ultimoRegistro == 0) {
                ultimoRegistro = 1000;
            }
            System.out.println("Ultimo regirtros = " + ultimoRegistro);
            //SELECCIONO LAS SENTENCIAS DE SQL--------------
            float ncantidad = op.transaccion(cantidad, stock);
            if (ncantidad != -1) {

                PreparedStatement sentencia = reg.prepareStatement("INSERT INTO COMPRA VALUES (?,?,?,?,?,?,?,?)");
                sentencia.setString(8, fecha);
                sentencia.setFloat(7, precio);
                sentencia.setFloat(6, ncantidad);
                sentencia.setString(5, tipo);
                sentencia.setString(4, numficha);
                sentencia.setString(3, serie);
                sentencia.setString(2, cicliente);
                sentencia.setInt(1, ultimoRegistro + 1);
                int res = sentencia.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "OK, DATOS GUARDADOS");
                    ActCantidad(serie, ncantidad);
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR, DATOS FALLIDOS");
                }
            } else {
                JOptionPane.showConfirmDialog(null, "No dispone del saldo para realizar esta transaccion");
            }
        } catch (SQLException ex) {
            System.out.println("Algo Salio mal");
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DefaultTableModel cargarDatosMovimiento(DefaultTableModel modeloMovimiento) {
        Connection reg = conexionmySQL();
        Object[] tmovimiento = new Object[5];
        try {
            Statement sentenciaSQL = reg.createStatement();
            ResultSet p = sentenciaSQL.executeQuery("select * from movimiento");
            while (p.next()) {
                //tmovimiento[0] = cont1;
                //[1] = p.getString("cod_cuenta");
                tmovimiento[0] = p.getString("FECHA");
                tmovimiento[1] = p.getString("COD_MOVIMIENTO");
                tmovimiento[2] = p.getString("TIPO_MOV");
                tmovimiento[3] = p.getString("MONTO");
                tmovimiento[4] = p.getString("SALDO_MOV");
                modeloMovimiento.addRow(tmovimiento);
                //cont1 = cont1 + 1;
            }
            System.out.println(":'v");
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return modeloMovimiento;
    }

    public String buscarProducto(String serie) {
        Connection reg = conexionmySQL();
        String sql1, sql2, cod_mov = "", cod_serie = "", tipo_mov = "", fecha = "", monto = "", saldo = "";
        String ans = "No existe registro";
        try {
            sql1 = "select * FROM PRODUCTO where PRO_CODIGO = '" + serie + "'";
            PreparedStatement pst1 = reg.prepareStatement(sql1);
            ResultSet resul1 = pst1.executeQuery();

            while (resul1.next()) {
                serie = resul1.getString(1);
                ans = serie;
                System.out.println("Se recibio: " + serie);
            }
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return ans;
    }

    public String buscarMovimiento(String cuenta) {
        Connection reg = conexionmySQL();
        String sql1, sql2, cod_mov = "", cod_cuenta = "", tipo_mov = "", fecha = "", monto = "", saldo = "";
        String ans = "No existe registro";
        try {

            sql1 = "select * FROM MOVIMIENTO where codigo = '" + cuenta;
            PreparedStatement pst1 = reg.prepareStatement(sql1);
            ResultSet resul1 = pst1.executeQuery();
            while (resul1.next()) {
                cod_mov = resul1.getString(1);
                cod_cuenta = resul1.getString(2);
                tipo_mov = resul1.getString(3);
                fecha = resul1.getString(4);
                monto = resul1.getString(5);
                saldo = resul1.getString(6);
                ans = fecha + " " + "transaccion realizada" + " " + tipo_mov + " " + monto + " " + saldo;
            }
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return ans;
    }

    public float buscarSaldoProducto(String serie) {
        Connection reg = conexionmySQL();
        float saldo = 0;
        try {
            String sql1 = "select PRO_CANTIDAD FROM PRODUCTO where PRO_SERIE = '" + serie + "'";
            PreparedStatement pst1 = reg.prepareStatement(sql1);
            ResultSet resul1 = pst1.executeQuery();
            while (resul1.next()) {
                saldo = resul1.getFloat(1);
                System.out.println("Se recibio: " + saldo);
            }
        } catch (SQLException error) {
            System.out.println("Existe un ERROR: " + error);
        }
        return saldo;
    }

    public void IngresoProducto(String serie, String nombre, String marca, String descri, Double cantidad, Float precio, String tipo) throws SQLException {
        
        String cod;
        int numRegistros = 0;
        int ultimoRegistro = 0;
        Connection reg = conexionmySQL();
        Statement sentenciaSQL;
        sentenciaSQL = con.createStatement();
        try {
                ResultSet p = sentenciaSQL.executeQuery("select count(*) from producto order by PRO_CODIGO");
                while (p.next()) {
                    numRegistros = p.getInt("count(*)");
                }
                if (numRegistros != 0) {
                    p = sentenciaSQL.executeQuery("Select PRO_CODIGO from PRODUCTO order by PRO_CODIGO+0 desc limit 1");
                    while (p.next()) {
                        ultimoRegistro = p.getInt("PRO_CODIGO");
                    }
                }
                if (ultimoRegistro == 0) {
                    ultimoRegistro = 11111111;
                }
                System.out.println("Ultimo Registro: " + ultimoRegistro);
                PreparedStatement sentencia = reg.prepareStatement("INSERT INTO PRODUCTO VALUES (?,?,?,?,?,?,?,?)");
                sentencia.setString(8, tipo);
                sentencia.setFloat(7, precio);
                sentencia.setDouble(6, cantidad);
                sentencia.setString(5, descri);
                sentencia.setString(4, marca);
                sentencia.setString(3, nombre);
                sentencia.setString(2, serie);
                sentencia.setInt(1, ultimoRegistro + 1);
                //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
                int res = sentencia.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "OK, DATOS GUARDADOS");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR, DATOS FALLIDOS");
                }

            } catch (SQLException ex) {
                System.out.println("Ultimo Registro: " + ultimoRegistro);
                System.out.println("Algo Salio mal :(");
                Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    /*
    public void IngresoProducto(String serie, String nombre, String marca, String descri, Double cantidad, Float precio, String tipo) throws SQLException {

        String cod;
        int numRegistros = 0;
        int ultimoRegistro = 0;
        Connection reg = conexionmySQL();
        Statement sentenciaSQL;
        sentenciaSQL = con.createStatement();
        ResultSet p1 = sentenciaSQL.executeQuery("SELECT PRO_SERIE FROM PRODUCTO WHERE CEDULA = '" + cia + "'");
        if (buscarCliente(cia).equals("No existe registro")) {
            JOptionPane.showMessageDialog(null, "ADVERTENCIA\nCedula encontrada o no existe:" + cia + "\nIngrese otra cedula o ingrese primero un cliente");
        } else {
            try {
                ResultSet p = sentenciaSQL.executeQuery("select count(*) from cuenta order by COD_CUENTA");
                while (p.next()) {
                    numRegistros = p.getInt("count(*)");
                }
                if (numRegistros != 0) {
                    p = sentenciaSQL.executeQuery("Select COD_CUENTA from cuenta order by COD_CUENTA+0 desc limit 1");
                    while (p.next()) {
                        ultimoRegistro = p.getInt("COD_CUENTA");
                    }
                }
                if (ultimoRegistro == 0) {
                    ultimoRegistro = 11111111;
                }
                System.out.println("Ultimo Registro: " + ultimoRegistro);
                PreparedStatement sentencia = reg.prepareStatement("INSERT INTO cuenta VALUES (?,?,?,?,?)");
                sentencia.setString(5, estado);
                sentencia.setFloat(4, saldo);
                sentencia.setString(3, tipo);
                sentencia.setString(2, cia);
                sentencia.setInt(1, ultimoRegistro + 1);
                //Este metodo actualiza y si afecta a mas de una columna se pone de 1 a mas
                int res = sentencia.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "OK, DATOS GUARDADOS");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR, DATOS FALLIDOS");
                }

            } catch (SQLException ex) {
                System.out.println("Ultimo Registro: " + ultimoRegistro);
                System.out.println("Algo Salio mal :(");
                Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
*/
    public ArrayList datos(long codigo, int tipo) throws SQLException {
        ArrayList<Producto> info = new ArrayList<Producto>();
        Statement sentenciaSQL;
        sentenciaSQL = con.createStatement();
        try {
            ResultSet p = sentenciaSQL.executeQuery("select * from PRODUCTO WHERE PRO_SERIE= '" + codigo + "'  order by PRO_SERIE");
            if (p.next() == false) {
            } else {
                do {
                    Producto c = new Producto();
                    c.setCodigo(p.getDouble("PRO_CODIGO"));
                    c.setSerie(p.getDouble("PRO_SERIE"));
                    c.setNombre(p.getString("PRO_NOMBRE"));
                    c.setMarca(p.getString("PRO_MARCA"));
                    c.setDescripcion(p.getString("PRO_DESCRIPCION"));
                    c.setCantidad(p.getDouble("PRO_CANTIDAD"));
                    c.setPrecio(p.getFloat("PRO_PRECIO"));
                    c.setTipo(p.getString("PRO_TIPO"));
                    info.add(c);
                } while (p.next());
            }
        } catch (SQLException error) {
            System.out.println("No existe esa info prro :'v" + error);
        }
        return info;
    }
    
    public ArrayList datos2(long serie, int tipo) throws SQLException {
        ArrayList<Producto> info2 = new ArrayList<Producto>();
        Statement sentenciaSQL;
        sentenciaSQL = con.createStatement();
        try {
            ResultSet p = sentenciaSQL.executeQuery("SELECT *FROM PRODUCTO WHERE PRO_SERIE = '" + serie + "'");
            if (p.next() == false) {
                System.out.println("No hay perro :'v ");
            } else {
                do {
                    Producto c = new Producto();
                    c.setCodigo(p.getDouble("PRO_CODIGO"));
                    c.setNombre(p.getString("PRO_NOMBRE"));
                    c.setSerie(p.getDouble("PRO_SERIE"));
                    c.setMarca(p.getString("PRO_MARCA"));
                    c.setDescripcion(p.getString("PRO_DESCRIPCION"));
                    c.setCantidad(p.getDouble("PRO_CANTIDAD"));
                    c.setPrecio(p.getFloat("PRO_PRECIO"));
                    c.setTipo(p.getString("PRO_TIPO"));
                    info2.add(c);
                } while (p.next());
            }
        } catch (SQLException error) {
            System.out.println("No existe esa info prro :'v" + error);
        }
        return info2;
    }
    
    public void cambiarProducto(String ced, String nombre, String marca, String descrip, Double cantidad, float precio) throws SQLException {

        Connection reg = conexionmySQL();
        Statement sentenciaSQL;
        sentenciaSQL = con.createStatement();
        try {
            PreparedStatement sentencia = reg.prepareStatement("UPDATE PRODUCTO SET PRO_NOMBRE ='" + nombre + "' , PRO_MARCA ='" + marca + "' , PRO_DESCRIPCION ='" + descrip + "' , PRO_CANTIDAD ='" + cantidad + "' , PRO_PRECIO ='" + precio + "' WHERE PRO_SERIE = '" + ced + "';");
            sentencia.execute();
            JOptionPane.showMessageDialog(null, "OK, DATOS GUARDADOS");
        } catch (SQLException ex) {
            System.out.println("Algo Salio mal :(");
            JOptionPane.showMessageDialog(null, "ERROR, DATOS FALLIDOS");
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList busmovimientoTotal() throws SQLException
    {
        ArrayList<Compra> ress = new ArrayList<Compra>();
        Statement sentenciaSQL;
        sentenciaSQL = con.createStatement();
        try {
            ResultSet p = sentenciaSQL.executeQuery("SELECT COM_FECHA, COM_NUMFICHA, _COM_CODIGO, COM_TIPO, COM_CANTIDAD, COM_PRECIOTOTAL FROM COMPRA ORDER BY _COM_CODIGO");
            if (p.next() == false) 
            {
                JOptionPane.showMessageDialog(null,"El numero de cuenta no existe" );
            } else 
            {
                do {
                    Compra v = new Compra();
                    v.setFecha(p.getString("COM_FECHA"));
                    v.setNumFicha(p.getDouble("COM_NUMFICHA"));
                    v.setCodigoCompra(p.getDouble("_COM_CODIGO"));
                    v.setTipoCompra(p.getString("COM_TIPO"));
                    v.setCantidadCompra(p.getDouble("COM_CANTIDAD"));
                    v.setPrecioTotal(p.getFloat("COM_PRECIOTOTAL"));
                    ress.add(v);
                } while (p.next());
            }
        } catch (SQLException error) {
            System.out.println("No existe esa info prro :'v" + error);
        }
        return ress;
    }
}
