/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecinoka;

/**
 * This is a tute provided by miss inoka...Several months back...
 * 
 * @author Nadun
 *
 *Date-2016.02.08
 *Time-1.15AM
 *
 */
	
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class JDBCSwing extends JFrame implements ActionListener
{
JLabel lblId,lblFName,lblLname,lblAddress,lblSalary,lblI,lblF,lblL,lblA,lblS,lblIVal,lblFVal,lblLVal,lblAVal,lblSVal ;
JTextField txtID,txtFName,txtLName,txtAddress,txtSalary;
JButton btnAdd,btnUpdate,btnDelete,btnPrev,btnNext;
//ResultSet rs;

	JDBCSwing()
	{
		super("JDBC ALL in One");
		
		JPanel pnlInput = new JPanel(new GridLayout(5,2));
		
		lblId = new JLabel("Enter Id : ");
		txtID = new JTextField(11);
		
		lblFName = new JLabel("First Name : ");
		txtFName = new JTextField(15);
		
		lblLname = new JLabel("Last Name :  ");
		txtLName = new JTextField();
		
		lblAddress = new JLabel(" Address : ");
		txtAddress = new JTextField();
		
		lblSalary = new JLabel("Salary :  ");
		txtSalary = new JTextField();
		
		pnlInput.add(lblId);
		pnlInput.add(txtID);
		
		pnlInput.add(lblFName);
		pnlInput.add(txtFName);
		
		pnlInput.add(lblLname);
		pnlInput.add(txtLName);
		
		pnlInput.add(lblAddress);
		pnlInput.add(txtAddress);
		
		pnlInput.add(lblSalary);
		pnlInput.add(txtSalary);
		
		JPanel pnlButton = new JPanel(new GridLayout(1,3));
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(this);
		
		btnUpdate = new JButton("Update");
		//btnUpdate.addActionListener(this);
		
		btnDelete =  new JButton("Delete");
		//btnDelete.addActionListener(this);
		
		pnlButton.add(btnAdd);
		pnlButton.add(btnUpdate);
		pnlButton.add(btnDelete);
		
		
		JPanel pnlNavigate = new JPanel(new GridLayout(1,2));
		btnPrev = new JButton("<<");
		btnPrev.setActionCommand("Next");
		//btnPrev.addActionListener(this);
		
		
		btnNext = new JButton(">>");
		btnNext.setActionCommand("Next");
		//btnNext.addActionListener(this);
		
		 pnlNavigate.add(btnPrev);
		 pnlNavigate.add(btnNext);
		 
		 
		 JPanel pnlNavAns = new JPanel(new GridLayout(5,2));
		 
		 lblI = new JLabel("ID : ");
		 lblIVal = new JLabel("Val");
		 
		 lblF = new JLabel("First Name : ");
		 lblFVal = new JLabel("Val");
		 
		 lblL = new JLabel("Last Name : ");
		 lblLVal = new JLabel("Val");
		 
		 lblA = new JLabel(" Address : ");
		 lblAVal = new JLabel("Val");
		 
		 lblS = new JLabel("Salary :  ");
		 lblSVal =  new JLabel("Val");
		 
		 pnlNavAns.add(lblI);
		 pnlNavAns.add(lblIVal);
		 
		 pnlNavAns.add(lblF);
		 pnlNavAns.add(lblFVal);
		 
		 pnlNavAns.add(lblL);
		 pnlNavAns.add(lblLVal);
		 
		 pnlNavAns.add(lblA);
		 pnlNavAns.add(lblAVal);
		 
		 pnlNavAns.add(lblS);
		 pnlNavAns.add(lblSVal);
		 
		
		Container cn = getContentPane();
		 cn.setLayout(new BoxLayout(cn,BoxLayout.Y_AXIS));
		 
		 cn.add(pnlInput);
		 cn.add(pnlButton);
		 cn.add(pnlNavAns);
		 cn.add(pnlNavigate);
		 
		 setSize(350,400);
		 show();
		 
			
	}
	
	public void actionPerformed(ActionEvent evt)
	
	{
		String action = evt.getActionCommand();
		if(action.equals("Add"))
		{
			addoperation();
		}/**else if(action.equals(btnUpdate))
			{
				updateoperation();
			}else if(action.equals(btnDelete))
				{
					deleteoperation();
				}else if(action.equals(btnPrev))
					{
						preNevigation();
					}else if(action.equals(btnNext))
						{
							NextNevigation();
						}**/
		
	}
	
	
		private void addoperation()
		{
			
			
			try			
			{
				//Loading JDBC Driver
				
				Class.forName("com.mysql.jdbc.Driver");
				
			}catch(ClassNotFoundException e)
			{
				throw new RuntimeException(e);
			
				
			}
						
			String url = "jdbc:mysql://localhost:3306/javaswing";
			String username="root";
			String password="";
			String query = "INSERT INTO employees(id,last_name,first_name,address,salary)"+" VALUES('"+txtID.getText()+"','"+txtFName.getText()+"','"+txtLName.getText()+"','"+txtAddress.getText()+"','"+txtSalary+"');";
			
			
				try{
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt = con.createStatement();
				stmt.execute(query);
				JOptionPane.showMessageDialog(null, "Record Added Successfully.", "Record Added", JOptionPane.INFORMATION_MESSAGE);
				ClearControls();
			 	
				}catch(Exception e)
					{
						JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
					}
			
		}

		private void ClearControls()
		{
			txtFName.setText("");
			txtLName.setText("");
			txtAddress.setText("");
			txtSalary.setText("");
		}
		
	

public static void main(String[] args)
{
	JDBCSwing obj = new JDBCSwing();
	
	}
}
