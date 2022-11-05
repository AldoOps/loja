package gft.exception;

public class EntityNotFoundException  extends LojaException{

    private static final long serialVersionUID = 3842948239423842L;

    public EntityNotFoundException(String message) {
        super(message);
    }
}
