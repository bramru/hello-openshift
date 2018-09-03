package nl.ru.bramru.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MainController {

  @RequestMapping("/")
  public String index() {
    return "Hello";
  }

  @RequestMapping("/world")
  public String world() {
    return "Hello World!\n";
  }
}
