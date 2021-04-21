package sa.alrajhi.jbl.serverutilization.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }





@GetMapping("/update")
public void updateEnv(@RequestParam String env,String service,String user){
    System.out.println(env);
    System.out.println(service);
    System.out.println(user);
}










}

