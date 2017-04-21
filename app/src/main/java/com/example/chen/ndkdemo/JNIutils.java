package com.example.chen.ndkdemo;

/**
 * Created by Chen on 2017/4/21.
 */

public class JNIutils {
    static {
        try {
            System.loadLibrary("NDKJNIdemo");
        } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            unsatisfiedLinkError.printStackTrace();
            System.out.println("loadLibrary Error");
        }
    }
    public static native String getShowString();
}
