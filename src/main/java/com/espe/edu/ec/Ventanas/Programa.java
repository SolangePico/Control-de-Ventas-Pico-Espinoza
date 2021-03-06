/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.edu.ec.Ventanas;

import com.espe.edu.ec.Clases.Compra;
import com.espe.edu.ec.Clases.ConexionMySql;
import com.espe.edu.ec.Clases.Operaciones;
import com.espe.edu.ec.Clases.Producto;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author solan
 */
public class Programa extends javax.swing.JFrame {

    /**
     * Creates new form Programa
     */
    
    String fecha, hora;
    private String setCurrentUser;
    ConexionMySql con = new ConexionMySql();
    Operaciones op = new Operaciones();
    
    public Programa() {
        initComponents();
        cargar();
        ValidacionTipeo();
        FechayHora();
    }

    public void cargar() {
        DefaultTableModel modeloCliente = (DefaultTableModel) c.getModel();
        c.setModel(con.cargarDatosCliente(modeloCliente));
        System.out.println("Inciado componentes :D ");
    }

    public void recargar() {
        DefaultTableModel modelotc = (DefaultTableModel) c.getModel();
        int ntc = modelotc.getRowCount();
        for (int i = 0; i < ntc; i++) {
            modelotc.removeRow(0);
        }
        cargar();
    }
    
    public void limpiarProducto(){
        txserie.setText("");
        txnombreproducto.setText("");
        txmarca.setText("");
        txdescrip.setText("");
        txcantidad.setText("");
        txprecio.setText("");
    }
    
    public void FechayHora() {
        Calendar cal = Calendar.getInstance();
        int mes = cal.get(Calendar.MONTH) + 1;
        fecha = cal.get(Calendar.YEAR) + "-" + mes + "-" + cal.get(Calendar.DATE);
        hora = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
        lblFecha.setText(fecha);

        lblHora.setText(hora);
        /*lblHora.hide();
        jLabel45.hide();*/
    }
     
    public void vaciarMovimiento(){
        DefaultTableModel modelotc = (DefaultTableModel) Tabla_compras_consulta.getModel();
        int ntc = modelotc.getRowCount();
        for (int i = 0; i < ntc; i++) {
            modelotc.removeRow(0);
        } 
    }
    
    public void ValidacionTipeo() {
        gesCli_txCedula.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (Character.isLetter(c)) {
                    Toolkit.getDefaultToolkit().beep();
                    ke.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        gesCli_txNombre.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (Character.isDigit(c)) {
                    Toolkit.getDefaultToolkit().beep();
                    ke.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        gesCli_txApellido.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (Character.isDigit(c)) {
                    Toolkit.getDefaultToolkit().beep();
                    ke.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PnlGestClien = new javax.swing.JPanel();
        Spn_GesCl = new javax.swing.JTabbedPane();
        gesCli_Visualizar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        c = new javax.swing.JTable();
        gesCli_btnBuscar = new javax.swing.JButton();
        gesCli_txBuscar = new javax.swing.JTextField();
        gesCli_btnEliminar = new javax.swing.JButton();
        gesCli_btnModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        gesCli_Ingreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gesCli_btnGuardar = new javax.swing.JButton();
        gesCli_txCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        gesCli_txNombre = new javax.swing.JTextField();
        gesCli_txApellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gesCli_txApellidoMaterno = new javax.swing.JTextField();
        gesCli_txTeleFijo = new javax.swing.JTextField();
        gesCli_txCelular = new javax.swing.JTextField();
        gesCli_txDireccion = new javax.swing.JTextField();
        gesCli_txCorreo = new javax.swing.JTextField();
        gesCli_btnGuardar1 = new javax.swing.JButton();
        Spn_GesCl1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtbuscarserie = new javax.swing.JTextField();
        btnConsultarCuentas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_cuentas_consulta = new javax.swing.JTable();
        gesCli_Ingreso1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txserie = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jcbtipoproducto = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txprecio = new javax.swing.JTextField();
        gesCli_btnGuardar2 = new javax.swing.JButton();
        btnnuevocuenta = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txnombreproducto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txmarca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txcantidad = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txdescrip = new javax.swing.JTextField();
        gesCli_Mod1 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        txtbuscarmodiiii = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txnombreproductocam = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txmarcacam = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txdescripcam = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txcantidadcam = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txpreciocam = new javax.swing.JTextField();
        btnguardamodificado = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txcodigocam = new javax.swing.JTextField();
        PnlRegMov2 = new javax.swing.JPanel();
        txtcantidadcompra = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbtipocompra = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txnumseriecompra = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txpreciocompra = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txcicliente = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txnumficha = new javax.swing.JTextField();
        PnlConMov = new javax.swing.JPanel();
        lbl_con_movi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_compras_consulta = new javax.swing.JTable();
        btnConsultasMovimientos = new javax.swing.JButton();
        txtConsCompra = new javax.swing.JTextField();
        fecha1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(240, 189, 172));

        Spn_GesCl.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        c.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "C.I", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono Fijo", "Celular", "Direccion", "Correo"
            }
        ));
        c.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(c);

