package com.periodic.server.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.periodic.server.model.projection.PeriodicTableProj;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeriodicTableRes {
    private List<PeriodicTableProj> tableData;
}
