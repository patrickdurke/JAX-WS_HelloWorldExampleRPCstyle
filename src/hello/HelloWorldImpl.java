package hello;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "hello.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

    @Override
    public int getHelloWorldAsNumber(int number) {
        return 1000 + number;
    }

    @Override
    public String[] getArrayOfHelloWorldStrings(String[] names) {
        for (String name : names) {
            name = "hello " + name;
        }
        return names;
    }

}