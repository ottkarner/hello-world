package cn.greenlinux.helloworld;

/**
 * 哈喽，世界！
 *
 * 我是Greenlinux，这里是我的代码空间。
 */
public class HelloWorld {

    public String sayHello() {

        return "Hello World!";
    }

    public static void main(String[] args) {

        String hello = new HelloWorld().sayHello();
        System.out.println(hello);
    }
}