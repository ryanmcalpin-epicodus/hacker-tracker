import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mName;
  private static List<Team> instances = new ArrayList<Team>();

  public Team(String name) {
    mName = name;
    instances.add(this);
  }

  public String getName() {
    return mName;
  }

  public static List<Team> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }
}
