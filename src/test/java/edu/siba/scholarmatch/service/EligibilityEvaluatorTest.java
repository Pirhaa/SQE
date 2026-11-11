package edu.siba.scholarmatch.service;

import edu.siba.scholarmatch.model.EligibilityResult;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class EligibilityEvaluatorTest {
    private final EligibilityEvaluator evaluator = new EligibilityEvaluator();

    @Test
    void returnsEligibleWhenEveryCriterionPasses() {
        var checks = List.of(
                new EligibilityEvaluator.CriterionCheck(3.6, value -> (double) value >= 3.0, "Minimum CGPA is 3.0"),
                new EligibilityEvaluator.CriterionCheck(5, value -> (int) value >= 1, "Applicant must be enrolled")
        );
        EligibilityResult result = evaluator.evaluate(checks);
        assertTrue(result.eligible());
        assertTrue(result.unmetCriteria().isEmpty());
    }

    @Test
    void explainsEveryCriterionThatFails() {
        var checks = List.of(
                new EligibilityEvaluator.CriterionCheck(2.4, value -> (double) value >= 3.0, "Minimum CGPA is 3.0"),
                new EligibilityEvaluator.CriterionCheck(0, value -> (int) value >= 1, "Applicant must be enrolled")
        );
        EligibilityResult result = evaluator.evaluate(checks);
        assertFalse(result.eligible());
        assertEquals(List.of("Minimum CGPA is 3.0", "Applicant must be enrolled"), result.unmetCriteria());
    }

    @Test
    void rejectsNullCriteriaList() {
        assertThrows(NullPointerException.class, () -> evaluator.evaluate(null));
    }
}
