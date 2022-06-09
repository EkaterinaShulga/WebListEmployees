package pro.sky.java.course2.weblistemployees.exception;

//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
public class EmployeeStoragesFullException extends RuntimeException{

   public EmployeeStoragesFullException(){
        super();
    }


    public EmployeeStoragesFullException(String text){
        super(text);
    }

}
