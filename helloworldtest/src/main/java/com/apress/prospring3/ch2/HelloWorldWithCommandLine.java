/**
 * Created by Administrator on 2015/4/23.
 */
package com.apress.prospring3.ch2;
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World!");
        }
    }
}