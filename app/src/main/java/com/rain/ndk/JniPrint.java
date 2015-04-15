package com.rain.ndk;

/**
 * <p></p>
 *
 * @author Jianyu.L (<a href="mailto:lijianyu2012@gmail.com">lijianyu2012@gmail.com</a>)
 * @since 2015-04-10 17:20
 */
public class JniPrint {

    public static native String printInput(String input);

    static {
        System.loadLibrary("jniDemo");
    }
}
