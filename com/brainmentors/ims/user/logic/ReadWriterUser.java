package com.brainmentors.ims.user.logic;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.brainmentors.ims.user.dto.UserDTO;

public class ReadWriterUser {
	
	public static boolean registerUser(ArrayList<UserDTO> userList) throws IOException{
		FileOutputStream fo =new FileOutputStream("D:\\test99\\user.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		for(UserDTO userDTO : userList){
		os.writeObject(userDTO);
		}
		os.close();
		fo.close();
		return true;
	}
	
	public static ArrayList<UserDTO> readUsers() throws IOException{
		File file =new File("D:\\test99\\user.dat");
		FileInputStream fi = null;
		ObjectInputStream oi= null;
		ArrayList<UserDTO> userList = new ArrayList<>();
		UserDTO userDTOObject = null;
		try{
			
			if(!file.exists()){
				return null;
			}
			else{
				fi = new FileInputStream(file);
				 oi = new ObjectInputStream(fi);
				
				
				 do  {
					try{
					//userDTOObject =(UserDTO)oi.readObject();
					 userDTOObject = (UserDTO)oi.readObject();
					System.out.println(userDTOObject);
					userList.add(userDTOObject);
					}
					catch(Exception e){
						System.out.println(userList.size());
						e.printStackTrace();
						break;
						
					}
					}while(userDTOObject!=null);
				
				/*if(userDTOObject.getUserid().equals(userDTO.getUserid()) && userDTOObject.getPwd().equals(userDTO.getPwd())){
					System.out.println("User FOUND ... "+userDTOObject);
					return true;
				}*/
			}
			}
			finally{
				if(oi!=null){
				oi.close();
				}
				if(fi!= null){
				fi.close();
				}
				if(userList.size()==0){
					return null;
				}
				else
				return userList;
			}
	}
	
	public static boolean checkLogin(UserDTO userDTO) throws ClassNotFoundException, IOException{
		File file =new File("D:\\test99\\user.dat");
		FileInputStream fi = null;
		ObjectInputStream oi= null;
		//UserDTO userDTOArray[] = new UserDTO[10];
		UserDTO userDTOObject = null;
		ArrayList<UserDTO> userList = new ArrayList<>();
		try{
			
		if(!file.exists()){
			return false;
		}
		else{
			fi = new FileInputStream(file);
			 oi = new ObjectInputStream(fi);
			
			
			 do  {
				try{
				//userDTOObject =(UserDTO)oi.readObject();
				 userDTOObject = (UserDTO)oi.readObject();
				System.out.println(userDTOObject);
				userList.add(userDTOObject);
				}
				catch(EOFException e){
					//System.out.println(userList);
					System.out.println(userList.size());
					break;
					//e.printStackTrace();
				}
				}while(userDTOObject!=null);
			
			/*if(userDTOObject.getUserid().equals(userDTO.getUserid()) && userDTOObject.getPwd().equals(userDTO.getPwd())){
				System.out.println("User FOUND ... "+userDTOObject);
				return true;
			}*/
		}
		}
		finally{
			oi.close();
			fi.close();
			return false;
		}
		
	
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		checkLogin(null);
	}

}
