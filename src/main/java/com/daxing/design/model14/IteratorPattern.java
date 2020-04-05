package com.daxing.design.model14;


/**
 * 14迭代器模式
 * ，这个迭代器模式也有点没落
 * 了，基本上很少有项目再独立写迭代器了，
 * 直接使用 List 或者 Map 就可以完整的解决问题
 */
public class IteratorPattern {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战：", 10, 10000000);
        project.add("扭转时空：", 20, 20000000);
        project.add("变形金刚：", 30, 30000000);
        project.add("木马计：", 40, 40000000);

        for (int i = 1; i < 101; i++) {
            project.add("第：" + i + "项目", i * 5, i * 100000);
        }
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
