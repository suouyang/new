package com.gaotong.smart.mapper;

import com.gaotong.smart.entity.OrganizationalStructure;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrganizationalStructureMapperTest {
@Autowired
OrganizationalStructureMapper organizationalStructureMapper;

    @Test
    public void test(){
        OrganizationalStructure organizationalStructure = new OrganizationalStructure();
        organizationalStructure.setName("cceshi");
        organizationalStructure.setContent("werth");
        organizationalStructureMapper.insert(organizationalStructure);


    }
}