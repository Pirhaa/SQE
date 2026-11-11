package edu.siba.scholarmatch.service;

import edu.siba.scholarmatch.model.EligibilityResult;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/** Evaluates predefined rules; it does not use AI or external scholarship services. */
public class EligibilityEvaluator {
    /**
     * Evaluates the supplied criteria in order. Each predicate returns true when
     * its criterion is satisfied; the label explains a failed criterion.
     */
    public EligibilityResult evaluate(List<CriterionCheck> criteria) {
        Objects.requireNonNull(criteria, "criteria must not be null");
        List<String> unmet = criteria.stream()
                .filter(check -> !check.predicate().test(check.studentValue()))
                .map(CriterionCheck::failureExplanation)
                .toList();
        return new EligibilityResult(unmet.isEmpty(), unmet);
    }

    public record CriterionCheck(Object studentValue, Predicate<Object> predicate,
                                 String failureExplanation) {
        public CriterionCheck {
            Objects.requireNonNull(predicate, "predicate must not be null");
            if (failureExplanation == null || failureExplanation.isBlank()) {
                throw new IllegalArgumentException("failure explanation is required");
            }
        }
    }
}
