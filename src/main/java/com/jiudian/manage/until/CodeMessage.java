package com.jiudian.manage.until;

public enum  CodeMessage {
    SuccessCode("code","0"),SuccessMessage("message","成功"),
    ErrorCode("code","-1"),ErrorMessage("message","失败");
    public String name;
    public String message;
    CodeMessage(String name,String message) {
        this.name = name;
        this.message = message;
    }
    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
