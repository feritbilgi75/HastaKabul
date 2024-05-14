package com.mycompany.projeuideneme;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aslikanber
 */
public class doctor {
    private String name, surname, email, password, age, gender, branch, status, information;
    private long phoneNo;
    
    
    protected static void displayDoctor(String docName, String branch, String clinicName, BufferedImage img, int rowID)
    {
        // the panel will have a picture and a panel with multiple lşnes of text
        // flow layout with pic and panel, inner panel grid layout with three lines: name, occupation, clinic
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));
        // HOW TO ADD PICTURES
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        
        JPanel innerPanel = new JPanel();
        JButton nameButton = new JButton(docName);
        JTextField branchText = new JTextField(branch);
        JTextField clinicText = new JTextField(clinicName);
        
        innerPanel.setLayout(new GridLayout(3,0));
        innerPanel.add(nameButton);
        innerPanel.add(branchText);
        innerPanel.add(clinicText);
        
        panel.add(imgLabel);
        panel.add(innerPanel);
        panel.setVisible(true);
        
        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                DoctorListingPage newPage = new DoctorListingPage(rowID);
                newPage.setVisible(true);
            }
        });
    }
    
}
