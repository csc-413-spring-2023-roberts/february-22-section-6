public class CommandLine {

  public static void main(String[] args) {
    System.out.println(
        String.format("%d arguments provided", args.length));

    for (int i = 0; i < args.length; i++) {
      System.out.println(
          String.format("%3d: %s", i, args[i]));
    }
  }
}
