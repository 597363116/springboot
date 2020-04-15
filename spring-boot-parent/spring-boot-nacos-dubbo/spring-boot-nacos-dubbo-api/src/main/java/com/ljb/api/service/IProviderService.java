package com.ljb.api.service;

import java.util.List;

import com.ljb.api.dto.ProviderTestDTO;

/**
 * RPC接口
 * @Author Sans
 * @CreateTime 2019/11/6 23:03
 */
public interface IProviderService {
    List<ProviderTestDTO> queryList();
}