@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
      return "Mahmoud Mohamd from b2";
    }

}
