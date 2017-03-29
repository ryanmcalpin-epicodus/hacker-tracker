import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Before
  public void tearDown() {
    Team.clear();
  }

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

  @Test
  public void getId_teamsInstantiatedWithId_1() {
    Team team = new Team("The Hacks");
    assertEquals(1, team.getId());
  }

  @Test
  public void find_returnsTeamById_Team() {
    Team team = new Team("The Hacks");
    Team team2 = new Team("The Yeps");
    assertEquals(team2, Team.find(team2.getId()));
  }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {
    Team team = new Team("The Snacks");
    assertEquals(0, team.getMembers().size());
  }

  @Test
  public void addMember_addsMemberToTeam_true() {
    Team team = new Team("The Snacks");
    Member member = new Member("Ry", "bio");
    team.addMember(member);
    assertTrue(team.getMembers().contains(member));
  }
}
