package parquetprocesser.config;

import java.util.Arrays;
import java.util.List;

public class ArgParser {
  private String[] requestArgs;

  public ArgParser(String[] requestArgs) {
    this.requestArgs = requestArgs;
  }

  public int getPortNumber() {
    String portCommand = "-p";

    if (convertArgs().contains(portCommand)) {
      return findPortValue(portCommand);
    }
    return 5000;
  }

  private int findPortValue(String portCommand) {
    return Integer.valueOf(convertArgs().get(convertArgs().indexOf(portCommand) + 1));
  }

  private List<String> convertArgs() {
    List<String> argsList = Arrays.asList(requestArgs);
    return argsList;
  }
}
