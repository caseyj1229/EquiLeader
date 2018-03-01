import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquiLeaderTest {
    @Test
    void solution() {
        int[] A = {4,3,4,4,4,2};
        assertEquals(2,EquiLeader.solution(A));

        int[] B = {1,2,3,4};
        assertEquals(0,EquiLeader.solution(B));

        int[] C = {-4,3,-4,-4,-4,2};
        assertEquals(2,EquiLeader.solution(C));

        int[] D = {6,6,6,6,6,6,6,6,6,6,6};
        assertEquals(10,EquiLeader.solution(D));

        int[] E = {1,1};
        assertEquals(1,EquiLeader.solution(E));

        int[] F = {1};
        assertEquals(0,EquiLeader.solution(F));
    }
}