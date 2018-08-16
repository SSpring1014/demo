package com.xcl.demo.controller;

import com.xcl.demo.common.Enum.ResultEnum;
import com.xcl.demo.common.result.Result;
import com.xcl.demo.model.User;
import com.xcl.demo.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CreateUserController
 *
 * @author xcl
 * @date 2018/8/15 19:51
 */
@Slf4j
@RestController
public class CreateUserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo", method = {RequestMethod.POST, RequestMethod.GET})
    @ApiOperation(value = "请求用户信息", notes = "请求用户信息", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "query")
    })
    public Result getUserInfo(Long id) {
        Result result = new Result();
        try {
            User user = userService.findUser(id);
            result.setStatus(ResultEnum.SUCCESS.getCode());
            result.setStatusMessage(ResultEnum.SUCCESS.getName());
            result.setData(user);
            return result;
        } catch (Exception e) {
            log.error("用戶id :" + id + "查詢出錯！");
            e.printStackTrace();
            result.setStatus(ResultEnum.FAIL.getCode());
            result.setStatusMessage(ResultEnum.FAIL.getName());
            return result;
        }
    }
}

