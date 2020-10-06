

## Info

Projektet er baseret på denne tutorial:
https://mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/

## wsimport versionen
er genereret med 
C:\>"C:\Program Files (x86)\Java\jdk1.8.0_261\bin\wsimport" -keep http://localhost:9999/ws/hello?wsdl -s "C:\Users\Bruger\IdeaProjects"
(der var et issue i forhold til at Program Files er i 2 ord, derfor skulle det i citationstegn svjf...)
og vedr. -s:

-s directory
    Specifies where to place generated source files.
jf: https://docs.oracle.com/javase/9/tools/wsimport.htm