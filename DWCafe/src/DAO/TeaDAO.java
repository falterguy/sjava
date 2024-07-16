package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Tea;

public class TeaDAO extends ParentDAO{ 
	public HashMap<Integer,Tea> findAll(){	
	HashMap<Integer, Tea> data= new HashMap<>();
													
		String sql="select * from tea";
		
		try {
			pt=conn.prepareStatment(sql);
			rs=pt.executeQuery();
			while(rs.next()) {
				data.put(rs.getInt("tea_id"),
			new Tea(rs.getString(1),rs.getInt(2))			
						);
			}
			
		}catch(SQLException e) {
			System.out.println("tea테이블 조회실패");
		}
		
		return data;
		
	}
}

