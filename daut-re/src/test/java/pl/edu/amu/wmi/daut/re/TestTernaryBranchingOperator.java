package pl.edu.amu.wmi.daut.re;

import java.util.ArrayList;
import pl.edu.amu.wmi.daut.base.AutomatonSpecification;
import junit.framework.TestCase;
import pl.edu.amu.wmi.daut.base.AutomatonByRecursion;
import pl.edu.amu.wmi.daut.re.TabOperator.Factory;

public class TestTernaryBranchingOperator extends TestCase {

    public void testTernaryBranchingOperator() {

        RegexpOperator operator = new TernaryBranchingOperator();
        assertFalse(automaton.accepts("ba"));
        assertFalse(automaton.accepts("ca"));
        assertFalse(automaton.accepts("bbc"));
        assertFalse(automaton.accepts("acba"));
        assertFalse(automaton.accepts(" "));
        assertFalse(automaton.accepts(""));
        assertFalse(automaton.accepts("\r"));
        assertTrue(automaton.accepts("\t"));
        assertTrue(automaton.accepts("a"));
        assertTrue(automaton.accepts("b"));
        assertTrue(automaton.accepts("c"));
        assertTrue(automaton.accepts("aabbcc"));
        assertTrue(automaton.accepts("aab"));
        assertTrue(automaton.accepts("ac"));
    }

    /**
     * Test fabryki.
     */
    public final void testFactory() {

        Factory factory = new Factory();
        RegexpOperator operator2 = factory.createOperator(new ArrayList<String>());
        int arity = operator2.arity();
        assertEquals(arity, 0);

    }
}
