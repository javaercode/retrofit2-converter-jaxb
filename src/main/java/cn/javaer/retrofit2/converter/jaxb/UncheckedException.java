package cn.javaer.retrofit2.converter.jaxb;

/**
 * 包装 RuntimeException.
 *
 * @author zhangpeng
 */
public class UncheckedException extends RuntimeException {
    public UncheckedException(Throwable cause) {
        super(cause);
    }
}
