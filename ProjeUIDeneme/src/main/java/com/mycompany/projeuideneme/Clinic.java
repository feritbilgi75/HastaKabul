/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeuideneme;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author aslikanber
 */
public class Clinic {
    private String name, email, password, phoneNo, city, district;
    
    
    protected static void displayClinic(String clinicName, String address, String phoneNo, BufferedImage img, int rowID)
    {
        JPanel panel = new JPanel(new GridLayout(0,2));
        JLabel imgLabel = new JLabel(new ImageIcon(img));
        
        JPanel innerPanel = new JPanel(new GridLayout(3,0));
        JButton nameButton = new JButton(clinicName);
        JLabel addressText = new JLabel(address);
        JLabel phoneText = new JLabel(phoneNo);
        
        innerPanel.add(nameButton);
        innerPanel.add(addressText);
        innerPanel.add(phoneText);
        
        panel.add(imgLabel);
        panel.add(innerPanel);
        panel.setVisible(true);
        
        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ClinicListingPage newPage = new ClinicListingPage(rowID);
                newPage.setVisible(true);
            }
        });
    }
}
