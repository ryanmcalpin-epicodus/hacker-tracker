import java.util.List;
import java.util.ArrayList;

public class Member {
  private String mName;
  private String mBio;
  private static List<Member> instances = new ArrayList<Member>();
  private int mId;

  public Member(String name, String bio) {
    mName = name;
    mBio = bio;
    instances.add(this);
    mId = instances.size();
  }

  public String getName() {
    return mName;
  }

  public String getBio() {
    return mBio;
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
