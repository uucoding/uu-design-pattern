package com.uucoding.gof23.behavioral.iterator;

/**
 * 测试
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/6  15:27
 */
public class Client {

    public static void main(String[] args) {
        Container<Student> classContainer = new ClassContainer();
        classContainer.add(new Student(1, "张三"));
        classContainer.add(new Student(2, "李四"));
        classContainer.add(new Student(3, "王二"));

        Iterator<Student> iterator = classContainer.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
