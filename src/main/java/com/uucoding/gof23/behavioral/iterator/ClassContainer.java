package com.uucoding.gof23.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级容器
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/6  15:12
 */
public class ClassContainer implements Container<Student>{

    private List<Student> studentList = new ArrayList<>();

    /**
     * 添加方法
     * @param student
     * @return
     */
    @Override
    public boolean add(Student student) {
        return studentList.add(student);
    }

    @Override
    public Iterator<Student> getIterator() {
        return new StudentIterator();
    }

    /**
     * 学生迭代器
     */
    public class StudentIterator implements Iterator<Student>{

        private int index;

        @Override
        public boolean hasNext() {
            return index < studentList.size();

        }

        @Override
        public Student next() {
            return studentList.get(index++);
        }
    }
}
