package com.periodic.server.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.periodic.server.model.entity.Periodic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeriodicDetailInfoRes {
    private Periodic periodic;
}
