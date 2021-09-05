package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.OrganizationalStructure;
import com.gaotong.smart.service.OrganizationalStructureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-16
 */
@RestController
@CrossOrigin
@RequestMapping("/smart/organizational-structure")
public class OrganizationalStructureController {
@Autowired
    OrganizationalStructureService organizationalStructureService;

    @GetMapping("selectAll")
    public Result selectAll(){
        List<OrganizationalStructure> list = organizationalStructureService.list(null);
        return Result.ok().data("data",list);

    }

    @GetMapping("selectById/{id}")
    public Result selectById(@PathVariable String id){
        OrganizationalStructure structure = organizationalStructureService.getById(id);
        return Result.ok().data("data",structure);
    }



    @PostMapping("addOrganizationalStructure")
    public Result addOrganizationalStructure(@RequestBody OrganizationalStructure organizationalStructure){
        boolean flag = organizationalStructureService.save(organizationalStructure);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }
    }
    @PostMapping("updateOrganizationalStructure")
    public Result updateOrganizationalStructure(@RequestBody OrganizationalStructure organizationalStructure){
        boolean flag = organizationalStructureService.updateById(organizationalStructure);
        if(flag){
            return Result.ok();
        }else{
            return Result.error();
        }
    }



}

