package com.example.demo.dto;

import com.example.demo.dto.clientobject.MiscMetricCO;
import com.example.demo.dto.clientobject.PatentMetricCO;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * MiscMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:04 AM
 */
@Data
public class MiscMetricAddCmd extends CommonCommand{
    @NotNull
    private MiscMetricCO miscMetricCO;
}
