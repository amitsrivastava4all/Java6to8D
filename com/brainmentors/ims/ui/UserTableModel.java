package com.brainmentors.ims.ui;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.brainmentors.ims.user.dto.UserDTO;
import com.brainmentors.ims.user.logic.ReadWriterUser;

public class UserTableModel extends AbstractTableModel {
	public String[] user_cols = { "userid","password"};
	private ArrayList<UserDTO> userDTOList;
	public UserTableModel(){
		try {
			userDTOList = ReadWriterUser.readUsers();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return userDTOList.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return user_cols.length;
	}
	@Override
	 public String getColumnName(int col) {
	      return user_cols[col];
	    }
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		UserDTO userDTO = userDTOList.get(rowIndex); 

	      switch (columnIndex) {
	      case 0:
	        return userDTO.getUserid();
	      case 1:
	        return userDTO.getPwd();
	      
	        
	      }
	      return null;	
	      
	    }
	

}
