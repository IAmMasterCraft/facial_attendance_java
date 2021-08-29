package com.timmy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.timmy.entity.EnrollInfo;
import com.timmy.entity.UserInfo;

public interface EnrollInfoService {

	
	int deleteByPrimaryKey(Integer id);
	
	int deleteByEnrollId(Integer id);

	int insert(int enrollid,int backupnum,String imagPath,String signature);

    int insertSelective(EnrollInfo record);

   

    EnrollInfo selectByPrimaryKey(Integer id);
    
   
    int updateByPrimaryKeySelective(EnrollInfo record);

    int updateByPrimaryKeyWithBLOBs(EnrollInfo record);
    
    EnrollInfo selectByBackupnum(int enrollId,int backupnum);
    
    List<UserInfo> usersToSendDevice();
    
    List<EnrollInfo> selectAll();
    
    List<EnrollInfo> selectByEnrollId(int enrollId);
    int updateByEnrollIdAndBackupNum(String signatures,int enrollId,int backupnum);
}
