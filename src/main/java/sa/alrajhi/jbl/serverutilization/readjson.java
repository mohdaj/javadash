package sa.alrajhi.jbl.serverutilization;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.*;
import java.util.List;

public class readjson {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        InputStream inputStream =new FileInputStream(new File("C:/Users/engmo/Desktop/data.json"));
        TypeReference<List<object>> listTypeReference= new TypeReference<List<object>>(){};
        List<object>objects =mapper.readValue(inputStream,listTypeReference);
        for(object p : objects){
            System.out.println(p.getEnvironment() + p.getUser().getAdmin());
        }




    }
}
