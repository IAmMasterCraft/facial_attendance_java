package com.timmy.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.timmy.entity.EnrollInfo;
import com.timmy.entity.Person;

public interface PersonService {

	int deleteByPrimaryKey(int id);

    int insert(Person record);

    int insertSelective(Person record);


    Person selectByPrimaryKey(int id);

   
    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
    
    List<Person> selectAll();
    public void setUserToDevice(int enrollId,String name,int backupnum,int admin,String records,String deviceSn);
    
    public void getSignature(int enrollId,String deviceSn,int backupNum);
    public void getSignatureByAll(int enrollId);
    public void setUserToDevice2(String deviceSn);
    
    void getSignature2(List<EnrollInfo>enrolls,String deviceSn);
    
    void deleteUserInfoFromDevice(Integer enrollId,String deviceSn);
    
    public void setUsernameToDevice(String deviceSn);
}
