import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mName;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public int getId() {
    return mId;
  }

  public static List<Member> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public static Member find(int id) {
    return instances.get(id - 1);
  }
}
