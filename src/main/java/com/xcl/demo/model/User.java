package com.xcl.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * User
 *
 * @author xcl
 * @date 2018/8/15 19:44
 */
@Getter
@Setter
@Entity
@Data
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", columnDefinition = "姓名")
    private String userName;

    @Column(name = "mobile_phone", columnDefinition = "手机")
    private String mobilePhone;

    @Column(name = "sex", columnDefinition = "性别")
    private Integer sex;

    @Column(name = "create_time", columnDefinition = "创建时间")
    private Date createTime;

    @Column(name = "update_time", columnDefinition = "修改时间")
    private Date updateTime;

}
