package com.seungma.springvoicemarket;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestRepository {
    List<TestDTO> getDatas();
}
