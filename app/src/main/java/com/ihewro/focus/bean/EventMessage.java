package com.ihewro.focus.bean;

/**
 * <pre>
 *     author : hewro
 *     e-mail : ihewro@163.com
 *     time   : 2018/07/07
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class EventMessage {

    public static final String MAKE_READ_STATUS = "MAKE_READ_STATUS";
    public static final String ADD_FEED = "ADD_FEED";
    public static final String SHOW_FEED_FOLDER_MANAGE = "SHOW_FEED_FOLDER_MANAGE";
    public static final String SHOW_FEED_LIST_MANAGE = "SHOW_FEED_LIST_MANAGE";
    public static final String EDIT_FEED_FOLDER_NAME = "EDIT_FEED_FOLDER";//修改feed文件夹名称
    public static final String EDIT_FEED_NAME = "EDIT_FEED_NAME";



    private String type;
    private String message;
    private int index;
    private String message2;
    private String message3;


    public EventMessage(String type) {
        this.type = type;
    }

    public EventMessage(String type, int index) {
        this.type = type;
        this.index = index;
    }

    public EventMessage(String type, String message) {
        this.type = type;
        this.message = message;
    }


    public EventMessage(String type, String message, String message2) {
        this.type = type;
        this.message = message;
        this.message2 = message2;
    }


    public EventMessage(String type, String message, String message2, String message3) {
        this.type = type;
        this.message = message;
        this.message2 = message2;
        this.message3 = message3;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getMessage3() {
        return message3;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "type" + type + "\n" +
                "message" + message + "\n" +
                "message2" + message2 + "\n" +
                "message3" + message3;

    }
}
