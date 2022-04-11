package org.spengy.cookbook.domain;

import com.baomidou.mybatisplus.annotations.TableName;

@TableName("class_name")
public class Clazz {

    private Integer id;

    private String classId;

    private String className;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
