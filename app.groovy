@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
      return "Mahmoud Mohamd from master from step also";
    }

}
