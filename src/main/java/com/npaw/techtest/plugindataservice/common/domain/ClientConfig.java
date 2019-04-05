package com.npaw.techtest.plugindataservice.common.domain;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ClientConfig
{
    private String accountCode;
    private String targetDevice;
    private String pluginVersion;
    private int pingTime;
    private List<HostConfig> hosts;
}
