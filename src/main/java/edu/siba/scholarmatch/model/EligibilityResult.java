package edu.siba.scholarmatch.model;

import java.util.List;

/** Outcome of evaluating one student profile against one scholarship. */
public record EligibilityResult(boolean eligible, List<String> unmetCriteria) {
    public EligibilityResult {
        unmetCriteria = List.copyOf(unmetCriteria);
        if (eligible && !unmetCriteria.isEmpty()) {
            throw new IllegalArgumentException("An eligible result cannot contain unmet criteria");
        }
        if (!eligible && unmetCriteria.isEmpty()) {
            throw new IllegalArgumentException("An ineligible result must explain at least one unmet criterion");
        }
    }
}
