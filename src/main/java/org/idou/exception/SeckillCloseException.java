package org.idou.exception;

/**
 * 秒杀关闭异常
 * Created by ZhangSi on 2016/10/18.
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
