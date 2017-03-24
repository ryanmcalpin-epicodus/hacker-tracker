import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

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
}
