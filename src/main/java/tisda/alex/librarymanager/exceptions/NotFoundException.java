package tisda.alex.librarymanager.exceptions;

public class NotFoundException extends RuntimeException {
    public static final long serialVersionUID = 1L;
    public NotFoundException(String message){
        super(message);
    }

}
