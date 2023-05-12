package cn.liangjieheng.traceproducer.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {
    @Select("select account from wb_aws_iam_account")
    List<String> listAccount();
}
