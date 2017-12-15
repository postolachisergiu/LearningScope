package com.javafortesters.chap014exceptions.examples;

import com.javaforstesters.domainobject.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.*;
import org.junit.rules.*;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class OtherJunit {

    @BeforeClass
    public static void runOncePerClassBeforeAnyTests(){
        System.out.println("@BeforeClass method");
    }

    @Before
    public void runBeforeEveryTestMethod(){
        System.out.println("@Before each method");
    }

    @Test
    public void thisTestWillNeverFail(){}

    @Test(expected=InvalidPassword.class)
    public void expectInvalidPasswordException() throws InvalidPassword {
        User user = new User("username", "<6");
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Rule
    public Timeout timeout = new Timeout(1000);

    @Rule
    public final ErrorCollector collector = new ErrorCollector();



    @Test
    public void testRun() throws IOException {
        assertTrue(temporaryFolder.newFolder().exists());
    }

    @Ignore("Because it is not finished yet")
    @Test
    public void invalidPasswordThrown() throws InvalidPassword{
       expectedException.expect(InvalidPassword.class);
       expectedException.expectMessage("> 6 chars");
       expectedException.expectMessage(containsString("> 6 chars"));
       User user = new User("username", "");
    }

    @Ignore
    @Test
    public void example() {
        collector.addError(new Throwable("first thing went wrong"));
        collector.addError(new Throwable("second thing went wrong"));
    }

    @Rule
    public final TestName name = new TestName();

    @Test
    public void testA() {
        assertEquals("testA", name.getMethodName());
        assertSame("A","A");
        assertEquals("A","A");
    }


    @Rule
    public final TestRule globalTimeout = Timeout.millis(1000);


    @Test
    public void assertingWithHamcrest(){
        assertThat(3+3, is(6));
        assertThat(3+3, is(not(5)));
        assertThat(3+3, equalTo(6));
        assertThat("testcontains", containsString("test"));
    }

    @Test
    public void failTest(){
//        fail();
        fail("fail always fails");
    }
}
