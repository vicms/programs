/**
 * This is the first class of this project which is intended as generalpractice for java 
 * and its particular characteristics
 * 
 * Victor Mtz all rights reserved.
 * 
 **/

package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloController {

/**
 * 
 * Funcion que esta chida
 * 
 * @throws algoException
 * 
 **/
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}