package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team"); 
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equal_returns_true_for_same_object() {
       assert(team.equals(team));
    }

    @Test
    public void equal_returns_true_for_different_object() {
        int x = 3;
       assert(!team.equals(x));
    }

    @Test
    public void equal_returns_true_for_same_team() {
       Team NewTeam = new Team("test-team");
       assert(team.equals(NewTeam));
    }

    @Test
    public void equal_returns_true_for_same_name_different_member() {
       Team NewTeam = new Team("test-team");
       NewTeam.addMember("Tom");
       team.addMember("Lee");
       assert(!team.equals(NewTeam));
    }

    

    @Test
    public void equal_returns_false_for_different_class() {
        Team NewTeam = new Team("test");
        assert(!team.equals(NewTeam));
    }

    @Test
    public void hash_code_test(){
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }


   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
