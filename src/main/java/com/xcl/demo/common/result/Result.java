package com.xcl.demo.common.result;

import javafx.scene.control.Pagination;
import lombok.Getter;
import lombok.Setter;

/**
 * result
 * 统一API响应结果封装
 *
 * @author xcl
 * @date 2018/8/15 19:53
 */
@Setter
@Getter
public class Result {
    private int status;
    private String statusMessage;
    private Object data;
    private Pagination page;

    @Override
    public String toString() {
        return "result{" +
                "status=" + status +
                ", statusMessage='" + statusMessage + '\'' +
                ", data=" + data +
                ", page=" + page +
                '}';
    }
}
