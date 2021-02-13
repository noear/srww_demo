package demo.controller;

import org.noear.solon.ext.DataThrowable;

/**
 * @author noear 2021/2/10 created
 */
public class ApiCode extends DataThrowable {
    public final int code;
    public final String message;

    public ApiCode(int code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
