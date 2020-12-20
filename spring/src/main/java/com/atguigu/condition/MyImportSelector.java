package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: yangjiang
 * @create: 2020-12-19 16:21
 **/
public class MyImportSelector implements ImportSelector {

    //返回值就是要导入到容器中的全类名
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return null;
    }
}