        gesCli_btnBuscar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnBuscar.setText("Buscar");
        gesCli_btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnBuscarActionPerformed(evt);
            }
        });

        gesCli_btnEliminar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnEliminar.setText("Eliminar");
        gesCli_btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnEliminarActionPerformed(evt);
            }
        });

        gesCli_btnModificar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnModificar.setText("Modificar");
        gesCli_btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnModificarActionPerformed(evt);
            }
        });

        jLabel10.setText("Ingrese N.- Cedula: ");

        javax.swing.GroupLayout gesCli_VisualizarLayout = new javax.swing.GroupLayout(gesCli_Visualizar);
        gesCli_Visualizar.setLayout(gesCli_VisualizarLayout);
        gesCli_VisualizarLayout.setHorizontalGroup(
            gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                .addGroup(gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                        .addGroup(gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gesCli_txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(gesCli_btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(gesCli_btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(gesCli_btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 485, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gesCli_VisualizarLayout.setVerticalGroup(
            gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gesCli_VisualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(gesCli_txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gesCli_btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gesCli_btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gesCli_btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Spn_GesCl.addTab("Visualizar", gesCli_Visualizar);

        jLabel1.setText("Cedula: ");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        gesCli_btnGuardar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnGuardar.setText("Guardar");
        gesCli_btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setText("INGRESO DE CLIENTES");

        jLabel5.setText("Apellido Materno:");

        jLabel6.setText("Telefono Fijo:");

        jLabel7.setText("Celular:");

        jLabel8.setText("Direccion:");

        jLabel9.setText("Correo:");

        gesCli_btnGuardar1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnGuardar1.setText("Nuevo");
        gesCli_btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnGuardar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gesCli_IngresoLayout = new javax.swing.GroupLayout(gesCli_Ingreso);
        gesCli_Ingreso.setLayout(gesCli_IngresoLayout);
        gesCli_IngresoLayout.setHorizontalGroup(
            gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel4)
                .addContainerGap(631, Short.MAX_VALUE))
            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addComponent(gesCli_btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gesCli_btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(gesCli_txCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gesCli_txDireccion)
                            .addComponent(gesCli_txCelular, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gesCli_txTeleFijo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gesCli_txApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(gesCli_txCedula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gesCli_txNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gesCli_txApellidoMaterno, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(104, 104, 104))))
        );
        gesCli_IngresoLayout.setVerticalGroup(
            gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(gesCli_txCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(gesCli_txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(gesCli_txApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(gesCli_txApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gesCli_txTeleFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gesCli_txCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gesCli_txDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gesCli_txCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gesCli_btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gesCli_btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        Spn_GesCl.addTab("Ingreso", gesCli_Ingreso);

        javax.swing.GroupLayout PnlGestClienLayout = new javax.swing.GroupLayout(PnlGestClien);
        PnlGestClien.setLayout(PnlGestClienLayout);
        PnlGestClienLayout.setHorizontalGroup(
            PnlGestClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Spn_GesCl)
        );
        PnlGestClienLayout.setVerticalGroup(
            PnlGestClienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Spn_GesCl)
        );

        jTabbedPane1.addTab("Gestion de Clientes", PnlGestClien);

        Spn_GesCl1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel33.setText("Ingrese N.- Serie: ");

        btnConsultarCuentas.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnConsultarCuentas.setText("Consultar");
        btnConsultarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarCuentasActionPerformed(evt);
            }
        });

        Tabla_cuentas_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Serie", "Nombre", "Marca", "Descripcion", "Cantidad", "Precio", "Tipo"
            }
        ));
        jScrollPane3.setViewportView(Tabla_cuentas_consulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscarserie, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnConsultarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(btnConsultarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        Spn_GesCl1.addTab("Visualizar", jPanel1);

        jLabel18.setText("Serie:");

        jLabel19.setText("Tipo:");

        jcbtipoproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accesorios de autos", "Maquinas Industriales", "Televisores." }));

        jLabel21.setText("Precio:");

        gesCli_btnGuardar2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnGuardar2.setText("Guardar");
        gesCli_btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnGuardar2ActionPerformed(evt);
            }
        });

        btnnuevocuenta.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnnuevocuenta.setText("Nuevo");
        btnnuevocuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevocuentaActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel28.setText("REGISTRO DE PRODUCTOS");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Marca:");

        jLabel14.setText("Cantidad:");

        jLabel23.setText("Descripcion:");

        javax.swing.GroupLayout gesCli_Ingreso1Layout = new javax.swing.GroupLayout(gesCli_Ingreso1);
        gesCli_Ingreso1.setLayout(gesCli_Ingreso1Layout);
        gesCli_Ingreso1Layout.setHorizontalGroup(
            gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(24, 24, 24)
                                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txserie, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(txmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, gesCli_Ingreso1Layout.createSequentialGroup()
                                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                                        .addComponent(jcbtipoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20)
                                        .addGap(79, 79, 79))
                                    .addComponent(txdescrip)))
                            .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addGap(35, 35, 35)
                                    .addComponent(txprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(654, 654, 654))))
            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel28))
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(gesCli_btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnnuevocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gesCli_Ingreso1Layout.setVerticalGroup(
            gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(6, 6, 6)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txdescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jcbtipoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gesCli_btnGuardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        Spn_GesCl1.addTab("Crear", gesCli_Ingreso1);

        btnbuscar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel15.setText("Nombre:");

        jLabel29.setText("Marca:");

        jLabel30.setText("Descripcion:");

        jLabel31.setText("Cantidad:");

        txcantidadcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txcantidadcamActionPerformed(evt);
            }
        });

        jLabel32.setText("Precio:");

        btnguardamodificado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnguardamodificado.setText("Guardar Cambios");
        btnguardamodificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardamodificadoActionPerformed(evt);
            }
        });

        jLabel16.setText("Ingrese N.- Serie: ");

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel17.setText("Modificar un Producto");

        jLabel22.setText("Codigo:");

        javax.swing.GroupLayout gesCli_Mod1Layout = new javax.swing.GroupLayout(gesCli_Mod1);
        gesCli_Mod1.setLayout(gesCli_Mod1Layout);
        gesCli_Mod1Layout.setHorizontalGroup(
            gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                                .addComponent(txtbuscarmodiiii, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 541, Short.MAX_VALUE))
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txmarcacam)
                            .addComponent(txcantidadcam, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txdescripcam)
                            .addComponent(txpreciocam)
                            .addComponent(txnombreproductocam)
                            .addComponent(txcodigocam))
                        .addGap(316, 316, 316))))
            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnguardamodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 717, Short.MAX_VALUE))
        );
        gesCli_Mod1Layout.setVerticalGroup(
            gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarmodiiii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txcodigocam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txnombreproductocam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gesCli_Mod1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txmarcacam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txdescripcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txcantidadcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txpreciocam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnguardamodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        Spn_GesCl1.addTab("Modificar", gesCli_Mod1);

        jTabbedPane1.addTab("Gestion de Productos", Spn_GesCl1);

        txtcantidadcompra.setName("txtmonto_mov"); // NOI18N

        jLabel25.setText("Tipo: ");

        jLabel27.setText("Cantidad:");

        cmbtipocompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Credito" }));
        cmbtipocompra.setName("cmbtipocompra"); // NOI18N

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setName("bntRegistroMov"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Numero de Serie: ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("$");

        jLabel34.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel34.setText("REGISTRO DE COMPRA");

        jLabel41.setText("Precio: ");

        jLabel42.setText("C.I. Cliente:");

        txcicliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txciclienteActionPerformed(evt);
            }
        });

        jLabel43.setText("N- Ficha:");

        javax.swing.GroupLayout PnlRegMov2Layout = new javax.swing.GroupLayout(PnlRegMov2);
        PnlRegMov2.setLayout(PnlRegMov2Layout);
        PnlRegMov2Layout.setHorizontalGroup(
            PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(75, 75, 75)
                                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcantidadcompra)
                                    .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                        .addComponent(jLabel35)
                        .addGap(136, 136, 136))
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbtipocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txnumseriecompra)
                            .addComponent(txcicliente, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txnumficha))
                        .addGap(112, 112, 112)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlRegMov2Layout.setVerticalGroup(
            PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addGap(12, 12, 12)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txnumficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txcicliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txnumseriecompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbtipocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtcantidadcompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de Compra", PnlRegMov2);

        lbl_con_movi.setText("N- Serie:");

        Tabla_compras_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Fecha", "N- Ficha", "Cantidad", "Tipo", "Precio"
            }
        ));
        jScrollPane2.setViewportView(Tabla_compras_consulta);

        btnConsultasMovimientos.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnConsultasMovimientos.setText("Consultar");
        btnConsultasMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasMovimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlConMovLayout = new javax.swing.GroupLayout(PnlConMov);
        PnlConMov.setLayout(PnlConMovLayout);
        PnlConMovLayout.setHorizontalGroup(
            PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConMovLayout.createSequentialGroup()
                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_con_movi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConsCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnConsultasMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PnlConMovLayout.setVerticalGroup(
            PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConMovLayout.createSequentialGroup()
                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_con_movi)
                            .addComponent(txtConsCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnConsultasMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Compras", PnlConMov);

        fecha1.setText("Fecha: ");

        lblFecha.setText("--/--/----");

        jLabel45.setText("Hora: ");

        lblHora.setText("--:--");

        jLabel36.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel36.setText("Control de Ventas - Álmacenes Paul");

        jLabel38.setText("Solange Pico - Victoria Espinosa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fecha1)
                        .addGap(18, 18, 18)
                        .addComponent(lblFecha)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHora))
                    .addComponent(jLabel38))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha1)
                            .addComponent(lblFecha)
                            .addComponent(jLabel45)
                            .addComponent(lblHora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38))
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gesCli_btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnGuardarActionPerformed
        if (gesCli_txCedula.getText().equals("") || gesCli_txNombre.getText().equals("") || gesCli_txApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios");
        } else if (op.validadorDeCedula(gesCli_txCedula.getText())) {
            String respuesta = con.buscarCliente(gesCli_txCedula.getText());
            System.out.println("Respuesta: " + respuesta);
            if (respuesta.equals("No existe registro")) {
                con.IngresoClientes(gesCli_txCedula.getText(), gesCli_txNombre.getText(), gesCli_txApellido.getText(),gesCli_txApellidoMaterno.getText(),gesCli_txTeleFijo.getText(),
                        gesCli_txCelular.getText(), gesCli_txDireccion.getText(), gesCli_txCorreo.getText());
                recargar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario ya Existente");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "CI Incorrecta");
        }

    }//GEN-LAST:event_gesCli_btnGuardarActionPerformed

    private void gesCli_btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnGuardar1ActionPerformed
        // TODO add your handling code here:
        gesCli_txCedula.setText("");
        gesCli_txNombre.setText("");
        gesCli_txApellido.setText("");
        gesCli_txApellidoMaterno.setText("");
        gesCli_txTeleFijo.setText("");
        gesCli_txCelular.setText("");
        gesCli_txDireccion.setText("");
        gesCli_txCorreo.setText("");
    }//GEN-LAST:event_gesCli_btnGuardar1ActionPerformed

    private void gesCli_btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) c.getModel();
        int a = c.getSelectedRow();
        if (a < 0) {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar una fila de la tabla");
        } else {
            String fijo = JOptionPane.showInputDialog(c, "Ingrese nuevo telefono: ", "Modificacion Telefono Fijo", 1);
            //String celu = JOptionPane.showInputDialog(c, "Ingrese nuevo celular: ", "Modificacion Celular", 2);
            //String direccion = JOptionPane.showInputDialog(c, "Ingrese nueva direccion: ", "Modificacion Direccion", 3);
            //String correo = JOptionPane.showInputDialog(c, "Ingrese nuevo correo: ", "Modificacion Correo", 4);
            if (fijo.equals("")) {
                JOptionPane.showMessageDialog(null, "Registro No modificado");
            }else if (con.modificarCliente("" + model.getValueAt(a, 5), fijo) == 1){
                //} else if (con.modificarCliente((("" + model.getValueAt(a, 5), fijo) == 1),(("" + model.getValueAt(a, 6), celu == 2)), (("" + model.getValueAt(a, 7), direccion == 3)), (("" + model.getValueAt(a, 8), correo) == 4))){
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Registro No modificado");
            }
            recargar();
        }
    }//GEN-LAST:event_gesCli_btnModificarActionPerformed

    private void gesCli_btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnEliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) c.getModel();
        int a = c.getSelectedRow();

        if (a < 0) {
            JOptionPane.showMessageDialog(null,
                "Debe seleccionar una fila de la tabla");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null,
                "Esta seguro que desea Eliminar el registro? ");
            if (JOptionPane.OK_OPTION == confirmar) {
                if (con.eliminarCliente("" + model.getValueAt(a, 1)) == 1) {
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Registro No se puede eliminar");
                }
                recargar();
            }
        }
    }//GEN-LAST:event_gesCli_btnEliminarActionPerformed

    private void gesCli_btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnBuscarActionPerformed
        if (gesCli_txBuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(c, "Pon algo para buscar prro :'v ");
        } else {
            JOptionPane.showMessageDialog(c, con.buscarCliente(gesCli_txBuscar.getText()));
        }
    }//GEN-LAST:event_gesCli_btnBuscarActionPerformed

    private void gesCli_btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnGuardar2ActionPerformed
        if (txserie.getText().isEmpty() || txnombreproducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios :v");
        } else {
            try {
                con.IngresoProducto(txserie.getText(), txnombreproducto.getText(), txmarca.getText(), txdescrip.getText(), Double.parseDouble(txcantidad.getText()), Float.parseFloat(txprecio.getText()), jcbtipoproducto.getSelectedItem().toString());
                //con.ValidaExistenciasdeCedulas(txtcicuentas.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_gesCli_btnGuardar2ActionPerformed

    private void btnnuevocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevocuentaActionPerformed
        // TODO add your handling code here:
        limpiarProducto();
    }//GEN-LAST:event_btnnuevocuentaActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        //DefaultTableModel model = (DefaultTableModel) tablaCuentaModi.getModel();
        ArrayList<Producto> data = new ArrayList<Producto>();
        String i = "";
        if (txtbuscarmodiiii.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un valor");
        } else {
            System.out.println("hola");
            try {
                data = con.datos(Integer.parseInt(txtbuscarmodiiii.getText()), 2);
                for (Producto c : data) {
                    txcodigocam.setText(String.valueOf(c.getCodigo()));
                    txnombreproductocam.setText(c.getNombre());
                    txmarcacam.setText(c.getMarca());
                    txdescripcam.setText(c.getDescripcion());
                    txcantidadcam.setText(String.valueOf(c.getCantidad()));
                    txpreciocam.setText(String.valueOf(c.getPrecio()));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        /*txnombreproductocam.setEditable(false);
        txmarcacam.setEditable(false);
        txdescripcam.setEditable(false);*/
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txcantidadcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txcantidadcamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txcantidadcamActionPerformed

    private void btnguardamodificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardamodificadoActionPerformed
        // TODO add your handling code here:
        if (txcantidadcam.getText().isEmpty() || txpreciocam.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios :v");
        } else {
            try {
                con.cambiarProducto(txcodigocam.getText(), txnombreproductocam.getText(), txmarcacam.getText(), txdescripcam.getText(), Double.parseDouble(txcantidadcam.getText()), Float.parseFloat(txpreciocam.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txcodigocam.setEnabled(false);
    }//GEN-LAST:event_btnguardamodificadoActionPerformed

    private void btnConsultarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentasActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tabla_cuentas_consulta.getModel();
        ArrayList<Producto> data = new ArrayList<Producto>();
        String i = "";
        if (txtbuscarserie.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un valor");
        } else {
            System.out.println("hola");
            try {
                data = con.datos2(Integer.parseInt(txtbuscarserie.getText()), 2);
                for (Producto c : data) {
                    Object[] fila = new Object[8];
                    fila[0] = c.getCodigo();
                    fila[1] = c.getSerie();
                    fila[2] = c.getNombre();
                    fila[3] = c.getMarca();
                    fila[4] = c.getDescripcion();
                    fila[5] = c.getCantidad();
                    fila[6] = c.getPrecio();
                    fila[7] = c.getTipo();
                    model.addRow(fila);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultarCuentasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String monto = txtcantidadcompra.getText();
        float mon = Float.parseFloat(monto);
        if (txnumficha.getText().equals("") || txnumseriecompra.equals("") || txcicliente.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios");
        } else {
            if (mon > 0)
            {
                String respuesta = con.buscarProducto(txnumseriecompra.getText());
                System.out.println("Respuesta: " + respuesta);
                if (respuesta.equals(txnumseriecompra.getText())) {
                    try {
                        con.IngresoCompra(txnumficha.getText(), txcicliente.getText(), txnumseriecompra.getText(), cmbtipocompra.getSelectedItem().toString(), fecha + " " + hora, mon, Float.parseFloat(txpreciocompra.getText()), con.buscarCantidadProducto(txnumseriecompra.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //recargarMovimiento();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El producto no existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El valor debe ser mayor a cero");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txciclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txciclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txciclienteActionPerformed

    private void btnConsultasMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasMovimientosActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tabla_compras_consulta.getModel();
        ArrayList<Compra> moviss = new ArrayList<Compra>();
        String i = "";
        if (txtConsCompra.getText().equals("")) 
        {
            try {
                vaciarMovimiento();
                moviss = con.busmovimientoTotal();
                for (Compra m : moviss) {
                    Object[] fila = new Object[6];
                    fila[0] = m.getCodigoCompra();
                    fila[1] = m.getFecha();
                    fila[2] = m.getNumFicha();
                    fila[3] = m.getCantidadCompra();
                    fila[4] = m.getTipoCompra();
                    fila[5] = m.getPrecioTotal();
                    model.addRow(fila);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } /*else 
        {
            if(txtnumero_mov.getText().equals("")&& txtConsCompra.equals("")&& ! txDesde.getText().equals("")&& ! txtHasta.getText().equals(""))
           {
               System.out.println("Se consultara fecha");
           }
           else
              if(!txtnumero_mov.getText().equals("")&&txtConsCompra.getText().equals("") && txDesde.getText().equals("")&&txtHasta.getText().equals(""))
            try 
            {
                moviss = con.busmovimientoN(Integer.parseInt(txtnumero_mov.getText()));
                vaciarMovimiento();
                for (Movimiento m : moviss) 
                {
                    Object[] fila = new Object[5];
                    fila[0] = m.getFecha();
                    fila[1] = m.getCod_movi();
                    fila[2] = m.getTipo();
                    fila[3] = m.getMonto();
                    fila[4] = m.getSaldo();
                    model.addRow(fila);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
           else
           {
               if (txtnumero_mov.getText().equals("")&& !txtConsCompra.getText().equals("")&& txDesde.getText().equals("")&&txtHasta.getText().equals("") ) 
               try 
                 {
                    moviss = con.busmovimiento(Integer.parseInt(txtConsCompra.getText()),2);      
                    vaciarMovimiento();
                    for (Movimiento m : moviss) 
                    {
                        Object[] fila = new Object[5];
                        fila[0] = m.getFecha();
                        fila[1] = m.getCod_movi();
                        fila[2] = m.getTipo();
                        fila[3] = m.getMonto();
                        fila[4] = m.getSaldo();
                        model.addRow(fila);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
               else
               {
                   if (!txtConsCompra.getText().equals("")&&!txtnumero_mov.getText().equals("") && txDesde.getText().equals("")&& txtHasta.getText().equals("") ) 
                   {
                       try 
                       {       
                            moviss = con.busmovimientoPorN(Integer.parseInt(txtConsCompra.getText()), Integer.parseInt(txtnumero_mov.getText()));
                            vaciarMovimiento();
                            for (Movimiento m : moviss) 
                            {
                                Object[] fila = new Object[5];
                                fila[0] = m.getFecha();
                                fila[1] = m.getCod_movi();
                                fila[2] = m.getTipo();
                                fila[3] = m.getMonto();
                                fila[4] = m.getSaldo();
                                model.addRow(fila);
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                   }
               }
           }*/
    }//GEN-LAST:event_btnConsultasMovimientosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlConMov;
    private javax.swing.JPanel PnlGestClien;
    private javax.swing.JPanel PnlRegMov2;
    private javax.swing.JTabbedPane Spn_GesCl;
    private javax.swing.JTabbedPane Spn_GesCl1;
    private javax.swing.JTable Tabla_compras_consulta;
    private javax.swing.JTable Tabla_cuentas_consulta;
    private javax.swing.JButton btnConsultarCuentas;
    private javax.swing.JButton btnConsultasMovimientos;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardamodificado;
    private javax.swing.JButton btnnuevocuenta;
    public javax.swing.JTable c;
    private javax.swing.JComboBox<String> cmbtipocompra;
    private javax.swing.JLabel fecha1;
    private javax.swing.JPanel gesCli_Ingreso;
    private javax.swing.JPanel gesCli_Ingreso1;
    private javax.swing.JPanel gesCli_Mod1;
    private javax.swing.JPanel gesCli_Visualizar;
    private javax.swing.JButton gesCli_btnBuscar;
    private javax.swing.JButton gesCli_btnEliminar;
    private javax.swing.JButton gesCli_btnGuardar;
    private javax.swing.JButton gesCli_btnGuardar1;
    private javax.swing.JButton gesCli_btnGuardar2;
    private javax.swing.JButton gesCli_btnModificar;
    private javax.swing.JTextField gesCli_txApellido;
    private javax.swing.JTextField gesCli_txApellidoMaterno;
    private javax.swing.JTextField gesCli_txBuscar;
    private javax.swing.JTextField gesCli_txCedula;
    private javax.swing.JTextField gesCli_txCelular;
    private javax.swing.JTextField gesCli_txCorreo;
    private javax.swing.JTextField gesCli_txDireccion;
    private javax.swing.JTextField gesCli_txNombre;
    private javax.swing.JTextField gesCli_txTeleFijo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbtipoproducto;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lbl_con_movi;
    private javax.swing.JTextField txcantidad;
    private javax.swing.JTextField txcantidadcam;
    private javax.swing.JTextField txcicliente;
    private javax.swing.JTextField txcodigocam;
    private javax.swing.JTextField txdescrip;
    private javax.swing.JTextField txdescripcam;
    private javax.swing.JTextField txmarca;
    private javax.swing.JTextField txmarcacam;
    private javax.swing.JTextField txnombreproducto;
    private javax.swing.JTextField txnombreproductocam;
    private javax.swing.JTextField txnumficha;
    private javax.swing.JTextField txnumseriecompra;
    private javax.swing.JTextField txprecio;
    private javax.swing.JTextField txpreciocam;
    private javax.swing.JTextField txpreciocompra;
    private javax.swing.JTextField txserie;
    private javax.swing.JTextField txtConsCompra;
    private javax.swing.JTextField txtbuscarmodiiii;
    private javax.swing.JTextField txtbuscarserie;
    private javax.swing.JTextField txtcantidadcompra;
    // End of variables declaration//GEN-END:variables
}
