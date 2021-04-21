package sa.alrajhi.jbl.serverutilization;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import sa.alrajhi.jbl.serverutilization.Classes.Ob;
import sa.alrajhi.jbl.serverutilization.Classes.services;

import java.io.*;
import java.util.List;

public class readjson {
//    public static void main(String[] args) throws IOException {
//        ObjectMapper mapper =new ObjectMapper();
//        InputStream inputStream =new FileInputStream(new File("/Users/mohammedabujabal/Documents/MY-WOEK/javadash/src/main/java/sa/alrajhi/jbl/serverutilization/assets/data.json"));
//        TypeReference<List<Ob>> listTypeReference= new TypeReference<List<Ob>>(){};
//        List<Ob> objects =mapper.readValue(inputStream,listTypeReference);
//        for(Ob p : objects){
//            System.out.println(p.getEnv()+ "\n"+p.getServices().getWlp()+ "\n"+p.getServices().getAdmin() +"\n\n");
//        }
//
//        Ob ob =new Ob();
//        ob.setEnv("SIT2");
//        ob.setServices(new services("ips"));
//        mapper.writeValue(new File("/Users/mohammedabujabal/Documents/MY-WOEK/javadash/src/main/java/sa/alrajhi/jbl/serverutilization/assets/data.json"),ob);
//        inputStream.close();
//
//    }
}
