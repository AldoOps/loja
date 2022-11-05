package gft.exception;

import java.io.Serial;

public class LojaException  extends RuntimeException {


    @Serial
    private static final long serialVersionUID = 3429843204328032L;

    private String message;

    public LojaException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
