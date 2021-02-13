package demo.controller;

/**
 * @author noear 2021/2/10 created
 */
public class ApiCodes {
    public static final ApiCode CODE_200 = new ApiCode(200, "succeed");

    public static final ApiCode CODE_4001001 = new ApiCode(4001001, "Interface does not exist");
    public static final ApiCode CODE_4001002 = new ApiCode(4001002, "Resource expired");
    public static final ApiCode CODE_4002001 = new ApiCode(4002001, "Wrong ID card");
    public static final ApiCode CODE_4002002 = new ApiCode(4002002, "No auth info");
    public static final ApiCode CODE_4002003 = new ApiCode(4002003, "Input parameter error");
    public static final ApiCode CODE_4009001 = new ApiCode(4009001, "Lack of balance");
    public static final ApiCode CODE_4009999 = new ApiCode(4009999, "Unknown error");
}
