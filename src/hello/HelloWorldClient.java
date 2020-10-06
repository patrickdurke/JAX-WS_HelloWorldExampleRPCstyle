package hello;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient{

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://hello/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("mkyong"));

        //Eksperimenter med forskellige parametertyper og returtyper:
        System.out.println(hello.getHelloWorldAsNumber(42));

        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "Person" + i;
        }

        strings = hello.getArrayOfHelloWorldStrings(strings);

        for (String string: strings) {
            System.out.println(string);
        }
    }

}
