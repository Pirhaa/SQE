# Test Plan

## 1. Scope
Verify registration/login, academic profile management, scholarship search/details, eligibility matching, unmet-criteria explanations, administrator scholarship management, deadlines/status, validation, and access control.

## 2. Test levels
- **Unit:** eligibility rules, validators, and other isolated business logic using JUnit 5.
- **Integration:** database repositories and service/database interactions using a configured test database.
- **System:** complete desktop workflows against the requirements.
- **User acceptance:** student and administrator scenarios reviewed against expected behavior.

## 3. Test approach
Use positive, negative, boundary, and equivalence-partition test data. Keep test data separate from real records. Record actual results, evidence, tester, date, and defect ID for failures.

## 4. Environment
JDK 17+, Maven, MySQL, Java Swing desktop environment, and JUnit 5. Database credentials must be local and excluded from version control.

## 5. Exit criteria
All planned tests are executed; critical/high defects are fixed or explicitly accepted and documented; pass rate and requirements coverage are calculated and reported.

## 6. Risks
Incomplete criteria definitions, inconsistent test data, database configuration differences, and late requirement changes. Mitigate through early clarification, controlled fixtures, documented setup, and change review.
