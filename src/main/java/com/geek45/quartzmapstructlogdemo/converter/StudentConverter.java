/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.quartzmapstructlogdemo.converter;

import com.geek45.quartzmapstructlogdemo.model.StudentBO;
import com.geek45.quartzmapstructlogdemo.model.StudentDO;
import com.geek45.quartzmapstructlogdemo.model.StudentVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: StudentConverter
 * @Decription:
 * @Author: rubik
 * rubik create StudentConverter.java of 2021/12/29 7:30 下午
 */
@Mapper
public interface StudentConverter {

    StudentConverter INSTANCE = Mappers.getMapper(StudentConverter.class);

    StudentBO doConverterBo(StudentDO studentDO);

    @Mapping(target = "id", ignore = true)
    StudentDO boConverterDO(StudentBO studentBO);

    @Mapping(target = "studentNo", source = "studentCard")
    StudentVO boConverterVO(StudentBO studentBO);

    @Mapping(target = "studentCard",source = "studentNo")
    StudentBO voConverterBO(StudentVO studentVO);
}
