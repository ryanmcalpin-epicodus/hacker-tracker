import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Before
  public void tearDown() {
    Member.clear();
  }

  @Test
  public void member_instantiatesCorrectly_true() {
    Member member = new Member("Ryan");
    assertTrue(member instanceof Member);
  }

  @Test
  public void getName_returnsName_String() {
    Member member = new Member("Ryan");
    assertEquals("Ryan", member.getName());
  }

  @Test
  public void all_returnsAllInstances_true() {
    Member member = new Member("Ryan");
    Member member2 = new Member("Hannah");
    assertEquals(true, Member.all().contains(member));
    assertEquals(true, Member.all().contains(member2));
  }

  @Test
  public void clear_removesAllInstances_0() {
    Member member = new Member("Ryan");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_memberInstantiatesWithId_1() {
    Member member = new Member("Ryan");
    assertEquals(1, member.getId());
  }

  @Test
  public void find_returnsTeamById_Member() {
    Member member = new Member("Ryan");
    Member member2 = new Member("Hannah");
    assertEquals(member2, Member.find(member2.getId()));
  }
}
