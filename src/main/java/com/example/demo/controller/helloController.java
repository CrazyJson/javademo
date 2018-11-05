package com.example.demo.controller;

import com.example.demo.config.GrilProperties;
import com.example.demo.contract.IOrderService;
import com.example.demo.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Api(value = "区域操作controller", tags = {"区域模块校验接口"})
@RestController
public class helloController {

    @Autowired
    @Qualifier("DefaultOrderServiceImpl")
    private IOrderService orderService;

    @Autowired
    private GrilProperties grilProperties;

    @Autowired
    private List<IOrderService> orderServiceList;

    @ApiOperation(value="获取区域详细信息", notes="根据url的id来获取区域详细信息")
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String pp(@RequestParam("id") String id){

        String mt = orderService.sayName();
        for(IOrderService os : orderServiceList){
            System.out.println(os.sayName());
        }
        ArrayList<String> c =new ArrayList();
        c.add("24");
        for(int i=0;i<10;i++){
            c.add(String.valueOf(i));
        }
        Thread thread= new Thread(()->{
            System.out.print("123");
        }) ;
        thread.start();
        Function<Integer,Integer> x1=(Integer t)->{return 1;};

        Integer m =   x1.apply(1);

        c.sort((s1,s2)->(s1.compareTo(s2)));

        
        Class<Student> c0= Student.class;


        System.out.println("xxxx"+id+grilProperties.getCupSize());
        return String.join(",",c);
    }

    @GetMapping(value = "list")
    public String xx(){
        return "abc";
    }
}

