@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
      return "Mahmoud Mohamd";
    }

}