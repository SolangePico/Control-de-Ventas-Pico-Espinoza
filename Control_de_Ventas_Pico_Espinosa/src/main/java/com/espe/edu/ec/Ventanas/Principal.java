package com.espe.edu.ec.Ventanas;

import com.espe.edu.ec.Clases.ConexionMySql;
import com.espe.edu.ec.Clases.Producto;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import com.espe.edu.ec.Clases.Operaciones;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author solange
 */
public class Principal extends javax.swing.JFrame {

    String fecha, hora;
    private String setCurrentUser;
    ConexionMySql con = new ConexionMySql();
    Operaciones op = new Operaciones();

    public Principal() {
        //initComponents();
        cargar();
        ValidacionTipeo();
        FechayHora();
    }

    public void limpiarCuenta() {
        txtcicuentas.setText("");
        txtsaldoinicial.setText("");
    }

    public void FechayHora() {
        Calendar cal = Calendar.getInstance();
        int mes = cal.get(Calendar.MONTH) + 1;
        fecha = cal.get(Calendar.YEAR) + "-" + mes + "-" + cal.get(Calendar.DATE);
        hora = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND);
        lblFecha.setText(fecha);

        lblHora.setText(hora);
        lblHora.hide();
        jLabel13.hide();
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
        txtmontomovi.addKeyListener(new KeyListener() {
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
        txtcicuentas.addKeyListener(new KeyListener() {
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
        txtsaldoinicial.addKeyListener(new KeyListener() {
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
        txtbuscarmodiiii.addKeyListener(new KeyListener() {
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
        txtsaldoinicial1.addKeyListener(new KeyListener() {
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
        txtestadocamiar.addKeyListener(new KeyListener() {
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
        txtbuscuenta1.addKeyListener(new KeyListener() {
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
        txtnum_cuenta.addKeyListener(new KeyListener() {
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
        txtmontomovi.addKeyListener(new KeyListener() {
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
        txtnumero_mov.addKeyListener(new KeyListener() {
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
    }
/*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
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
        PnlGesCuen = new javax.swing.JPanel();
        Spn_GesCl1 = new javax.swing.JTabbedPane();
        gesCli_Ingreso1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtcicuentas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jcbtipocuenta = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        txtsaldoinicial = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        gesCli_btnGuardar1 = new javax.swing.JButton();
        btnnuevocuenta = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        gesCli_Mod1 = new javax.swing.JPanel();
        btnbuscar = new javax.swing.JButton();
        txtbuscarmodiiii = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcodigoblo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtcicuentas1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtsaldoinicial1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtestadocamiar = new javax.swing.JTextField();
        btnguardamodificado = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        PnlConCuen = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtbuscuenta1 = new javax.swing.JTextField();
        btnConsultarCuentas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_cuentas_consulta = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        PnlRegMov = new javax.swing.JPanel();
        PnlRegMov2 = new javax.swing.JPanel();
        txtmontomovi = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cmbtipo_mov = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtnum_cuenta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PnlConMov = new javax.swing.JPanel();
        lbl_con_movi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_movimientos_consulta = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnumero_mov = new javax.swing.JTextField();
        btnConsultasMovimientos = new javax.swing.JButton();
        txtcuenta_mov = new javax.swing.JComboBox<>();
        cmbanio_mov = new javax.swing.JComboBox<>();
        cmbmes_mov = new javax.swing.JComboBox<>();
        cmbdia_mov = new javax.swing.JComboBox<>();
        cmb2anio_mov = new javax.swing.JComboBox<>();
        cmb2mes_mov = new javax.swing.JComboBox<>();
        cmb2dia_mov = new javax.swing.JComboBox<>();
        fecha1 = new javax.swing.JLabel();
        lbUsuPrinc = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Princ_mItemCSesion = new javax.swing.JMenuItem();
        Princ_mItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setText("Usuario: ");

        jTabbedPane1.setBackground(new java.awt.Color(240, 189, 172));

        Spn_GesCl.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        c.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N", "C.I", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(c);
        if (c.getColumnModel().getColumnCount() > 0) {
            c.getColumnModel().getColumn(0).setResizable(false);
        }

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
                    .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(gesCli_btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(gesCli_btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gesCli_txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(gesCli_btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gesCli_VisualizarLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addGap(30, 30, 30)
                .addGroup(gesCli_VisualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gesCli_btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gesCli_btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Spn_GesCl.addTab("Visualizar", gesCli_Visualizar);

        jLabel1.setText("Cedula: ");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        gesCli_btnGuardar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnGuardar.setText("Guardar");
        gesCli_btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel4.setText("INGRESO DE CLIENTES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/folder_customer_256.png"))); // NOI18N

        javax.swing.GroupLayout gesCli_IngresoLayout = new javax.swing.GroupLayout(gesCli_Ingreso);
        gesCli_Ingreso.setLayout(gesCli_IngresoLayout);
        gesCli_IngresoLayout.setHorizontalGroup(
            gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gesCli_txNombre))
                            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gesCli_txCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gesCli_IngresoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gesCli_txApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(gesCli_btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(104, 104, 104))
            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gesCli_IngresoLayout.setVerticalGroup(
            gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(gesCli_txCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_IngresoLayout.createSequentialGroup()
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(gesCli_txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gesCli_IngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gesCli_txApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(60, 60, 60)
                        .addComponent(gesCli_btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(89, Short.MAX_VALUE))
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
            .addGroup(PnlGestClienLayout.createSequentialGroup()
                .addComponent(Spn_GesCl, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion de Clientes", PnlGestClien);

        Spn_GesCl1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel18.setText("Cedula:");

        jLabel19.setText("Tipo:");

        jcbtipocuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AHO", "COR" }));

        jLabel21.setText("Saldo:");

        jLabel22.setText("Estado:");

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACT", "INA" }));

        gesCli_btnGuardar1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        gesCli_btnGuardar1.setText("Guardar");
        gesCli_btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gesCli_btnGuardar1ActionPerformed(evt);
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
        jLabel28.setText("REGISTRO DE CUENTA");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/movi.png"))); // NOI18N

        javax.swing.GroupLayout gesCli_Ingreso1Layout = new javax.swing.GroupLayout(gesCli_Ingreso1);
        gesCli_Ingreso1.setLayout(gesCli_Ingreso1Layout);
        gesCli_Ingreso1Layout.setHorizontalGroup(
            gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbtipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcicuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsaldoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(79, 79, 79))
            .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(gesCli_btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnnuevocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gesCli_Ingreso1Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel28)))
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
                            .addComponent(txtcicuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jcbtipocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(txtsaldoinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel20))
                .addGap(46, 46, 46)
                .addGroup(gesCli_Ingreso1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gesCli_btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevocuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Spn_GesCl1.addTab("Crear", gesCli_Ingreso1);

        btnbuscar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        jLabel15.setText("Codigo:");

        jLabel29.setText("Cedula:");

        jLabel30.setText("Tipo:");

        jLabel31.setText("Saldo:");

        txtsaldoinicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaldoinicial1ActionPerformed(evt);
            }
        });

        jLabel32.setText("Estado:");

        btnguardamodificado.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnguardamodificado.setText("Guardar Cambios");
        btnguardamodificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardamodificadoActionPerformed(evt);
            }
        });

        jLabel16.setText("Ingrese N.- Cedula: ");

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel17.setText("Modificar una Cuenta");

        jLabel24.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel24.setText("Cambiar Saldo o Desactivar una cuenta ");

        javax.swing.GroupLayout gesCli_Mod1Layout = new javax.swing.GroupLayout(gesCli_Mod1);
        gesCli_Mod1.setLayout(gesCli_Mod1Layout);
        gesCli_Mod1Layout.setHorizontalGroup(
            gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcodigoblo))
                            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcicuentas1)
                                    .addComponent(txtsaldoinicial1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txttipo)
                                    .addComponent(txtestadocamiar))))
                        .addGap(316, 316, 316))
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                                .addComponent(txtbuscarmodiiii, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 187, Short.MAX_VALUE))))
            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel24))
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnguardamodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gesCli_Mod1Layout.setVerticalGroup(
            gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscarmodiiii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtcodigoblo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gesCli_Mod1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gesCli_Mod1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcicuentas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtsaldoinicial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gesCli_Mod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(txtestadocamiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnguardamodificado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Spn_GesCl1.addTab("Modificar", gesCli_Mod1);

        javax.swing.GroupLayout PnlGesCuenLayout = new javax.swing.GroupLayout(PnlGesCuen);
        PnlGesCuen.setLayout(PnlGesCuenLayout);
        PnlGesCuenLayout.setHorizontalGroup(
            PnlGesCuenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Spn_GesCl1)
        );
        PnlGesCuenLayout.setVerticalGroup(
            PnlGesCuenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlGesCuenLayout.createSequentialGroup()
                .addComponent(Spn_GesCl1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestion Cuentas", PnlGesCuen);

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
                "Numero de Cuenta", "Cliente", "Cedula", "Tipo", "Saldo", "Estado"
            }
        ));
        jScrollPane3.setViewportView(Tabla_cuentas_consulta);

        jLabel33.setText("Ingrese N.- Cedula: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbuscuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnConsultarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(btnConsultarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlConCuenLayout = new javax.swing.GroupLayout(PnlConCuen);
        PnlConCuen.setLayout(PnlConCuenLayout);
        PnlConCuenLayout.setHorizontalGroup(
            PnlConCuenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PnlConCuenLayout.setVerticalGroup(
            PnlConCuenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConCuenLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );

        jTabbedPane1.addTab("Consulta Cuentas", PnlConCuen);

        txtmontomovi.setName("txtmonto_mov"); // NOI18N

        jLabel25.setText("Tipo: ");

        jLabel27.setText("Monto: ");

        cmbtipo_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Debito", "Credito", " " }));
        cmbtipo_mov.setName("cmbtipo_mov"); // NOI18N

        jButton1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setName("bntRegistroMov"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Numero de Cuenta: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("$");

        jLabel34.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel34.setText("REGISTRO DE MOVIMIENTO");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/Iconos Pago.png"))); // NOI18N

        javax.swing.GroupLayout PnlRegMov2Layout = new javax.swing.GroupLayout(PnlRegMov2);
        PnlRegMov2.setLayout(PnlRegMov2Layout);
        PnlRegMov2Layout.setHorizontalGroup(
            PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(txtmontomovi, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbtipo_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnum_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(136, 136, 136))
            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel34))
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlRegMov2Layout.setVerticalGroup(
            PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlRegMov2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlRegMov2Layout.createSequentialGroup()
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtnum_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbtipo_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(24, 24, 24)
                        .addGroup(PnlRegMov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtmontomovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23))
                .addGap(4, 4, 4)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PnlRegMovLayout = new javax.swing.GroupLayout(PnlRegMov);
        PnlRegMov.setLayout(PnlRegMovLayout);
        PnlRegMovLayout.setHorizontalGroup(
            PnlRegMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
            .addGroup(PnlRegMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlRegMovLayout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(PnlRegMov2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );
        PnlRegMovLayout.setVerticalGroup(
            PnlRegMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
            .addGroup(PnlRegMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PnlRegMovLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PnlRegMov2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Registro de Movimientos", PnlRegMov);

        lbl_con_movi.setText("Cuenta ");

        Tabla_movimientos_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Concepto", "Tipo", "Monto", "Saldo"
            }
        ));
        jScrollPane2.setViewportView(Tabla_movimientos_consulta);

        jLabel5.setText("Busqueda por Fechas:");

        jLabel6.setText("De:");

        jLabel7.setText("Hasta:");

        jLabel8.setText("Busqueda por los ultimos movimientos:");

        jLabel9.setText("Numeros de Movimientos:");

        txtnumero_mov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumero_movActionPerformed(evt);
            }
        });

        btnConsultasMovimientos.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnConsultasMovimientos.setText("Consultar");

        cmbanio_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003" }));

        cmbmes_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", " " }));

        cmbdia_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " " }));

        cmb2anio_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003" }));

        cmb2mes_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre", " " }));

        cmb2dia_mov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        javax.swing.GroupLayout PnlConMovLayout = new javax.swing.GroupLayout(PnlConMov);
        PnlConMov.setLayout(PnlConMovLayout);
        PnlConMovLayout.setHorizontalGroup(
            PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConMovLayout.createSequentialGroup()
                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlConMovLayout.createSequentialGroup()
                                .addComponent(lbl_con_movi)
                                .addGap(18, 18, 18)
                                .addComponent(txtcuenta_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlConMovLayout.createSequentialGroup()
                                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5)
                                    .addGroup(PnlConMovLayout.createSequentialGroup()
                                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmb2anio_mov, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbanio_mov, 0, 71, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(PnlConMovLayout.createSequentialGroup()
                                        .addComponent(cmbmes_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbdia_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PnlConMovLayout.createSequentialGroup()
                                        .addComponent(cmb2mes_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmb2dia_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71)
                                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(PnlConMovLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnumero_mov, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(btnConsultasMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlConMovLayout.setVerticalGroup(
            PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlConMovLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_con_movi)
                    .addComponent(txtcuenta_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbanio_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbmes_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbdia_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmb2anio_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb2mes_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb2dia_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PnlConMovLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PnlConMovLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtnumero_mov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultasMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta Movimientos", PnlConMov);

        fecha1.setText("Fecha: ");

        lbUsuPrinc.setText("usu");

        lblFecha.setText("--/--/----");

        jLabel13.setText("Hora: ");

        lblHora.setText("--:--");

        jMenu1.setText("Archivo");

        Princ_mItemCSesion.setText("Cerrar Sesion");
        Princ_mItemCSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Princ_mItemCSesionActionPerformed(evt);
            }
        });
        jMenu1.add(Princ_mItemCSesion);

        Princ_mItemSalir.setText("Salir");
        Princ_mItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Princ_mItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(Princ_mItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsuPrinc)
                .addGap(68, 68, 68)
                .addComponent(fecha1)
                .addGap(18, 18, 18)
                .addComponent(lblFecha)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHora)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fecha1)
                    .addComponent(lbUsuPrinc)
                    .addComponent(lblFecha)
                    .addComponent(jLabel13)
                    .addComponent(lblHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Princ_mItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Princ_mItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Princ_mItemSalirActionPerformed

    private void txtnumero_movActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumero_movActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumero_movActionPerformed

    private void gesCli_btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnGuardarActionPerformed
        if (gesCli_txCedula.getText().equals("") || gesCli_txNombre.getText().equals("") || gesCli_txApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios");
        } else if (op.validadorDeCedula(gesCli_txCedula.getText())) {
            String respuesta = con.buscarCliente(gesCli_txCedula.getText());
            System.out.println("Respuesta: " + respuesta);
            if (respuesta.equals("No existe registro")) {
                con.IngresoClientes(gesCli_txCedula.getText(), gesCli_txNombre.getText(), gesCli_txApellido.getText());
                recargar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuario ya Existente");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "CI Incorrecta");
        }


    }//GEN-LAST:event_gesCli_btnGuardarActionPerformed

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
            JOptionPane.showMessageDialog(PnlConCuen, "Pon algo para buscar prro :'v ");
        } else {
            JOptionPane.showMessageDialog(PnlConCuen, con.buscarCliente(gesCli_txBuscar.getText()));
        }

    }//GEN-LAST:event_gesCli_btnBuscarActionPerformed

    private void gesCli_btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnModificarActionPerformed
        DefaultTableModel model = (DefaultTableModel) c.getModel();
        int a = c.getSelectedRow();

        if (a < 0) {

            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar una fila de la tabla");

        } else {
            String nNombre = JOptionPane.showInputDialog(PnlConCuen, "Ingrese nuevo nombre: ", "Modificacion Nombre", 1);
            if (nNombre.equals("")) {
                JOptionPane.showMessageDialog(null, "Registro No modificado");
            } else if (con.modificarCliente("" + model.getValueAt(a, 1), nNombre) == 1) {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Registro No modificado");
            }
            recargar();
        }
    }//GEN-LAST:event_gesCli_btnModificarActionPerformed

    private void Princ_mItemCSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Princ_mItemCSesionActionPerformed
        this.hashCode();
    }//GEN-LAST:event_Princ_mItemCSesionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(PnlConCuen, "Sistema Bancario Version 1\n\nCreado por: \nJhonathan Lechon \n Victoria Espinosa \n Solange Pico", "Autores", 1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String t = "";
        if (cmbtipo_mov.getSelectedItem().equals("Debito")) {
            t = "DEB";
        } else {
            t = "CRE";
        }
        String monto = txtmontomovi.getText();
        float mon = Integer.parseInt(monto);
        if (txtnum_cuenta.getText().equals("") || cmbtipo_mov.getSelectedItem().equals("") || txtmontomovi.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios");
        } else {
            if (mon > 0) {
                String respuesta = con.buscarCuenta(txtnum_cuenta.getText());
                System.out.println("Respuesta: " + respuesta);
                if (respuesta.equals(txtnum_cuenta.getText())) {
                    try {
                        con.IngresoMovimiento(txtnum_cuenta.getText(), t, fecha + " " + hora, mon, con.buscarSaldoCuenta(txtnum_cuenta.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    recargar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La cuenta no existe");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El valor debe ser mayor a cero");
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed
/*
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        //DefaultTableModel model = (DefaultTableModel) tablaCuentaModi.getModel();
        ArrayList<Cuenta> data = new ArrayList<Cuenta>();
        String i = "";
        if (txtbuscarmodiiii.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un valor");
        } else {
            System.out.println("hola");
            try {
                data = con.datos(Integer.parseInt(txtbuscarmodiiii.getText()), 2);
                for (Cuenta c : data) {
                    txtcodigoblo.setText(String.valueOf(c.getCodigo()));
                    txtcicuentas1.setText(c.getCi());
                    txttipo.setText(c.getTipo());
                    txtsaldoinicial1.setText(String.valueOf(c.getSaldo()));
                    txtestadocamiar.setText(c.getEstado());
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        txtcodigoblo.setEditable(false);
        txtcicuentas1.setEditable(false);
        txttipo.setEditable(false);
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtsaldoinicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaldoinicial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsaldoinicial1ActionPerformed

    private void btnguardamodificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardamodificadoActionPerformed
        // TODO add your handling code here:
        if (txtsaldoinicial1.getText().isEmpty() || txtestadocamiar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios :v");
        } else {
            try {
                con.cambiarcuenta((txtcicuentas1.getText()), Float.parseFloat(txtsaldoinicial1.getText()), txtestadocamiar.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnguardamodificadoActionPerformed

    private void btnConsultarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarCuentasActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) Tabla_cuentas_consulta.getModel();
        ArrayList<Cuenta> data = new ArrayList<Cuenta>();
        String i = "";
        if (txtbuscuenta1.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un valor");
        } else {
            System.out.println("hola");
            try {
                data = con.datos2(Integer.parseInt(txtbuscuenta1.getText()), 2);
                for (Cuenta c : data) {
                    Object[] fila = new Object[6];
                    fila[0] = c.getCodigo();
                    fila[1] = c.getNombre();
                    fila[2] = c.getCi();
                    fila[3] = c.getTipo();
                    fila[4] = c.getSaldo();
                    fila[5] = c.getEstado();
                    model.addRow(fila);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnConsultarCuentasActionPerformed

    private void gesCli_btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gesCli_btnGuardar1ActionPerformed
        if (txtcicuentas.getText().isEmpty() || txtsaldoinicial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos vacios :v");
        } else {
            try {
                con.IngresoCuentas(txtcicuentas.getText(), jcbtipocuenta.getSelectedItem().toString(), Float.parseFloat(txtsaldoinicial.getText()), cbestado.getSelectedItem().toString());
                //con.ValidaExistenciasdeCedulas(txtcicuentas.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_gesCli_btnGuardar1ActionPerformed

    private void btnnuevocuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevocuentaActionPerformed
        // TODO add your handling code here:
        limpiarCuenta();
    }//GEN-LAST:event_btnnuevocuentaActionPerformed
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlConCuen;
    private javax.swing.JPanel PnlConMov;
    private javax.swing.JPanel PnlGesCuen;
    private javax.swing.JPanel PnlGestClien;
    private javax.swing.JPanel PnlRegMov;
    private javax.swing.JPanel PnlRegMov2;
    private javax.swing.JMenuItem Princ_mItemCSesion;
    private javax.swing.JMenuItem Princ_mItemSalir;
    private javax.swing.JTabbedPane Spn_GesCl;
    private javax.swing.JTabbedPane Spn_GesCl1;
    private javax.swing.JTable Tabla_cuentas_consulta;
    private javax.swing.JTable Tabla_movimientos_consulta;
    private javax.swing.JButton btnConsultarCuentas;
    private javax.swing.JButton btnConsultasMovimientos;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardamodificado;
    private javax.swing.JButton btnnuevocuenta;
    public javax.swing.JTable c;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JComboBox<String> cmb2anio_mov;
    private javax.swing.JComboBox<String> cmb2dia_mov;
    private javax.swing.JComboBox<String> cmb2mes_mov;
    private javax.swing.JComboBox<String> cmbanio_mov;
    private javax.swing.JComboBox<String> cmbdia_mov;
    private javax.swing.JComboBox<String> cmbmes_mov;
    private javax.swing.JComboBox<String> cmbtipo_mov;
    private javax.swing.JLabel fecha1;
    private javax.swing.JPanel gesCli_Ingreso;
    private javax.swing.JPanel gesCli_Ingreso1;
    private javax.swing.JPanel gesCli_Mod1;
    private javax.swing.JPanel gesCli_Visualizar;
    private javax.swing.JButton gesCli_btnBuscar;
    private javax.swing.JButton gesCli_btnEliminar;
    private javax.swing.JButton gesCli_btnGuardar;
    private javax.swing.JButton gesCli_btnGuardar1;
    private javax.swing.JButton gesCli_btnModificar;
    private javax.swing.JTextField gesCli_txApellido;
    private javax.swing.JTextField gesCli_txBuscar;
    private javax.swing.JTextField gesCli_txCedula;
    private javax.swing.JTextField gesCli_txNombre;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbtipocuenta;
    public javax.swing.JLabel lbUsuPrinc;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lbl_con_movi;
    private javax.swing.JTextField txtbuscarmodiiii;
    private javax.swing.JTextField txtbuscuenta1;
    private javax.swing.JTextField txtcicuentas;
    private javax.swing.JTextField txtcicuentas1;
    private javax.swing.JTextField txtcodigoblo;
    private javax.swing.JComboBox<String> txtcuenta_mov;
    private javax.swing.JTextField txtestadocamiar;
    private javax.swing.JTextField txtmontomovi;
    private javax.swing.JTextField txtnum_cuenta;
    private javax.swing.JTextField txtnumero_mov;
    private javax.swing.JTextField txtsaldoinicial;
    private javax.swing.JTextField txtsaldoinicial1;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables

    public String getSetCurrentUser() {
        return setCurrentUser;
    }

    public void setSetCurrentUser(String setCurrentUser) {
        this.setCurrentUser = setCurrentUser;
    }
}
