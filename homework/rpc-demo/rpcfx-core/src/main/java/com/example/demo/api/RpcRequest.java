package com.example.demo.api;

import lombok.Data;

/**
 * Rpc 自定义请求结构
 *
 * @author
 */
@Data
public class RpcRequest {

    /**
     * 接口类名称
     */
    private String serviceClass;

    /**
     * 方法名
     */
    private String method;

    /**
     * 参数
     */
    private Object[] argv;
}
