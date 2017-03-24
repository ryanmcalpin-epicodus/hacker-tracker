import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

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

  @Test
  public void all_returnsAllInstances_true() {
    Team team = new Team("The Hacks");
    Team otherTeam = new Team("The Others");
    assertEquals(true, Team.all().contains(team));
    assertEquals(true, Team.all().contains(otherTeam));
  }

  @Test
  public void clear_removesAllInstances_0() {
    Team team = new Team("The Hacks");
    Team.clear();
    assertEquals(0, Team.all().size());
  }
}
