package com.example.demo.command;

import com.alibaba.cola.dto.Response;
import com.example.demo.dto.MetricDeleteCmd;
import com.example.demo.gatewayimpl.database.MetricMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MetricDeleteCmdExe
 *
 * @author Frank Zhang
 * @date 2019-03-04 3:01 PM
 */
@Component
public class MetricDeleteCmdExe{

    @Resource
    private MetricMapper metricMapper;

    public Response execute(MetricDeleteCmd cmd) {

        metricMapper.delete(cmd.getMetricId(), cmd.getOperater());

        return Response.buildSuccess();
    }
}