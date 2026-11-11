package edu.siba.scholarmatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ProjectStructureTest {
    @Test
    void applicationEntryPointIsLoadable() {
        assertDoesNotThrow(() -> Class.forName("edu.siba.scholarmatch.Main"));
    }
}
