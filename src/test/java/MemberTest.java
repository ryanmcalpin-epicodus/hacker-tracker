import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void team_instantiatesCorrectly_true() {
    Team team = new Team("The Hacks");
    assertTrue(team instanceof Team);
  }

  @Test
  public void getName_returnsName_String() {
    Team team = new Team("The Hacks");
    assertEquals("The Hacks", team.getName());
  }
}
