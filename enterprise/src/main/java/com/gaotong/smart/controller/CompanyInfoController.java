package com.gaotong.smart.controller;


import com.gaotong.smart.config.Result;
import com.gaotong.smart.entity.CompanyInfo;
import com.gaotong.smart.service.CompanyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suouyang
 * @since 2021-08-05
 */
@RestController
@CrossOrigin
@RequestMapping("/smart/company-info")
public class CompanyInfoController {

    @Autowired
    CompanyInfoService companyInfoService;
    @GetMapping("selectCompanyInfo")
    public Result selectCompanyInfo(){
        CompanyInfo companyInfo = companyInfoService.getOne(null);
        return Result.ok().data("data",companyInfo);
    }
    @GetMapping("selectCompanyInfoById/{id}")
    public Result selectCompanyInfo(@PathVariable String id){
        CompanyInfo companyInfo = companyInfoService.getById(id);
        return Result.ok().data("data",companyInfo);
    }
    @DeleteMapping("deleteCompanyInfo/{id}")
    public Result deleteCompanyInfo(@PathVariable String id){
        boolean flag = companyInfoService.removeById(id);
        if(flag){
            return Result.ok();
        }else{
          return  Result.error();
        }
    }

    @PostMapping("updateCompanyInfo/")
        public Result updateCompanyInfo(@RequestBody(required = false) CompanyInfo companyInfo){

        boolean flag = companyInfoService.updateById(companyInfo);
            if(flag){
                return Result.ok();
            }else{
                return  Result.error();
            }
        }
    }





