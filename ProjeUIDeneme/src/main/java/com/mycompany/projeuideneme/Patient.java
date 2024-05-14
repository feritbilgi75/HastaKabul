/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeuideneme;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.swing.JTextField;
import java.sql.*;
import javax.imageio.ImageIO;

/**
 *
 * @author aslikanber
 */
public class Patient {
    private String name, surname, email, password, gender, city, disctrict;
    private long phoneNo;
    private int age;
    
    // search method: take info from database, display on panel for each result, name is a button -> doctors page
    protected static void search(JTextField text, Patient patient)
    {
        String searched = text.getText();
        String url = ""; // the sql url
        String sql = "SELECT * FROM doctors WHERE name = ?";
        
        try (Connection con = DriverManager.getConnection(url)){
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, searched);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) // while doctor is found in the table
            {
                String branch = resultSet.getString("Branch");
                String clinicName = resultSet.getString("Clinic Name");
                byte[] imageData = resultSet.getBytes("Image");
                ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
                BufferedImage img = ImageIO.read(bis);
                
                int rowID = resultSet.getRow(); // INSALLAH
                doctor.displayDoctor(clinicName, branch, clinicName, img, rowID);
            }
            con.close();  
        } catch (SQLException | IOException e) {
            System.out.print(e.getMessage());
        }
    }
    
}
