package hello;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.lang.reflect.Array;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{

    @WebMethod String getHelloWorldAsString(String name);
    @WebMethod int getHelloWorldAsNumber(int number);
    @WebMethod String[] getArrayOfHelloWorldStrings(String[] names);


}