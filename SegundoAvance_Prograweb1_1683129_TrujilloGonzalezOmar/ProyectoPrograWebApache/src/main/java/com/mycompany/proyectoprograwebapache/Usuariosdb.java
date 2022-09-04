package com.mycompany.proyectoprograwebapache;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hench
 */
public class Usuariosdb {

          public void consultasUsuarios(){
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT ID, Nombre, ApellidoP, ApellidoM FROM Usuarios");
            while (rs.next()){
                System.out.println("ID = " +rs.getInt("ID")+ " Nombres  = "+rs.getString("nombre"));
            }
            con.close();
             }catch(Exception ex){
             System.out.println(ex);
            }
        }
              public void Buscar( String Correo,String Contra ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("SELECT FROM Usuarios WHERE Correo =(Correo)VALUES(?) AND Contra= (Contra) VALUES(?)");
                stmt.setString(1, Correo);
                stmt.setString(2, Contra);
             
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
          
        public void Insertar(String Nombre, String ApellidoP, String ApellidoM, String Fecha_Nacimiento, String Correo, String NombreUsuario, String Contra ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("INSERT INTO Usuarios (Nombre, ApellidoP, ApellidoM,Fecha_Nacimiento,Correo,NombreUsuario,Contra)VALUES(?,?,?,?,?,?,?)");
                stmt.setString(1, Nombre);
                stmt.setString(2, ApellidoP);
                stmt.setString(3, ApellidoM);
                stmt.setString(4, Fecha_Nacimiento);
                stmt.setString(5, Correo);
                stmt.setString(6, NombreUsuario);
                stmt.setString(7, Contra);
             
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        
        public void Editar(String Nombre, String ApellidoP, String ApellidoM, String Fecha_Nacimiento, String Correo, String NombreUsuario, String Contra){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("UPDATE Usuarios SET(Nombre,ApellidoP, ApellidoM, Fecha_Nacimiento,Correo,NombreUsuario,Contra)VALUES(?,?,?,?,?,?,?), WHERE ID = 1");
                stmt.setString(1, Nombre);
                stmt.setString(2, ApellidoP);
                stmt.setString(3, ApellidoM);
                stmt.setString(4, Fecha_Nacimiento);
                stmt.setString(5, Correo);
                stmt.setString(6, NombreUsuario);
                stmt.setString(7, Contra);
             
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        public void Eliminar(int ID,String Nombre, String ApellidoP, String ApellidoM, String NombreUsuario, boolean Eliminado ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("UPDATE Usuarios SET(Eliminado)VALUES(?), WHERE ID = 1");
               
                stmt.setBoolean(1, true);
               
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
        
         public void InsertarNota(int ID_User, String Titulo, String Texto, String hashtag ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("INSERT INTO Notas (ID_User, Titulo, Texto,hashtag)VALUES(?,?,?,?,)");
                stmt.setInt(1, ID_User);
                stmt.setString(2, Titulo);
                stmt.setString(3, Texto);
                stmt.setString(4, hashtag);
               
             
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
         
          public void EditarNotas(int ID_User, String Titulo, String Texto, String hashtag ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("UPDATE Notas SET(ID_User, Titulo, Texto,hashtag)VALUES(?,?,?,?,), WHERE ID_USER=1");
                stmt.setInt(1, ID_User);
                stmt.setString(2, Titulo);
                stmt.setString(3, Texto);
                stmt.setString(4, hashtag);
               
             
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
          public void EliminarNotas(int ID_User,String Titulo,String Texto, boolean Eliminado ){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Progra_web1","root","Henchin117!");
               PreparedStatement stmt = con.prepareStatement("UPDATE Notas SET(Eliminado)VALUES(?), WHERE ID_User = 1 AND Titulo=Primera");
               
                stmt.setBoolean(1, true);
               
                  ResultSet rs = stmt.executeQuery();
                  con.close();
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
}
